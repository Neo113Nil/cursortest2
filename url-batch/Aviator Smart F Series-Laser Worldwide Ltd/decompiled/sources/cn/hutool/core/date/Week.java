package cn.hutool.core.date;

import androidx.core.text.util.LocalePreferences;
import java.time.DayOfWeek;

/* loaded from: classes.dex */
public enum Week {
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);

    private static final String[] ALIASES = {LocalePreferences.FirstDayOfWeek.SUNDAY, LocalePreferences.FirstDayOfWeek.MONDAY, LocalePreferences.FirstDayOfWeek.TUESDAY, LocalePreferences.FirstDayOfWeek.WEDNESDAY, LocalePreferences.FirstDayOfWeek.THURSDAY, LocalePreferences.FirstDayOfWeek.FRIDAY, LocalePreferences.FirstDayOfWeek.SATURDAY};
    private static final Week[] ENUMS = values();
    private final int value;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$cn$hutool$core$date$Week;

        static {
            int[] iArr = new int[Week.values().length];
            $SwitchMap$cn$hutool$core$date$Week = iArr;
            try {
                iArr[Week.SUNDAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cn$hutool$core$date$Week[Week.MONDAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$cn$hutool$core$date$Week[Week.TUESDAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$cn$hutool$core$date$Week[Week.WEDNESDAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$cn$hutool$core$date$Week[Week.THURSDAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$cn$hutool$core$date$Week[Week.FRIDAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$cn$hutool$core$date$Week[Week.SATURDAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    Week(int i8) {
        this.value = i8;
    }

    public static Week of(int i8) {
        Week[] weekArr = ENUMS;
        if (i8 > weekArr.length || i8 < 1) {
            return null;
        }
        return weekArr[i8 - 1];
    }

    public int getIso8601Value() {
        int value = getValue() - 1;
        if (value == 0) {
            return 7;
        }
        return value;
    }

    public int getValue() {
        return this.value;
    }

    public String toChinese() {
        return toChinese("星期");
    }

    public DayOfWeek toJdkDayOfWeek() {
        DayOfWeek of;
        of = DayOfWeek.of(getIso8601Value());
        return of;
    }

    public String toChinese(String str) {
        switch (a.$SwitchMap$cn$hutool$core$date$Week[ordinal()]) {
            case 1:
                return str + "日";
            case 2:
                return str + "一";
            case 3:
                return str + "二";
            case 4:
                return str + "三";
            case 5:
                return str + "四";
            case 6:
                return str + "五";
            case 7:
                return str + "六";
            default:
                return null;
        }
    }

    public static Week of(String str) {
        cn.hutool.core.lang.q.notBlank(str);
        Week of = of(cn.hutool.core.util.h.indexOfIgnoreCase(ALIASES, str) + 1);
        return of == null ? valueOf(str.toUpperCase()) : of;
    }

    public static Week of(DayOfWeek dayOfWeek) {
        int value;
        cn.hutool.core.lang.q.notNull(dayOfWeek);
        value = dayOfWeek.getValue();
        int i8 = value + 1;
        return of(8 != i8 ? i8 : 1);
    }
}
