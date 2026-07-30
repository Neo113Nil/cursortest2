package com.artillery.ctc.uitls;

import android.annotation.SuppressLint;
import android.provider.Settings;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.exifinterface.media.ExifInterface;
import cn.hutool.core.date.d;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

@Keep
/* loaded from: classes.dex */
public final class TimeUtils {
    private static final ThreadLocal<Map<String, SimpleDateFormat>> SDF_THREAD_LOCAL = new a();
    private static final String[] CHINESE_ZODIAC = {"猴", "鸡", "狗", "猪", "鼠", "牛", "虎", "兔", "龙", "蛇", "马", "羊"};
    private static final int[] ZODIAC_FLAGS = {20, 19, 21, 21, 21, 22, 23, 23, 23, 24, 23, 22};
    private static final String[] ZODIAC = {"水瓶座", "双鱼座", "白羊座", "金牛座", "双子座", "巨蟹座", "狮子座", "处女座", "天秤座", "天蝎座", "射手座", "摩羯座"};

    public class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map initialValue() {
            return new HashMap();
        }
    }

    private TimeUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static long date2Millis(Date date) {
        return date.getTime();
    }

    public static String date2String(Date date) {
        return date2String(date, getDefaultFormat());
    }

    public static String getChineseWeek(String str) {
        return getChineseWeek(string2Date(str, getDefaultFormat()));
    }

    public static String getChineseZodiac(String str) {
        return getChineseZodiac(string2Date(str, getDefaultFormat()));
    }

    public static Date getDate(long j8, long j9, int i8) {
        return millis2Date(j8 + timeSpan2Millis(j9, i8));
    }

    public static Date getDateByNow(long j8, int i8) {
        return getDate(getNowMills(), j8, i8);
    }

    private static SimpleDateFormat getDefaultFormat() {
        return getSafeDateFormat(d.NORM_DATETIME_PATTERN);
    }

    public static String getFitTimeSpan(String str, String str2, int i8) {
        return millis2FitTimeSpan(string2Millis(str, getDefaultFormat()) - string2Millis(str2, getDefaultFormat()), i8);
    }

    public static String getFitTimeSpanByNow(String str, int i8) {
        return getFitTimeSpan(str, getNowString(), getDefaultFormat(), i8);
    }

    public static String getFriendlyTimeSpanByNow(String str) {
        return getFriendlyTimeSpanByNow(str, getDefaultFormat());
    }

    public static long getMillis(long j8, long j9, int i8) {
        return j8 + timeSpan2Millis(j9, i8);
    }

    public static long getMillisByNow(long j8, int i8) {
        return getMillis(getNowMills(), j8, i8);
    }

    public static Date getNowDate() {
        return new Date();
    }

    public static long getNowMills() {
        return System.currentTimeMillis();
    }

    public static String getNowString() {
        return millis2String(System.currentTimeMillis(), getDefaultFormat());
    }

    @SuppressLint({"SimpleDateFormat"})
    public static SimpleDateFormat getSafeDateFormat(String str) {
        Map<String, SimpleDateFormat> map = SDF_THREAD_LOCAL.get();
        SimpleDateFormat simpleDateFormat = map.get(str);
        if (simpleDateFormat != null) {
            return simpleDateFormat;
        }
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(str);
        map.put(str, simpleDateFormat2);
        return simpleDateFormat2;
    }

    public static String getString(long j8, long j9, int i8) {
        return getString(j8, getDefaultFormat(), j9, i8);
    }

    public static String getStringByNow(long j8, int i8) {
        return getStringByNow(j8, getDefaultFormat(), i8);
    }

    public static long getTimeSpan(String str, String str2, int i8) {
        return getTimeSpan(str, str2, getDefaultFormat(), i8);
    }

    public static long getTimeSpanByNow(String str, int i8) {
        return getTimeSpan(str, getNowString(), getDefaultFormat(), i8);
    }

    public static String getUSWeek(String str) {
        return getUSWeek(string2Date(str, getDefaultFormat()));
    }

    public static int getValueByCalendarField(int i8) {
        return Calendar.getInstance().get(i8);
    }

    private static long getWeeOfToday() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static String getZodiac(String str) {
        return getZodiac(string2Date(str, getDefaultFormat()));
    }

    public static boolean isAm() {
        return Calendar.getInstance().get(9) == 0;
    }

    public static boolean isLeapYear(String str) {
        return isLeapYear(string2Date(str, getDefaultFormat()));
    }

    public static boolean isPm() {
        return !isAm();
    }

    public static boolean isToday(String str) {
        return isToday(string2Millis(str, getDefaultFormat()));
    }

    public static boolean isUsingNetworkProvidedTime() {
        return Settings.Global.getInt(y.d.a().getContentResolver(), "auto_time", 0) == 1;
    }

    public static Date millis2Date(long j8) {
        return new Date(j8);
    }

    public static String millis2FitTimeSpan(long j8, int i8) {
        if (i8 <= 0) {
            return null;
        }
        int min = Math.min(i8, 5);
        String[] strArr = {"天", "小时", "分钟", "秒", "毫秒"};
        if (j8 == 0) {
            return 0 + strArr[min - 1];
        }
        StringBuilder sb = new StringBuilder();
        if (j8 < 0) {
            sb.append("-");
            j8 = -j8;
        }
        int[] iArr = {TimeConstants.DAY, TimeConstants.HOUR, 60000, 1000, 1};
        for (int i9 = 0; i9 < min; i9++) {
            long j9 = iArr[i9];
            if (j8 >= j9) {
                long j10 = j8 / j9;
                j8 -= j9 * j10;
                sb.append(j10);
                sb.append(strArr[i9]);
            }
        }
        return sb.toString();
    }

    public static String millis2String(long j8) {
        return millis2String(j8, getDefaultFormat());
    }

    private static long millis2TimeSpan(long j8, int i8) {
        return j8 / i8;
    }

    public static Date string2Date(String str) {
        return string2Date(str, getDefaultFormat());
    }

    public static long string2Millis(String str) {
        return string2Millis(str, getDefaultFormat());
    }

    private static long timeSpan2Millis(long j8, int i8) {
        return j8 * i8;
    }

    public static String utcTimestamp(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(d.UTC_PATTERN, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(date);
    }

    public static String date2String(Date date, @NonNull String str) {
        return getSafeDateFormat(str).format(date);
    }

    public static String getChineseWeek(String str, @NonNull DateFormat dateFormat) {
        return getChineseWeek(string2Date(str, dateFormat));
    }

    public static String getChineseZodiac(String str, @NonNull DateFormat dateFormat) {
        return getChineseZodiac(string2Date(str, dateFormat));
    }

    public static Date getDate(String str, long j8, int i8) {
        return getDate(str, getDefaultFormat(), j8, i8);
    }

    public static String getFitTimeSpanByNow(String str, @NonNull DateFormat dateFormat, int i8) {
        return getFitTimeSpan(str, getNowString(dateFormat), dateFormat, i8);
    }

    public static String getFriendlyTimeSpanByNow(String str, @NonNull DateFormat dateFormat) {
        return getFriendlyTimeSpanByNow(string2Millis(str, dateFormat));
    }

    public static long getMillis(String str, long j8, int i8) {
        return getMillis(str, getDefaultFormat(), j8, i8);
    }

    public static String getNowString(@NonNull DateFormat dateFormat) {
        return millis2String(System.currentTimeMillis(), dateFormat);
    }

    public static String getString(long j8, @NonNull DateFormat dateFormat, long j9, int i8) {
        return millis2String(j8 + timeSpan2Millis(j9, i8), dateFormat);
    }

    public static String getStringByNow(long j8, @NonNull DateFormat dateFormat, int i8) {
        return getString(getNowMills(), dateFormat, j8, i8);
    }

    public static long getTimeSpan(String str, String str2, @NonNull DateFormat dateFormat, int i8) {
        return millis2TimeSpan(string2Millis(str, dateFormat) - string2Millis(str2, dateFormat), i8);
    }

    public static long getTimeSpanByNow(String str, @NonNull DateFormat dateFormat, int i8) {
        return getTimeSpan(str, getNowString(dateFormat), dateFormat, i8);
    }

    public static String getUSWeek(String str, @NonNull DateFormat dateFormat) {
        return getUSWeek(string2Date(str, dateFormat));
    }

    public static String getZodiac(String str, @NonNull DateFormat dateFormat) {
        return getZodiac(string2Date(str, dateFormat));
    }

    public static boolean isLeapYear(String str, @NonNull DateFormat dateFormat) {
        return isLeapYear(string2Date(str, dateFormat));
    }

    public static boolean isPm(String str) {
        return !isAm(str);
    }

    public static boolean isToday(String str, @NonNull DateFormat dateFormat) {
        return isToday(string2Millis(str, dateFormat));
    }

    public static String millis2String(long j8, @NonNull String str) {
        return millis2String(j8, getSafeDateFormat(str));
    }

    public static Date string2Date(String str, @NonNull String str2) {
        return string2Date(str, getSafeDateFormat(str2));
    }

    public static long string2Millis(String str, @NonNull String str2) {
        return string2Millis(str, getSafeDateFormat(str2));
    }

    public static String date2String(Date date, @NonNull DateFormat dateFormat) {
        return dateFormat.format(date);
    }

    public static String getChineseWeek(Date date) {
        return new SimpleDateFormat(ExifInterface.LONGITUDE_EAST, Locale.CHINA).format(date);
    }

    public static String getChineseZodiac(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return CHINESE_ZODIAC[calendar.get(1) % 12];
    }

    public static Date getDate(String str, @NonNull DateFormat dateFormat, long j8, int i8) {
        return millis2Date(string2Millis(str, dateFormat) + timeSpan2Millis(j8, i8));
    }

    public static String getFitTimeSpan(String str, String str2, @NonNull DateFormat dateFormat, int i8) {
        return millis2FitTimeSpan(string2Millis(str, dateFormat) - string2Millis(str2, dateFormat), i8);
    }

    public static String getFitTimeSpanByNow(Date date, int i8) {
        return getFitTimeSpan(date, getNowDate(), i8);
    }

    public static String getFriendlyTimeSpanByNow(Date date) {
        return getFriendlyTimeSpanByNow(date.getTime());
    }

    public static long getMillis(String str, @NonNull DateFormat dateFormat, long j8, int i8) {
        return string2Millis(str, dateFormat) + timeSpan2Millis(j8, i8);
    }

    public static String getString(String str, long j8, int i8) {
        return getString(str, getDefaultFormat(), j8, i8);
    }

    public static long getTimeSpan(Date date, Date date2, int i8) {
        return millis2TimeSpan(date2Millis(date) - date2Millis(date2), i8);
    }

    public static long getTimeSpanByNow(Date date, int i8) {
        return getTimeSpan(date, new Date(), i8);
    }

    public static String getUSWeek(Date date) {
        return new SimpleDateFormat("EEEE", Locale.US).format(date);
    }

    public static int getValueByCalendarField(String str, int i8) {
        return getValueByCalendarField(string2Date(str, getDefaultFormat()), i8);
    }

    public static String getZodiac(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return getZodiac(calendar.get(2) + 1, calendar.get(5));
    }

    public static boolean isAm(String str) {
        return getValueByCalendarField(str, getDefaultFormat(), 9) == 0;
    }

    public static boolean isLeapYear(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return isLeapYear(calendar.get(1));
    }

    public static boolean isPm(String str, @NonNull DateFormat dateFormat) {
        return !isAm(str, dateFormat);
    }

    public static boolean isToday(Date date) {
        return isToday(date.getTime());
    }

    public static String millis2String(long j8, @NonNull DateFormat dateFormat) {
        return dateFormat.format(new Date(j8));
    }

    public static Date string2Date(String str, @NonNull DateFormat dateFormat) {
        try {
            return dateFormat.parse(str);
        } catch (ParseException e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public static long string2Millis(String str, @NonNull DateFormat dateFormat) {
        try {
            return dateFormat.parse(str).getTime();
        } catch (ParseException e8) {
            e8.printStackTrace();
            return -1L;
        }
    }

    public static String getChineseWeek(long j8) {
        return getChineseWeek(new Date(j8));
    }

    public static Date getDate(Date date, long j8, int i8) {
        return millis2Date(date2Millis(date) + timeSpan2Millis(j8, i8));
    }

    public static String getFitTimeSpanByNow(long j8, int i8) {
        return getFitTimeSpan(j8, System.currentTimeMillis(), i8);
    }

    public static String getFriendlyTimeSpanByNow(long j8) {
        long currentTimeMillis = System.currentTimeMillis() - j8;
        if (currentTimeMillis < 0) {
            return String.format("%tc", Long.valueOf(j8));
        }
        if (currentTimeMillis < 1000) {
            return "刚刚";
        }
        if (currentTimeMillis < 60000) {
            return String.format(Locale.getDefault(), "%d秒前", Long.valueOf(currentTimeMillis / 1000));
        }
        if (currentTimeMillis < 3600000) {
            return String.format(Locale.getDefault(), "%d分钟前", Long.valueOf(currentTimeMillis / 60000));
        }
        long weeOfToday = getWeeOfToday();
        return j8 >= weeOfToday ? String.format("今天%tR", Long.valueOf(j8)) : j8 >= weeOfToday - 86400000 ? String.format("昨天%tR", Long.valueOf(j8)) : String.format("%tF", Long.valueOf(j8));
    }

    public static long getMillis(Date date, long j8, int i8) {
        return date2Millis(date) + timeSpan2Millis(j8, i8);
    }

    public static String getString(String str, @NonNull DateFormat dateFormat, long j8, int i8) {
        return millis2String(string2Millis(str, dateFormat) + timeSpan2Millis(j8, i8), dateFormat);
    }

    public static long getTimeSpan(long j8, long j9, int i8) {
        return millis2TimeSpan(j8 - j9, i8);
    }

    public static long getTimeSpanByNow(long j8, int i8) {
        return getTimeSpan(j8, System.currentTimeMillis(), i8);
    }

    public static String getUSWeek(long j8) {
        return getUSWeek(new Date(j8));
    }

    public static int getValueByCalendarField(String str, @NonNull DateFormat dateFormat, int i8) {
        return getValueByCalendarField(string2Date(str, dateFormat), i8);
    }

    public static boolean isAm(String str, @NonNull DateFormat dateFormat) {
        return getValueByCalendarField(str, dateFormat, 9) == 0;
    }

    public static boolean isPm(Date date) {
        return !isAm(date);
    }

    public static boolean isToday(long j8) {
        long weeOfToday = getWeeOfToday();
        return j8 >= weeOfToday && j8 < weeOfToday + 86400000;
    }

    public static String getFitTimeSpan(Date date, Date date2, int i8) {
        return millis2FitTimeSpan(date2Millis(date) - date2Millis(date2), i8);
    }

    public static String getString(Date date, long j8, int i8) {
        return getString(date, getDefaultFormat(), j8, i8);
    }

    public static int getValueByCalendarField(Date date, int i8) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(i8);
    }

    public static boolean isAm(Date date) {
        return getValueByCalendarField(date, 9) == 0;
    }

    public static boolean isPm(long j8) {
        return !isAm(j8);
    }

    public static String getChineseZodiac(long j8) {
        return getChineseZodiac(millis2Date(j8));
    }

    public static String getFitTimeSpan(long j8, long j9, int i8) {
        return millis2FitTimeSpan(j8 - j9, i8);
    }

    public static String getString(Date date, @NonNull DateFormat dateFormat, long j8, int i8) {
        return millis2String(date2Millis(date) + timeSpan2Millis(j8, i8), dateFormat);
    }

    public static boolean isAm(long j8) {
        return getValueByCalendarField(j8, 9) == 0;
    }

    public static String getChineseZodiac(int i8) {
        return CHINESE_ZODIAC[i8 % 12];
    }

    public static boolean isLeapYear(long j8) {
        return isLeapYear(millis2Date(j8));
    }

    public static int getValueByCalendarField(long j8, int i8) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j8);
        return calendar.get(i8);
    }

    public static String getZodiac(long j8) {
        return getZodiac(millis2Date(j8));
    }

    public static boolean isLeapYear(int i8) {
        return (i8 % 4 == 0 && i8 % 100 != 0) || i8 % 400 == 0;
    }

    public static String getZodiac(int i8, int i9) {
        String[] strArr = ZODIAC;
        int i10 = i8 - 1;
        if (i9 < ZODIAC_FLAGS[i10]) {
            i10 = (i8 + 10) % 12;
        }
        return strArr[i10];
    }
}
