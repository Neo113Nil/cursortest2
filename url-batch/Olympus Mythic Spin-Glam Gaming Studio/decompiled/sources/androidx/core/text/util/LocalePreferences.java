package androidx.core.text.util;

import android.icu.number.NumberFormatter;
import android.icu.number.UnlocalizedNumberFormatter;
import android.icu.text.DateFormat;
import android.icu.text.DateTimePatternGenerator;
import android.icu.util.Calendar;
import android.icu.util.MeasureUnit;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;

@RequiresApi
/* loaded from: classes10.dex */
public final class LocalePreferences {
    private static final String[] WEATHER_FAHRENHEIT_COUNTRIES = {"BS", "BZ", "KY", "PR", "PW", "US"};

    public static class CalendarType {

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface CalendarTypes {
        }
    }

    public static class FirstDayOfWeek {

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface Days {
        }
    }

    public static class HourCycle {

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface HourCycleTypes {
        }
    }

    public static class TemperatureUnit {

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface TemperatureUnits {
        }
    }

    @RequiresApi
    private static class Api24Impl {
        @DoNotInline
        static String getCalendarType(@NonNull Locale locale) {
            return Calendar.getInstance(locale).getType();
        }

        @DoNotInline
        static Locale getDefaultLocale() {
            return Locale.getDefault(Locale.Category.FORMAT);
        }
    }

    @RequiresApi
    private static class Api33Impl {
        @DoNotInline
        static String getResolvedTemperatureUnit(@NonNull Locale locale) {
            String identifier = ((UnlocalizedNumberFormatter) ((UnlocalizedNumberFormatter) NumberFormatter.with().usage("weather")).unit(MeasureUnit.CELSIUS)).locale(locale).format(1L).getOutputUnit().getIdentifier();
            return identifier.startsWith("fahrenhe") ? "fahrenhe" : identifier;
        }

        @DoNotInline
        static String getHourCycle(@NonNull Locale locale) {
            return getHourCycleType(DateTimePatternGenerator.getInstance(locale).getDefaultHourCycle());
        }

        private static String getHourCycleType(DateFormat.HourCycle hourCycle) {
            int i = AnonymousClass1.$SwitchMap$android$icu$text$DateFormat$HourCycle[hourCycle.ordinal()];
            if (i == 1) {
                return "h11";
            }
            if (i == 2) {
                return "h12";
            }
            if (i == 3) {
                return "h23";
            }
            if (i == 4) {
                return "h24";
            }
            return "";
        }
    }

    /* renamed from: androidx.core.text.util.LocalePreferences$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$android$icu$text$DateFormat$HourCycle;

        static {
            DateFormat.HourCycle[] values;
            DateFormat.HourCycle hourCycle;
            int ordinal;
            DateFormat.HourCycle hourCycle2;
            int ordinal2;
            DateFormat.HourCycle hourCycle3;
            int ordinal3;
            DateFormat.HourCycle hourCycle4;
            int ordinal4;
            values = DateFormat.HourCycle.values();
            int[] iArr = new int[values.length];
            $SwitchMap$android$icu$text$DateFormat$HourCycle = iArr;
            try {
                hourCycle4 = DateFormat.HourCycle.HOUR_CYCLE_11;
                ordinal4 = hourCycle4.ordinal();
                iArr[ordinal4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = $SwitchMap$android$icu$text$DateFormat$HourCycle;
                hourCycle3 = DateFormat.HourCycle.HOUR_CYCLE_12;
                ordinal3 = hourCycle3.ordinal();
                iArr2[ordinal3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = $SwitchMap$android$icu$text$DateFormat$HourCycle;
                hourCycle2 = DateFormat.HourCycle.HOUR_CYCLE_23;
                ordinal2 = hourCycle2.ordinal();
                iArr3[ordinal2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = $SwitchMap$android$icu$text$DateFormat$HourCycle;
                hourCycle = DateFormat.HourCycle.HOUR_CYCLE_24;
                ordinal = hourCycle.ordinal();
                iArr4[ordinal] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }
}
