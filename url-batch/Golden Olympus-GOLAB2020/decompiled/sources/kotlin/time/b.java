package kotlin.time;

import io.jsonwebtoken.JwtParser;
import j2.AbstractC3185a;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.E;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;
import kotlin.ranges.g;
import kotlin.text.StringsKt;
import kotlin.time.a;
import n2.EnumC3267b;

/* loaded from: classes3.dex */
public abstract class b {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long i(long j4, int i4) {
        return a.h((j4 << 1) + i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long j(long j4) {
        return a.h((j4 << 1) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long k(long j4) {
        return new f(-4611686018426L, 4611686018426L).f(j4) ? l(n(j4)) : j(g.l(j4, -4611686018427387903L, 4611686018427387903L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long l(long j4) {
        return a.h(j4 << 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long m(long j4) {
        return new f(-4611686018426999999L, 4611686018426999999L).f(j4) ? l(j4) : j(o(j4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long n(long j4) {
        return j4 * 1000000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long o(long j4) {
        return j4 / 1000000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long p(String str, boolean z4) {
        boolean z5;
        int i4;
        String str2;
        int i5;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        a.C0233a c0233a = a.f41281c;
        long b4 = c0233a.b();
        char charAt = str.charAt(0);
        int i6 = (charAt == '+' || charAt == '-') ? 1 : 0;
        boolean z6 = i6 > 0;
        boolean z7 = z6 && StringsKt.I0(str, '-', false, 2, null);
        if (length <= i6) {
            throw new IllegalArgumentException("No components");
        }
        char c4 = '9';
        char c5 = '0';
        String str3 = "null cannot be cast to non-null type java.lang.String";
        if (str.charAt(i6) == 'P') {
            int i7 = i6 + 1;
            if (i7 == length) {
                throw new IllegalArgumentException();
            }
            boolean z8 = false;
            EnumC3267b enumC3267b = null;
            while (i7 < length) {
                if (str.charAt(i7) != 'T') {
                    int i8 = i7;
                    while (true) {
                        if (i8 >= str.length()) {
                            i5 = length;
                            break;
                        }
                        char charAt2 = str.charAt(i8);
                        if (!new kotlin.ranges.b(c5, c4).f(charAt2)) {
                            i5 = length;
                            if (!StringsKt.O("+-.", charAt2, false, 2, null)) {
                                break;
                            }
                        } else {
                            i5 = length;
                        }
                        i8++;
                        length = i5;
                        c5 = '0';
                        c4 = '9';
                    }
                    Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
                    String substring = str.substring(i7, i8);
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    if (substring.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length2 = i7 + substring.length();
                    if (length2 < 0 || length2 > StringsKt.W(str)) {
                        throw new IllegalArgumentException("Missing unit for value " + substring);
                    }
                    char charAt3 = str.charAt(length2);
                    i7 = length2 + 1;
                    EnumC3267b d4 = d.d(charAt3, z8);
                    if (enumC3267b != null && enumC3267b.compareTo(d4) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int b02 = StringsKt.b0(substring, JwtParser.SEPARATOR_CHAR, 0, false, 6, null);
                    if (d4 != EnumC3267b.f41382f || b02 <= 0) {
                        b4 = a.B(b4, t(q(substring), d4));
                    } else {
                        Intrinsics.checkNotNull(substring, "null cannot be cast to non-null type java.lang.String");
                        String substring2 = substring.substring(0, b02);
                        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                        long B4 = a.B(b4, t(q(substring2), d4));
                        Intrinsics.checkNotNull(substring, "null cannot be cast to non-null type java.lang.String");
                        String substring3 = substring.substring(b02);
                        Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
                        b4 = a.B(B4, r(Double.parseDouble(substring3), d4));
                    }
                    enumC3267b = d4;
                    length = i5;
                    c5 = '0';
                    c4 = '9';
                } else {
                    if (z8 || (i7 = i7 + 1) == length) {
                        throw new IllegalArgumentException();
                    }
                    z8 = true;
                }
            }
        } else {
            if (z4) {
                throw new IllegalArgumentException();
            }
            int max = Math.max(length - i6, 8);
            char c6 = '0';
            if (StringsKt.A(str, i6, "Infinity", 0, max, true)) {
                b4 = c0233a.a();
            } else {
                boolean z9 = !z6;
                if (z6 && str.charAt(i6) == '(' && StringsKt.d1(str) == ')') {
                    i6++;
                    int i9 = length - 1;
                    if (i6 == i9) {
                        throw new IllegalArgumentException("No components");
                    }
                    i4 = i9;
                    z5 = true;
                } else {
                    z5 = z9;
                    i4 = length;
                }
                boolean z10 = false;
                EnumC3267b enumC3267b2 = null;
                while (i6 < i4) {
                    if (z10 && z5) {
                        while (i6 < str.length() && str.charAt(i6) == ' ') {
                            i6++;
                        }
                    }
                    int i10 = i6;
                    while (i10 < str.length()) {
                        char charAt4 = str.charAt(i10);
                        if (!new kotlin.ranges.b(c6, '9').f(charAt4) && charAt4 != '.') {
                            break;
                        }
                        i10++;
                    }
                    Intrinsics.checkNotNull(str, str3);
                    String substring4 = str.substring(i6, i10);
                    Intrinsics.checkNotNullExpressionValue(substring4, "substring(...)");
                    if (substring4.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length3 = i6 + substring4.length();
                    int i11 = length3;
                    while (true) {
                        if (i11 >= str.length()) {
                            str2 = substring4;
                            break;
                        }
                        str2 = substring4;
                        if (!new kotlin.ranges.b('a', 'z').f(str.charAt(i11))) {
                            break;
                        }
                        i11++;
                        substring4 = str2;
                    }
                    Intrinsics.checkNotNull(str, str3);
                    String substring5 = str.substring(length3, i11);
                    Intrinsics.checkNotNullExpressionValue(substring5, "substring(...)");
                    i6 = length3 + substring5.length();
                    EnumC3267b e4 = d.e(substring5);
                    if (enumC3267b2 != null && enumC3267b2.compareTo(e4) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int b03 = StringsKt.b0(str2, JwtParser.SEPARATOR_CHAR, 0, false, 6, null);
                    String str4 = str2;
                    if (b03 > 0) {
                        Intrinsics.checkNotNull(str4, str3);
                        String substring6 = str4.substring(0, b03);
                        Intrinsics.checkNotNullExpressionValue(substring6, "substring(...)");
                        String str5 = str3;
                        long B5 = a.B(b4, t(Long.parseLong(substring6), e4));
                        Intrinsics.checkNotNull(str4, str5);
                        String substring7 = str4.substring(b03);
                        Intrinsics.checkNotNullExpressionValue(substring7, "substring(...)");
                        b4 = a.B(B5, r(Double.parseDouble(substring7), e4));
                        if (i6 < i4) {
                            throw new IllegalArgumentException("Fractional component must be last");
                        }
                        enumC3267b2 = e4;
                        str3 = str5;
                    } else {
                        b4 = a.B(b4, t(Long.parseLong(str4), e4));
                        enumC3267b2 = e4;
                    }
                    z10 = true;
                    c6 = '0';
                }
            }
        }
        return z7 ? a.G(b4) : b4;
    }

    private static final long q(String str) {
        int length = str.length();
        int i4 = (length <= 0 || !StringsKt.O("+-", str.charAt(0), false, 2, null)) ? 0 : 1;
        if (length - i4 > 16) {
            Iterable intRange = new IntRange(i4, StringsKt.W(str));
            if (!(intRange instanceof Collection) || !((Collection) intRange).isEmpty()) {
                Iterator it = intRange.iterator();
                while (it.hasNext()) {
                    if (!new kotlin.ranges.b('0', '9').f(str.charAt(((E) it).a()))) {
                    }
                }
            }
            return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        return StringsKt.K(str, "+", false, 2, null) ? Long.parseLong(StringsKt.a1(str, 1)) : Long.parseLong(str);
    }

    public static final long r(double d4, EnumC3267b unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        double a4 = c.a(d4, unit, EnumC3267b.f41379c);
        if (Double.isNaN(a4)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.");
        }
        long d5 = AbstractC3185a.d(a4);
        return new f(-4611686018426999999L, 4611686018426999999L).f(d5) ? l(d5) : k(AbstractC3185a.d(c.a(d4, unit, EnumC3267b.f41381e)));
    }

    public static final long s(int i4, EnumC3267b unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return unit.compareTo(EnumC3267b.f41382f) <= 0 ? l(c.c(i4, unit, EnumC3267b.f41379c)) : t(i4, unit);
    }

    public static final long t(long j4, EnumC3267b unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        EnumC3267b enumC3267b = EnumC3267b.f41379c;
        long c4 = c.c(4611686018426999999L, enumC3267b, unit);
        return new f(-c4, c4).f(j4) ? l(c.c(j4, unit, enumC3267b)) : j(g.l(c.b(j4, unit, EnumC3267b.f41381e), -4611686018427387903L, 4611686018427387903L));
    }
}
