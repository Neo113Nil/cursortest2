package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Build;
import android.text.format.DateUtils;
import androidx.annotation.Nullable;
import androidx.core.util.Pair;
import com.google.android.material.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes4.dex */
class DateStrings {
    private DateStrings() {
    }

    static Pair<String, String> getDateRangeString(@Nullable Long l8, @Nullable Long l9) {
        return getDateRangeString(l8, l9, null);
    }

    static String getDateString(long j8) {
        return getDateString(j8, null);
    }

    static String getDayContentDescription(Context context, long j8, boolean z7, boolean z8, boolean z9) {
        String optionalYearMonthDayOfWeekDay = getOptionalYearMonthDayOfWeekDay(j8);
        if (z7) {
            optionalYearMonthDayOfWeekDay = String.format(context.getString(R.string.mtrl_picker_today_description), optionalYearMonthDayOfWeekDay);
        }
        return z8 ? String.format(context.getString(R.string.mtrl_picker_start_date_description), optionalYearMonthDayOfWeekDay) : z9 ? String.format(context.getString(R.string.mtrl_picker_end_date_description), optionalYearMonthDayOfWeekDay) : optionalYearMonthDayOfWeekDay;
    }

    static String getMonthDay(long j8) {
        return getMonthDay(j8, Locale.getDefault());
    }

    static String getMonthDayOfWeekDay(long j8) {
        return getMonthDayOfWeekDay(j8, Locale.getDefault());
    }

    static String getOptionalYearMonthDayOfWeekDay(long j8) {
        return isDateWithinCurrentYear(j8) ? getMonthDayOfWeekDay(j8) : getYearMonthDayOfWeekDay(j8);
    }

    static String getYearContentDescription(Context context, int i8) {
        return UtcDates.getTodayCalendar().get(1) == i8 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i8)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i8));
    }

    static String getYearMonth(long j8) {
        String format;
        if (Build.VERSION.SDK_INT < 24) {
            return DateUtils.formatDateTime(null, j8, 8228);
        }
        format = UtcDates.getYearMonthFormat(Locale.getDefault()).format(new Date(j8));
        return format;
    }

    static String getYearMonthDay(long j8) {
        return getYearMonthDay(j8, Locale.getDefault());
    }

    static String getYearMonthDayOfWeekDay(long j8) {
        return getYearMonthDayOfWeekDay(j8, Locale.getDefault());
    }

    private static boolean isDateWithinCurrentYear(long j8) {
        Calendar todayCalendar = UtcDates.getTodayCalendar();
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        utcCalendar.setTimeInMillis(j8);
        return todayCalendar.get(1) == utcCalendar.get(1);
    }

    static Pair<String, String> getDateRangeString(@Nullable Long l8, @Nullable Long l9, @Nullable SimpleDateFormat simpleDateFormat) {
        if (l8 == null && l9 == null) {
            return Pair.create(null, null);
        }
        if (l8 == null) {
            return Pair.create(null, getDateString(l9.longValue(), simpleDateFormat));
        }
        if (l9 == null) {
            return Pair.create(getDateString(l8.longValue(), simpleDateFormat), null);
        }
        Calendar todayCalendar = UtcDates.getTodayCalendar();
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        utcCalendar.setTimeInMillis(l8.longValue());
        Calendar utcCalendar2 = UtcDates.getUtcCalendar();
        utcCalendar2.setTimeInMillis(l9.longValue());
        if (simpleDateFormat != null) {
            return Pair.create(simpleDateFormat.format(new Date(l8.longValue())), simpleDateFormat.format(new Date(l9.longValue())));
        }
        return utcCalendar.get(1) == utcCalendar2.get(1) ? utcCalendar.get(1) == todayCalendar.get(1) ? Pair.create(getMonthDay(l8.longValue(), Locale.getDefault()), getMonthDay(l9.longValue(), Locale.getDefault())) : Pair.create(getMonthDay(l8.longValue(), Locale.getDefault()), getYearMonthDay(l9.longValue(), Locale.getDefault())) : Pair.create(getYearMonthDay(l8.longValue(), Locale.getDefault()), getYearMonthDay(l9.longValue(), Locale.getDefault()));
    }

    static String getDateString(long j8, @Nullable SimpleDateFormat simpleDateFormat) {
        return simpleDateFormat != null ? simpleDateFormat.format(new Date(j8)) : isDateWithinCurrentYear(j8) ? getMonthDay(j8) : getYearMonthDay(j8);
    }

    static String getMonthDay(long j8, Locale locale) {
        String format;
        if (Build.VERSION.SDK_INT < 24) {
            return UtcDates.getMediumNoYear(locale).format(new Date(j8));
        }
        format = UtcDates.getAbbrMonthDayFormat(locale).format(new Date(j8));
        return format;
    }

    static String getMonthDayOfWeekDay(long j8, Locale locale) {
        String format;
        if (Build.VERSION.SDK_INT < 24) {
            return UtcDates.getFullFormat(locale).format(new Date(j8));
        }
        format = UtcDates.getMonthWeekdayDayFormat(locale).format(new Date(j8));
        return format;
    }

    static String getYearMonthDay(long j8, Locale locale) {
        String format;
        if (Build.VERSION.SDK_INT < 24) {
            return UtcDates.getMediumFormat(locale).format(new Date(j8));
        }
        format = UtcDates.getYearAbbrMonthDayFormat(locale).format(new Date(j8));
        return format;
    }

    static String getYearMonthDayOfWeekDay(long j8, Locale locale) {
        String format;
        if (Build.VERSION.SDK_INT < 24) {
            return UtcDates.getFullFormat(locale).format(new Date(j8));
        }
        format = UtcDates.getYearMonthWeekdayDayFormat(locale).format(new Date(j8));
        return format;
    }
}
