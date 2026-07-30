package c2;

import android.text.TextUtils;
import androidx.annotation.DrawableRes;
import com.crrepa.band.my.R$drawable;

/* loaded from: classes2.dex */
public class e {
    private static final int CLOUDY = 0;
    private static final int FOGGY = 1;
    private static final int HAZE = 7;
    private static final int OVERCAST = 2;
    private static final int RAINY = 3;
    private static final int SANDSTORM = 6;
    private static final int SNOWY = 4;
    private static final int SUNNY = 5;

    public static int getWeatherCode(String str) {
        if (TextUtils.isEmpty(str)) {
            return 2;
        }
        int parseInt = Integer.parseInt(str);
        if (parseInt == 100) {
            return 5;
        }
        if (parseInt <= 103) {
            return 0;
        }
        if (parseInt <= 213) {
            return 2;
        }
        if (parseInt <= 313) {
            return 3;
        }
        if (parseInt <= 407) {
            return 4;
        }
        if (parseInt <= 501) {
            return 1;
        }
        if (parseInt <= 502) {
            return 7;
        }
        return parseInt <= 508 ? 6 : 2;
    }

    @DrawableRes
    public static int getWeatherCodeIcon(int i8) {
        switch (i8) {
            case 0:
                return R$drawable.ic_weather_1_cloudy;
            case 1:
                return R$drawable.ic_weather_2_foggy;
            case 2:
                return R$drawable.ic_weather_3_overcast;
            case 3:
                return R$drawable.ic_weather_4_rainny;
            case 4:
                return R$drawable.ic_weather_5_snowy;
            case 5:
                return R$drawable.ic_weather_6_sunny;
            case 6:
                return R$drawable.ic_weather_7_dust;
            case 7:
                return R$drawable.ic_weather_8_haze;
            default:
                return R$drawable.ic_weather_9_nodata;
        }
    }

    public static int getWeatherCodeOfOpenWeather(int i8) {
        if (i8 == 800) {
            return 5;
        }
        if (i8 == 721 || i8 == 711) {
            return 7;
        }
        if (i8 == 741 || i8 == 701) {
            return 1;
        }
        if (600 <= i8 && i8 < 700) {
            return 4;
        }
        if (i8 < 600) {
            return 3;
        }
        if (800 < i8) {
            return 0;
        }
        return 731 == i8 ? 6 : 2;
    }

    public static int getWeatherCodeOfYahoo(int i8) {
        if ((31 <= i8 && i8 <= 34) || i8 == 36) {
            return 5;
        }
        if ((26 <= i8 && i8 <= 30) || i8 == 44) {
            return 0;
        }
        if ((3 <= i8 && i8 <= 12) || i8 == 35 || ((37 <= i8 && i8 <= 40) || i8 == 45 || i8 == 47)) {
            return 3;
        }
        if ((13 <= i8 && i8 <= 18) || ((41 <= i8 && i8 <= 43) || i8 == 46)) {
            return 4;
        }
        if (i8 == 19 || i8 == 20) {
            return 1;
        }
        if (i8 == 21 || i8 == 22) {
            return 7;
        }
        return (i8 < 0 || i8 > 2) ? 2 : 6;
    }

    public static float getWeatherTemp(float f8, int i8) {
        return i8 == 1 ? l2.c.celsius2Fahrenheit(f8) : f8;
    }

    public static int getWeatherTempOfYahoo(int i8, int i9) {
        return i9 == 0 ? (int) l2.c.fahrenheit2Celsius(i8) : i8;
    }
}
