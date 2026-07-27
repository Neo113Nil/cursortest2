package kotlin.time;

import U2.c;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.A;
import kotlin.text.C0754a;
import kotlin.text.u;
import kotlin.text.y;
import kotlin.time.a;

/* loaded from: classes.dex */
public abstract class b {
    /* JADX WARN: Removed duplicated region for block: B:115:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long a(String str) {
        boolean z4;
        U2.b unit;
        long c4;
        char charAt;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        a.f7548e.getClass();
        char charAt2 = str.charAt(0);
        int i2 = (charAt2 == '+' || charAt2 == '-') ? 1 : 0;
        if (i2 > 0) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            if (str.length() > 0 && C0754a.a(str.charAt(0), '-', false)) {
                z4 = true;
                if (length > i2) {
                    throw new IllegalArgumentException("No components");
                }
                if (str.charAt(i2) != 'P') {
                    throw new IllegalArgumentException();
                }
                int i4 = i2 + 1;
                if (i4 == length) {
                    throw new IllegalArgumentException();
                }
                U2.b bVar = null;
                long j4 = 0;
                boolean z5 = false;
                while (i4 < length) {
                    if (str.charAt(i4) != 'T') {
                        int i5 = i4;
                        while (i5 < str.length() && (('0' <= (charAt = str.charAt(i5)) && charAt < ':') || y.o("+-.", charAt))) {
                            i5++;
                        }
                        String substring = str.substring(i4, i5);
                        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                        if (substring.length() == 0) {
                            throw new IllegalArgumentException();
                        }
                        int length2 = substring.length() + i4;
                        if (length2 < 0 || length2 >= str.length()) {
                            throw new IllegalArgumentException("Missing unit for value ".concat(substring));
                        }
                        char charAt3 = str.charAt(length2);
                        int i6 = length2 + 1;
                        if (z5) {
                            if (charAt3 == 'H') {
                                unit = U2.b.f4134l;
                            } else if (charAt3 == 'M') {
                                unit = U2.b.f4133k;
                            } else {
                                if (charAt3 != 'S') {
                                    throw new IllegalArgumentException("Invalid duration ISO time unit: " + charAt3);
                                }
                                unit = U2.b.f4132j;
                            }
                        } else {
                            if (charAt3 != 'D') {
                                throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + charAt3);
                            }
                            unit = U2.b.f4135m;
                        }
                        if (bVar != null && bVar.compareTo(unit) <= 0) {
                            throw new IllegalArgumentException("Unexpected order of duration components");
                        }
                        int u4 = y.u(substring, '.', 0, false, 6);
                        if (unit != U2.b.f4132j || u4 <= 0) {
                            j4 = a.h(j4, e(d(substring), unit));
                        } else {
                            String substring2 = substring.substring(0, u4);
                            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                            long h4 = a.h(j4, e(d(substring2), unit));
                            String substring3 = substring.substring(u4);
                            Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
                            double parseDouble = Double.parseDouble(substring3);
                            Intrinsics.checkNotNullParameter(unit, "unit");
                            double a4 = c.a(parseDouble, unit, U2.b.f4130e);
                            if (Double.isNaN(a4)) {
                                throw new IllegalArgumentException("Duration value cannot be NaN.");
                            }
                            long b4 = O2.c.b(a4);
                            if (-4611686018426999999L > b4 || b4 >= 4611686018427000000L) {
                                c4 = c(O2.c.b(c.a(parseDouble, unit, U2.b.f4131i)));
                            } else {
                                c4 = b4 << 1;
                                a.C0004a c0004a = a.f7548e;
                                int i7 = U2.a.f4129a;
                            }
                            j4 = a.h(h4, c4);
                        }
                        bVar = unit;
                        i4 = i6;
                    } else {
                        if (z5 || (i4 = i4 + 1) == length) {
                            throw new IllegalArgumentException();
                        }
                        z5 = true;
                    }
                }
                if (!z4) {
                    return j4;
                }
                long j5 = ((-(j4 >> 1)) << 1) + (((int) j4) & 1);
                int i8 = U2.a.f4129a;
                return j5;
            }
        }
        z4 = false;
        if (length > i2) {
        }
    }

    public static final long b(long j4) {
        long j5 = (j4 << 1) + 1;
        a.C0004a c0004a = a.f7548e;
        int i2 = U2.a.f4129a;
        return j5;
    }

    public static final long c(long j4) {
        if (-4611686018426L > j4 || j4 >= 4611686018427L) {
            return b(kotlin.ranges.b.f(j4, -4611686018427387903L, 4611686018427387903L));
        }
        long j5 = (j4 * 1000000) << 1;
        a.C0004a c0004a = a.f7548e;
        int i2 = U2.a.f4129a;
        return j5;
    }

    public static final long d(String str) {
        int length = str.length();
        int i2 = (length <= 0 || !y.o("+-", str.charAt(0))) ? 0 : 1;
        if (length - i2 > 16) {
            Iterable intRange = new IntRange(i2, y.r(str), 1);
            if (!(intRange instanceof Collection) || !((Collection) intRange).isEmpty()) {
                R2.b it = intRange.iterator();
                while (it.f3947i) {
                    char charAt = str.charAt(it.b());
                    if ('0' <= charAt && charAt < ':') {
                    }
                }
            }
            return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        if (u.n(str, "+")) {
            str = A.N(1, str);
        }
        return Long.parseLong(str);
    }

    public static final long e(long j4, U2.b sourceUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "unit");
        U2.b targetUnit = U2.b.f4130e;
        Intrinsics.checkNotNullParameter(targetUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(sourceUnit, "targetUnit");
        long convert = sourceUnit.f4137d.convert(4611686018426999999L, targetUnit.f4137d);
        long j5 = -convert;
        TimeUnit timeUnit = sourceUnit.f4137d;
        if (j5 > j4 || j4 > convert) {
            U2.b targetUnit2 = U2.b.f4131i;
            Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
            Intrinsics.checkNotNullParameter(targetUnit2, "targetUnit");
            return b(kotlin.ranges.b.f(targetUnit2.f4137d.convert(j4, timeUnit), -4611686018427387903L, 4611686018427387903L));
        }
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        long convert2 = targetUnit.f4137d.convert(j4, timeUnit) << 1;
        a.C0004a c0004a = a.f7548e;
        int i2 = U2.a.f4129a;
        return convert2;
    }
}
