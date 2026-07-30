package cn.hutool.core.date;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalUnit;
import java.time.temporal.WeekFields;
import java.util.Date;
import java.util.TimeZone;
import java.util.function.Supplier;

/* loaded from: classes.dex */
public class k1 {
    public static LocalDateTime beginOfDay(LocalDateTime localDateTime) {
        LocalTime localTime;
        LocalDateTime with;
        localTime = LocalTime.MIN;
        with = localDateTime.with((TemporalAdjuster) localTime);
        return with;
    }

    public static Duration between(LocalDateTime localDateTime, LocalDateTime localDateTime2) {
        return c3.between(localDateTime, localDateTime2);
    }

    public static Period betweenPeriod(LocalDate localDate, LocalDate localDate2) {
        Period between;
        between = Period.between(localDate, localDate2);
        return between;
    }

    public static Week dayOfWeek(LocalDate localDate) {
        DayOfWeek dayOfWeek;
        dayOfWeek = localDate.getDayOfWeek();
        return Week.of(dayOfWeek);
    }

    public static LocalDateTime endOfDay(LocalDateTime localDateTime) {
        return endOfDay(localDateTime, false);
    }

    public static String format(LocalDateTime localDateTime, DateTimeFormatter dateTimeFormatter) {
        return t2.format(localDateTime, dateTimeFormatter);
    }

    public static String formatNormal(LocalDateTime localDateTime) {
        return format(localDateTime, d.NORM_DATETIME_FORMATTER);
    }

    public static boolean isIn(ChronoLocalDateTime<?> chronoLocalDateTime, ChronoLocalDateTime<?> chronoLocalDateTime2, ChronoLocalDateTime<?> chronoLocalDateTime3) {
        return t2.isIn(chronoLocalDateTime, chronoLocalDateTime2, chronoLocalDateTime3);
    }

    public static boolean isOverlap(ChronoLocalDateTime<?> chronoLocalDateTime, ChronoLocalDateTime<?> chronoLocalDateTime2, ChronoLocalDateTime<?> chronoLocalDateTime3, ChronoLocalDateTime<?> chronoLocalDateTime4) {
        int compareTo;
        int compareTo2;
        compareTo = chronoLocalDateTime.compareTo((ChronoLocalDateTime<?>) chronoLocalDateTime4);
        if (compareTo <= 0) {
            compareTo2 = chronoLocalDateTime3.compareTo((ChronoLocalDateTime<?>) chronoLocalDateTime2);
            if (compareTo2 <= 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSameDay(LocalDateTime localDateTime, LocalDateTime localDateTime2) {
        LocalDate localDate;
        LocalDate localDate2;
        if (localDateTime != null && localDateTime2 != null) {
            localDate = localDateTime.toLocalDate();
            localDate2 = localDateTime2.toLocalDate();
            if (isSameDay(localDate, localDate2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isWeekend(LocalDateTime localDateTime) {
        LocalDate localDate;
        localDate = localDateTime.toLocalDate();
        return isWeekend(localDate);
    }

    public static LocalDateTime now() {
        LocalDateTime now;
        now = LocalDateTime.now();
        return now;
    }

    public static LocalDateTime of(Instant instant) {
        ZoneId systemDefault;
        systemDefault = ZoneId.systemDefault();
        return of(instant, systemDefault);
    }

    public static LocalDate ofDate(TemporalAccessor temporalAccessor) {
        ChronoField chronoField;
        ChronoField chronoField2;
        ChronoField chronoField3;
        LocalDate of;
        LocalDate localDate;
        LocalDate localDate2;
        if (temporalAccessor == null) {
            return null;
        }
        if (cn.hutool.core.convert.impl.v1.a(temporalAccessor)) {
            localDate2 = cn.hutool.core.convert.b.a(temporalAccessor).toLocalDate();
            return localDate2;
        }
        if (n0.a(temporalAccessor)) {
            localDate = of(temporalAccessor).toLocalDate();
            return localDate;
        }
        chronoField = ChronoField.YEAR;
        int i8 = t2.get(temporalAccessor, chronoField);
        chronoField2 = ChronoField.MONTH_OF_YEAR;
        int i9 = t2.get(temporalAccessor, chronoField2);
        chronoField3 = ChronoField.DAY_OF_MONTH;
        of = LocalDate.of(i8, i9, t2.get(temporalAccessor, chronoField3));
        return of;
    }

    public static LocalDateTime ofUTC(Instant instant) {
        ZoneId of;
        of = ZoneId.of("UTC");
        return of(instant, of);
    }

    public static LocalDateTime offset(LocalDateTime localDateTime, long j8, TemporalUnit temporalUnit) {
        return cn.hutool.core.convert.b.a(c3.offset(localDateTime, j8, temporalUnit));
    }

    public static LocalDateTime parse(CharSequence charSequence) {
        return parse(charSequence, g1.a(null));
    }

    public static LocalDate parseDate(CharSequence charSequence) {
        return parseDate(charSequence, g1.a(null));
    }

    public static long toEpochMilli(TemporalAccessor temporalAccessor) {
        return t2.toEpochMilli(temporalAccessor);
    }

    public static int weekOfYear(TemporalAccessor temporalAccessor) {
        WeekFields weekFields;
        TemporalField weekOfYear;
        weekFields = WeekFields.ISO;
        weekOfYear = weekFields.weekOfYear();
        return t2.get(temporalAccessor, weekOfYear);
    }

    public static long between(LocalDateTime localDateTime, LocalDateTime localDateTime2, ChronoUnit chronoUnit) {
        return c3.between(localDateTime, localDateTime2, chronoUnit);
    }

    public static LocalDateTime endOfDay(LocalDateTime localDateTime, boolean z7) {
        LocalTime localTime;
        LocalDateTime with;
        LocalTime of;
        LocalDateTime with2;
        if (z7) {
            of = LocalTime.of(23, 59, 59);
            with2 = localDateTime.with((TemporalAdjuster) of);
            return with2;
        }
        localTime = LocalTime.MAX;
        with = localDateTime.with((TemporalAdjuster) localTime);
        return with;
    }

    public static String format(LocalDateTime localDateTime, String str) {
        return t2.format(localDateTime, str);
    }

    public static String formatNormal(LocalDate localDate) {
        return format(localDate, d.NORM_DATE_FORMATTER);
    }

    public static boolean isIn(ChronoLocalDateTime<?> chronoLocalDateTime, ChronoLocalDateTime<?> chronoLocalDateTime2, ChronoLocalDateTime<?> chronoLocalDateTime3, boolean z7, boolean z8) {
        return t2.isIn(chronoLocalDateTime, chronoLocalDateTime2, chronoLocalDateTime3, z7, z8);
    }

    public static boolean isSameDay(LocalDate localDate, LocalDate localDate2) {
        boolean isEqual;
        if (localDate != null && localDate2 != null) {
            isEqual = localDate.isEqual(localDate2);
            if (isEqual) {
                return true;
            }
        }
        return false;
    }

    public static boolean isWeekend(LocalDate localDate) {
        DayOfWeek dayOfWeek;
        DayOfWeek dayOfWeek2;
        DayOfWeek dayOfWeek3;
        dayOfWeek = localDate.getDayOfWeek();
        dayOfWeek2 = DayOfWeek.SATURDAY;
        if (dayOfWeek2 != dayOfWeek) {
            dayOfWeek3 = DayOfWeek.SUNDAY;
            if (dayOfWeek3 != dayOfWeek) {
                return false;
            }
        }
        return true;
    }

    public static LocalDateTime of(ZonedDateTime zonedDateTime) {
        LocalDateTime localDateTime;
        if (zonedDateTime == null) {
            return null;
        }
        localDateTime = zonedDateTime.toLocalDateTime();
        return localDateTime;
    }

    public static LocalDateTime ofUTC(long j8) {
        Instant ofEpochMilli;
        ofEpochMilli = Instant.ofEpochMilli(j8);
        return ofUTC(ofEpochMilli);
    }

    public static LocalDateTime parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        TemporalAccessor parse;
        LocalDateTime parse2;
        if (cn.hutool.core.text.l.isBlank(charSequence)) {
            return null;
        }
        if (dateTimeFormatter == null) {
            parse2 = LocalDateTime.parse(charSequence);
            return parse2;
        }
        parse = dateTimeFormatter.parse(charSequence);
        return of(parse);
    }

    public static LocalDate parseDate(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        TemporalAccessor parse;
        LocalDate parse2;
        if (charSequence == null) {
            return null;
        }
        if (dateTimeFormatter == null) {
            parse2 = LocalDate.parse(charSequence);
            return parse2;
        }
        parse = dateTimeFormatter.parse(charSequence);
        return ofDate(parse);
    }

    public static String format(LocalDate localDate, DateTimeFormatter dateTimeFormatter) {
        return t2.format(localDate, dateTimeFormatter);
    }

    public static LocalDateTime of(Instant instant, ZoneId zoneId) {
        LocalDateTime ofInstant;
        if (instant == null) {
            return null;
        }
        ofInstant = LocalDateTime.ofInstant(instant, cn.hutool.core.convert.impl.p0.a(cn.hutool.core.util.e0.defaultIfNull(zoneId, (Supplier<? extends ZoneId>) new Supplier() { // from class: cn.hutool.core.date.j1
            @Override // java.util.function.Supplier
            public final Object get() {
                ZoneId systemDefault;
                systemDefault = ZoneId.systemDefault();
                return systemDefault;
            }
        })));
        return ofInstant;
    }

    public static String format(LocalDate localDate, String str) {
        DateTimeFormatter ofPattern;
        if (localDate == null) {
            return null;
        }
        ofPattern = DateTimeFormatter.ofPattern(str);
        return format(localDate, ofPattern);
    }

    public static LocalDateTime of(Instant instant, TimeZone timeZone) {
        ZoneId zoneId;
        if (instant == null) {
            return null;
        }
        zoneId = ((TimeZone) cn.hutool.core.util.e0.defaultIfNull(timeZone, new j())).toZoneId();
        return of(instant, zoneId);
    }

    public static LocalDate parseDate(CharSequence charSequence, String str) {
        DateTimeFormatter ofPattern;
        if (charSequence == null) {
            return null;
        }
        ofPattern = DateTimeFormatter.ofPattern(str);
        return parseDate(charSequence, ofPattern);
    }

    public static LocalDateTime of(long j8) {
        Instant ofEpochMilli;
        ofEpochMilli = Instant.ofEpochMilli(j8);
        return of(ofEpochMilli);
    }

    public static LocalDateTime parse(CharSequence charSequence, String str) {
        DateTimeFormatterBuilder appendPattern;
        ChronoField chronoField;
        DateTimeFormatterBuilder appendValue;
        DateTimeFormatter dateTimeFormatter = null;
        if (cn.hutool.core.text.l.isBlank(charSequence)) {
            return null;
        }
        if (cn.hutool.core.date.format.o.isCustomFormat(str)) {
            return of(cn.hutool.core.date.format.o.parse(charSequence, str));
        }
        if (cn.hutool.core.text.l.isNotBlank(str)) {
            if (!cn.hutool.core.text.l.startWithIgnoreEquals(str, d.PURE_DATETIME_PATTERN)) {
                dateTimeFormatter = DateTimeFormatter.ofPattern(str);
            } else {
                String removePrefix = cn.hutool.core.text.l.removePrefix(str, d.PURE_DATETIME_PATTERN);
                if (cn.hutool.core.util.p0.isMatch("[S]{1,2}", removePrefix)) {
                    charSequence = ((Object) charSequence) + cn.hutool.core.text.l.repeat('0', 3 - removePrefix.length());
                }
                appendPattern = b1.a().appendPattern(d.PURE_DATETIME_PATTERN);
                chronoField = ChronoField.MILLI_OF_SECOND;
                appendValue = appendPattern.appendValue(chronoField, 3);
                dateTimeFormatter = appendValue.toFormatter();
            }
        }
        return parse(charSequence, dateTimeFormatter);
    }

    public static LocalDateTime of(long j8, ZoneId zoneId) {
        Instant ofEpochMilli;
        ofEpochMilli = Instant.ofEpochMilli(j8);
        return of(ofEpochMilli, zoneId);
    }

    public static LocalDateTime of(long j8, TimeZone timeZone) {
        Instant ofEpochMilli;
        ofEpochMilli = Instant.ofEpochMilli(j8);
        return of(ofEpochMilli, timeZone);
    }

    public static LocalDateTime of(Date date) {
        Instant instant;
        Instant instant2;
        if (date == null) {
            return null;
        }
        if (date instanceof DateTime) {
            instant2 = date.toInstant();
            return of(instant2, ((DateTime) date).getZoneId());
        }
        instant = date.toInstant();
        return of(instant);
    }

    public static LocalDateTime of(TemporalAccessor temporalAccessor) {
        ChronoField chronoField;
        ChronoField chronoField2;
        ChronoField chronoField3;
        ChronoField chronoField4;
        ChronoField chronoField5;
        ChronoField chronoField6;
        ChronoField chronoField7;
        LocalDateTime of;
        Instant from;
        ZoneId systemDefault;
        LocalDateTime ofInstant;
        ZonedDateTime from2;
        LocalDateTime localDateTime;
        LocalDateTime from3;
        ZoneId systemDefault2;
        LocalDateTime ofInstant2;
        LocalDateTime atStartOfDay;
        if (temporalAccessor == null) {
            return null;
        }
        if (c0.a(temporalAccessor)) {
            atStartOfDay = k0.a(temporalAccessor).atStartOfDay();
            return atStartOfDay;
        }
        if (!n0.a(temporalAccessor)) {
            try {
                try {
                    try {
                        from3 = LocalDateTime.from(temporalAccessor);
                        return from3;
                    } catch (Exception unused) {
                        from2 = ZonedDateTime.from(temporalAccessor);
                        localDateTime = from2.toLocalDateTime();
                        return localDateTime;
                    }
                } catch (Exception unused2) {
                    from = Instant.from(temporalAccessor);
                    systemDefault = ZoneId.systemDefault();
                    ofInstant = LocalDateTime.ofInstant(from, systemDefault);
                    return ofInstant;
                }
            } catch (Exception unused3) {
                chronoField = ChronoField.YEAR;
                int i8 = t2.get(temporalAccessor, chronoField);
                chronoField2 = ChronoField.MONTH_OF_YEAR;
                int i9 = t2.get(temporalAccessor, chronoField2);
                chronoField3 = ChronoField.DAY_OF_MONTH;
                int i10 = t2.get(temporalAccessor, chronoField3);
                chronoField4 = ChronoField.HOUR_OF_DAY;
                int i11 = t2.get(temporalAccessor, chronoField4);
                chronoField5 = ChronoField.MINUTE_OF_HOUR;
                int i12 = t2.get(temporalAccessor, chronoField5);
                chronoField6 = ChronoField.SECOND_OF_MINUTE;
                int i13 = t2.get(temporalAccessor, chronoField6);
                chronoField7 = ChronoField.NANO_OF_SECOND;
                of = LocalDateTime.of(i8, i9, i10, i11, i12, i13, t2.get(temporalAccessor, chronoField7));
                return of;
            }
        }
        Instant a8 = cn.hutool.core.convert.impl.a1.a(temporalAccessor);
        systemDefault2 = ZoneId.systemDefault();
        ofInstant2 = LocalDateTime.ofInstant(a8, systemDefault2);
        return ofInstant2;
    }
}
