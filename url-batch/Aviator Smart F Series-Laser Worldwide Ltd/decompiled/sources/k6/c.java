package k6;

import f6.l;
import j6.m;
import j6.p;
import j6.v;
import java.util.Collection;
import java.util.Iterator;
import k6.a;
import kotlin.collections.f0;
import kotlin.jvm.internal.s;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import kotlin.text.t;
import kotlin.time.DurationUnit;

/* loaded from: classes3.dex */
public abstract class c {
    public static final long MAX_MILLIS = 4611686018427387903L;
    public static final long MAX_NANOS = 4611686018426999999L;
    private static final long MAX_NANOS_IN_MILLIS = 4611686018426L;
    public static final int NANOS_IN_MILLIS = 1000000;

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOf(long j8, int i8) {
        return a.m219constructorimpl((j8 << 1) + i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOfMillis(long j8) {
        return a.m219constructorimpl((j8 << 1) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOfMillisNormalized(long j8) {
        long coerceIn;
        if (new p(-4611686018426L, MAX_NANOS_IN_MILLIS).contains(j8)) {
            return durationOfNanos(millisToNanos(j8));
        }
        coerceIn = v.coerceIn(j8, -4611686018427387903L, MAX_MILLIS);
        return durationOfMillis(coerceIn);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOfNanos(long j8) {
        return a.m219constructorimpl(j8 << 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOfNanosNormalized(long j8) {
        return new p(-4611686018426999999L, MAX_NANOS).contains(j8) ? durationOfNanos(j8) : durationOfMillis(nanosToMillis(j8));
    }

    public static /* synthetic */ void getDays$annotations(double d8) {
    }

    public static /* synthetic */ void getHours$annotations(double d8) {
    }

    public static /* synthetic */ void getMicroseconds$annotations(double d8) {
    }

    public static /* synthetic */ void getMilliseconds$annotations(double d8) {
    }

    public static /* synthetic */ void getMinutes$annotations(double d8) {
    }

    public static /* synthetic */ void getNanoseconds$annotations(double d8) {
    }

    public static /* synthetic */ void getSeconds$annotations(double d8) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long millisToNanos(long j8) {
        return j8 * 1000000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long nanosToMillis(long j8) {
        return j8 / 1000000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long parseDuration(String str, boolean z7) {
        boolean z8;
        int i8;
        long j8;
        char last;
        int i9;
        boolean contains$default;
        boolean startsWith$default;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        a.C0358a c0358a = a.Companion;
        long m322getZEROUwyO8pc = c0358a.m322getZEROUwyO8pc();
        char charAt = str.charAt(0);
        int i10 = (charAt == '+' || charAt == '-') ? 1 : 0;
        boolean z9 = i10 > 0;
        if (z9) {
            startsWith$default = StringsKt__StringsKt.startsWith$default((CharSequence) str, '-', false, 2, (Object) null);
            if (startsWith$default) {
                z8 = true;
                if (length > i10) {
                    throw new IllegalArgumentException("No components");
                }
                char c8 = '0';
                if (str.charAt(i10) == 'P') {
                    int i11 = i10 + 1;
                    if (i11 == length) {
                        throw new IllegalArgumentException();
                    }
                    boolean z10 = false;
                    DurationUnit durationUnit = null;
                    while (i11 < length) {
                        if (str.charAt(i11) != 'T') {
                            int i12 = i11;
                            while (true) {
                                if (i12 >= str.length()) {
                                    i9 = length;
                                    break;
                                }
                                char charAt2 = str.charAt(i12);
                                if (!new j6.c(c8, '9').contains(charAt2)) {
                                    i9 = length;
                                    contains$default = StringsKt__StringsKt.contains$default((CharSequence) "+-.", charAt2, false, 2, (Object) null);
                                    if (!contains$default) {
                                        break;
                                    }
                                } else {
                                    i9 = length;
                                }
                                i12++;
                                length = i9;
                                c8 = '0';
                            }
                            s.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
                            String substring = str.substring(i11, i12);
                            s.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            if (substring.length() == 0) {
                                throw new IllegalArgumentException();
                            }
                            int length2 = i11 + substring.length();
                            if (length2 < 0 || length2 > StringsKt__StringsKt.getLastIndex(str)) {
                                throw new IllegalArgumentException("Missing unit for value " + substring);
                            }
                            char charAt3 = str.charAt(length2);
                            i11 = length2 + 1;
                            DurationUnit durationUnitByIsoChar = e.durationUnitByIsoChar(charAt3, z10);
                            if (durationUnit != null && durationUnit.compareTo(durationUnitByIsoChar) <= 0) {
                                throw new IllegalArgumentException("Unexpected order of duration components");
                            }
                            int indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) substring, '.', 0, false, 6, (Object) null);
                            if (durationUnitByIsoChar != DurationUnit.SECONDS || indexOf$default <= 0) {
                                m322getZEROUwyO8pc = a.m255plusLRDsOJo(m322getZEROUwyO8pc, toDuration(parseOverLongIsoComponent(substring), durationUnitByIsoChar));
                            } else {
                                s.checkNotNull(substring, "null cannot be cast to non-null type java.lang.String");
                                String substring2 = substring.substring(0, indexOf$default);
                                s.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                long m255plusLRDsOJo = a.m255plusLRDsOJo(m322getZEROUwyO8pc, toDuration(parseOverLongIsoComponent(substring2), durationUnitByIsoChar));
                                s.checkNotNull(substring, "null cannot be cast to non-null type java.lang.String");
                                String substring3 = substring.substring(indexOf$default);
                                s.checkNotNullExpressionValue(substring3, "this as java.lang.String).substring(startIndex)");
                                m322getZEROUwyO8pc = a.m255plusLRDsOJo(m255plusLRDsOJo, toDuration(Double.parseDouble(substring3), durationUnitByIsoChar));
                            }
                            durationUnit = durationUnitByIsoChar;
                            length = i9;
                            c8 = '0';
                        } else {
                            if (z10 || (i11 = i11 + 1) == length) {
                                throw new IllegalArgumentException();
                            }
                            z10 = true;
                        }
                    }
                } else {
                    if (z7) {
                        throw new IllegalArgumentException();
                    }
                    String str2 = "this as java.lang.String).substring(startIndex)";
                    if (t.regionMatches(str, i10, "Infinity", 0, Math.max(length - i10, 8), true)) {
                        m322getZEROUwyO8pc = c0358a.m320getINFINITEUwyO8pc();
                    } else {
                        boolean z11 = !z9;
                        if (z9 && str.charAt(i10) == '(') {
                            last = StringsKt___StringsKt.last(str);
                            if (last == ')') {
                                i10++;
                                int i13 = length - 1;
                                if (i10 == i13) {
                                    throw new IllegalArgumentException("No components");
                                }
                                i8 = i13;
                                j8 = m322getZEROUwyO8pc;
                                z11 = true;
                                DurationUnit durationUnit2 = null;
                                boolean z12 = false;
                                while (i10 < i8) {
                                    if (z12 && z11) {
                                        while (i10 < str.length() && str.charAt(i10) == ' ') {
                                            i10++;
                                        }
                                    }
                                    int i14 = i10;
                                    while (i14 < str.length()) {
                                        char charAt4 = str.charAt(i14);
                                        if (!new j6.c('0', '9').contains(charAt4) && charAt4 != '.') {
                                            break;
                                        }
                                        i14++;
                                    }
                                    s.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
                                    String substring4 = str.substring(i10, i14);
                                    s.checkNotNullExpressionValue(substring4, "this as java.lang.String…ing(startIndex, endIndex)");
                                    if (substring4.length() == 0) {
                                        throw new IllegalArgumentException();
                                    }
                                    int length3 = i10 + substring4.length();
                                    int i15 = length3;
                                    while (i15 < str.length()) {
                                        if (!new j6.c('a', 'z').contains(str.charAt(i15))) {
                                            break;
                                        }
                                        i15++;
                                    }
                                    s.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
                                    String substring5 = str.substring(length3, i15);
                                    s.checkNotNullExpressionValue(substring5, "this as java.lang.String…ing(startIndex, endIndex)");
                                    i10 = length3 + substring5.length();
                                    DurationUnit durationUnitByShortName = e.durationUnitByShortName(substring5);
                                    if (durationUnit2 != null && durationUnit2.compareTo(durationUnitByShortName) <= 0) {
                                        throw new IllegalArgumentException("Unexpected order of duration components");
                                    }
                                    int indexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) substring4, '.', 0, false, 6, (Object) null);
                                    if (indexOf$default2 > 0) {
                                        s.checkNotNull(substring4, "null cannot be cast to non-null type java.lang.String");
                                        String substring6 = substring4.substring(0, indexOf$default2);
                                        s.checkNotNullExpressionValue(substring6, "this as java.lang.String…ing(startIndex, endIndex)");
                                        long m255plusLRDsOJo2 = a.m255plusLRDsOJo(j8, toDuration(Long.parseLong(substring6), durationUnitByShortName));
                                        s.checkNotNull(substring4, "null cannot be cast to non-null type java.lang.String");
                                        String substring7 = substring4.substring(indexOf$default2);
                                        String str3 = str2;
                                        s.checkNotNullExpressionValue(substring7, str3);
                                        j8 = a.m255plusLRDsOJo(m255plusLRDsOJo2, toDuration(Double.parseDouble(substring7), durationUnitByShortName));
                                        if (i10 < i8) {
                                            throw new IllegalArgumentException("Fractional component must be last");
                                        }
                                        durationUnit2 = durationUnitByShortName;
                                        str2 = str3;
                                    } else {
                                        j8 = a.m255plusLRDsOJo(j8, toDuration(Long.parseLong(substring4), durationUnitByShortName));
                                        durationUnit2 = durationUnitByShortName;
                                    }
                                    z12 = true;
                                }
                                m322getZEROUwyO8pc = j8;
                            }
                        }
                        i8 = length;
                        j8 = m322getZEROUwyO8pc;
                        DurationUnit durationUnit22 = null;
                        boolean z122 = false;
                        while (i10 < i8) {
                        }
                        m322getZEROUwyO8pc = j8;
                    }
                }
                return z8 ? a.m272unaryMinusUwyO8pc(m322getZEROUwyO8pc) : m322getZEROUwyO8pc;
            }
        }
        z8 = false;
        if (length > i10) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final long parseOverLongIsoComponent(String str) {
        int i8;
        boolean contains$default;
        int length = str.length();
        if (length > 0) {
            contains$default = StringsKt__StringsKt.contains$default((CharSequence) "+-", str.charAt(0), false, 2, (Object) null);
            if (contains$default) {
                i8 = 1;
                if (length - i8 > 16) {
                    Iterable mVar = new m(i8, StringsKt__StringsKt.getLastIndex(str));
                    if (!(mVar instanceof Collection) || !((Collection) mVar).isEmpty()) {
                        Iterator it = mVar.iterator();
                        while (it.hasNext()) {
                            if (!new j6.c('0', '9').contains(str.charAt(((f0) it).nextInt()))) {
                            }
                        }
                    }
                    return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                if (t.startsWith$default(str, "+", false, 2, null)) {
                    str = StringsKt___StringsKt.drop(str, 1);
                }
                return Long.parseLong(str);
            }
        }
        i8 = 0;
        if (length - i8 > 16) {
        }
        if (t.startsWith$default(str, "+", false, 2, null)) {
        }
        return Long.parseLong(str);
    }

    private static final int skipWhile(String str, int i8, l lVar) {
        while (i8 < str.length() && ((Boolean) lVar.invoke(Character.valueOf(str.charAt(i8)))).booleanValue()) {
            i8++;
        }
        return i8;
    }

    private static final String substringWhile(String str, int i8, l lVar) {
        int i9 = i8;
        while (i9 < str.length() && ((Boolean) lVar.invoke(Character.valueOf(str.charAt(i9)))).booleanValue()) {
            i9++;
        }
        s.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(i8, i9);
        s.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: times-kIfJnKk, reason: not valid java name */
    private static final long m345timeskIfJnKk(double d8, long j8) {
        return a.m256timesUwyO8pc(j8, d8);
    }

    /* renamed from: times-mvk6XK0, reason: not valid java name */
    private static final long m346timesmvk6XK0(int i8, long j8) {
        return a.m257timesUwyO8pc(j8, i8);
    }

    public static final long toDuration(int i8, DurationUnit unit) {
        s.checkNotNullParameter(unit, "unit");
        return unit.compareTo(DurationUnit.SECONDS) <= 0 ? durationOfNanos(d.convertDurationUnitOverflow(i8, unit, DurationUnit.NANOSECONDS)) : toDuration(i8, unit);
    }

    public static /* synthetic */ void getDays$annotations(int i8) {
    }

    public static /* synthetic */ void getHours$annotations(int i8) {
    }

    public static /* synthetic */ void getMicroseconds$annotations(int i8) {
    }

    public static /* synthetic */ void getMilliseconds$annotations(int i8) {
    }

    public static /* synthetic */ void getMinutes$annotations(int i8) {
    }

    public static /* synthetic */ void getNanoseconds$annotations(int i8) {
    }

    public static /* synthetic */ void getSeconds$annotations(int i8) {
    }

    public static /* synthetic */ void getDays$annotations(long j8) {
    }

    public static /* synthetic */ void getHours$annotations(long j8) {
    }

    public static /* synthetic */ void getMicroseconds$annotations(long j8) {
    }

    public static /* synthetic */ void getMilliseconds$annotations(long j8) {
    }

    public static /* synthetic */ void getMinutes$annotations(long j8) {
    }

    public static /* synthetic */ void getNanoseconds$annotations(long j8) {
    }

    public static /* synthetic */ void getSeconds$annotations(long j8) {
    }

    public static final long toDuration(long j8, DurationUnit unit) {
        long coerceIn;
        s.checkNotNullParameter(unit, "unit");
        DurationUnit durationUnit = DurationUnit.NANOSECONDS;
        long convertDurationUnitOverflow = d.convertDurationUnitOverflow(MAX_NANOS, durationUnit, unit);
        if (!new p(-convertDurationUnitOverflow, convertDurationUnitOverflow).contains(j8)) {
            coerceIn = v.coerceIn(d.convertDurationUnit(j8, unit, DurationUnit.MILLISECONDS), -4611686018427387903L, MAX_MILLIS);
            return durationOfMillis(coerceIn);
        }
        return durationOfNanos(d.convertDurationUnitOverflow(j8, unit, durationUnit));
    }

    public static final long toDuration(double d8, DurationUnit unit) {
        long roundToLong;
        long roundToLong2;
        s.checkNotNullParameter(unit, "unit");
        double convertDurationUnit = d.convertDurationUnit(d8, unit, DurationUnit.NANOSECONDS);
        if (!Double.isNaN(convertDurationUnit)) {
            roundToLong = h6.d.roundToLong(convertDurationUnit);
            if (!new p(-4611686018426999999L, MAX_NANOS).contains(roundToLong)) {
                roundToLong2 = h6.d.roundToLong(d.convertDurationUnit(d8, unit, DurationUnit.MILLISECONDS));
                return durationOfMillisNormalized(roundToLong2);
            }
            return durationOfNanos(roundToLong);
        }
        throw new IllegalArgumentException("Duration value cannot be NaN.".toString());
    }
}
