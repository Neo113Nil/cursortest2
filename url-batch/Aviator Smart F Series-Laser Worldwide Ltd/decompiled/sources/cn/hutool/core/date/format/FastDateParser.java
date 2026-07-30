package cn.hutool.core.date.format;

import cn.hutool.core.map.SafeConcurrentHashMap;
import com.moyoung.dafit.module.common.utils.u;
import java.io.ObjectInputStream;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class FastDateParser extends AbstractDateBasic implements cn.hutool.core.date.format.c {
    private static final k ABBREVIATED_YEAR_STRATEGY;
    private static final ConcurrentMap<Locale, k>[] CACHES;
    private static final k DAY_OF_MONTH_STRATEGY;
    private static final k DAY_OF_WEEK_IN_MONTH_STRATEGY;
    private static final k DAY_OF_WEEK_STRATEGY;
    private static final k DAY_OF_YEAR_STRATEGY;
    private static final k HOUR12_STRATEGY;
    private static final k HOUR24_OF_DAY_STRATEGY;
    private static final k HOUR_OF_DAY_STRATEGY;
    private static final k HOUR_STRATEGY;
    static final Locale JAPANESE_IMPERIAL = new Locale(u.LANGUAGE_JA, u.COUNTRY_JP, u.COUNTRY_JP);
    private static final k LITERAL_YEAR_STRATEGY;
    private static final Comparator<String> LONGER_FIRST_LOWERCASE;
    private static final k MILLISECOND_STRATEGY;
    private static final k MINUTE_STRATEGY;
    private static final k NUMBER_MONTH_STRATEGY;
    private static final k SECOND_STRATEGY;
    private static final k WEEK_OF_MONTH_STRATEGY;
    private static final k WEEK_OF_YEAR_STRATEGY;
    private static final long serialVersionUID = -3199383897950947498L;
    private final int century;
    private transient List<l> patterns;
    private final int startYear;

    static class a extends i {
        a(int i8) {
            super(i8);
        }

        @Override // cn.hutool.core.date.format.FastDateParser.i
        int modify(FastDateParser fastDateParser, int i8) {
            return i8 < 100 ? fastDateParser.adjustYear(i8) : i8;
        }
    }

    static class b extends i {
        b(int i8) {
            super(i8);
        }

        @Override // cn.hutool.core.date.format.FastDateParser.i
        int modify(FastDateParser fastDateParser, int i8) {
            return i8 - 1;
        }
    }

    static class c extends i {
        c(int i8) {
            super(i8);
        }

        @Override // cn.hutool.core.date.format.FastDateParser.i
        int modify(FastDateParser fastDateParser, int i8) {
            if (i8 != 7) {
                return 1 + i8;
            }
            return 1;
        }
    }

    static class d extends i {
        d(int i8) {
            super(i8);
        }

        @Override // cn.hutool.core.date.format.FastDateParser.i
        int modify(FastDateParser fastDateParser, int i8) {
            if (i8 == 24) {
                return 0;
            }
            return i8;
        }
    }

    static class e extends i {
        e(int i8) {
            super(i8);
        }

        @Override // cn.hutool.core.date.format.FastDateParser.i
        int modify(FastDateParser fastDateParser, int i8) {
            if (i8 == 12) {
                return 0;
            }
            return i8;
        }
    }

    private static class f extends j {
        private final int field;
        private final Map<String, Integer> lKeyValues;
        final Locale locale;

        f(int i8, Calendar calendar, Locale locale) {
            super(null);
            this.field = i8;
            this.locale = locale;
            StringBuilder sb = new StringBuilder();
            sb.append("((?iu)");
            this.lKeyValues = FastDateParser.appendDisplayNames(calendar, locale, i8, sb);
            sb.setLength(sb.length() - 1);
            sb.append(")");
            createPattern(sb);
        }

        @Override // cn.hutool.core.date.format.FastDateParser.j
        void setCalendar(FastDateParser fastDateParser, Calendar calendar, String str) {
            calendar.set(this.field, this.lKeyValues.get(str.toLowerCase(this.locale)).intValue());
        }
    }

    private static class g extends k {
        private final String formatField;

        g(String str) {
            super(null);
            this.formatField = str;
        }

        @Override // cn.hutool.core.date.format.FastDateParser.k
        boolean isNumber() {
            return false;
        }

        @Override // cn.hutool.core.date.format.FastDateParser.k
        boolean parse(FastDateParser fastDateParser, Calendar calendar, String str, ParsePosition parsePosition, int i8) {
            for (int i9 = 0; i9 < this.formatField.length(); i9++) {
                int index = parsePosition.getIndex() + i9;
                if (index == str.length()) {
                    parsePosition.setErrorIndex(index);
                    return false;
                }
                if (this.formatField.charAt(i9) != str.charAt(index)) {
                    parsePosition.setErrorIndex(index);
                    return false;
                }
            }
            parsePosition.setIndex(this.formatField.length() + parsePosition.getIndex());
            return true;
        }
    }

    private static class h extends j {
        private static final k ISO_8601_1_STRATEGY = new h("(Z|(?:[+-]\\d{2}))");
        private static final k ISO_8601_2_STRATEGY = new h("(Z|(?:[+-]\\d{2}\\d{2}))");
        private static final k ISO_8601_3_STRATEGY = new h("(Z|(?:[+-]\\d{2}(?::)\\d{2}))");

        h(String str) {
            super(null);
            createPattern(str);
        }

        static k getStrategy(int i8) {
            if (i8 == 1) {
                return ISO_8601_1_STRATEGY;
            }
            if (i8 == 2) {
                return ISO_8601_2_STRATEGY;
            }
            if (i8 == 3) {
                return ISO_8601_3_STRATEGY;
            }
            throw new IllegalArgumentException("invalid number of X");
        }

        @Override // cn.hutool.core.date.format.FastDateParser.j
        void setCalendar(FastDateParser fastDateParser, Calendar calendar, String str) {
            if (Objects.equals(str, "Z")) {
                calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
                return;
            }
            calendar.setTimeZone(TimeZone.getTimeZone("GMT" + str));
        }
    }

    private static class i extends k {
        private final int field;

        i(int i8) {
            super(null);
            this.field = i8;
        }

        @Override // cn.hutool.core.date.format.FastDateParser.k
        boolean isNumber() {
            return true;
        }

        int modify(FastDateParser fastDateParser, int i8) {
            return i8;
        }

        @Override // cn.hutool.core.date.format.FastDateParser.k
        boolean parse(FastDateParser fastDateParser, Calendar calendar, String str, ParsePosition parsePosition, int i8) {
            int index = parsePosition.getIndex();
            int length = str.length();
            if (i8 == 0) {
                while (index < length && Character.isWhitespace(str.charAt(index))) {
                    index++;
                }
                parsePosition.setIndex(index);
            } else {
                int i9 = i8 + index;
                if (length > i9) {
                    length = i9;
                }
            }
            while (index < length && Character.isDigit(str.charAt(index))) {
                index++;
            }
            if (parsePosition.getIndex() == index) {
                parsePosition.setErrorIndex(index);
                return false;
            }
            int parseInt = Integer.parseInt(str.substring(parsePosition.getIndex(), index));
            parsePosition.setIndex(index);
            calendar.set(this.field, modify(fastDateParser, parseInt));
            return true;
        }
    }

    private static abstract class j extends k {
        private Pattern pattern;

        private j() {
            super(null);
        }

        void createPattern(StringBuilder sb) {
            createPattern(sb.toString());
        }

        @Override // cn.hutool.core.date.format.FastDateParser.k
        boolean isNumber() {
            return false;
        }

        @Override // cn.hutool.core.date.format.FastDateParser.k
        boolean parse(FastDateParser fastDateParser, Calendar calendar, String str, ParsePosition parsePosition, int i8) {
            Matcher matcher = this.pattern.matcher(str.substring(parsePosition.getIndex()));
            if (!matcher.lookingAt()) {
                parsePosition.setErrorIndex(parsePosition.getIndex());
                return false;
            }
            parsePosition.setIndex(parsePosition.getIndex() + matcher.end(1));
            setCalendar(fastDateParser, calendar, matcher.group(1));
            return true;
        }

        abstract void setCalendar(FastDateParser fastDateParser, Calendar calendar, String str);

        /* synthetic */ j(a aVar) {
            this();
        }

        void createPattern(String str) {
            this.pattern = Pattern.compile(str);
        }
    }

    private static abstract class k {
        private k() {
        }

        /* synthetic */ k(a aVar) {
            this();
        }

        boolean isNumber() {
            return false;
        }

        abstract boolean parse(FastDateParser fastDateParser, Calendar calendar, String str, ParsePosition parsePosition, int i8);
    }

    private static class l {
        final k strategy;
        final int width;

        l(k kVar, int i8) {
            this.strategy = kVar;
            this.width = i8;
        }

        int getMaxWidth(ListIterator<l> listIterator) {
            if (!this.strategy.isNumber() || !listIterator.hasNext()) {
                return 0;
            }
            k kVar = listIterator.next().strategy;
            listIterator.previous();
            if (kVar.isNumber()) {
                return this.width;
            }
            return 0;
        }
    }

    private class m {
        private int currentIdx;
        private final Calendar definingCalendar;

        m(Calendar calendar) {
            this.definingCalendar = calendar;
        }

        private l letterPattern(char c8) {
            int i8 = this.currentIdx;
            do {
                int i9 = this.currentIdx + 1;
                this.currentIdx = i9;
                if (i9 >= FastDateParser.this.pattern.length()) {
                    break;
                }
            } while (FastDateParser.this.pattern.charAt(this.currentIdx) == c8);
            int i10 = this.currentIdx - i8;
            return new l(FastDateParser.this.getStrategy(c8, i10, this.definingCalendar), i10);
        }

        private l literal() {
            StringBuilder sb = new StringBuilder();
            boolean z7 = false;
            while (this.currentIdx < FastDateParser.this.pattern.length()) {
                char charAt = FastDateParser.this.pattern.charAt(this.currentIdx);
                if (!z7 && FastDateParser.isFormatLetter(charAt)) {
                    break;
                }
                if (charAt == '\'') {
                    int i8 = this.currentIdx + 1;
                    this.currentIdx = i8;
                    if (i8 == FastDateParser.this.pattern.length() || FastDateParser.this.pattern.charAt(this.currentIdx) != '\'') {
                        z7 = !z7;
                    }
                }
                this.currentIdx++;
                sb.append(charAt);
            }
            if (z7) {
                throw new IllegalArgumentException("Unterminated quote");
            }
            String sb2 = sb.toString();
            return new l(new g(sb2), sb2.length());
        }

        l getNextStrategy() {
            if (this.currentIdx >= FastDateParser.this.pattern.length()) {
                return null;
            }
            char charAt = FastDateParser.this.pattern.charAt(this.currentIdx);
            return FastDateParser.isFormatLetter(charAt) ? letterPattern(charAt) : literal();
        }
    }

    static class n extends j {
        private static final String GMT_OPTION = "GMT[+-]\\d{1,2}:\\d{2}";
        private static final int ID = 0;
        private static final String RFC_822_TIME_ZONE = "[+-]\\d{4}";
        private static final String UTC_TIME_ZONE_WITH_OFFSET = "[+-]\\d{2}:\\d{2}";
        private final Locale locale;
        private final Map<String, a> tzNames;

        private static class a {
            int dstOffset;
            TimeZone zone;

            a(TimeZone timeZone, boolean z7) {
                this.zone = timeZone;
                this.dstOffset = z7 ? timeZone.getDSTSavings() : 0;
            }
        }

        n(Locale locale) {
            super(null);
            this.tzNames = new HashMap();
            this.locale = locale;
            StringBuilder sb = new StringBuilder();
            sb.append("((?iu)[+-]\\d{4}|[+-]\\d{2}:\\d{2}|GMT[+-]\\d{1,2}:\\d{2}");
            TreeSet<String> treeSet = new TreeSet(FastDateParser.LONGER_FIRST_LOWERCASE);
            for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
                String str = strArr[0];
                if (!"GMT".equalsIgnoreCase(str)) {
                    TimeZone timeZone = TimeZone.getTimeZone(str);
                    a aVar = new a(timeZone, false);
                    a aVar2 = aVar;
                    for (int i8 = 1; i8 < strArr.length; i8++) {
                        if (i8 == 3) {
                            aVar2 = new a(timeZone, true);
                        } else if (i8 == 5) {
                            aVar2 = aVar;
                        }
                        String str2 = strArr[i8];
                        if (str2 != null) {
                            String lowerCase = str2.toLowerCase(locale);
                            if (treeSet.add(lowerCase)) {
                                this.tzNames.put(lowerCase, aVar2);
                            }
                        }
                    }
                }
            }
            for (String str3 : treeSet) {
                sb.append('|');
                FastDateParser.simpleQuote(sb, str3);
            }
            sb.append(")");
            createPattern(sb);
        }

        @Override // cn.hutool.core.date.format.FastDateParser.j
        void setCalendar(FastDateParser fastDateParser, Calendar calendar, String str) {
            if (str.charAt(0) == '+' || str.charAt(0) == '-') {
                calendar.setTimeZone(TimeZone.getTimeZone("GMT" + str));
                return;
            }
            if (str.regionMatches(true, 0, "GMT", 0, 3)) {
                calendar.setTimeZone(TimeZone.getTimeZone(str.toUpperCase()));
            } else {
                calendar.set(16, this.tzNames.get(str.toLowerCase(this.locale)).dstOffset);
                calendar.set(15, fastDateParser.getTimeZone().getRawOffset());
            }
        }
    }

    static {
        Comparator<String> reverseOrder;
        reverseOrder = Comparator.reverseOrder();
        LONGER_FIRST_LOWERCASE = reverseOrder;
        CACHES = new ConcurrentMap[17];
        ABBREVIATED_YEAR_STRATEGY = new a(1);
        NUMBER_MONTH_STRATEGY = new b(2);
        LITERAL_YEAR_STRATEGY = new i(1);
        WEEK_OF_YEAR_STRATEGY = new i(3);
        WEEK_OF_MONTH_STRATEGY = new i(4);
        DAY_OF_YEAR_STRATEGY = new i(6);
        DAY_OF_MONTH_STRATEGY = new i(5);
        DAY_OF_WEEK_STRATEGY = new c(7);
        DAY_OF_WEEK_IN_MONTH_STRATEGY = new i(8);
        HOUR_OF_DAY_STRATEGY = new i(11);
        HOUR24_OF_DAY_STRATEGY = new d(11);
        HOUR12_STRATEGY = new e(10);
        HOUR_STRATEGY = new i(10);
        MINUTE_STRATEGY = new i(12);
        SECOND_STRATEGY = new i(13);
        MILLISECOND_STRATEGY = new i(14);
    }

    public FastDateParser(String str, TimeZone timeZone, Locale locale) {
        this(str, timeZone, locale, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int adjustYear(int i8) {
        int i9 = this.century + i8;
        return i8 >= this.startYear ? i9 : i9 + 100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, Integer> appendDisplayNames(Calendar calendar, Locale locale, int i8, StringBuilder sb) {
        HashMap hashMap = new HashMap();
        Map<String, Integer> displayNames = calendar.getDisplayNames(i8, 0, locale);
        TreeSet treeSet = new TreeSet(LONGER_FIRST_LOWERCASE);
        for (Map.Entry<String, Integer> entry : displayNames.entrySet()) {
            String lowerCase = entry.getKey().toLowerCase(locale);
            if (treeSet.add(lowerCase)) {
                hashMap.put(lowerCase, entry.getValue());
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            simpleQuote(sb, (String) it.next()).append('|');
        }
        return hashMap;
    }

    private static ConcurrentMap<Locale, k> getCache(int i8) {
        ConcurrentMap<Locale, k> concurrentMap;
        ConcurrentMap<Locale, k>[] concurrentMapArr = CACHES;
        synchronized (concurrentMapArr) {
            try {
                if (concurrentMapArr[i8] == null) {
                    concurrentMapArr[i8] = new SafeConcurrentHashMap(3);
                }
                concurrentMap = concurrentMapArr[i8];
            } catch (Throwable th) {
                throw th;
            }
        }
        return concurrentMap;
    }

    private k getLocaleSpecificStrategy(int i8, Calendar calendar) {
        ConcurrentMap<Locale, k> cache = getCache(i8);
        k kVar = cache.get(this.locale);
        if (kVar == null) {
            kVar = i8 == 15 ? new n(this.locale) : new f(i8, calendar, this.locale);
            k putIfAbsent = cache.putIfAbsent(this.locale, kVar);
            if (putIfAbsent != null) {
                return putIfAbsent;
            }
        }
        return kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public k getStrategy(char c8, int i8, Calendar calendar) {
        if (c8 != 'y') {
            if (c8 != 'z') {
                switch (c8) {
                    case 'D':
                        return DAY_OF_YEAR_STRATEGY;
                    case 'E':
                        return getLocaleSpecificStrategy(7, calendar);
                    case 'F':
                        return DAY_OF_WEEK_IN_MONTH_STRATEGY;
                    case 'G':
                        return getLocaleSpecificStrategy(0, calendar);
                    case 'H':
                        return HOUR_OF_DAY_STRATEGY;
                    default:
                        switch (c8) {
                            case 'K':
                                return HOUR_STRATEGY;
                            case 'M':
                                return i8 >= 3 ? getLocaleSpecificStrategy(2, calendar) : NUMBER_MONTH_STRATEGY;
                            case 'S':
                                return MILLISECOND_STRATEGY;
                            case 'a':
                                return getLocaleSpecificStrategy(9, calendar);
                            case 'd':
                                return DAY_OF_MONTH_STRATEGY;
                            case 'h':
                                return HOUR12_STRATEGY;
                            case 'k':
                                return HOUR24_OF_DAY_STRATEGY;
                            case 'm':
                                return MINUTE_STRATEGY;
                            case 's':
                                return SECOND_STRATEGY;
                            case 'u':
                                return DAY_OF_WEEK_STRATEGY;
                            case 'w':
                                return WEEK_OF_YEAR_STRATEGY;
                            default:
                                switch (c8) {
                                    case 'W':
                                        return WEEK_OF_MONTH_STRATEGY;
                                    case 'X':
                                        return h.getStrategy(i8);
                                    case 'Y':
                                        break;
                                    case 'Z':
                                        if (i8 == 2) {
                                            return h.ISO_8601_3_STRATEGY;
                                        }
                                        break;
                                    default:
                                        throw new IllegalArgumentException("Format '" + c8 + "' not supported");
                                }
                        }
                }
            }
            return getLocaleSpecificStrategy(15, calendar);
        }
        return i8 > 2 ? LITERAL_YEAR_STRATEGY : ABBREVIATED_YEAR_STRATEGY;
    }

    private void init(Calendar calendar) {
        this.patterns = new ArrayList();
        m mVar = new m(calendar);
        while (true) {
            l nextStrategy = mVar.getNextStrategy();
            if (nextStrategy == null) {
                return;
            } else {
                this.patterns.add(nextStrategy);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isFormatLetter(char c8) {
        return (c8 >= 'A' && c8 <= 'Z') || (c8 >= 'a' && c8 <= 'z');
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        init(Calendar.getInstance(this.timeZone, this.locale));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static StringBuilder simpleQuote(StringBuilder sb, String str) {
        for (int i8 = 0; i8 < str.length(); i8++) {
            char charAt = str.charAt(i8);
            if (charAt != '$' && charAt != '.' && charAt != '?' && charAt != '^' && charAt != '[' && charAt != '\\' && charAt != '{' && charAt != '|') {
                switch (charAt) {
                }
                sb.append(charAt);
            }
            sb.append(cn.hutool.core.io.file.c.WINDOWS_SEPARATOR);
            sb.append(charAt);
        }
        return sb;
    }

    @Override // cn.hutool.core.date.format.c
    public Date parse(String str) {
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = parse(str, parsePosition);
        if (parse != null) {
            return parse;
        }
        if (!this.locale.equals(JAPANESE_IMPERIAL)) {
            throw new ParseException("Unparseable date: " + str, parsePosition.getErrorIndex());
        }
        throw new ParseException("(The " + this.locale + " locale does not support dates before 1868 AD)\nUnparseable date: \"" + str, parsePosition.getErrorIndex());
    }

    @Override // cn.hutool.core.date.format.c
    public /* bridge */ /* synthetic */ Object parseObject(String str) {
        return cn.hutool.core.date.format.b.a(this, str);
    }

    public FastDateParser(String str, TimeZone timeZone, Locale locale, Date date) {
        super(str, timeZone, locale);
        int i8;
        Calendar calendar = Calendar.getInstance(timeZone, locale);
        if (date != null) {
            calendar.setTime(date);
            i8 = calendar.get(1);
        } else if (locale.equals(JAPANESE_IMPERIAL)) {
            i8 = 0;
        } else {
            calendar.setTime(new Date());
            i8 = calendar.get(1) - 80;
        }
        int i9 = (i8 / 100) * 100;
        this.century = i9;
        this.startYear = i8 - i9;
        init(calendar);
    }

    @Override // cn.hutool.core.date.format.c
    public /* bridge */ /* synthetic */ Object parseObject(String str, ParsePosition parsePosition) {
        return cn.hutool.core.date.format.b.b(this, str, parsePosition);
    }

    @Override // cn.hutool.core.date.format.c
    public Date parse(String str, ParsePosition parsePosition) {
        Calendar calendar = Calendar.getInstance(this.timeZone, this.locale);
        calendar.clear();
        if (parse(str, parsePosition, calendar)) {
            return calendar.getTime();
        }
        return null;
    }

    @Override // cn.hutool.core.date.format.c
    public boolean parse(String str, ParsePosition parsePosition, Calendar calendar) {
        ListIterator<l> listIterator = this.patterns.listIterator();
        while (listIterator.hasNext()) {
            l next = listIterator.next();
            if (!next.strategy.parse(this, calendar, str, parsePosition, next.getMaxWidth(listIterator))) {
                return false;
            }
        }
        return true;
    }
}
