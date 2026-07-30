package m3;

import android.content.Context;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.BandPeriodTimeModel;
import com.crrepa.band.my.model.band.provider.BandTimeSystemProvider;
import com.moyoung.dafit.module.common.utils.m;
import java.util.Calendar;
import java.util.Date;

/* loaded from: classes2.dex */
public class a {
    private static final int ALL_DAY_MINUTE_COUNT = 1440;
    private static final int NOOD_HOUR_NUMBER = 12;
    private static final String PERIOD_DIVIDER = "-";
    private static final String SPACE = " ";

    private a() {
    }

    public static String formatBandPeriodTime(Context context, BandPeriodTimeModel bandPeriodTimeModel, int i8) {
        int startHour = bandPeriodTimeModel.getStartHour();
        int startMinute = bandPeriodTimeModel.getStartMinute();
        int endHour = bandPeriodTimeModel.getEndHour();
        int endMinute = bandPeriodTimeModel.getEndMinute();
        if (startHour == endHour && startMinute == endMinute) {
            return i8 == 2 ? context.getString(R.string.all_day) : context.getString(R.string.close);
        }
        if (i8 == 1) {
            if (1440 - (((((endHour <= startHour ? endHour + 24 : endHour) - startHour) * 60) + endMinute) - startMinute) == 1) {
                return context.getString(R.string.all_day);
            }
        }
        return formatPeriodTime(context, startHour, startMinute) + " - " + formatPeriodTime(context, endHour, endMinute);
    }

    public static String formatPeriodTime(Context context, int i8, int i9) {
        Calendar calendar = com.moyoung.dafit.module.common.utils.k.getCalendar();
        calendar.set(11, i8);
        calendar.set(12, i9);
        Date time = calendar.getTime();
        String string = context.getString(R.string.hour_minute_format_24);
        if (BandTimeSystemProvider.is12HourTime()) {
            string = context.getString(R.string.hour_minute_format_12);
        }
        return m.format(time, string);
    }

    public static String formatPeriodTime(Context context, Date date) {
        String string = context.getString(R.string.hour_minute_format_24);
        if (BandTimeSystemProvider.is12HourTime()) {
            string = context.getString(R.string.hour_minute_format_12);
        }
        return m.format(date, string);
    }
}
