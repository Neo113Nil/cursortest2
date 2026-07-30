package cn.hutool.core.date.format;

import com.baidu.ar.util.SystemInfoUtil;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public class FastDateFormat extends Format implements c, d {
    private static final h CACHE = new a();
    public static final int FULL = 0;
    public static final int LONG = 1;
    public static final int MEDIUM = 2;
    public static final int SHORT = 3;
    private static final long serialVersionUID = 8097890768636183236L;
    private final FastDateParser parser;
    private final FastDatePrinter printer;

    static class a extends h {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // cn.hutool.core.date.format.h
        public FastDateFormat createInstance(String str, TimeZone timeZone, Locale locale) {
            return new FastDateFormat(str, timeZone, locale);
        }
    }

    protected FastDateFormat(String str, TimeZone timeZone, Locale locale) {
        this(str, timeZone, locale, null);
    }

    public static FastDateFormat getDateInstance(int i8) {
        return (FastDateFormat) CACHE.getDateInstance(i8, null, null);
    }

    public static FastDateFormat getDateTimeInstance(int i8, int i9) {
        return (FastDateFormat) CACHE.getDateTimeInstance(Integer.valueOf(i8), Integer.valueOf(i9), null, null);
    }

    public static FastDateFormat getInstance() {
        return (FastDateFormat) CACHE.getInstance();
    }

    public static FastDateFormat getTimeInstance(int i8) {
        return (FastDateFormat) CACHE.getTimeInstance(i8, null, null);
    }

    public boolean equals(Object obj) {
        if (obj instanceof FastDateFormat) {
            return this.printer.equals(((FastDateFormat) obj).printer);
        }
        return false;
    }

    @Override // java.text.Format
    public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        stringBuffer.append(this.printer.format(obj));
        return stringBuffer;
    }

    public DateTimeFormatter getDateTimeFormatter() {
        DateTimeFormatter ofPattern;
        ZoneId zoneId;
        DateTimeFormatter withZone;
        ofPattern = DateTimeFormatter.ofPattern(getPattern());
        if (getLocale() != null) {
            ofPattern = ofPattern.withLocale(getLocale());
        }
        if (getTimeZone() == null) {
            return ofPattern;
        }
        zoneId = getTimeZone().toZoneId();
        withZone = ofPattern.withZone(zoneId);
        return withZone;
    }

    @Override // cn.hutool.core.date.format.c, cn.hutool.core.date.format.a
    public Locale getLocale() {
        return this.printer.getLocale();
    }

    public int getMaxLengthEstimate() {
        return this.printer.getMaxLengthEstimate();
    }

    @Override // cn.hutool.core.date.format.c, cn.hutool.core.date.format.a
    public String getPattern() {
        return this.printer.getPattern();
    }

    @Override // cn.hutool.core.date.format.c, cn.hutool.core.date.format.a
    public TimeZone getTimeZone() {
        return this.printer.getTimeZone();
    }

    public int hashCode() {
        return this.printer.hashCode();
    }

    @Override // cn.hutool.core.date.format.c
    public Date parse(String str) {
        return this.parser.parse(str);
    }

    @Override // java.text.Format, cn.hutool.core.date.format.c
    public Object parseObject(String str, ParsePosition parsePosition) {
        return this.parser.parseObject(str, parsePosition);
    }

    public String toString() {
        return "FastDateFormat[" + this.printer.getPattern() + SystemInfoUtil.COMMA + this.printer.getLocale() + SystemInfoUtil.COMMA + this.printer.getTimeZone().getID() + "]";
    }

    protected FastDateFormat(String str, TimeZone timeZone, Locale locale, Date date) {
        this.printer = new FastDatePrinter(str, timeZone, locale);
        this.parser = new FastDateParser(str, timeZone, locale, date);
    }

    public static FastDateFormat getDateInstance(int i8, Locale locale) {
        return (FastDateFormat) CACHE.getDateInstance(i8, null, locale);
    }

    public static FastDateFormat getDateTimeInstance(int i8, int i9, Locale locale) {
        return (FastDateFormat) CACHE.getDateTimeInstance(Integer.valueOf(i8), Integer.valueOf(i9), null, locale);
    }

    public static FastDateFormat getInstance(String str) {
        return (FastDateFormat) CACHE.getInstance(str, null, null);
    }

    public static FastDateFormat getTimeInstance(int i8, Locale locale) {
        return (FastDateFormat) CACHE.getTimeInstance(i8, null, locale);
    }

    @Override // cn.hutool.core.date.format.d
    public String format(long j8) {
        return this.printer.format(j8);
    }

    @Override // cn.hutool.core.date.format.c
    public Date parse(String str, ParsePosition parsePosition) {
        return this.parser.parse(str, parsePosition);
    }

    public static FastDateFormat getDateInstance(int i8, TimeZone timeZone) {
        return (FastDateFormat) CACHE.getDateInstance(i8, timeZone, null);
    }

    public static FastDateFormat getDateTimeInstance(int i8, int i9, TimeZone timeZone) {
        return getDateTimeInstance(i8, i9, timeZone, null);
    }

    public static FastDateFormat getInstance(String str, TimeZone timeZone) {
        return (FastDateFormat) CACHE.getInstance(str, timeZone, null);
    }

    public static FastDateFormat getTimeInstance(int i8, TimeZone timeZone) {
        return (FastDateFormat) CACHE.getTimeInstance(i8, timeZone, null);
    }

    @Override // cn.hutool.core.date.format.d
    public String format(Date date) {
        return this.printer.format(date);
    }

    @Override // cn.hutool.core.date.format.c
    public boolean parse(String str, ParsePosition parsePosition, Calendar calendar) {
        return this.parser.parse(str, parsePosition, calendar);
    }

    public static FastDateFormat getDateInstance(int i8, TimeZone timeZone, Locale locale) {
        return (FastDateFormat) CACHE.getDateInstance(i8, timeZone, locale);
    }

    public static FastDateFormat getDateTimeInstance(int i8, int i9, TimeZone timeZone, Locale locale) {
        return (FastDateFormat) CACHE.getDateTimeInstance(Integer.valueOf(i8), Integer.valueOf(i9), timeZone, locale);
    }

    public static FastDateFormat getInstance(String str, Locale locale) {
        return (FastDateFormat) CACHE.getInstance(str, null, locale);
    }

    public static FastDateFormat getTimeInstance(int i8, TimeZone timeZone, Locale locale) {
        return (FastDateFormat) CACHE.getTimeInstance(i8, timeZone, locale);
    }

    @Override // cn.hutool.core.date.format.d
    public String format(Calendar calendar) {
        return this.printer.format(calendar);
    }

    public static FastDateFormat getInstance(String str, TimeZone timeZone, Locale locale) {
        return (FastDateFormat) CACHE.getInstance(str, timeZone, locale);
    }

    @Override // cn.hutool.core.date.format.d
    public <B extends Appendable> B format(long j8, B b8) {
        return (B) this.printer.format(j8, (long) b8);
    }

    @Override // cn.hutool.core.date.format.d
    public <B extends Appendable> B format(Date date, B b8) {
        return (B) this.printer.format(date, (Date) b8);
    }

    @Override // cn.hutool.core.date.format.d
    public <B extends Appendable> B format(Calendar calendar, B b8) {
        return (B) this.printer.format(calendar, (Calendar) b8);
    }
}
