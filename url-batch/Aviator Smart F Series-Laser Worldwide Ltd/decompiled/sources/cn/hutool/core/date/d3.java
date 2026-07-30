package cn.hutool.core.date;

import com.baidu.ar.auth.FeatureCodes;
import java.util.Calendar;
import java.util.Date;

/* loaded from: classes.dex */
public class d3 {
    private static final int[] DAY_ARR = {20, 19, 21, 20, 21, 22, 23, 23, 23, 24, 23, 22};
    private static final String[] ZODIACS = {"摩羯座", "水瓶座", "双鱼座", "白羊座", "金牛座", "双子座", "巨蟹座", "狮子座", "处女座", "天秤座", "天蝎座", "射手座", "摩羯座"};
    private static final String[] CHINESE_ZODIACS = {"鼠", "牛", "虎", "兔", "龙", "蛇", "马", "羊", "猴", "鸡", "狗", "猪"};

    public static String getChineseZodiac(Date date) {
        return getChineseZodiac(a.calendar(date));
    }

    public static String getZodiac(Date date) {
        return getZodiac(a.calendar(date));
    }

    public static String getChineseZodiac(Calendar calendar) {
        if (calendar == null) {
            return null;
        }
        return getChineseZodiac(calendar.get(1));
    }

    public static String getZodiac(Calendar calendar) {
        if (calendar == null) {
            return null;
        }
        return getZodiac(calendar.get(2), calendar.get(5));
    }

    public static String getChineseZodiac(int i8) {
        if (i8 < 1900) {
            return null;
        }
        String[] strArr = CHINESE_ZODIACS;
        return strArr[(i8 - FeatureCodes.SKY_SEG) % strArr.length];
    }

    public static String getZodiac(Month month, int i8) {
        return getZodiac(month.getValue(), i8);
    }

    public static String getZodiac(int i8, int i9) {
        cn.hutool.core.lang.q.checkBetween(i8, Month.JANUARY.getValue(), Month.DECEMBER.getValue(), "Unsupported month value, must be [0,12]", new Object[0]);
        return i9 < DAY_ARR[i8] ? ZODIACS[i8] : ZODIACS[i8 + 1];
    }
}
