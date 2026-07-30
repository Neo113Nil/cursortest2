package cn.hutool.core.date;

import java.time.format.TextStyle;
import java.util.Locale;

/* loaded from: classes.dex */
public enum Month {
    JANUARY(0),
    FEBRUARY(1),
    MARCH(2),
    APRIL(3),
    MAY(4),
    JUNE(5),
    JULY(6),
    AUGUST(7),
    SEPTEMBER(8),
    OCTOBER(9),
    NOVEMBER(10),
    DECEMBER(11),
    UNDECIMBER(12);

    private final int value;
    private static final String[] ALIASES = {"jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec"};
    private static final Month[] ENUMS = values();

    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$cn$hutool$core$date$Month;

        static {
            int[] iArr = new int[Month.values().length];
            $SwitchMap$cn$hutool$core$date$Month = iArr;
            try {
                iArr[Month.FEBRUARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cn$hutool$core$date$Month[Month.APRIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$cn$hutool$core$date$Month[Month.JUNE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$cn$hutool$core$date$Month[Month.SEPTEMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$cn$hutool$core$date$Month[Month.NOVEMBER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    Month(int i8) {
        this.value = i8;
    }

    public static Month of(int i8) {
        Month[] monthArr = ENUMS;
        if (i8 >= monthArr.length || i8 < 0) {
            return null;
        }
        return monthArr[i8];
    }

    public String getDisplayName(TextStyle textStyle) {
        return getDisplayName(textStyle, Locale.getDefault());
    }

    public int getLastDay(boolean z7) {
        int i8 = a.$SwitchMap$cn$hutool$core$date$Month[ordinal()];
        return i8 != 1 ? (i8 == 2 || i8 == 3 || i8 == 4 || i8 == 5) ? 30 : 31 : z7 ? 29 : 28;
    }

    public int getValue() {
        return this.value;
    }

    public int getValueBaseOne() {
        cn.hutool.core.lang.q.isFalse(this == UNDECIMBER, "Unsupported UNDECIMBER Field", new Object[0]);
        return getValue() + 1;
    }

    public java.time.Month toJdkMonth() {
        java.time.Month of;
        of = java.time.Month.of(getValueBaseOne());
        return of;
    }

    public static int getLastDay(int i8, boolean z7) {
        Month of = of(i8);
        cn.hutool.core.lang.q.notNull(of, "Invalid Month base 0: " + i8, new Object[0]);
        return of.getLastDay(z7);
    }

    public String getDisplayName(TextStyle textStyle, Locale locale) {
        String displayName;
        displayName = toJdkMonth().getDisplayName(textStyle, locale);
        return displayName;
    }

    public static Month of(String str) {
        cn.hutool.core.lang.q.notBlank(str);
        Month of = of(cn.hutool.core.util.h.indexOfIgnoreCase(ALIASES, str));
        return of == null ? valueOf(str.toUpperCase()) : of;
    }

    public static Month of(java.time.Month month) {
        int ordinal;
        ordinal = month.ordinal();
        return of(ordinal);
    }
}
