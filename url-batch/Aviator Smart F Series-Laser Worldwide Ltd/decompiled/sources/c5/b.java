package c5;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.moyoung.classes.R$mipmap;
import com.moyoung.classes.R$string;
import com.moyoung.classes.completed.ClassesHistoryAdapter;
import com.moyoung.dafit.module.common.utils.m;
import com.moyoung.dafit.module.common.utils.u;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class b {
    public static String getCourseStartDateStr(Context context, long j8) {
        if (j8 == 0) {
            return "";
        }
        return m.format(new Date(j8), ClassesHistoryAdapter.is12HourTime(context) ? "yyyy/MM/dd hh:mm a" : "yyyy/MM/dd HH:mm");
    }

    public static String getKcalStr(Context context, int i8) {
        return i8 + "" + context.getResources().getString(R$string.classes_calorie_unit);
    }

    @SuppressLint({"UseCompatLoadingForDrawables"})
    public static Drawable getLevelDrawable(Context context, int i8) {
        return i8 == 1 ? context.getResources().getDrawable(R$mipmap.ic_fitness_level_l2) : i8 == 2 ? context.getResources().getDrawable(R$mipmap.ic_fitness_level_l3) : context.getResources().getDrawable(R$mipmap.ic_fitness_level_l1);
    }

    public static String getLevelStr(Context context, int i8) {
        return i8 == 1 ? context.getString(R$string.course_fitness_middle_level_title) : i8 == 2 ? context.getString(R$string.course_fitness_high_level_title) : context.getString(R$string.course_fitness_low_level_title);
    }

    public static String getRepeatCountStr(Context context, int i8) {
        return i8 + "" + context.getResources().getString(R$string.classes_record_times);
    }

    @NonNull
    @SuppressLint({"DefaultLocale"})
    public static String ms2HourAndMinAndSecondStr(long j8) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long hours = timeUnit.toHours(j8);
        long minutes = timeUnit.toMinutes(j8) - timeUnit.toMinutes(hours);
        long seconds = timeUnit.toSeconds(j8) - TimeUnit.MINUTES.toSeconds(minutes);
        Locale locale = new Locale("en", u.COUNTRY_US);
        return hours > 0 ? String.format(locale, "%02d:%02d:%02d", Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds)) : String.format(locale, "%02d:%02d", Long.valueOf(minutes), Long.valueOf(seconds));
    }

    @NonNull
    @SuppressLint({"DefaultLocale"})
    public static String ms2HourAndMinAndSecondStr2(long j8) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long hours = timeUnit.toHours(j8);
        long minutes = timeUnit.toMinutes(j8) - timeUnit.toMinutes(hours);
        return String.format(new Locale("en", u.COUNTRY_US), "%02d:%02d:%02d", Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(timeUnit.toSeconds(j8) - TimeUnit.MINUTES.toSeconds(minutes)));
    }

    @NonNull
    @SuppressLint({"DefaultLocale"})
    public static String ms2MinAndSecondStr(long j8) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long minutes = timeUnit.toMinutes(j8);
        return String.format(new Locale("en", u.COUNTRY_US), "%02d:%02d", Long.valueOf(minutes), Long.valueOf(timeUnit.toSeconds(j8) - TimeUnit.MINUTES.toSeconds(minutes)));
    }

    public static int ms2MinuteCeil(long j8) {
        return (int) Math.ceil((j8 / 1000.0f) / 60.0f);
    }

    public static String ms2MinuteRoundStr(Context context, long j8) {
        return ms2MinuteCeil(j8) + "" + context.getResources().getString(R$string.classes_minute_unit);
    }

    public static String ms2MinuteSecondRoundStr(Context context, long j8) {
        int ms2SecondCeil = ms2SecondCeil(j8);
        int i8 = ms2SecondCeil / 60;
        int i9 = ms2SecondCeil % 60;
        if (i8 == 0) {
            return i9 + "" + context.getResources().getString(R$string.classes_second_unit);
        }
        if (i9 == 0) {
            return i8 + "" + context.getResources().getString(R$string.classes_m_unit);
        }
        return i8 + "" + context.getResources().getString(R$string.classes_m_unit) + i9 + "" + context.getResources().getString(R$string.classes_second_unit);
    }

    public static int ms2SecondCeil(long j8) {
        return (int) Math.ceil(j8 / 1000.0f);
    }

    public static String ms2SecondStr(Context context, long j8) {
        return ms2SecondCeil(j8) + "" + context.getResources().getString(R$string.classes_second_unit);
    }
}
