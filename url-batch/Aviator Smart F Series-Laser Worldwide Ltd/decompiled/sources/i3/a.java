package i3;

import android.annotation.SuppressLint;
import android.content.Context;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.band.provider.BandTimeSystemProvider;
import com.google.android.material.timepicker.TimeModel;
import com.moyoung.dafit.module.common.utils.k;
import com.moyoung.dafit.module.common.utils.u;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes2.dex */
public class a {
    public static final int DAY_MONTH_YEAR = 3;
    public static final int MONTH_DAY_YEAR = 2;
    public static final int YEAR_MONTH_DAY = 1;

    private a() {
    }

    public static void getAllLocale() {
        ArrayList arrayList = new ArrayList();
        for (String str : Locale.getISOCountries()) {
            Locale locale = new Locale("", str);
            arrayList.add("country: " + str + "; " + locale.getDisplayName(Locale.CHINESE) + "; " + locale.getDisplayName(Locale.US));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            System.out.println((String) it.next());
        }
    }

    public static int getDateDay(Date date) {
        Calendar calendar = k.getCalendar();
        calendar.setTime(date);
        return calendar.get(5);
    }

    public static int getDateHour(Date date) {
        Calendar calendar = k.getCalendar();
        calendar.setTime(date);
        return calendar.get(11);
    }

    public static int getDateMinute(Date date) {
        Calendar calendar = k.getCalendar();
        calendar.setTime(date);
        return calendar.get(12);
    }

    public static int getDateMonth(Date date) {
        Calendar calendar = k.getCalendar();
        calendar.setTime(date);
        return calendar.get(2);
    }

    public static int getDateSortType() {
        if (u.isEN()) {
            return 3;
        }
        if (u.isOfCountry(u.COUNTRY_CN, u.COUNTRY_JP, u.COUNTRY_KR, u.COUNTRY_ZA)) {
            return 1;
        }
        return u.isOfCountry(u.COUNTRY_US, u.COUNTRY_CA) ? 2 : 3;
    }

    public static String getDateText(Context context, Date date, int i8) {
        String string = context.getString(R.string.year_month_day_format);
        if (i8 == 1) {
            string = context.getString(R.string.year_format);
        } else if (i8 == 2) {
            string = context.getString(R.string.month_format);
        } else if (i8 == 5) {
            string = context.getString(R.string.day_format);
        }
        return new SimpleDateFormat(string).format(date);
    }

    public static int getDateYear(Date date) {
        Calendar calendar = k.getCalendar();
        calendar.setTime(date);
        return calendar.get(1);
    }

    public static int getDayNumOfMonth(Date date) {
        Calendar calendar = k.getCalendar();
        calendar.setTime(date);
        calendar.set(5, 1);
        calendar.roll(5, -1);
        return calendar.get(5);
    }

    public static int getDayOfWeek(Date date) {
        Calendar calendar = k.getCalendar();
        calendar.setTime(date);
        return calendar.get(7);
    }

    public static Date getEndDateOfMonth(Date date) {
        Calendar calendar = k.getCalendar();
        calendar.setTime(date);
        calendar.set(5, getDayNumOfMonth(date));
        return calendar.getTime();
    }

    public static int getHourType(int i8) {
        Calendar calendar = k.getCalendar();
        calendar.set(11, i8);
        return calendar.get(9);
    }

    public static Date getStartDateOfMonth(Date date) {
        Calendar calendar = k.getCalendar();
        calendar.setTime(date);
        calendar.set(5, 1);
        return calendar.getTime();
    }

    public static Date getStartDateOfWeek(Date date) {
        Calendar calendar = k.getCalendar();
        calendar.setTime(date);
        calendar.setFirstDayOfWeek(1);
        calendar.set(7, calendar.getFirstDayOfWeek());
        return calendar.getTime();
    }

    public static Date getStartDateOfYear(Date date) {
        Calendar calendar = k.getCalendar();
        calendar.setTime(date);
        calendar.set(6, 1);
        return calendar.getTime();
    }

    public static Date getTimeDate(int i8, int i9) {
        Calendar calendar = k.getCalendar();
        calendar.setTime(new Date());
        calendar.set(11, i8);
        calendar.set(12, i9);
        calendar.set(13, 0);
        return calendar.getTime();
    }

    public static String getTimeFormat(Context context) {
        String string = context.getString(R.string.hour_minute_format_24);
        return BandTimeSystemProvider.is12HourTime() ? u.isZH() ? context.getString(R.string.hour_minute_format_12_zh) : u.isEN() ? context.getString(R.string.hour_minute_format_12) : string : string;
    }

    public static Date getWatchRecordTime(int i8, int i9) {
        Calendar calendar = k.getCalendar();
        calendar.setTime(new Date());
        calendar.set(11, i8);
        calendar.set(12, i9);
        calendar.set(13, 59);
        return calendar.getTime();
    }

    public static String getWorldClockTimeFormat(Context context) {
        return BandTimeSystemProvider.is12HourTime() ? context.getString(R.string.hour_minute_format_12) : context.getString(R.string.hour_minute_format_24);
    }

    @SuppressLint({"DefaultLocale"})
    public static String getYMDString(Date date) {
        Calendar calendar = k.getCalendar();
        calendar.setTime(date);
        return String.format("%04d", Integer.valueOf(calendar.get(1))) + String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(calendar.get(2) + 1)) + String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(calendar.get(5)));
    }

    public static int hourTypeChange(int i8, int i9, int i10) {
        Calendar calendar = k.getCalendar();
        calendar.set(i8, i9);
        if (i8 == 11) {
            return calendar.get(10);
        }
        if (i8 != 10) {
            return i9;
        }
        calendar.set(9, i10);
        return calendar.get(11);
    }

    public static boolean isGreaterDay(Date date, Date date2) {
        Calendar calendar = k.getCalendar();
        Calendar calendar2 = k.getCalendar();
        calendar.setTime(date);
        calendar2.setTime(date2);
        if (calendar.get(1) > calendar2.get(1)) {
            return true;
        }
        return calendar.get(1) == calendar2.get(1) && calendar.get(6) > calendar2.get(6);
    }

    public static boolean isHalfYearOld(Date date) {
        Calendar calendar = k.getCalendar();
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

    public static boolean isSameDay(Date date, Date date2) {
        Calendar calendar = k.getCalendar();
        Calendar calendar2 = k.getCalendar();
        calendar.setTime(date);
        calendar2.setTime(date2);
        return calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6);
    }

    public static boolean isSameMinute(Date date, Date date2) {
        Calendar calendar = k.getCalendar();
        Calendar calendar2 = k.getCalendar();
        calendar.setTime(date);
        calendar2.setTime(date2);
        return calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6) && calendar.get(11) == calendar2.get(11) && calendar.get(12) == calendar2.get(12);
    }

    public static boolean isSameMonth(Date date, Date date2) {
        Calendar calendar = k.getCalendar();
        Calendar calendar2 = k.getCalendar();
        calendar.setTime(date);
        calendar2.setTime(date2);
        return calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2);
    }

    public static Date updateDateByHourMinute(Date date, int i8, int i9) {
        Calendar calendar = k.getCalendar();
        calendar.setTime(date);
        calendar.set(11, i8);
        calendar.set(12, i9);
        return calendar.getTime();
    }

    public static Date updateDateByYearMonthDay(Date date, Date date2) {
        Calendar calendar = k.getCalendar();
        Calendar calendar2 = k.getCalendar();
        calendar.setTime(date);
        calendar2.setTime(date2);
        calendar.set(1, calendar2.get(1));
        calendar.set(2, calendar2.get(2));
        calendar.set(5, calendar2.get(5));
        return calendar.getTime();
    }

    public static Date getTimeDate(long j8) {
        Calendar calendar = k.getCalendar();
        calendar.setTimeInMillis(j8);
        return calendar.getTime();
    }
}
