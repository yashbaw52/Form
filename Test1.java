package amazonPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
	
	DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	Date date = new Date();
	String date1 = dateFormat.format(date);
	WebDriver driver;
	
	@BeforeMethod
	
	public void invokeurl() {
		System.setProperty("webdriver.chrome.driver", "C://Users//Yash//Downloads//chromedriver_win32//chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.navigate().to("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		
		
	}
	
	
	
	
  @Test
  public void name() {
	  WebElement fn = driver.findElement(By.name("firstname"));
	  fn.sendKeys("abc");
	  
	  WebElement ln = driver.findElement(By.name("lastname"));
	  ln.sendKeys("qwerty");
	  
  }
  @Test
  public void gender () {
	  WebElement male = driver.findElement(By.id("sex-0"));
	  male.click();
  }
  @Test
  public void yoexp() {
	  WebElement exp = driver.findElement(By.id("exp-4"));
	  exp.click();
  }
  @Test
  public void date () {
	  WebElement td = driver.findElement(By.id("datepicker"));
	  td.sendKeys(date1);
  }
}
