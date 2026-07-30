package cn.hutool.core.date;

import java.time.temporal.ChronoUnit;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'MINUTE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class DateUnit {
    private static final /* synthetic */ DateUnit[] $VALUES;
    public static final DateUnit DAY;
    public static final DateUnit HOUR;
    public static final DateUnit MINUTE;
    public static final DateUnit MS;
    public static final DateUnit SECOND;
    public static final DateUnit WEEK;
    private final long millis;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$cn$hutool$core$date$DateUnit;
        static final /* synthetic */ int[] $SwitchMap$java$time$temporal$ChronoUnit;

        static {
            ChronoUnit[] values;
            ChronoUnit chronoUnit;
            int ordinal;
            ChronoUnit chronoUnit2;
            int ordinal2;
            ChronoUnit chronoUnit3;
            int ordinal3;
            ChronoUnit chronoUnit4;
            int ordinal4;
            ChronoUnit chronoUnit5;
            int ordinal5;
            ChronoUnit chronoUnit6;
            int ordinal6;
            int[] iArr = new int[DateUnit.values().length];
            $SwitchMap$cn$hutool$core$date$DateUnit = iArr;
            try {
                iArr[DateUnit.MS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cn$hutool$core$date$DateUnit[DateUnit.SECOND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$cn$hutool$core$date$DateUnit[DateUnit.MINUTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$cn$hutool$core$date$DateUnit[DateUnit.HOUR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$cn$hutool$core$date$DateUnit[DateUnit.DAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$cn$hutool$core$date$DateUnit[DateUnit.WEEK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            values = ChronoUnit.values();
            int[] iArr2 = new int[values.length];
            $SwitchMap$java$time$temporal$ChronoUnit = iArr2;
            try {
                chronoUnit6 = ChronoUnit.MICROS;
                ordinal6 = chronoUnit6.ordinal();
                iArr2[ordinal6] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                int[] iArr3 = $SwitchMap$java$time$temporal$ChronoUnit;
                chronoUnit5 = ChronoUnit.SECONDS;
                ordinal5 = chronoUnit5.ordinal();
                iArr3[ordinal5] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                int[] iArr4 = $SwitchMap$java$time$temporal$ChronoUnit;
                chronoUnit4 = ChronoUnit.MINUTES;
                ordinal4 = chronoUnit4.ordinal();
                iArr4[ordinal4] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                int[] iArr5 = $SwitchMap$java$time$temporal$ChronoUnit;
                chronoUnit3 = ChronoUnit.HOURS;
                ordinal3 = chronoUnit3.ordinal();
                iArr5[ordinal3] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                int[] iArr6 = $SwitchMap$java$time$temporal$ChronoUnit;
                chronoUnit2 = ChronoUnit.DAYS;
                ordinal2 = chronoUnit2.ordinal();
                iArr6[ordinal2] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                int[] iArr7 = $SwitchMap$java$time$temporal$ChronoUnit;
                chronoUnit = ChronoUnit.WEEKS;
                ordinal = chronoUnit.ordinal();
                iArr7[ordinal] = 6;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        DateUnit dateUnit = new DateUnit("MS", 0, 1L);
        MS = dateUnit;
        DateUnit dateUnit2 = new DateUnit("SECOND", 1, 1000L);
        SECOND = dateUnit2;
        DateUnit dateUnit3 = new DateUnit("MINUTE", 2, dateUnit2.getMillis() * 60);
        MINUTE = dateUnit3;
        DateUnit dateUnit4 = new DateUnit("HOUR", 3, dateUnit3.getMillis() * 60);
        HOUR = dateUnit4;
        DateUnit dateUnit5 = new DateUnit("DAY", 4, dateUnit4.getMillis() * 24);
        DAY = dateUnit5;
        DateUnit dateUnit6 = new DateUnit("WEEK", 5, dateUnit5.getMillis() * 7);
        WEEK = dateUnit6;
        $VALUES = new DateUnit[]{dateUnit, dateUnit2, dateUnit3, dateUnit4, dateUnit5, dateUnit6};
    }

    private DateUnit(String str, int i8, long j8) {
        this.millis = j8;
    }

    public static DateUnit of(ChronoUnit chronoUnit) {
        int ordinal;
        int[] iArr = a.$SwitchMap$java$time$temporal$ChronoUnit;
        ordinal = chronoUnit.ordinal();
        switch (iArr[ordinal]) {
            case 1:
                return MS;
            case 2:
                return SECOND;
            case 3:
                return MINUTE;
            case 4:
                return HOUR;
            case 5:
                return DAY;
            case 6:
                return WEEK;
            default:
                return null;
        }
    }

    public static DateUnit valueOf(String str) {
        return (DateUnit) Enum.valueOf(DateUnit.class, str);
    }

    public static DateUnit[] values() {
        return (DateUnit[]) $VALUES.clone();
    }

    public long getMillis() {
        return this.millis;
    }

    public ChronoUnit toChronoUnit() {
        return toChronoUnit(this);
    }

    public static ChronoUnit toChronoUnit(DateUnit dateUnit) {
        ChronoUnit chronoUnit;
        ChronoUnit chronoUnit2;
        ChronoUnit chronoUnit3;
        ChronoUnit chronoUnit4;
        ChronoUnit chronoUnit5;
        ChronoUnit chronoUnit6;
        switch (a.$SwitchMap$cn$hutool$core$date$DateUnit[dateUnit.ordinal()]) {
            case 1:
                chronoUnit = ChronoUnit.MICROS;
                return chronoUnit;
            case 2:
                chronoUnit2 = ChronoUnit.SECONDS;
                return chronoUnit2;
            case 3:
                chronoUnit3 = ChronoUnit.MINUTES;
                return chronoUnit3;
            case 4:
                chronoUnit4 = ChronoUnit.HOURS;
                return chronoUnit4;
            case 5:
                chronoUnit5 = ChronoUnit.DAYS;
                return chronoUnit5;
            case 6:
                chronoUnit6 = ChronoUnit.WEEKS;
                return chronoUnit6;
            default:
                return null;
        }
    }
}
