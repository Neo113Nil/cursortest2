package cn.hutool.core.date;

import androidx.core.text.util.LocalePreferences;
import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.date.BetweenFormatter;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* loaded from: classes.dex */
public class z extends cn.hutool.core.date.a {
    private static final String[] wtb = {LocalePreferences.FirstDayOfWeek.SUNDAY, LocalePreferences.FirstDayOfWeek.MONDAY, LocalePreferences.FirstDayOfWeek.TUESDAY, LocalePreferences.FirstDayOfWeek.WEDNESDAY, LocalePreferences.FirstDayOfWeek.THURSDAY, LocalePreferences.FirstDayOfWeek.FRIDAY, LocalePreferences.FirstDayOfWeek.SATURDAY, "jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec", "gmt", "ut", "utc", "est", "edt", "cst", "cdt", "mst", "mdt", "pst", "pdt"};

    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$java$util$concurrent$TimeUnit;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            $SwitchMap$java$util$concurrent$TimeUnit = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static int age(Date date, Date date2) {
        cn.hutool.core.lang.q.notNull(date, "Birthday can not be null !", new Object[0]);
        if (date2 == null) {
            date2 = date();
        }
        return cn.hutool.core.date.a.age(date.getTime(), date2.getTime());
    }

    public static int ageOfNow(String str) {
        return ageOfNow(parse(str));
    }

    public static DateTime beginOfDay(Date date) {
        return new DateTime(cn.hutool.core.date.a.beginOfDay(cn.hutool.core.date.a.calendar(date)));
    }

    public static DateTime beginOfHour(Date date) {
        return new DateTime(cn.hutool.core.date.a.beginOfHour(cn.hutool.core.date.a.calendar(date)));
    }

    public static DateTime beginOfMinute(Date date) {
        return new DateTime(cn.hutool.core.date.a.beginOfMinute(cn.hutool.core.date.a.calendar(date)));
    }

    public static DateTime beginOfMonth(Date date) {
        return new DateTime(cn.hutool.core.date.a.beginOfMonth(cn.hutool.core.date.a.calendar(date)));
    }

    public static DateTime beginOfQuarter(Date date) {
        return new DateTime(cn.hutool.core.date.a.beginOfQuarter(cn.hutool.core.date.a.calendar(date)));
    }

    public static DateTime beginOfSecond(Date date) {
        return new DateTime(cn.hutool.core.date.a.beginOfSecond(cn.hutool.core.date.a.calendar(date)));
    }

    public static DateTime beginOfWeek(Date date) {
        return new DateTime(cn.hutool.core.date.a.beginOfWeek(cn.hutool.core.date.a.calendar(date)));
    }

    public static DateTime beginOfYear(Date date) {
        return new DateTime(cn.hutool.core.date.a.beginOfYear(cn.hutool.core.date.a.calendar(date)));
    }

    public static long between(Date date, Date date2, DateUnit dateUnit) {
        return between(date, date2, dateUnit, true);
    }

    public static long betweenDay(Date date, Date date2, boolean z7) {
        if (z7) {
            date = beginOfDay(date);
            date2 = beginOfDay(date2);
        }
        return between(date, date2, DateUnit.DAY);
    }

    public static long betweenMonth(Date date, Date date2, boolean z7) {
        return new DateBetween(date, date2).betweenMonth(z7);
    }

    public static long betweenMs(Date date, Date date2) {
        return new DateBetween(date, date2).between(DateUnit.MS);
    }

    public static long betweenWeek(Date date, Date date2, boolean z7) {
        if (z7) {
            date = beginOfDay(date);
            date2 = beginOfDay(date2);
        }
        return between(date, date2, DateUnit.WEEK);
    }

    public static long betweenYear(Date date, Date date2, boolean z7) {
        return new DateBetween(date, date2).betweenYear(z7);
    }

    public static DateTime ceiling(Date date, DateField dateField) {
        return new DateTime(cn.hutool.core.date.a.ceiling(cn.hutool.core.date.a.calendar(date), dateField));
    }

    public static int compare(Date date, Date date2) {
        return cn.hutool.core.comparator.d.compare(date, date2);
    }

    public static DateTime convertTimeZone(Date date, ZoneId zoneId) {
        return new DateTime(date, f3.toTimeZone(zoneId));
    }

    public static n1 createStopWatch() {
        return new n1();
    }

    public static long current() {
        return System.currentTimeMillis();
    }

    public static long currentSeconds() {
        return System.currentTimeMillis() / 1000;
    }

    public static DateTime date() {
        return new DateTime();
    }

    public static DateTime dateNew(Date date) {
        if (date == null) {
            return null;
        }
        return new DateTime(date);
    }

    public static DateTime dateSecond() {
        return beginOfSecond(date());
    }

    public static int dayOfMonth(Date date) {
        return DateTime.of(date).dayOfMonth();
    }

    public static int dayOfWeek(Date date) {
        return DateTime.of(date).dayOfWeek();
    }

    public static Week dayOfWeekEnum(Date date) {
        return DateTime.of(date).dayOfWeekEnum();
    }

    public static int dayOfYear(Date date) {
        return DateTime.of(date).dayOfYear();
    }

    public static DateTime endOfDay(Date date) {
        return new DateTime(cn.hutool.core.date.a.endOfDay(cn.hutool.core.date.a.calendar(date)));
    }

    public static DateTime endOfHour(Date date) {
        return new DateTime(cn.hutool.core.date.a.endOfHour(cn.hutool.core.date.a.calendar(date)));
    }

    public static DateTime endOfMinute(Date date) {
        return new DateTime(cn.hutool.core.date.a.endOfMinute(cn.hutool.core.date.a.calendar(date)));
    }

    public static DateTime endOfMonth(Date date) {
        return new DateTime(cn.hutool.core.date.a.endOfMonth(cn.hutool.core.date.a.calendar(date)));
    }

    public static DateTime endOfQuarter(Date date) {
        return new DateTime(cn.hutool.core.date.a.endOfQuarter(cn.hutool.core.date.a.calendar(date)));
    }

    public static DateTime endOfSecond(Date date) {
        return new DateTime(cn.hutool.core.date.a.endOfSecond(cn.hutool.core.date.a.calendar(date)));
    }

    public static DateTime endOfWeek(Date date) {
        return new DateTime(cn.hutool.core.date.a.endOfWeek(cn.hutool.core.date.a.calendar(date)));
    }

    public static DateTime endOfYear(Date date) {
        return new DateTime(cn.hutool.core.date.a.endOfYear(cn.hutool.core.date.a.calendar(date)));
    }

    public static String format(LocalDateTime localDateTime, String str) {
        return k1.format(localDateTime, str);
    }

    public static String formatBetween(Date date, Date date2, BetweenFormatter.Level level) {
        return formatBetween(between(date, date2, DateUnit.MS), level);
    }

    public static String formatChineseDate(Date date, boolean z7, boolean z8) {
        if (date == null) {
            return null;
        }
        if (z7) {
            return cn.hutool.core.date.a.formatChineseDate(cn.hutool.core.date.a.calendar(date), z8);
        }
        return (z8 ? d.CHINESE_DATE_TIME_FORMAT : d.CHINESE_DATE_FORMAT).format(date);
    }

    public static String formatDate(Date date) {
        if (date == null) {
            return null;
        }
        return d.NORM_DATE_FORMAT.format(date);
    }

    public static String formatDateTime(Date date) {
        if (date == null) {
            return null;
        }
        return d.NORM_DATETIME_FORMAT.format(date);
    }

    public static String formatHttpDate(Date date) {
        if (date == null) {
            return null;
        }
        return d.HTTP_DATETIME_FORMAT.format(date);
    }

    public static String formatLocalDateTime(LocalDateTime localDateTime) {
        return k1.formatNormal(localDateTime);
    }

    public static String formatTime(Date date) {
        if (date == null) {
            return null;
        }
        return d.NORM_TIME_FORMAT.format(date);
    }

    public static String getChineseZodiac(int i8) {
        return d3.getChineseZodiac(i8);
    }

    public static int getLastDayOfMonth(Date date) {
        return date(date).getLastDayOfMonth();
    }

    public static String getShotName(TimeUnit timeUnit) {
        switch (a.$SwitchMap$java$util$concurrent$TimeUnit[timeUnit.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "μs";
            case 3:
                return "ms";
            case 4:
                return "s";
            case 5:
                return "min";
            case 6:
                return CmcdHeadersFactory.STREAMING_FORMAT_HLS;
            default:
                return timeUnit.name().toLowerCase();
        }
    }

    public static String getZodiac(int i8, int i9) {
        return d3.getZodiac(i8, i9);
    }

    public static int hour(Date date, boolean z7) {
        return DateTime.of(date).hour(z7);
    }

    public static boolean isAM(Date date) {
        return DateTime.of(date).isAM();
    }

    @Deprecated
    public static boolean isExpired(Date date, DateField dateField, int i8, Date date2) {
        return offset(date, dateField, i8).after(date2);
    }

    public static boolean isIn(Date date, Date date2, Date date3) {
        return date instanceof DateTime ? ((DateTime) date).isIn(date2, date3) : new DateTime(date).isIn(date2, date3);
    }

    public static boolean isLastDayOfMonth(Date date) {
        return date(date).isLastDayOfMonth();
    }

    public static boolean isLeapYear(int i8) {
        boolean isLeap;
        isLeap = Year.isLeap(i8);
        return isLeap;
    }

    public static boolean isOverlap(Date date, Date date2, Date date3, Date date4) {
        return date.compareTo(date4) <= 0 && date3.compareTo(date2) <= 0;
    }

    public static boolean isPM(Date date) {
        return DateTime.of(date).isPM();
    }

    public static boolean isSameDay(Date date, Date date2) {
        if (date == null || date2 == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        return cn.hutool.core.date.a.isSameDay(cn.hutool.core.date.a.calendar(date), cn.hutool.core.date.a.calendar(date2));
    }

    public static boolean isSameMonth(Date date, Date date2) {
        if (date == null || date2 == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        return cn.hutool.core.date.a.isSameMonth(cn.hutool.core.date.a.calendar(date), cn.hutool.core.date.a.calendar(date2));
    }

    public static boolean isSameTime(Date date, Date date2) {
        return date.compareTo(date2) == 0;
    }

    public static boolean isSameWeek(Date date, Date date2, boolean z7) {
        if (date == null || date2 == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        return cn.hutool.core.date.a.isSameWeek(cn.hutool.core.date.a.calendar(date), cn.hutool.core.date.a.calendar(date2), z7);
    }

    public static boolean isWeekend(Date date) {
        Week dayOfWeekEnum = dayOfWeekEnum(date);
        return Week.SATURDAY == dayOfWeekEnum || Week.SUNDAY == dayOfWeekEnum;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$rangeNotContains$0(List list, DateTime dateTime) {
        return !list.contains(dateTime);
    }

    public static DateTime lastMonth() {
        return offsetMonth(new DateTime(), -1);
    }

    public static DateTime lastWeek() {
        return offsetWeek(new DateTime(), -1);
    }

    public static int lengthOfMonth(int i8, boolean z7) {
        java.time.Month of;
        int length;
        of = java.time.Month.of(i8);
        length = of.length(z7);
        return length;
    }

    public static int lengthOfYear(int i8) {
        Year of;
        int length;
        of = Year.of(i8);
        length = of.length();
        return length;
    }

    public static int millisecond(Date date) {
        return DateTime.of(date).millisecond();
    }

    public static int minute(Date date) {
        return DateTime.of(date).minute();
    }

    public static int month(Date date) {
        return DateTime.of(date).month();
    }

    public static Month monthEnum(Date date) {
        return DateTime.of(date).monthEnum();
    }

    public static long nanosToMillis(long j8) {
        return TimeUnit.NANOSECONDS.toMillis(j8);
    }

    public static double nanosToSeconds(long j8) {
        return j8 / 1.0E9d;
    }

    public static SimpleDateFormat newSimpleFormat(String str) {
        return newSimpleFormat(str, null, null);
    }

    public static DateTime nextMonth() {
        return offsetMonth(new DateTime(), 1);
    }

    public static DateTime nextWeek() {
        return offsetWeek(new DateTime(), 1);
    }

    private static String normalize(CharSequence charSequence) {
        if (cn.hutool.core.text.l.isBlank(charSequence)) {
            return cn.hutool.core.text.l.str(charSequence);
        }
        List<String> splitTrim = cn.hutool.core.text.l.splitTrim(charSequence, ' ');
        int size = splitTrim.size();
        if (size < 1 || size > 2) {
            return cn.hutool.core.text.l.str(charSequence);
        }
        StringBuilder builder = cn.hutool.core.util.c1.builder();
        builder.append(cn.hutool.core.text.l.removeSuffix(splitTrim.get(0).replaceAll("[/.年月]", "-"), "日"));
        if (size == 2) {
            builder.append(' ');
            builder.append(cn.hutool.core.text.l.removeSuffix(splitTrim.get(1).replaceAll("[时分秒]", ":"), ":").replace(',', '.'));
        }
        return builder.toString();
    }

    private static String normalizeMillSeconds(String str, CharSequence charSequence, CharSequence charSequence2) {
        if (cn.hutool.core.text.l.isBlank(charSequence2)) {
            return cn.hutool.core.text.l.subBefore((CharSequence) str, charSequence, true) + ((Object) charSequence) + cn.hutool.core.text.l.subPre(cn.hutool.core.text.l.subAfter((CharSequence) str, charSequence, true), 3);
        }
        return cn.hutool.core.text.l.subBefore((CharSequence) str, charSequence, true) + ((Object) charSequence) + cn.hutool.core.text.l.subPre(cn.hutool.core.text.l.subBetween(str, charSequence, charSequence2), 3) + ((Object) charSequence2) + cn.hutool.core.text.l.subAfter((CharSequence) str, charSequence2, true);
    }

    public static String now() {
        return formatDateTime(new DateTime());
    }

    public static DateTime offset(Date date, DateField dateField, int i8) {
        return dateNew(date).offset(dateField, i8);
    }

    public static DateTime offsetDay(Date date, int i8) {
        return offset(date, DateField.DAY_OF_YEAR, i8);
    }

    public static DateTime offsetHour(Date date, int i8) {
        return offset(date, DateField.HOUR_OF_DAY, i8);
    }

    public static DateTime offsetMillisecond(Date date, int i8) {
        return offset(date, DateField.MILLISECOND, i8);
    }

    public static DateTime offsetMinute(Date date, int i8) {
        return offset(date, DateField.MINUTE, i8);
    }

    public static DateTime offsetMonth(Date date, int i8) {
        return offset(date, DateField.MONTH, i8);
    }

    public static DateTime offsetSecond(Date date, int i8) {
        return offset(date, DateField.SECOND, i8);
    }

    public static DateTime offsetWeek(Date date, int i8) {
        return offset(date, DateField.WEEK_OF_YEAR, i8);
    }

    public static DateTime parse(CharSequence charSequence, DateFormat dateFormat) {
        return new DateTime(charSequence, dateFormat);
    }

    public static DateTime parseCST(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return parse(charSequence, d.JDK_DATETIME_FORMAT);
    }

    public static DateTime parseDate(CharSequence charSequence) {
        return parse(normalize(charSequence), d.NORM_DATE_FORMAT);
    }

    public static DateTime parseDateTime(CharSequence charSequence) {
        return parse(normalize(charSequence), d.NORM_DATETIME_FORMAT);
    }

    public static LocalDateTime parseLocalDateTime(CharSequence charSequence) {
        return parseLocalDateTime(charSequence, d.NORM_DATETIME_PATTERN);
    }

    public static DateTime parseTime(CharSequence charSequence) {
        return parse(normalize(charSequence), d.NORM_TIME_FORMAT);
    }

    public static DateTime parseTimeToday(CharSequence charSequence) {
        String format = cn.hutool.core.text.l.format("{} {}", today(), charSequence);
        return 1 == cn.hutool.core.text.l.count((CharSequence) format, ':') ? parse(format, d.NORM_DATETIME_MINUTE_PATTERN) : parse(format, d.NORM_DATETIME_FORMAT);
    }

    public static DateTime parseUTC(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (cn.hutool.core.text.l.contains(str, org.bouncycastle.pqc.math.linearalgebra.k.MATRIX_TYPE_ZERO)) {
            if (length == 20) {
                return parse(str, d.UTC_FORMAT);
            }
            if (length <= 28 && length >= 22) {
                return parse(str, d.UTC_MS_FORMAT);
            }
        } else {
            if (cn.hutool.core.text.l.contains((CharSequence) str, '+')) {
                String replace = str.replace(" +", "+");
                String subAfter = cn.hutool.core.text.l.subAfter((CharSequence) replace, '+', true);
                if (cn.hutool.core.text.l.isBlank(subAfter)) {
                    throw new DateException("Invalid format: [{}]", replace);
                }
                if (!cn.hutool.core.text.l.contains((CharSequence) subAfter, ':')) {
                    replace = cn.hutool.core.text.l.subBefore((CharSequence) replace, '+', true) + "+" + subAfter.substring(0, 2) + ":00";
                }
                return cn.hutool.core.text.l.contains((CharSequence) replace, '.') ? parse(normalizeMillSeconds(replace, ".", "+"), d.UTC_MS_WITH_XXX_OFFSET_FORMAT) : parse(replace, d.UTC_WITH_XXX_OFFSET_FORMAT);
            }
            if (cn.hutool.core.util.p0.contains("-\\d{2}:?00", str)) {
                String replace2 = str.replace(" -", "-");
                if (':' != replace2.charAt(replace2.length() - 3)) {
                    replace2 = replace2.substring(0, replace2.length() - 2) + ":00";
                }
                return cn.hutool.core.text.l.contains((CharSequence) replace2, '.') ? new DateTime(normalizeMillSeconds(replace2, ".", "-"), d.UTC_MS_WITH_XXX_OFFSET_FORMAT) : new DateTime(replace2, d.UTC_WITH_XXX_OFFSET_FORMAT);
            }
            if (length == 19) {
                return parse(str, d.UTC_SIMPLE_FORMAT);
            }
            if (length == 16) {
                return parse(str + ":00", d.UTC_SIMPLE_FORMAT);
            }
            if (cn.hutool.core.text.l.contains((CharSequence) str, '.')) {
                return parse(normalizeMillSeconds(str, ".", null), d.UTC_SIMPLE_MS_FORMAT);
            }
        }
        throw new DateException("No format fit for date String [{}] !", str);
    }

    public static int quarter(Date date) {
        return DateTime.of(date).quarter();
    }

    public static Quarter quarterEnum(Date date) {
        return DateTime.of(date).quarterEnum();
    }

    public static DateRange range(Date date, Date date2, DateField dateField) {
        return new DateRange(date, date2, dateField);
    }

    public static void rangeConsume(Date date, Date date2, DateField dateField, Consumer<Date> consumer) {
        if (date == null || date2 == null || date.after(date2)) {
            return;
        }
        range(date, date2, dateField).forEach(consumer);
    }

    public static List<DateTime> rangeContains(DateRange dateRange, DateRange dateRange2) {
        Stream stream;
        Stream filter;
        Collector list;
        Object collect;
        ArrayList newArrayList = CollUtil.newArrayList((Iterable) dateRange);
        final ArrayList newArrayList2 = CollUtil.newArrayList((Iterable) dateRange2);
        stream = newArrayList.stream();
        newArrayList2.getClass();
        filter = stream.filter(new Predicate() { // from class: cn.hutool.core.date.x
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return newArrayList2.contains((DateTime) obj);
            }
        });
        list = Collectors.toList();
        collect = filter.collect(list);
        return (List) collect;
    }

    public static <T> List<T> rangeFunc(Date date, Date date2, DateField dateField, Function<Date, T> function) {
        Object apply;
        if (date == null || date2 == null || date.after(date2)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<DateTime> it = range(date, date2, dateField).iterator();
        while (it.hasNext()) {
            apply = function.apply(it.next());
            arrayList.add(apply);
        }
        return arrayList;
    }

    public static List<DateTime> rangeNotContains(DateRange dateRange, DateRange dateRange2) {
        Stream stream;
        Stream filter;
        Collector list;
        Object collect;
        final ArrayList newArrayList = CollUtil.newArrayList((Iterable) dateRange);
        stream = CollUtil.newArrayList((Iterable) dateRange2).stream();
        filter = stream.filter(new Predicate() { // from class: cn.hutool.core.date.y
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean lambda$rangeNotContains$0;
                lambda$rangeNotContains$0 = z.lambda$rangeNotContains$0(newArrayList, (DateTime) obj);
                return lambda$rangeNotContains$0;
            }
        });
        list = Collectors.toList();
        collect = filter.collect(list);
        return (List) collect;
    }

    public static List<DateTime> rangeToList(Date date, Date date2, DateField dateField) {
        return CollUtil.newArrayList((Iterable) range(date, date2, dateField));
    }

    public static DateTime round(Date date, DateField dateField) {
        return new DateTime(cn.hutool.core.date.a.round(cn.hutool.core.date.a.calendar(date), dateField));
    }

    public static int second(Date date) {
        return DateTime.of(date).second();
    }

    public static String secondToTime(int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException("Seconds must be a positive number!");
        }
        int i9 = i8 / 3600;
        int i10 = i8 % 3600;
        int i11 = i10 / 60;
        int i12 = i10 % 60;
        StringBuilder sb = new StringBuilder();
        if (i9 < 10) {
            sb.append("0");
        }
        sb.append(i9);
        sb.append(":");
        if (i11 < 10) {
            sb.append("0");
        }
        sb.append(i11);
        sb.append(":");
        if (i12 < 10) {
            sb.append("0");
        }
        sb.append(i12);
        return sb.toString();
    }

    public static long spendMs(long j8) {
        return System.currentTimeMillis() - j8;
    }

    public static long spendNt(long j8) {
        return System.nanoTime() - j8;
    }

    public static int thisDayOfMonth() {
        return dayOfMonth(date());
    }

    public static int thisDayOfWeek() {
        return dayOfWeek(date());
    }

    public static Week thisDayOfWeekEnum() {
        return dayOfWeekEnum(date());
    }

    public static int thisHour(boolean z7) {
        return hour(date(), z7);
    }

    public static int thisMillisecond() {
        return millisecond(date());
    }

    public static int thisMinute() {
        return minute(date());
    }

    public static int thisMonth() {
        return month(date());
    }

    public static Month thisMonthEnum() {
        return monthEnum(date());
    }

    public static int thisSecond() {
        return second(date());
    }

    public static int thisWeekOfMonth() {
        return weekOfMonth(date());
    }

    public static int thisWeekOfYear() {
        return weekOfYear(date());
    }

    public static int thisYear() {
        return year(date());
    }

    public static int timeToSecond(String str) {
        int i8 = 0;
        if (cn.hutool.core.text.l.isEmpty(str)) {
            return 0;
        }
        for (int size = cn.hutool.core.text.l.splitTrim((CharSequence) str, ':', 3).size() - 1; size >= 0; size--) {
            i8 = (int) (i8 + (Integer.parseInt(r11.get(size)) * Math.pow(60.0d, r0 - size)));
        }
        return i8;
    }

    public static TimeInterval timer() {
        return new TimeInterval();
    }

    public static Instant toInstant(Date date) {
        Instant instant;
        if (date == null) {
            return null;
        }
        instant = date.toInstant();
        return instant;
    }

    @Deprecated
    public static int toIntSecond(Date date) {
        return Integer.parseInt(format(date, "yyMMddHHmm"));
    }

    public static LocalDateTime toLocalDateTime(Instant instant) {
        return k1.of(instant);
    }

    public static String today() {
        return formatDate(new DateTime());
    }

    public static DateTime tomorrow() {
        return offsetDay(new DateTime(), 1);
    }

    public static DateTime truncate(Date date, DateField dateField) {
        return new DateTime(cn.hutool.core.date.a.truncate(cn.hutool.core.date.a.calendar(date), dateField));
    }

    public static int weekOfMonth(Date date) {
        return DateTime.of(date).weekOfMonth();
    }

    public static int weekOfYear(Date date) {
        return DateTime.of(date).weekOfYear();
    }

    public static int year(Date date) {
        return DateTime.of(date).year();
    }

    public static String yearAndQuarter(Date date) {
        return cn.hutool.core.date.a.yearAndQuarter(cn.hutool.core.date.a.calendar(date));
    }

    public static DateTime yesterday() {
        return offsetDay(new DateTime(), -1);
    }

    public static int ageOfNow(Date date) {
        return age(date, date());
    }

    public static DateTime beginOfWeek(Date date, boolean z7) {
        return new DateTime(cn.hutool.core.date.a.beginOfWeek(cn.hutool.core.date.a.calendar(date), z7));
    }

    public static long between(Date date, Date date2, DateUnit dateUnit, boolean z7) {
        return new DateBetween(date, date2, z7).between(dateUnit);
    }

    public static DateTime ceiling(Date date, DateField dateField, boolean z7) {
        return new DateTime(cn.hutool.core.date.a.ceiling(cn.hutool.core.date.a.calendar(date), dateField, z7));
    }

    public static int compare(Date date, Date date2, String str) {
        if (str != null) {
            if (date != null) {
                date = parse(format(date, str), str);
            }
            if (date2 != null) {
                date2 = parse(format(date2, str), str);
            }
        }
        return cn.hutool.core.comparator.d.compare(date, date2);
    }

    public static DateTime convertTimeZone(Date date, TimeZone timeZone) {
        return new DateTime(date, timeZone);
    }

    public static n1 createStopWatch(String str) {
        return new n1(str);
    }

    public static DateTime date(Date date) {
        if (date == null) {
            return null;
        }
        return date instanceof DateTime ? (DateTime) date : dateNew(date);
    }

    public static DateTime endOfWeek(Date date, boolean z7) {
        return new DateTime(cn.hutool.core.date.a.endOfWeek(cn.hutool.core.date.a.calendar(date), z7));
    }

    public static String format(Date date, String str) {
        if (date == null || cn.hutool.core.text.l.isBlank(str)) {
            return null;
        }
        if (cn.hutool.core.date.format.o.isCustomFormat(str)) {
            return cn.hutool.core.date.format.o.format(date, str);
        }
        return format(date, newSimpleFormat(str, null, date instanceof DateTime ? ((DateTime) date).getTimeZone() : null));
    }

    public static String formatBetween(Date date, Date date2) {
        return formatBetween(between(date, date2, DateUnit.MS));
    }

    public static SimpleDateFormat newSimpleFormat(String str, Locale locale, TimeZone timeZone) {
        Locale.Category category;
        if (locale == null) {
            category = Locale.Category.FORMAT;
            locale = Locale.getDefault(category);
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        if (timeZone != null) {
            simpleDateFormat.setTimeZone(timeZone);
        }
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    public static DateTime parse(CharSequence charSequence, cn.hutool.core.date.format.c cVar) {
        return new DateTime(charSequence, cVar);
    }

    public static LocalDateTime parseLocalDateTime(CharSequence charSequence, String str) {
        return k1.parse(charSequence, str);
    }

    public static List<DateTime> rangeToList(Date date, Date date2, DateField dateField, int i8) {
        return CollUtil.newArrayList((Iterable) new DateRange(date, date2, dateField, i8));
    }

    public static TimeInterval timer(boolean z7) {
        return new TimeInterval(z7);
    }

    public static Instant toInstant(TemporalAccessor temporalAccessor) {
        return t2.toInstant(temporalAccessor);
    }

    public static LocalDateTime toLocalDateTime(Date date) {
        return k1.of(date);
    }

    public static LinkedHashSet<String> yearAndQuarter(Date date, Date date2) {
        return (date == null || date2 == null) ? new LinkedHashSet<>(0) : cn.hutool.core.date.a.yearAndQuarter(date.getTime(), date2.getTime());
    }

    public static String formatBetween(long j8, BetweenFormatter.Level level) {
        return new BetweenFormatter(j8, level).format();
    }

    @Deprecated
    public static boolean isExpired(Date date, Date date2, Date date3) {
        return betweenMs(date, date3) > betweenMs(date, date2);
    }

    public static DateTime parse(CharSequence charSequence, cn.hutool.core.date.format.c cVar, boolean z7) {
        return new DateTime(charSequence, cVar, z7);
    }

    public static String formatBetween(long j8) {
        return new BetweenFormatter(j8, BetweenFormatter.Level.MILLISECOND).format();
    }

    public static DateTime parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        return new DateTime(charSequence, dateTimeFormatter);
    }

    public static DateTime date(long j8) {
        return new DateTime(j8);
    }

    public static DateTime parse(CharSequence charSequence, String str) {
        return new DateTime(charSequence, str);
    }

    public static DateTime date(Calendar calendar) {
        if (calendar == null) {
            return null;
        }
        return new DateTime(calendar);
    }

    public static DateTime parse(CharSequence charSequence, String str, Locale locale) {
        if (cn.hutool.core.date.format.o.isCustomFormat(str)) {
            return new DateTime(cn.hutool.core.date.format.o.parse(charSequence, str));
        }
        return new DateTime(charSequence, newSimpleFormat(str, locale, null));
    }

    public static DateTime date(TemporalAccessor temporalAccessor) {
        if (temporalAccessor == null) {
            return null;
        }
        return new DateTime(temporalAccessor);
    }

    public static String format(Date date, cn.hutool.core.date.format.d dVar) {
        if (dVar == null || date == null) {
            return null;
        }
        return dVar.format(date);
    }

    public static String format(Date date, DateFormat dateFormat) {
        if (dateFormat == null || date == null) {
            return null;
        }
        return dateFormat.format(date);
    }

    public static DateTime parse(String str, String... strArr) {
        return new DateTime(cn.hutool.core.date.a.parseByPatterns(str, strArr));
    }

    public static String format(Date date, DateTimeFormatter dateTimeFormatter) {
        Instant instant;
        if (dateTimeFormatter == null || date == null) {
            return null;
        }
        instant = date.toInstant();
        return t2.format(instant, dateTimeFormatter);
    }

    public static DateTime parse(CharSequence charSequence) {
        if (cn.hutool.core.text.l.isBlank(charSequence)) {
            return null;
        }
        String removeAll = cn.hutool.core.text.l.removeAll(charSequence.toString().trim(), 26085, 31186);
        int length = removeAll.length();
        if (cn.hutool.core.util.d0.isNumber(removeAll)) {
            if (length == 14) {
                return parse(removeAll, d.PURE_DATETIME_FORMAT);
            }
            if (length == 17) {
                return parse(removeAll, d.PURE_DATETIME_MS_FORMAT);
            }
            if (length == 8) {
                return parse(removeAll, d.PURE_DATE_FORMAT);
            }
            if (length == 6) {
                return parse(removeAll, d.PURE_TIME_FORMAT);
            }
        } else {
            if (cn.hutool.core.util.p0.isMatch(cn.hutool.core.lang.n0.TIME, removeAll)) {
                return parseTimeToday(removeAll);
            }
            if (cn.hutool.core.text.l.containsAnyIgnoreCase(removeAll, wtb)) {
                return parseCST(removeAll);
            }
            if (cn.hutool.core.text.l.contains((CharSequence) removeAll, 'T')) {
                return parseUTC(removeAll);
            }
        }
        String normalize = normalize(removeAll);
        if (cn.hutool.core.util.p0.isMatch(d.REGEX_NORM, normalize)) {
            int count = cn.hutool.core.text.l.count((CharSequence) normalize, ':');
            if (count == 0) {
                return parse(normalize, d.NORM_DATE_FORMAT);
            }
            if (count == 1) {
                return parse(normalize, d.NORM_DATETIME_MINUTE_FORMAT);
            }
            if (count == 2) {
                int indexOf = cn.hutool.core.text.l.indexOf(normalize, '.');
                if (indexOf > 0) {
                    if (normalize.length() - indexOf > 4) {
                        normalize = cn.hutool.core.text.l.subPre(normalize, indexOf + 4);
                    }
                    return parse(normalize, d.NORM_DATETIME_MS_FORMAT);
                }
                return parse(normalize, d.NORM_DATETIME_FORMAT);
            }
        }
        throw new DateException("No format fit for date String [{}] !", normalize);
    }
}
