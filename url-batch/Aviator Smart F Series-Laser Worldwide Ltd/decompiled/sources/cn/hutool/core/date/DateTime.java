package cn.hutool.core.date;

import cn.hutool.core.date.BetweenFormatter;
import cn.hutool.core.date.format.FastDateFormat;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public class DateTime extends Date {
    private static final long serialVersionUID = -5395712593979185936L;
    private static boolean useJdkToStringStyle = false;
    private Week firstDayOfWeek;
    private int minimalDaysInFirstWeek;
    private boolean mutable;
    private TimeZone timeZone;

    public DateTime() {
        this(TimeZone.getDefault());
    }

    public static DateTime now() {
        return new DateTime();
    }

    public static DateTime of(long j8) {
        return new DateTime(j8);
    }

    private static Date parse(CharSequence charSequence, DateFormat dateFormat) {
        cn.hutool.core.lang.q.notBlank(charSequence, "Date String must be not blank !", new Object[0]);
        try {
            return dateFormat.parse(charSequence.toString());
        } catch (Exception e8) {
            throw new DateException(cn.hutool.core.text.l.format("Parse [{}] with format [{}] error!", charSequence, dateFormat instanceof SimpleDateFormat ? ((SimpleDateFormat) dateFormat).toPattern() : dateFormat.toString()), e8);
        }
    }

    private DateTime setTimeInternal(long j8) {
        super.setTime(j8);
        return this;
    }

    public static void setUseJdkToStringStyle(boolean z7) {
        useJdkToStringStyle = z7;
    }

    public DateBetween between(Date date) {
        return new DateBetween(this, date);
    }

    public int dayOfMonth() {
        return getField(DateField.DAY_OF_MONTH);
    }

    public int dayOfWeek() {
        return getField(DateField.DAY_OF_WEEK);
    }

    public Week dayOfWeekEnum() {
        return Week.of(dayOfWeek());
    }

    public int dayOfWeekInMonth() {
        return getField(DateField.DAY_OF_WEEK_IN_MONTH);
    }

    public int dayOfYear() {
        return getField(DateField.DAY_OF_YEAR);
    }

    public int getField(DateField dateField) {
        return getField(dateField.getValue());
    }

    public Week getFirstDayOfWeek() {
        return this.firstDayOfWeek;
    }

    public int getLastDayOfMonth() {
        return monthEnum().getLastDay(isLeapYear());
    }

    public TimeZone getTimeZone() {
        return this.timeZone;
    }

    public ZoneId getZoneId() {
        ZoneId zoneId;
        zoneId = this.timeZone.toZoneId();
        return zoneId;
    }

    public int hour(boolean z7) {
        return getField(z7 ? DateField.HOUR_OF_DAY : DateField.HOUR);
    }

    public boolean isAM() {
        return getField(DateField.AM_PM) == 0;
    }

    public boolean isAfter(Date date) {
        if (date != null) {
            return compareTo(date) > 0;
        }
        throw new NullPointerException("Date to compare is null !");
    }

    public boolean isAfterOrEquals(Date date) {
        if (date != null) {
            return compareTo(date) >= 0;
        }
        throw new NullPointerException("Date to compare is null !");
    }

    public boolean isBefore(Date date) {
        if (date != null) {
            return compareTo(date) < 0;
        }
        throw new NullPointerException("Date to compare is null !");
    }

    public boolean isBeforeOrEquals(Date date) {
        if (date != null) {
            return compareTo(date) <= 0;
        }
        throw new NullPointerException("Date to compare is null !");
    }

    public boolean isIn(Date date, Date date2) {
        long time = date.getTime();
        long time2 = date2.getTime();
        long time3 = getTime();
        return time3 >= Math.min(time, time2) && time3 <= Math.max(time, time2);
    }

    public boolean isLastDayOfMonth() {
        return dayOfMonth() == getLastDayOfMonth();
    }

    public boolean isLeapYear() {
        return z.isLeapYear(year());
    }

    public boolean isMutable() {
        return this.mutable;
    }

    public boolean isPM() {
        return 1 == getField(DateField.AM_PM);
    }

    public boolean isWeekend() {
        int dayOfWeek = dayOfWeek();
        return 7 == dayOfWeek || 1 == dayOfWeek;
    }

    public int millisecond() {
        return getField(DateField.MILLISECOND);
    }

    public int minute() {
        return getField(DateField.MINUTE);
    }

    public int month() {
        return getField(DateField.MONTH);
    }

    public int monthBaseOne() {
        return month() + 1;
    }

    public Month monthEnum() {
        return Month.of(month());
    }

    public int monthStartFromOne() {
        return month() + 1;
    }

    public DateTime offset(DateField dateField, int i8) {
        if (DateField.ERA == dateField) {
            throw new IllegalArgumentException("ERA is not support offset!");
        }
        Calendar calendar = toCalendar();
        calendar.add(dateField.getValue(), i8);
        return (this.mutable ? this : (DateTime) cn.hutool.core.util.e0.clone(this)).setTimeInternal(calendar.getTimeInMillis());
    }

    public DateTime offsetNew(DateField dateField, int i8) {
        Calendar calendar = toCalendar();
        calendar.add(dateField.getValue(), i8);
        return ((DateTime) cn.hutool.core.util.e0.clone(this)).setTimeInternal(calendar.getTimeInMillis());
    }

    public int quarter() {
        return (month() / 3) + 1;
    }

    public Quarter quarterEnum() {
        return Quarter.of(quarter());
    }

    public int second() {
        return getField(DateField.SECOND);
    }

    public DateTime setField(DateField dateField, int i8) {
        return setField(dateField.getValue(), i8);
    }

    public DateTime setFirstDayOfWeek(Week week) {
        this.firstDayOfWeek = week;
        return this;
    }

    public DateTime setMinimalDaysInFirstWeek(int i8) {
        this.minimalDaysInFirstWeek = i8;
        return this;
    }

    public DateTime setMutable(boolean z7) {
        this.mutable = z7;
        return this;
    }

    @Override // java.util.Date
    public void setTime(long j8) {
        if (!this.mutable) {
            throw new DateException("This is not a mutable object !");
        }
        super.setTime(j8);
    }

    public DateTime setTimeZone(TimeZone timeZone) {
        this.timeZone = (TimeZone) cn.hutool.core.util.e0.defaultIfNull(timeZone, new j());
        return this;
    }

    public Calendar toCalendar() {
        Locale.Category category;
        Locale locale;
        category = Locale.Category.FORMAT;
        locale = Locale.getDefault(category);
        return toCalendar(locale);
    }

    public String toDateStr() {
        TimeZone timeZone = this.timeZone;
        return timeZone != null ? toString(z.newSimpleFormat(d.NORM_DATE_PATTERN, null, timeZone)) : toString(d.NORM_DATE_FORMAT);
    }

    public Date toJdkDate() {
        return new Date(getTime());
    }

    public LocalDateTime toLocalDateTime() {
        return k1.of(this);
    }

    public String toMsStr() {
        return toString(d.NORM_DATETIME_MS_FORMAT);
    }

    public java.sql.Date toSqlDate() {
        return new java.sql.Date(getTime());
    }

    @Override // java.util.Date
    public String toString() {
        return useJdkToStringStyle ? super.toString() : toString(this.timeZone);
    }

    public String toStringDefaultTimeZone() {
        return toString(TimeZone.getDefault());
    }

    public String toTimeStr() {
        TimeZone timeZone = this.timeZone;
        return timeZone != null ? toString(z.newSimpleFormat(d.NORM_TIME_PATTERN, null, timeZone)) : toString(d.NORM_TIME_FORMAT);
    }

    public Timestamp toTimestamp() {
        return new Timestamp(getTime());
    }

    public int weekOfMonth() {
        return getField(DateField.WEEK_OF_MONTH);
    }

    public int weekOfYear() {
        return getField(DateField.WEEK_OF_YEAR);
    }

    public int year() {
        return getField(DateField.YEAR);
    }

    public DateTime(TimeZone timeZone) {
        this(System.currentTimeMillis(), timeZone);
    }

    public static DateTime of(Date date) {
        return date instanceof DateTime ? (DateTime) date : new DateTime(date);
    }

    public long between(Date date, DateUnit dateUnit) {
        return new DateBetween(this, date).between(dateUnit);
    }

    public int getField(int i8) {
        return toCalendar().get(i8);
    }

    public DateTime setField(int i8, int i9) {
        Calendar calendar = toCalendar();
        calendar.set(i8, i9);
        return (!this.mutable ? (DateTime) cn.hutool.core.util.e0.clone(this) : this).setTimeInternal(calendar.getTimeInMillis());
    }

    public Calendar toCalendar(Locale locale) {
        return toCalendar(this.timeZone, locale);
    }

    public DateTime(Date date) {
        this(date, date instanceof DateTime ? ((DateTime) date).timeZone : TimeZone.getDefault());
    }

    public String between(Date date, DateUnit dateUnit, BetweenFormatter.Level level) {
        return new DateBetween(this, date).toString(dateUnit, level);
    }

    public Calendar toCalendar(TimeZone timeZone) {
        Locale.Category category;
        Locale locale;
        category = Locale.Category.FORMAT;
        locale = Locale.getDefault(category);
        return toCalendar(timeZone, locale);
    }

    public String toString(TimeZone timeZone) {
        if (timeZone != null) {
            return toString(z.newSimpleFormat(d.NORM_DATETIME_PATTERN, null, timeZone));
        }
        return toString(d.NORM_DATETIME_FORMAT);
    }

    public Calendar toCalendar(TimeZone timeZone, Locale locale) {
        Locale.Category category;
        if (locale == null) {
            category = Locale.Category.FORMAT;
            locale = Locale.getDefault(category);
        }
        Calendar calendar = timeZone != null ? Calendar.getInstance(timeZone, locale) : Calendar.getInstance(locale);
        calendar.setFirstDayOfWeek(this.firstDayOfWeek.getValue());
        int i8 = this.minimalDaysInFirstWeek;
        if (i8 > 0) {
            calendar.setMinimalDaysInFirstWeek(i8);
        }
        calendar.setTime(this);
        return calendar;
    }

    public static DateTime of(Calendar calendar) {
        return new DateTime(calendar);
    }

    public String toString(String str) {
        TimeZone timeZone = this.timeZone;
        if (timeZone != null) {
            return toString(z.newSimpleFormat(str, null, timeZone));
        }
        return toString(FastDateFormat.getInstance(str));
    }

    public DateTime(Date date, TimeZone timeZone) {
        this(((Date) cn.hutool.core.util.e0.defaultIfNull(date, new Date())).getTime(), timeZone);
    }

    public static DateTime of(String str, String str2) {
        return new DateTime(str, str2);
    }

    public DateTime(Calendar calendar) {
        this(calendar.getTime(), calendar.getTimeZone());
        setFirstDayOfWeek(Week.of(calendar.getFirstDayOfWeek()));
    }

    private static Calendar parse(CharSequence charSequence, cn.hutool.core.date.format.c cVar, boolean z7) {
        cn.hutool.core.lang.q.notNull(cVar, "Parser or DateFromat must be not null !", new Object[0]);
        cn.hutool.core.lang.q.notBlank(charSequence, "Date String must be not blank !", new Object[0]);
        Calendar parse = a.parse(charSequence, z7, cVar);
        if (parse != null) {
            parse.setFirstDayOfWeek(Week.MONDAY.getValue());
            return parse;
        }
        throw new DateException("Parse [{}] with format [{}] error!", charSequence, cVar.getPattern());
    }

    public String toString(cn.hutool.core.date.format.d dVar) {
        return dVar.format(this);
    }

    public String toString(DateFormat dateFormat) {
        return dateFormat.format((Date) this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DateTime(Instant instant) {
        this(r0);
        long epochMilli;
        epochMilli = instant.toEpochMilli();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DateTime(Instant instant, ZoneId zoneId) {
        this(r0, f3.toTimeZone(zoneId));
        long epochMilli;
        epochMilli = instant.toEpochMilli();
    }

    public DateTime(TemporalAccessor temporalAccessor) {
        this(t2.toInstant(temporalAccessor));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DateTime(ZonedDateTime zonedDateTime) {
        this(r0, r2);
        ZoneId zone;
        Instant instant = zonedDateTime.toInstant();
        zone = zonedDateTime.getZone();
    }

    public DateTime(long j8) {
        this(j8, TimeZone.getDefault());
    }

    public DateTime(long j8, TimeZone timeZone) {
        super(j8);
        this.mutable = true;
        this.firstDayOfWeek = Week.MONDAY;
        this.timeZone = (TimeZone) cn.hutool.core.util.e0.defaultIfNull(timeZone, new j());
    }

    public DateTime(CharSequence charSequence) {
        this(z.parse(charSequence));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DateTime(CharSequence charSequence, String str) {
        this(r2);
        Date parse;
        if (cn.hutool.core.date.format.o.isCustomFormat(str)) {
            parse = cn.hutool.core.date.format.o.parse(charSequence, str);
        } else {
            parse = parse(charSequence, z.newSimpleFormat(str));
        }
    }

    public DateTime(CharSequence charSequence, DateFormat dateFormat) {
        this(parse(charSequence, dateFormat), dateFormat.getTimeZone());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DateTime(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        this(r1, r2);
        TemporalAccessor parse;
        ZoneId zone;
        parse = dateTimeFormatter.parse(charSequence);
        Instant instant = t2.toInstant(parse);
        zone = dateTimeFormatter.getZone();
    }

    public DateTime(CharSequence charSequence, cn.hutool.core.date.format.c cVar) {
        this(charSequence, cVar, cn.hutool.core.util.d1.getBoolean(cn.hutool.core.util.d1.HUTOOL_DATE_LENIENT, true));
    }

    public DateTime(CharSequence charSequence, cn.hutool.core.date.format.c cVar, boolean z7) {
        this(parse(charSequence, cVar, z7));
    }
}
