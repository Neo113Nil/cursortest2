package cn.hutool.core.date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalField;
import java.time.temporal.UnsupportedTemporalTypeException;
import java.time.temporal.ValueRange;

/* loaded from: classes.dex */
public class t2 extends c3 {
    public static String format(TemporalAccessor temporalAccessor, DateTimeFormatter dateTimeFormatter) {
        ZoneId systemDefault;
        ZonedDateTime atZone;
        String format;
        String message;
        LocalDate now;
        LocalDateTime atDate;
        String format2;
        String message2;
        LocalDateTime atStartOfDay;
        String format3;
        String format4;
        if (temporalAccessor == null) {
            return null;
        }
        if (c2.a(temporalAccessor)) {
            return temporalAccessor.toString();
        }
        if (dateTimeFormatter == null) {
            dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        }
        try {
            format4 = dateTimeFormatter.format(temporalAccessor);
            return format4;
        } catch (UnsupportedTemporalTypeException e8) {
            if (c0.a(temporalAccessor)) {
                message2 = e8.getMessage();
                if (message2.contains("HourOfDay")) {
                    atStartOfDay = k0.a(temporalAccessor).atStartOfDay();
                    format3 = dateTimeFormatter.format(atStartOfDay);
                    return format3;
                }
            }
            if (y1.a(temporalAccessor)) {
                message = e8.getMessage();
                if (message.contains("YearOfEra")) {
                    LocalTime a8 = s1.a(temporalAccessor);
                    now = LocalDate.now();
                    atDate = a8.atDate(now);
                    format2 = dateTimeFormatter.format(atDate);
                    return format2;
                }
            }
            if (!n0.a(temporalAccessor)) {
                throw e8;
            }
            Instant a9 = cn.hutool.core.convert.impl.a1.a(temporalAccessor);
            systemDefault = ZoneId.systemDefault();
            atZone = a9.atZone(systemDefault);
            format = dateTimeFormatter.format(atZone);
            return format;
        }
    }

    public static int get(TemporalAccessor temporalAccessor, TemporalField temporalField) {
        boolean isSupported;
        ValueRange range;
        long minimum;
        int i8;
        isSupported = temporalAccessor.isSupported(temporalField);
        if (isSupported) {
            i8 = temporalAccessor.get(temporalField);
            return i8;
        }
        range = temporalField.range();
        minimum = range.getMinimum();
        return (int) minimum;
    }

    public static boolean isIn(TemporalAccessor temporalAccessor, TemporalAccessor temporalAccessor2, TemporalAccessor temporalAccessor3) {
        return isIn(temporalAccessor, temporalAccessor2, temporalAccessor3, true, true);
    }

    public static long toEpochMilli(TemporalAccessor temporalAccessor) {
        long epochMilli;
        int value;
        int value2;
        int value3;
        if (c2.a(temporalAccessor)) {
            value3 = n2.a(temporalAccessor).getValue();
            return value3;
        }
        if (r1.a(temporalAccessor)) {
            value2 = p2.a(temporalAccessor).getValue();
            return value2;
        }
        if (l2.a(temporalAccessor)) {
            value = r2.a(temporalAccessor).getValue();
            return value;
        }
        epochMilli = toInstant(temporalAccessor).toEpochMilli();
        return epochMilli;
    }

    public static Instant toInstant(TemporalAccessor temporalAccessor) {
        LocalDate now;
        OffsetDateTime atDate;
        Instant instant;
        LocalDate now2;
        LocalDateTime atDate2;
        ZoneId systemDefault;
        ZonedDateTime atZone;
        ZoneId systemDefault2;
        ZonedDateTime atStartOfDay;
        Instant instant2;
        ZoneId systemDefault3;
        ZonedDateTime atZone2;
        if (temporalAccessor == null) {
            return null;
        }
        if (n0.a(temporalAccessor)) {
            return cn.hutool.core.convert.impl.a1.a(temporalAccessor);
        }
        if (cn.hutool.core.convert.impl.v1.a(temporalAccessor)) {
            LocalDateTime a8 = cn.hutool.core.convert.b.a(temporalAccessor);
            systemDefault3 = ZoneId.systemDefault();
            atZone2 = a8.atZone(systemDefault3);
            return atZone2.toInstant();
        }
        if (cn.hutool.core.convert.impl.i0.a(temporalAccessor)) {
            return cn.hutool.core.convert.impl.j0.a(temporalAccessor).toInstant();
        }
        if (j2.a(temporalAccessor)) {
            instant2 = k2.a(temporalAccessor).toInstant();
            return instant2;
        }
        if (c0.a(temporalAccessor)) {
            LocalDate a9 = k0.a(temporalAccessor);
            systemDefault2 = ZoneId.systemDefault();
            atStartOfDay = a9.atStartOfDay(systemDefault2);
            return atStartOfDay.toInstant();
        }
        if (y1.a(temporalAccessor)) {
            LocalTime a10 = s1.a(temporalAccessor);
            now2 = LocalDate.now();
            atDate2 = a10.atDate(now2);
            systemDefault = ZoneId.systemDefault();
            atZone = atDate2.atZone(systemDefault);
            return atZone.toInstant();
        }
        if (!g2.a(temporalAccessor)) {
            return toInstant(k1.of(temporalAccessor));
        }
        OffsetTime a11 = h2.a(temporalAccessor);
        now = LocalDate.now();
        atDate = a11.atDate(now);
        instant = atDate.toInstant();
        return instant;
    }

    public static boolean isIn(TemporalAccessor temporalAccessor, TemporalAccessor temporalAccessor2, TemporalAccessor temporalAccessor3, boolean z7, boolean z8) {
        if (temporalAccessor == null || temporalAccessor2 == null || temporalAccessor3 == null) {
            throw new IllegalArgumentException("参数不可为null");
        }
        long epochMilli = toEpochMilli(temporalAccessor);
        long epochMilli2 = toEpochMilli(temporalAccessor2);
        long epochMilli3 = toEpochMilli(temporalAccessor3);
        long min = Math.min(epochMilli2, epochMilli3);
        long max = Math.max(epochMilli2, epochMilli3);
        boolean z9 = min < epochMilli && epochMilli < max;
        if (!z9 && z7) {
            z9 = epochMilli == min;
        }
        if (z9 || !z8) {
            return z9;
        }
        return epochMilli == max;
    }

    public static String format(TemporalAccessor temporalAccessor, String str) {
        if (temporalAccessor == null) {
            return null;
        }
        if (!r1.a(temporalAccessor) && !c2.a(temporalAccessor) && !l2.a(temporalAccessor) && !m2.a(temporalAccessor)) {
            if (cn.hutool.core.date.format.o.isCustomFormat(str)) {
                return cn.hutool.core.date.format.o.format(temporalAccessor, str);
            }
            return format(temporalAccessor, cn.hutool.core.text.l.isBlank(str) ? null : DateTimeFormatter.ofPattern(str));
        }
        return temporalAccessor.toString();
    }
}
