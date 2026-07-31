package com.google.android.material.datepicker;

import A.d;
import android.content.Context;
import android.text.format.DateUtils;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
abstract class DateStrings {
    static d getDateRangeString(Long l4, Long l5) {
        return getDateRangeString(l4, l5, null);
    }

    static String getDateString(long j4) {
        return getDateString(j4, null);
    }

    static String getMonthDay(long j4) {
        return getMonthDay(j4, Locale.getDefault());
    }

    static String getMonthDayOfWeekDay(long j4) {
        return getMonthDayOfWeekDay(j4, Locale.getDefault());
    }

    static String getYearMonth(Context context, long j4) {
        return DateUtils.formatDateTime(context, j4 - TimeZone.getDefault().getOffset(j4), 36);
    }

    static String getYearMonthDay(long j4) {
        return getYearMonthDay(j4, Locale.getDefault());
    }

    static String getYearMonthDayOfWeekDay(long j4) {
        return getYearMonthDayOfWeekDay(j4, Locale.getDefault());
    }

    static d getDateRangeString(Long l4, Long l5, SimpleDateFormat simpleDateFormat) {
        if (l4 == null && l5 == null) {
            return d.a(null, null);
        }
        if (l4 == null) {
            return d.a(null, getDateString(l5.longValue(), simpleDateFormat));
        }
        if (l5 == null) {
            return d.a(getDateString(l4.longValue(), simpleDateFormat), null);
        }
        Calendar todayCalendar = UtcDates.getTodayCalendar();
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        utcCalendar.setTimeInMillis(l4.longValue());
        Calendar utcCalendar2 = UtcDates.getUtcCalendar();
        utcCalendar2.setTimeInMillis(l5.longValue());
        if (simpleDateFormat != null) {
            return d.a(simpleDateFormat.format(new Date(l4.longValue())), simpleDateFormat.format(new Date(l5.longValue())));
        }
        return utcCalendar.get(1) == utcCalendar2.get(1) ? utcCalendar.get(1) == todayCalendar.get(1) ? d.a(getMonthDay(l4.longValue(), Locale.getDefault()), getMonthDay(l5.longValue(), Locale.getDefault())) : d.a(getMonthDay(l4.longValue(), Locale.getDefault()), getYearMonthDay(l5.longValue(), Locale.getDefault())) : d.a(getYearMonthDay(l4.longValue(), Locale.getDefault()), getYearMonthDay(l5.longValue(), Locale.getDefault()));
    }

    static String getDateString(long j4, SimpleDateFormat simpleDateFormat) {
        Calendar todayCalendar = UtcDates.getTodayCalendar();
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        utcCalendar.setTimeInMillis(j4);
        return simpleDateFormat != null ? simpleDateFormat.format(new Date(j4)) : todayCalendar.get(1) == utcCalendar.get(1) ? getMonthDay(j4) : getYearMonthDay(j4);
    }

    static String getMonthDay(long j4, Locale locale) {
        return UtcDates.getAbbrMonthDayFormat(locale).format(new Date(j4));
    }

    static String getMonthDayOfWeekDay(long j4, Locale locale) {
        return UtcDates.getAbbrMonthWeekdayDayFormat(locale).format(new Date(j4));
    }

    static String getYearMonthDay(long j4, Locale locale) {
        return UtcDates.getYearAbbrMonthDayFormat(locale).format(new Date(j4));
    }

    static String getYearMonthDayOfWeekDay(long j4, Locale locale) {
        return UtcDates.getYearAbbrMonthWeekdayDayFormat(locale).format(new Date(j4));
    }
}
