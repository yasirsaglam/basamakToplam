import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, sonuc = 0;
        System.out.print("Sayıyı giriniz : ");
        sayi = input.nextInt();
        while (sayi != 0) {
            sonuc += sayi % 10;
            sayi /= 10;
        }
        System.out.print("Girdiğiniz sayının basamakları toplamı : " + sonuc);
    }
}
