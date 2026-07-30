package cn.hutool.core.date;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalUnit;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class c3 {

    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$java$time$temporal$ChronoUnit;
        static final /* synthetic */ int[] $SwitchMap$java$util$concurrent$TimeUnit;

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
            ChronoUnit chronoUnit7;
            int ordinal7;
            values = ChronoUnit.values();
            int[] iArr = new int[values.length];
            $SwitchMap$java$time$temporal$ChronoUnit = iArr;
            try {
                chronoUnit7 = ChronoUnit.NANOS;
                ordinal7 = chronoUnit7.ordinal();
                iArr[ordinal7] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = $SwitchMap$java$time$temporal$ChronoUnit;
                chronoUnit6 = ChronoUnit.MICROS;
                ordinal6 = chronoUnit6.ordinal();
                iArr2[ordinal6] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = $SwitchMap$java$time$temporal$ChronoUnit;
                chronoUnit5 = ChronoUnit.MILLIS;
                ordinal5 = chronoUnit5.ordinal();
                iArr3[ordinal5] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = $SwitchMap$java$time$temporal$ChronoUnit;
                chronoUnit4 = ChronoUnit.SECONDS;
                ordinal4 = chronoUnit4.ordinal();
                iArr4[ordinal4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                int[] iArr5 = $SwitchMap$java$time$temporal$ChronoUnit;
                chronoUnit3 = ChronoUnit.MINUTES;
                ordinal3 = chronoUnit3.ordinal();
                iArr5[ordinal3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                int[] iArr6 = $SwitchMap$java$time$temporal$ChronoUnit;
                chronoUnit2 = ChronoUnit.HOURS;
                ordinal2 = chronoUnit2.ordinal();
                iArr6[ordinal2] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                int[] iArr7 = $SwitchMap$java$time$temporal$ChronoUnit;
                chronoUnit = ChronoUnit.DAYS;
                ordinal = chronoUnit.ordinal();
                iArr7[ordinal] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr8 = new int[TimeUnit.values().length];
            $SwitchMap$java$util$concurrent$TimeUnit = iArr8;
            try {
                iArr8[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    public static Duration between(Temporal temporal, Temporal temporal2) {
        Duration between;
        between = Duration.between(temporal, temporal2);
        return between;
    }

    public static <T extends Temporal> T offset(T t7, long j8, TemporalUnit temporalUnit) {
        Temporal plus;
        if (t7 == null) {
            return null;
        }
        plus = t7.plus(j8, temporalUnit);
        return (T) plus;
    }

    public static ChronoUnit toChronoUnit(TimeUnit timeUnit) {
        ChronoUnit chronoUnit;
        ChronoUnit chronoUnit2;
        ChronoUnit chronoUnit3;
        ChronoUnit chronoUnit4;
        ChronoUnit chronoUnit5;
        ChronoUnit chronoUnit6;
        ChronoUnit chronoUnit7;
        if (timeUnit == null) {
            return null;
        }
        switch (a.$SwitchMap$java$util$concurrent$TimeUnit[timeUnit.ordinal()]) {
            case 1:
                chronoUnit = ChronoUnit.NANOS;
                return chronoUnit;
            case 2:
                chronoUnit2 = ChronoUnit.MICROS;
                return chronoUnit2;
            case 3:
                chronoUnit3 = ChronoUnit.MILLIS;
                return chronoUnit3;
            case 4:
                chronoUnit4 = ChronoUnit.SECONDS;
                return chronoUnit4;
            case 5:
                chronoUnit5 = ChronoUnit.MINUTES;
                return chronoUnit5;
            case 6:
                chronoUnit6 = ChronoUnit.HOURS;
                return chronoUnit6;
            case 7:
                chronoUnit7 = ChronoUnit.DAYS;
                return chronoUnit7;
            default:
                throw new IllegalArgumentException("Unknown TimeUnit constant");
        }
    }

    public static TimeUnit toTimeUnit(ChronoUnit chronoUnit) {
        int ordinal;
        if (chronoUnit == null) {
            return null;
        }
        int[] iArr = a.$SwitchMap$java$time$temporal$ChronoUnit;
        ordinal = chronoUnit.ordinal();
        switch (iArr[ordinal]) {
            case 1:
                return TimeUnit.NANOSECONDS;
            case 2:
                return TimeUnit.MICROSECONDS;
            case 3:
                return TimeUnit.MILLISECONDS;
            case 4:
                return TimeUnit.SECONDS;
            case 5:
                return TimeUnit.MINUTES;
            case 6:
                return TimeUnit.HOURS;
            case 7:
                return TimeUnit.DAYS;
            default:
                throw new IllegalArgumentException("ChronoUnit cannot be converted to TimeUnit: " + chronoUnit);
        }
    }

    public static long between(Temporal temporal, Temporal temporal2, ChronoUnit chronoUnit) {
        long between;
        between = chronoUnit.between(temporal, temporal2);
        return between;
    }

    public <T extends Temporal> T offset(T t7, DayOfWeek dayOfWeek, boolean z7) {
        Temporal with;
        with = t7.with(z7 ? TemporalAdjusters.previous(dayOfWeek) : TemporalAdjusters.next(dayOfWeek));
        return (T) with;
    }
}
