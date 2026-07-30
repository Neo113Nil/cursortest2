package com.moyoung.dafit.module.common.utils;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes4.dex */
public class m {
    private m() {
    }

    public static String format(Date date, String str) {
        if (date == null && TextUtils.isEmpty(str)) {
            return null;
        }
        return new SimpleDateFormat(str).format(date);
    }

    public static long format2GMTTimestamp(long j8) {
        return j8 - TimeZone.getDefault().getOffset(j8);
    }

    public static long format2UTCTimestamp(long j8) {
        Date date = new Date(j8);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar2.set(calendar.get(1), calendar.get(2), calendar.get(5), calendar.get(11), calendar.get(12), calendar.get(13));
        calendar2.set(14, calendar.get(14));
        return calendar2.getTimeInMillis();
    }

    public static String formatMonthEn(Date date, String str) {
        if (date == null && TextUtils.isEmpty(str)) {
            return null;
        }
        return new SimpleDateFormat(str, Locale.ENGLISH).format(date);
    }

    public static String formatTime(int i8, int i9, String str) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, i8);
        calendar.set(12, i9);
        return format(calendar.getTime(), str);
    }

    public static int getAge(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i8 = calendar.get(1);
        int i9 = calendar.get(2) + 1;
        int i10 = calendar.get(5);
        calendar.setTime(new Date());
        int i11 = calendar.get(1);
        int i12 = calendar.get(2) + 1;
        int i13 = i11 - i8;
        return (i12 >= i9 && (i12 != i9 || calendar.get(5) >= i10)) ? i13 : i13 - 1;
    }

    public static Date getDateForHourAndMinute(Date date, int i8, int i9, boolean z7) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(11, i8);
        calendar.set(12, i9);
        calendar.set(13, 0);
        return calendar.getTime();
    }

    public static Date getDateOfDayNumber(Date date, int i8) {
        Calendar startCalendarOfMonth = getStartCalendarOfMonth(date);
        startCalendarOfMonth.add(5, i8 - 1);
        return startCalendarOfMonth.getTime();
    }

    public static Date getDateOfDayOfMonth(Date date, int i8) {
        Calendar startCalendarOfMonth = getStartCalendarOfMonth(date);
        startCalendarOfMonth.add(5, i8 - 1);
        return startCalendarOfMonth.getTime();
    }

    public static Date getDateOfOffsetDay(Date date, int i8) {
        if (i8 == 0) {
            return date;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(5, i8);
        return calendar.getTime();
    }

    public static Date getDateOfOffsetMinute(Date date, int i8) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(12, i8);
        return calendar.getTime();
    }

    public static Date getDateOfOffsetMonth(Date date, int i8) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(2, i8);
        return calendar.getTime();
    }

    public static int getDayOfMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(5);
    }

    public static int getDayOfWeek(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(7);
    }

    public static int getDaySpace(Date date, Date date2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i8 = calendar.get(1);
        int i9 = calendar.get(6);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        return (((calendar2.get(1) - i8) * 365) + calendar2.get(6)) - i9;
    }

    public static Date getEndDateOfMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(5, calendar.getActualMaximum(5));
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        return calendar.getTime();
    }

    public static Date getEndDateOfWeek(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.setFirstDayOfWeek(1);
        calendar.set(7, calendar.getFirstDayOfWeek() + 6);
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        return calendar.getTime();
    }

    public static Date getEndDateOfYear(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(6, calendar.getActualMaximum(6));
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        return calendar.getTime();
    }

    public static long getGMTTimeInMillis() {
        long currentTimeMillis = System.currentTimeMillis();
        int offset = TimeZone.getDefault().getOffset(currentTimeMillis);
        long j8 = currentTimeMillis - offset;
        Log.e("WorldClockLog", "CurrentTime：" + currentTimeMillis + ". offset：" + offset + ". ResultTime：" + j8);
        return j8;
    }

    public static int getHourForStringTime(String str, boolean z7) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
        if (z7) {
            simpleDateFormat = new SimpleDateFormat(u.isZH() ? "a hh:mm" : "hh:mm a", Locale.getDefault());
        }
        try {
            Date parse = simpleDateFormat.parse(str);
            Calendar calendar = Calendar.getInstance();
            if (parse == null) {
                return 0;
            }
            calendar.setTime(parse);
            return calendar.get(11);
        } catch (ParseException e8) {
            e8.printStackTrace();
            return 0;
        }
    }

    public static Date getLastDayEndTime(Date date) {
        Date sameDayStartTime = getSameDayStartTime(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(sameDayStartTime);
        calendar.set(14, -1);
        return calendar.getTime();
    }

    public static long getMilliSecondSpace(Date date, Date date2) {
        return date2.getTime() - date.getTime();
    }

    public static int getMinuteForStringTime(String str, boolean z7) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
        if (z7) {
            simpleDateFormat = new SimpleDateFormat(u.isZH() ? "a hh:mm" : "hh:mm a", Locale.getDefault());
        }
        try {
            Date parse = simpleDateFormat.parse(str);
            Calendar calendar = Calendar.getInstance();
            if (parse == null) {
                return 0;
            }
            calendar.setTime(parse);
            return calendar.get(12);
        } catch (ParseException e8) {
            e8.printStackTrace();
            return 0;
        }
    }

    public static int getMinuteOfDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return (calendar.get(11) * 60) + calendar.get(12);
    }

    public static int getMinuteSpace(long j8, long j9) {
        return (int) (((j9 - j8) / 1000) / 60);
    }

    public static int getMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(2) + 1;
    }

    public static int getMonthCountDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.getActualMaximum(5);
    }

    public static long getMonthNumber(Date date) {
        Calendar.getInstance().setTime(date);
        return (r0.get(1) * 12) + r0.get(2);
    }

    public static int getMonthSapce(Date date, Date date2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i8 = calendar.get(1);
        int i9 = calendar.get(2);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        return ((calendar2.get(1) - i8) * 12) + (calendar2.get(2) - i9);
    }

    public static Date getSameDayEndTime(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        return calendar.getTime();
    }

    public static Date getSameDayStartTime(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTime();
    }

    @NonNull
    public static Calendar getStartCalendarOfMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }

    public static Calendar getStartCalendarOfWeek(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.setFirstDayOfWeek(1);
        calendar.set(7, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }

    @NonNull
    public static Calendar getStartCalendarOfYear(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(6, 1);
        return calendar;
    }

    public static Date getStartDateOfMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTime();
    }

    public static Date getStartDateOfWeek(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.setFirstDayOfWeek(1);
        calendar.set(7, calendar.getFirstDayOfWeek());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTime();
    }

    public static Date getStartDateOfYear(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(6, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTime();
    }

    public static int getYear(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(1);
    }

    public static int getYearOfDate(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(1);
    }

    public static boolean isAmInDay(long j8) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j8);
        return calendar.get(11) < 12;
    }

    public static int isDayOfWeekOfFirstDayOfMonth(Date date) {
        return getStartCalendarOfMonth(date).get(7);
    }

    public static boolean isHalfYearOld(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i8 = calendar.get(2);
        int i9 = calendar.get(5);
        calendar.setTime(new Date());
        int i10 = calendar.get(2);
        int i11 = calendar.get(5);
        int i12 = i10 - i8;
        if (i12 <= 0) {
            i12 += 12;
        }
        if (i11 < i9) {
            i12--;
        }
        return i12 >= 6;
    }

    public static boolean isLastMinuteOfDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        return 23 <= calendar.get(11) && 59 <= calendar.get(12);
    }

    public static boolean isSameDay(Date date, Date date2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        return calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5);
    }

    public static boolean isSameMonth(Date date, Date date2) {
        return getYear(date) == getYear(date2) && getMonth(date) == getMonth(date2);
    }

    public static boolean isSameWeek(Date date, Date date2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i8 = calendar.get(3);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        return i8 == calendar2.get(3);
    }

    public static String format(long j8, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return new SimpleDateFormat(str, Locale.getDefault()).format(new Date(j8));
    }

    public static String getYear(Context context, Date date, @StringRes int i8, @StringRes int i9) {
        return format(date, context.getString(i8)) + context.getString(i9);
    }
}
