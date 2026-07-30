package cn.hutool.core.date.format;

import cn.hutool.core.date.DateException;
import cn.hutool.core.map.SafeConcurrentHashMap;
import com.artillery.ctc.uitls.TimeConstants;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public class FastDatePrinter extends AbstractDateBasic implements cn.hutool.core.date.format.d {
    private static final ConcurrentMap<i, String> C_TIME_ZONE_DISPLAY_CACHE = new SafeConcurrentHashMap(7);
    private static final int MAX_DIGITS = 10;
    private static final long serialVersionUID = -6305750172255764887L;
    private transient int mMaxLengthEstimate;
    private transient f[] rules;

    private static class a implements f {
        private final char mValue;

        a(char c8) {
            this.mValue = c8;
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.f
        public void appendTo(Appendable appendable, Calendar calendar) {
            appendable.append(this.mValue);
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.f
        public int estimateLength() {
            return 1;
        }
    }

    private static class c implements f {
        final int length;
        static final c ISO8601_HOURS = new c(3);
        static final c ISO8601_HOURS_MINUTES = new c(5);
        static final c ISO8601_HOURS_COLON_MINUTES = new c(6);

        c(int i8) {
            this.length = i8;
        }

        static c getRule(int i8) {
            if (i8 == 1) {
                return ISO8601_HOURS;
            }
            if (i8 == 2) {
                return ISO8601_HOURS_MINUTES;
            }
            if (i8 == 3) {
                return ISO8601_HOURS_COLON_MINUTES;
            }
            throw new IllegalArgumentException("invalid number of X");
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.f
        public void appendTo(Appendable appendable, Calendar calendar) {
            int i8 = calendar.get(15) + calendar.get(16);
            if (i8 == 0) {
                appendable.append("Z");
                return;
            }
            if (i8 < 0) {
                appendable.append('-');
                i8 = -i8;
            } else {
                appendable.append('+');
            }
            int i9 = i8 / TimeConstants.HOUR;
            FastDatePrinter.appendDigits(appendable, i9);
            int i10 = this.length;
            if (i10 < 5) {
                return;
            }
            if (i10 == 6) {
                appendable.append(':');
            }
            FastDatePrinter.appendDigits(appendable, (i8 / 60000) - (i9 * 60));
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.f
        public int estimateLength() {
            return this.length;
        }
    }

    private interface d extends f {
        void appendTo(Appendable appendable, int i8);

        @Override // cn.hutool.core.date.format.FastDatePrinter.f
        /* synthetic */ void appendTo(Appendable appendable, Calendar calendar);

        @Override // cn.hutool.core.date.format.FastDatePrinter.f
        /* synthetic */ int estimateLength();
    }

    private static class e implements d {
        private final int mField;
        private final int mSize;

        e(int i8, int i9) {
            if (i9 < 3) {
                throw new IllegalArgumentException();
            }
            this.mField = i8;
            this.mSize = i9;
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.d, cn.hutool.core.date.format.FastDatePrinter.f
        public void appendTo(Appendable appendable, Calendar calendar) {
            appendTo(appendable, calendar.get(this.mField));
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.d, cn.hutool.core.date.format.FastDatePrinter.f
        public int estimateLength() {
            return this.mSize;
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.d
        public final void appendTo(Appendable appendable, int i8) {
            FastDatePrinter.appendFullDigits(appendable, i8, this.mSize);
        }
    }

    private interface f {
        void appendTo(Appendable appendable, Calendar calendar);

        int estimateLength();
    }

    private static class g implements f {
        private final String mValue;

        g(String str) {
            this.mValue = str;
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.f
        public void appendTo(Appendable appendable, Calendar calendar) {
            appendable.append(this.mValue);
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.f
        public int estimateLength() {
            return this.mValue.length();
        }
    }

    private static class h implements f {
        private final int mField;
        private final String[] mValues;

        h(int i8, String[] strArr) {
            this.mField = i8;
            this.mValues = strArr;
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.f
        public void appendTo(Appendable appendable, Calendar calendar) {
            appendable.append(this.mValues[calendar.get(this.mField)]);
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.f
        public int estimateLength() {
            int length = this.mValues.length;
            int i8 = 0;
            while (true) {
                length--;
                if (length < 0) {
                    return i8;
                }
                int length2 = this.mValues[length].length();
                if (length2 > i8) {
                    i8 = length2;
                }
            }
        }
    }

    private static class i {
        private final Locale mLocale;
        private final int mStyle;
        private final TimeZone mTimeZone;

        i(TimeZone timeZone, boolean z7, int i8, Locale locale) {
            this.mTimeZone = timeZone;
            if (z7) {
                this.mStyle = Integer.MIN_VALUE | i8;
            } else {
                this.mStyle = i8;
            }
            this.mLocale = locale;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.mTimeZone.equals(iVar.mTimeZone) && this.mStyle == iVar.mStyle && this.mLocale.equals(iVar.mLocale);
        }

        public int hashCode() {
            return (((this.mStyle * 31) + this.mLocale.hashCode()) * 31) + this.mTimeZone.hashCode();
        }
    }

    private static class j implements f {
        private final String mDaylight;
        private final Locale mLocale;
        private final String mStandard;
        private final int mStyle;

        j(TimeZone timeZone, Locale locale, int i8) {
            this.mLocale = locale;
            this.mStyle = i8;
            this.mStandard = FastDatePrinter.getTimeZoneDisplay(timeZone, false, i8, locale);
            this.mDaylight = FastDatePrinter.getTimeZoneDisplay(timeZone, true, i8, locale);
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.f
        public void appendTo(Appendable appendable, Calendar calendar) {
            TimeZone timeZone = calendar.getTimeZone();
            if (calendar.get(16) != 0) {
                appendable.append(FastDatePrinter.getTimeZoneDisplay(timeZone, true, this.mStyle, this.mLocale));
            } else {
                appendable.append(FastDatePrinter.getTimeZoneDisplay(timeZone, false, this.mStyle, this.mLocale));
            }
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.f
        public int estimateLength() {
            return Math.max(this.mStandard.length(), this.mDaylight.length());
        }
    }

    private static class k implements f {
        static final k INSTANCE_COLON = new k(true);
        static final k INSTANCE_NO_COLON = new k(false);
        final boolean mColon;

        k(boolean z7) {
            this.mColon = z7;
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.f
        public void appendTo(Appendable appendable, Calendar calendar) {
            int i8 = calendar.get(15) + calendar.get(16);
            if (i8 < 0) {
                appendable.append('-');
                i8 = -i8;
            } else {
                appendable.append('+');
            }
            int i9 = i8 / TimeConstants.HOUR;
            FastDatePrinter.appendDigits(appendable, i9);
            if (this.mColon) {
                appendable.append(':');
            }
            FastDatePrinter.appendDigits(appendable, (i8 / 60000) - (i9 * 60));
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.f
        public int estimateLength() {
            return 5;
        }
    }

    private static class n implements d {
        static final n INSTANCE = new n();

        n() {
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.d, cn.hutool.core.date.format.FastDatePrinter.f
        public void appendTo(Appendable appendable, Calendar calendar) {
            appendTo(appendable, calendar.get(2) + 1);
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.d, cn.hutool.core.date.format.FastDatePrinter.f
        public int estimateLength() {
            return 2;
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.d
        public final void appendTo(Appendable appendable, int i8) {
            FastDatePrinter.appendDigits(appendable, i8);
        }
    }

    private static class o implements d {
        private final int mField;

        o(int i8) {
            this.mField = i8;
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.d, cn.hutool.core.date.format.FastDatePrinter.f
        public void appendTo(Appendable appendable, Calendar calendar) {
            appendTo(appendable, calendar.get(this.mField));
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.d, cn.hutool.core.date.format.FastDatePrinter.f
        public int estimateLength() {
            return 2;
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.d
        public final void appendTo(Appendable appendable, int i8) {
            if (i8 < 100) {
                FastDatePrinter.appendDigits(appendable, i8);
            } else {
                FastDatePrinter.appendFullDigits(appendable, i8, 2);
            }
        }
    }

    private static class p implements d {
        static final p INSTANCE = new p();

        p() {
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.d, cn.hutool.core.date.format.FastDatePrinter.f
        public void appendTo(Appendable appendable, Calendar calendar) {
            appendTo(appendable, calendar.get(1) % 100);
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.d, cn.hutool.core.date.format.FastDatePrinter.f
        public int estimateLength() {
            return 2;
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.d
        public final void appendTo(Appendable appendable, int i8) {
            FastDatePrinter.appendDigits(appendable, i8);
        }
    }

    private static class q implements d {
        static final q INSTANCE = new q();

        q() {
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.d, cn.hutool.core.date.format.FastDatePrinter.f
        public void appendTo(Appendable appendable, Calendar calendar) {
            appendTo(appendable, calendar.get(2) + 1);
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.d, cn.hutool.core.date.format.FastDatePrinter.f
        public int estimateLength() {
            return 2;
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.d
        public final void appendTo(Appendable appendable, int i8) {
            if (i8 < 10) {
                appendable.append((char) (i8 + 48));
            } else {
                FastDatePrinter.appendDigits(appendable, i8);
            }
        }
    }

    private static class r implements d {
        private final int mField;

        r(int i8) {
            this.mField = i8;
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.d, cn.hutool.core.date.format.FastDatePrinter.f
        public void appendTo(Appendable appendable, Calendar calendar) {
            appendTo(appendable, calendar.get(this.mField));
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.d, cn.hutool.core.date.format.FastDatePrinter.f
        public int estimateLength() {
            return 4;
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.d
        public final void appendTo(Appendable appendable, int i8) {
            if (i8 < 10) {
                appendable.append((char) (i8 + 48));
            } else if (i8 < 100) {
                FastDatePrinter.appendDigits(appendable, i8);
            } else {
                FastDatePrinter.appendFullDigits(appendable, i8, 1);
            }
        }
    }

    private static class s implements d {
        private final d mRule;

        s(d dVar) {
            this.mRule = dVar;
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.d, cn.hutool.core.date.format.FastDatePrinter.f
        public void appendTo(Appendable appendable, Calendar calendar) {
            int weekYear;
            d dVar = this.mRule;
            weekYear = calendar.getWeekYear();
            dVar.appendTo(appendable, weekYear);
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.d, cn.hutool.core.date.format.FastDatePrinter.f
        public int estimateLength() {
            return this.mRule.estimateLength();
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.d
        public void appendTo(Appendable appendable, int i8) {
            this.mRule.appendTo(appendable, i8);
        }
    }

    public FastDatePrinter(String str, TimeZone timeZone, Locale locale) {
        super(str, timeZone, locale);
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void appendDigits(Appendable appendable, int i8) {
        appendable.append((char) ((i8 / 10) + 48));
        appendable.append((char) ((i8 % 10) + 48));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void appendFullDigits(Appendable appendable, int i8, int i9) {
        if (i8 < 10000) {
            int i10 = i8 < 1000 ? i8 < 100 ? i8 < 10 ? 1 : 2 : 3 : 4;
            for (int i11 = i9 - i10; i11 > 0; i11--) {
                appendable.append('0');
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            return;
                        }
                        appendable.append((char) ((i8 / 1000) + 48));
                        i8 %= 1000;
                    }
                    if (i8 >= 100) {
                        appendable.append((char) ((i8 / 100) + 48));
                        i8 %= 100;
                    } else {
                        appendable.append('0');
                    }
                }
                if (i8 >= 10) {
                    appendable.append((char) ((i8 / 10) + 48));
                    i8 %= 10;
                } else {
                    appendable.append('0');
                }
            }
            appendable.append((char) (i8 + 48));
            return;
        }
        char[] cArr = new char[10];
        int i12 = 0;
        while (i8 != 0) {
            cArr[i12] = (char) ((i8 % 10) + 48);
            i8 /= 10;
            i12++;
        }
        while (i12 < i9) {
            appendable.append('0');
            i9--;
        }
        while (true) {
            i12--;
            if (i12 < 0) {
                return;
            } else {
                appendable.append(cArr[i12]);
            }
        }
    }

    private <B extends Appendable> B applyRules(Calendar calendar, B b8) {
        try {
            for (f fVar : this.rules) {
                fVar.appendTo(b8, calendar);
            }
            return b8;
        } catch (IOException e8) {
            throw new DateException(e8);
        }
    }

    private String applyRulesToString(Calendar calendar) {
        return ((StringBuilder) applyRules(calendar, new StringBuilder(this.mMaxLengthEstimate))).toString();
    }

    static String getTimeZoneDisplay(TimeZone timeZone, boolean z7, int i8, Locale locale) {
        i iVar = new i(timeZone, z7, i8, locale);
        ConcurrentMap<i, String> concurrentMap = C_TIME_ZONE_DISPLAY_CACHE;
        String str = concurrentMap.get(iVar);
        if (str != null) {
            return str;
        }
        String displayName = timeZone.getDisplayName(z7, i8, locale);
        String putIfAbsent = concurrentMap.putIfAbsent(iVar, displayName);
        return putIfAbsent != null ? putIfAbsent : displayName;
    }

    private void init() {
        int i8 = 0;
        f[] fVarArr = (f[]) parsePattern().toArray(new f[0]);
        this.rules = fVarArr;
        int length = fVarArr.length;
        while (true) {
            length--;
            if (length < 0) {
                this.mMaxLengthEstimate = i8;
                return;
            }
            i8 += this.rules[length].estimateLength();
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        init();
    }

    String format(Object obj) {
        if (obj instanceof Date) {
            return format((Date) obj);
        }
        if (obj instanceof Calendar) {
            return format((Calendar) obj);
        }
        if (obj instanceof Long) {
            return format(((Long) obj).longValue());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown class: ");
        sb.append(obj == null ? "<null>" : obj.getClass().getName());
        throw new IllegalArgumentException(sb.toString());
    }

    public int getMaxLengthEstimate() {
        return this.mMaxLengthEstimate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v18, types: [cn.hutool.core.date.format.FastDatePrinter$b] */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20, types: [cn.hutool.core.date.format.FastDatePrinter$h] */
    /* JADX WARN: Type inference failed for: r9v10, types: [cn.hutool.core.date.format.FastDatePrinter$j] */
    /* JADX WARN: Type inference failed for: r9v11, types: [cn.hutool.core.date.format.FastDatePrinter$j] */
    /* JADX WARN: Type inference failed for: r9v15, types: [cn.hutool.core.date.format.FastDatePrinter$g] */
    /* JADX WARN: Type inference failed for: r9v16, types: [cn.hutool.core.date.format.FastDatePrinter$a] */
    /* JADX WARN: Type inference failed for: r9v21, types: [cn.hutool.core.date.format.FastDatePrinter$h] */
    /* JADX WARN: Type inference failed for: r9v22, types: [cn.hutool.core.date.format.FastDatePrinter$h] */
    /* JADX WARN: Type inference failed for: r9v25, types: [cn.hutool.core.date.format.FastDatePrinter$h] */
    /* JADX WARN: Type inference failed for: r9v43, types: [cn.hutool.core.date.format.FastDatePrinter$h] */
    /* JADX WARN: Type inference failed for: r9v47, types: [cn.hutool.core.date.format.FastDatePrinter$c] */
    /* JADX WARN: Type inference failed for: r9v50, types: [cn.hutool.core.date.format.FastDatePrinter$k] */
    /* JADX WARN: Type inference failed for: r9v51, types: [cn.hutool.core.date.format.FastDatePrinter$c] */
    /* JADX WARN: Type inference failed for: r9v52, types: [cn.hutool.core.date.format.FastDatePrinter$k] */
    protected List<f> parsePattern() {
        d selectNumberRule;
        d dVar;
        ?? bVar;
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(this.locale);
        ArrayList arrayList = new ArrayList();
        String[] eras = dateFormatSymbols.getEras();
        String[] months = dateFormatSymbols.getMonths();
        String[] shortMonths = dateFormatSymbols.getShortMonths();
        String[] weekdays = dateFormatSymbols.getWeekdays();
        String[] shortWeekdays = dateFormatSymbols.getShortWeekdays();
        String[] amPmStrings = dateFormatSymbols.getAmPmStrings();
        int length = this.pattern.length();
        int[] iArr = new int[1];
        int i8 = 0;
        int i9 = 0;
        while (i9 < length) {
            iArr[i8] = i9;
            String parseToken = parseToken(this.pattern, iArr);
            int i10 = iArr[i8];
            int length2 = parseToken.length();
            if (length2 == 0) {
                return arrayList;
            }
            char charAt = parseToken.charAt(i8);
            if (charAt != 'y') {
                if (charAt != 'z') {
                    switch (charAt) {
                        case '\'':
                            String substring = parseToken.substring(1);
                            if (substring.length() != 1) {
                                dVar = new g(substring);
                                break;
                            } else {
                                dVar = new a(substring.charAt(0));
                                break;
                            }
                        case 'K':
                            dVar = selectNumberRule(10, length2);
                            break;
                        case 'M':
                            if (length2 < 4) {
                                if (length2 != 3) {
                                    if (length2 != 2) {
                                        dVar = q.INSTANCE;
                                        break;
                                    } else {
                                        dVar = n.INSTANCE;
                                        break;
                                    }
                                } else {
                                    dVar = new h(2, shortMonths);
                                    break;
                                }
                            } else {
                                dVar = new h(2, months);
                                break;
                            }
                        case 'S':
                            dVar = selectNumberRule(14, length2);
                            break;
                        case 'a':
                            dVar = new h(9, amPmStrings);
                            break;
                        case 'd':
                            dVar = selectNumberRule(5, length2);
                            break;
                        case 'h':
                            dVar = new l(selectNumberRule(10, length2));
                            break;
                        case 'k':
                            dVar = new m(selectNumberRule(11, length2));
                            break;
                        case 'm':
                            dVar = selectNumberRule(12, length2);
                            break;
                        case 's':
                            dVar = selectNumberRule(13, length2);
                            break;
                        case 'u':
                            bVar = new b(selectNumberRule(7, length2));
                            dVar = bVar;
                            break;
                        case 'w':
                            dVar = selectNumberRule(3, length2);
                            break;
                        default:
                            switch (charAt) {
                                case 'D':
                                    dVar = selectNumberRule(6, length2);
                                    break;
                                case 'E':
                                    bVar = new h(7, length2 < 4 ? shortWeekdays : weekdays);
                                    dVar = bVar;
                                    break;
                                case 'F':
                                    dVar = selectNumberRule(8, length2);
                                    break;
                                case 'G':
                                    i8 = 0;
                                    selectNumberRule = new h(0, eras);
                                    arrayList.add(selectNumberRule);
                                    i9 = i10 + 1;
                                case 'H':
                                    dVar = selectNumberRule(11, length2);
                                    break;
                                default:
                                    switch (charAt) {
                                        case 'W':
                                            dVar = selectNumberRule(4, length2);
                                            break;
                                        case 'X':
                                            dVar = c.getRule(length2);
                                            break;
                                        case 'Y':
                                            break;
                                        case 'Z':
                                            if (length2 != 1) {
                                                if (length2 != 2) {
                                                    dVar = k.INSTANCE_COLON;
                                                    break;
                                                } else {
                                                    dVar = c.ISO8601_HOURS_COLON_MINUTES;
                                                    break;
                                                }
                                            } else {
                                                dVar = k.INSTANCE_NO_COLON;
                                                break;
                                            }
                                        default:
                                            throw new IllegalArgumentException("Illegal pattern component: " + parseToken);
                                    }
                            }
                            break;
                    }
                } else {
                    dVar = length2 >= 4 ? new j(this.timeZone, this.locale, 1) : new j(this.timeZone, this.locale, 0);
                }
                i8 = 0;
                selectNumberRule = dVar;
                arrayList.add(selectNumberRule);
                i9 = i10 + 1;
            }
            i8 = 0;
            selectNumberRule = length2 == 2 ? p.INSTANCE : selectNumberRule(1, Math.max(length2, 4));
            if (charAt == 'Y') {
                selectNumberRule = new s(selectNumberRule);
                continue;
            }
            arrayList.add(selectNumberRule);
            i9 = i10 + 1;
        }
        return arrayList;
    }

    protected String parseToken(String str, int[] iArr) {
        StringBuilder sb = new StringBuilder();
        int i8 = iArr[0];
        int length = str.length();
        char charAt = str.charAt(i8);
        if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
            sb.append(charAt);
            while (true) {
                int i9 = i8 + 1;
                if (i9 >= length || str.charAt(i9) != charAt) {
                    break;
                }
                sb.append(charAt);
                i8 = i9;
            }
        } else {
            sb.append('\'');
            boolean z7 = false;
            while (i8 < length) {
                char charAt2 = str.charAt(i8);
                if (charAt2 != '\'') {
                    if (!z7 && ((charAt2 >= 'A' && charAt2 <= 'Z') || (charAt2 >= 'a' && charAt2 <= 'z'))) {
                        i8--;
                        break;
                    }
                    sb.append(charAt2);
                } else {
                    int i10 = i8 + 1;
                    if (i10 >= length || str.charAt(i10) != '\'') {
                        z7 = !z7;
                    } else {
                        sb.append(charAt2);
                        i8 = i10;
                    }
                }
                i8++;
            }
        }
        iArr[0] = i8;
        return sb.toString();
    }

    protected d selectNumberRule(int i8, int i9) {
        return i9 != 1 ? i9 != 2 ? new e(i8, i9) : new o(i8) : new r(i8);
    }

    private static class b implements d {
        private final d mRule;

        b(d dVar) {
            this.mRule = dVar;
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.d, cn.hutool.core.date.format.FastDatePrinter.f
        public void appendTo(Appendable appendable, Calendar calendar) {
            int i8 = calendar.get(7);
            this.mRule.appendTo(appendable, i8 != 1 ? i8 - 1 : 7);
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.d, cn.hutool.core.date.format.FastDatePrinter.f
        public int estimateLength() {
            return this.mRule.estimateLength();
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.d
        public void appendTo(Appendable appendable, int i8) {
            this.mRule.appendTo(appendable, i8);
        }
    }

    private static class l implements d {
        private final d mRule;

        l(d dVar) {
            this.mRule = dVar;
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.d, cn.hutool.core.date.format.FastDatePrinter.f
        public void appendTo(Appendable appendable, Calendar calendar) {
            int i8 = calendar.get(10);
            if (i8 == 0) {
                i8 = calendar.getLeastMaximum(10) + 1;
            }
            this.mRule.appendTo(appendable, i8);
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.d, cn.hutool.core.date.format.FastDatePrinter.f
        public int estimateLength() {
            return this.mRule.estimateLength();
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.d
        public void appendTo(Appendable appendable, int i8) {
            this.mRule.appendTo(appendable, i8);
        }
    }

    private static class m implements d {
        private final d mRule;

        m(d dVar) {
            this.mRule = dVar;
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.d, cn.hutool.core.date.format.FastDatePrinter.f
        public void appendTo(Appendable appendable, Calendar calendar) {
            int i8 = calendar.get(11);
            if (i8 == 0) {
                i8 = calendar.getMaximum(11) + 1;
            }
            this.mRule.appendTo(appendable, i8);
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.d, cn.hutool.core.date.format.FastDatePrinter.f
        public int estimateLength() {
            return this.mRule.estimateLength();
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.d
        public void appendTo(Appendable appendable, int i8) {
            this.mRule.appendTo(appendable, i8);
        }
    }

    @Override // cn.hutool.core.date.format.d
    public String format(long j8) {
        Calendar calendar = Calendar.getInstance(this.timeZone, this.locale);
        calendar.setTimeInMillis(j8);
        return applyRulesToString(calendar);
    }

    @Override // cn.hutool.core.date.format.d
    public String format(Date date) {
        Calendar calendar = Calendar.getInstance(this.timeZone, this.locale);
        calendar.setTime(date);
        return applyRulesToString(calendar);
    }

    @Override // cn.hutool.core.date.format.d
    public String format(Calendar calendar) {
        return ((StringBuilder) format(calendar, (Calendar) new StringBuilder(this.mMaxLengthEstimate))).toString();
    }

    @Override // cn.hutool.core.date.format.d
    public <B extends Appendable> B format(long j8, B b8) {
        Calendar calendar = Calendar.getInstance(this.timeZone, this.locale);
        calendar.setTimeInMillis(j8);
        return (B) applyRules(calendar, b8);
    }

    @Override // cn.hutool.core.date.format.d
    public <B extends Appendable> B format(Date date, B b8) {
        Calendar calendar = Calendar.getInstance(this.timeZone, this.locale);
        calendar.setTime(date);
        return (B) applyRules(calendar, b8);
    }

    @Override // cn.hutool.core.date.format.d
    public <B extends Appendable> B format(Calendar calendar, B b8) {
        if (!calendar.getTimeZone().equals(this.timeZone)) {
            calendar = (Calendar) calendar.clone();
            calendar.setTimeZone(this.timeZone);
        }
        return (B) applyRules(calendar, b8);
    }
}
