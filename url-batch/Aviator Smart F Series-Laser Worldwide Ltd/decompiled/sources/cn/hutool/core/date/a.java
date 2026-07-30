package cn.hutool.core.date;

import cn.hutool.core.date.DateModifier;
import cn.hutool.core.date.format.FastDateParser;
import java.text.ParsePosition;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public class a {
    public static int age(Calendar calendar, Calendar calendar2) {
        return age(calendar.getTimeInMillis(), calendar2.getTimeInMillis());
    }

    public static Calendar beginOfDay(Calendar calendar) {
        return truncate(calendar, DateField.DAY_OF_MONTH);
    }

    public static Calendar beginOfHour(Calendar calendar) {
        return truncate(calendar, DateField.HOUR_OF_DAY);
    }

    public static Calendar beginOfMinute(Calendar calendar) {
        return truncate(calendar, DateField.MINUTE);
    }

    public static Calendar beginOfMonth(Calendar calendar) {
        return truncate(calendar, DateField.MONTH);
    }

    public static Calendar beginOfQuarter(Calendar calendar) {
        calendar.set(2, (calendar.get(DateField.MONTH.getValue()) / 3) * 3);
        calendar.set(5, 1);
        return beginOfDay(calendar);
    }

    public static Calendar beginOfSecond(Calendar calendar) {
        return truncate(calendar, DateField.SECOND);
    }

    public static Calendar beginOfWeek(Calendar calendar) {
        return beginOfWeek(calendar, true);
    }

    public static Calendar beginOfYear(Calendar calendar) {
        return truncate(calendar, DateField.YEAR);
    }

    public static Calendar calendar() {
        return Calendar.getInstance();
    }

    public static Calendar ceiling(Calendar calendar, DateField dateField) {
        return DateModifier.modify(calendar, dateField.getValue(), DateModifier.ModifyType.CEILING);
    }

    public static int compare(Calendar calendar, Calendar calendar2) {
        return cn.hutool.core.comparator.d.compare(calendar, calendar2);
    }

    public static Calendar endOfDay(Calendar calendar) {
        return ceiling(calendar, DateField.DAY_OF_MONTH);
    }

    public static Calendar endOfHour(Calendar calendar) {
        return ceiling(calendar, DateField.HOUR_OF_DAY);
    }

    public static Calendar endOfMinute(Calendar calendar) {
        return ceiling(calendar, DateField.MINUTE);
    }

    public static Calendar endOfMonth(Calendar calendar) {
        return ceiling(calendar, DateField.MONTH);
    }

    public static Calendar endOfQuarter(Calendar calendar) {
        int i8 = calendar.get(1);
        int i9 = ((calendar.get(DateField.MONTH.getValue()) / 3) * 3) + 2;
        Calendar calendar2 = Calendar.getInstance(calendar.getTimeZone());
        calendar2.set(i8, i9, Month.of(i9).getLastDay(z.isLeapYear(i8)));
        return endOfDay(calendar2);
    }

    public static Calendar endOfSecond(Calendar calendar) {
        return ceiling(calendar, DateField.SECOND);
    }

    public static Calendar endOfWeek(Calendar calendar) {
        return endOfWeek(calendar, true);
    }

    public static Calendar endOfYear(Calendar calendar) {
        return ceiling(calendar, DateField.YEAR);
    }

    public static String formatChineseDate(Calendar calendar, boolean z7) {
        StringBuilder builder = cn.hutool.core.util.c1.builder();
        String valueOf = String.valueOf(calendar.get(1));
        int length = valueOf.length();
        for (int i8 = 0; i8 < length; i8++) {
            builder.append(cn.hutool.core.convert.z.numberCharToChinese(valueOf.charAt(i8), false));
        }
        builder.append((char) 24180);
        builder.append(cn.hutool.core.convert.z.formatThousand(calendar.get(2) + 1, false));
        builder.append((char) 26376);
        builder.append(cn.hutool.core.convert.z.formatThousand(calendar.get(5), false));
        builder.append((char) 26085);
        String replace = builder.toString().replace((char) 38646, (char) 12295);
        builder.delete(0, builder.length());
        builder.append(replace);
        if (z7) {
            builder.append(cn.hutool.core.convert.z.formatThousand(calendar.get(11), false));
            builder.append((char) 26102);
            builder.append(cn.hutool.core.convert.z.formatThousand(calendar.get(12), false));
            builder.append((char) 20998);
            builder.append(cn.hutool.core.convert.z.formatThousand(calendar.get(13), false));
            builder.append((char) 31186);
        }
        return builder.toString();
    }

    public static int getBeginValue(Calendar calendar, DateField dateField) {
        return getBeginValue(calendar, dateField.getValue());
    }

    public static int getEndValue(Calendar calendar, DateField dateField) {
        return getEndValue(calendar, dateField.getValue());
    }

    public static boolean isAM(Calendar calendar) {
        return calendar.get(9) == 0;
    }

    public static boolean isPM(Calendar calendar) {
        return 1 == calendar.get(9);
    }

    public static boolean isSameDay(Calendar calendar, Calendar calendar2) {
        if (calendar == null || calendar2 == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        return calendar.get(6) == calendar2.get(6) && calendar.get(1) == calendar2.get(1) && calendar.get(0) == calendar2.get(0);
    }

    public static boolean isSameInstant(Calendar calendar, Calendar calendar2) {
        return calendar == null ? calendar2 == null : calendar2 != null && calendar.getTimeInMillis() == calendar2.getTimeInMillis();
    }

    public static boolean isSameMonth(Calendar calendar, Calendar calendar2) {
        if (calendar == null || calendar2 == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        return calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(0) == calendar2.get(0);
    }

    public static boolean isSameWeek(Calendar calendar, Calendar calendar2, boolean z7) {
        if (calendar == null || calendar2 == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        Calendar calendar3 = (Calendar) calendar.clone();
        Calendar calendar4 = (Calendar) calendar2.clone();
        if (z7) {
            calendar3.setFirstDayOfWeek(2);
            calendar3.set(7, 2);
            calendar4.setFirstDayOfWeek(2);
            calendar4.set(7, 2);
        } else {
            calendar3.setFirstDayOfWeek(1);
            calendar3.set(7, 1);
            calendar4.setFirstDayOfWeek(1);
            calendar4.set(7, 1);
        }
        return isSameDay(calendar3, calendar4);
    }

    public static Calendar parse(CharSequence charSequence, boolean z7, cn.hutool.core.date.format.c cVar) {
        Calendar calendar = Calendar.getInstance(cVar.getTimeZone(), cVar.getLocale());
        calendar.clear();
        calendar.setLenient(z7);
        if (cVar.parse(cn.hutool.core.text.l.str(charSequence), new ParsePosition(0), calendar)) {
            return calendar;
        }
        return null;
    }

    public static Calendar parseByPatterns(String str, String... strArr) {
        return parseByPatterns(str, null, strArr);
    }

    public static Calendar round(Calendar calendar, DateField dateField) {
        return DateModifier.modify(calendar, dateField.getValue(), DateModifier.ModifyType.ROUND);
    }

    public static Instant toInstant(Calendar calendar) {
        Instant instant;
        if (calendar == null) {
            return null;
        }
        instant = calendar.toInstant();
        return instant;
    }

    public static LocalDateTime toLocalDateTime(Calendar calendar) {
        Instant instant;
        ZoneId zoneId;
        LocalDateTime ofInstant;
        instant = calendar.toInstant();
        zoneId = calendar.getTimeZone().toZoneId();
        ofInstant = LocalDateTime.ofInstant(instant, zoneId);
        return ofInstant;
    }

    public static Calendar truncate(Calendar calendar, DateField dateField) {
        return DateModifier.modify(calendar, dateField.getValue(), DateModifier.ModifyType.TRUNCATE);
    }

    public static LinkedHashSet<String> yearAndQuarter(long j8, long j9) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        Calendar calendar = calendar(j8);
        while (j8 <= j9) {
            linkedHashSet.add(yearAndQuarter(calendar));
            calendar.add(2, 3);
            j8 = calendar.getTimeInMillis();
        }
        return linkedHashSet;
    }

    protected static int age(long j8, long j9) {
        if (j8 > j9) {
            throw new IllegalArgumentException("Birthday is after dateToCompare!");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j9);
        int i8 = calendar.get(1);
        int i9 = calendar.get(2);
        int i10 = calendar.get(5);
        calendar.setTimeInMillis(j8);
        int i11 = i8 - calendar.get(1);
        if (i11 == 0) {
            return 0;
        }
        int i12 = calendar.get(2);
        if (i9 == i12) {
            if (i10 > calendar.get(5)) {
                return i11;
            }
        } else if (i9 >= i12) {
            return i11;
        }
        return i11 - 1;
    }

    public static Calendar beginOfWeek(Calendar calendar, boolean z7) {
        calendar.setFirstDayOfWeek(z7 ? 2 : 1);
        return truncate(calendar, DateField.WEEK_OF_MONTH);
    }

    public static Calendar calendar(Date date) {
        return date instanceof DateTime ? ((DateTime) date).toCalendar() : calendar(date.getTime());
    }

    public static Calendar ceiling(Calendar calendar, DateField dateField, boolean z7) {
        return DateModifier.modify(calendar, dateField.getValue(), DateModifier.ModifyType.CEILING, z7);
    }

    public static Calendar endOfWeek(Calendar calendar, boolean z7) {
        calendar.setFirstDayOfWeek(z7 ? 2 : 1);
        return ceiling(calendar, DateField.WEEK_OF_MONTH);
    }

    public static int getBeginValue(Calendar calendar, int i8) {
        return 7 == i8 ? calendar.getFirstDayOfWeek() : calendar.getActualMinimum(i8);
    }

    public static int getEndValue(Calendar calendar, int i8) {
        return 7 == i8 ? (calendar.getFirstDayOfWeek() + 6) % 7 : calendar.getActualMaximum(i8);
    }

    public static Calendar parseByPatterns(String str, Locale locale, String... strArr) {
        return parseByPatterns(str, locale, true, strArr);
    }

    public static Calendar parseByPatterns(String str, Locale locale, boolean z7, String... strArr) {
        if (str != null && strArr != null) {
            TimeZone timeZone = TimeZone.getDefault();
            Locale locale2 = (Locale) cn.hutool.core.util.e0.defaultIfNull(locale, Locale.getDefault());
            ParsePosition parsePosition = new ParsePosition(0);
            Calendar calendar = Calendar.getInstance(timeZone, locale2);
            calendar.setLenient(z7);
            for (String str2 : strArr) {
                if (cn.hutool.core.date.format.o.isCustomFormat(str2)) {
                    Date parse = cn.hutool.core.date.format.o.parse(str, str2);
                    if (parse != null) {
                        calendar.setTime(parse);
                        return calendar;
                    }
                } else {
                    FastDateParser fastDateParser = new FastDateParser(str2, timeZone, locale2);
                    calendar.clear();
                    try {
                        if (fastDateParser.parse(str, parsePosition, calendar) && parsePosition.getIndex() == str.length()) {
                            return calendar;
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                    parsePosition.setIndex(0);
                }
            }
            throw new DateException("Unable to parse the date: {}", str);
        }
        throw new IllegalArgumentException("Date and Patterns must not be null");
    }

    public static Calendar calendar(long j8) {
        return calendar(j8, TimeZone.getDefault());
    }

    public static Calendar calendar(long j8, TimeZone timeZone) {
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTimeInMillis(j8);
        return calendar;
    }

    public static String yearAndQuarter(Calendar calendar) {
        StringBuilder builder = cn.hutool.core.util.c1.builder();
        builder.append(calendar.get(1));
        builder.append((calendar.get(2) / 3) + 1);
        return builder.toString();
    }
}
