package m6;

import j6.C0588e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import z1.AbstractC1053a;

/* renamed from: m6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0694b implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public static final C0693a f6584e = new C0693a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final long f6585i = AbstractC1053a.s(4611686018427387903L);

    /* renamed from: l, reason: collision with root package name */
    public static final long f6586l = AbstractC1053a.s(-4611686018427387903L);

    /* renamed from: m, reason: collision with root package name */
    public static final long f6587m = 9223372036854759646L;

    /* renamed from: d, reason: collision with root package name */
    public final long f6588d;

    public static final long a(long j, long j7) {
        long j8 = 1000000;
        long j9 = j7 / j8;
        long b7 = AbstractC1053a.b(j, j9);
        if (-4611686018426L > b7 || b7 >= 4611686018427L) {
            return AbstractC1053a.s(b7);
        }
        return AbstractC1053a.t((b7 * j8) + (j7 - (j9 * j8)));
    }

    public static final void b(StringBuilder sb, int i2, int i5, int i7, String str, boolean z7) {
        sb.append(i2);
        if (i5 != 0) {
            sb.append('.');
            String C7 = StringsKt.C(i7, String.valueOf(i5));
            int i8 = -1;
            int length = C7.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i9 = length - 1;
                    if (C7.charAt(length) != '0') {
                        i8 = length;
                        break;
                    } else if (i9 < 0) {
                        break;
                    } else {
                        length = i9;
                    }
                }
            }
            int i10 = i8 + 1;
            if (z7 || i10 >= 3) {
                sb.append((CharSequence) C7, 0, ((i8 + 3) / 3) * 3);
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            } else {
                sb.append((CharSequence) C7, 0, i10);
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            }
        }
        sb.append(str);
    }

    public static final int c(long j) {
        if (d(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % 1000) * 1000000 : (j >> 1) % 1000000000);
    }

    public static final boolean d(long j) {
        return j == f6585i || j == f6586l;
    }

    public static final long e(long j, long j7) {
        int i2 = ((int) j) & 1;
        if (i2 != (((int) j7) & 1)) {
            return i2 == 1 ? a(j >> 1, j7 >> 1) : a(j7 >> 1, j >> 1);
        }
        if (i2 == 0) {
            long j8 = (j >> 1) + (j7 >> 1);
            return (-4611686018426999999L > j8 || j8 >= 4611686018427000000L) ? AbstractC1053a.s(j8 / 1000000) : AbstractC1053a.t(j8);
        }
        long b7 = AbstractC1053a.b(j >> 1, j7 >> 1);
        if (b7 != 9223372036854759646L) {
            return (b7 == 4611686018427387903L || b7 == -4611686018427387903L) ? AbstractC1053a.s(b7) : (-4611686018426L > b7 || b7 >= 4611686018427L) ? AbstractC1053a.s(C0588e.a(b7)) : AbstractC1053a.t(b7 * 1000000);
        }
        throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
    }

    public static final long f(long j, d targetUnit) {
        Intrinsics.checkNotNullParameter(targetUnit, "unit");
        if (j == f6585i) {
            return Long.MAX_VALUE;
        }
        if (j == f6586l) {
            return Long.MIN_VALUE;
        }
        long j7 = j >> 1;
        d sourceUnit = (((int) j) & 1) == 0 ? d.f6590e : d.f6591i;
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        return targetUnit.f6597d.convert(j7, sourceUnit.f6597d);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = ((C0694b) obj).f6588d;
        long j7 = this.f6588d;
        long j8 = j7 ^ j;
        if (j8 < 0 || (((int) j8) & 1) == 0) {
            return Intrinsics.e(j7, j);
        }
        int i2 = (((int) j7) & 1) - (((int) j) & 1);
        return j7 < 0 ? -i2 : i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0694b) {
            return this.f6588d == ((C0694b) obj).f6588d;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6588d);
    }

    public final String toString() {
        long j;
        int f7;
        long j7 = this.f6588d;
        if (j7 == 0) {
            return "0s";
        }
        if (j7 == f6585i) {
            return "Infinity";
        }
        if (j7 == f6586l) {
            return "-Infinity";
        }
        int i2 = 0;
        boolean z7 = j7 < 0;
        StringBuilder sb = new StringBuilder();
        if (z7) {
            sb.append('-');
        }
        if (j7 < 0) {
            long j8 = ((-(j7 >> 1)) << 1) + (((int) j7) & 1);
            f6584e.getClass();
            int i5 = c.f6589a;
            j7 = j8;
        }
        long f8 = f(j7, d.f6595o);
        int f9 = d(j7) ? 0 : (int) (f(j7, d.f6594n) % 24);
        if (d(j7)) {
            j = 0;
            f7 = 0;
        } else {
            j = 0;
            f7 = (int) (f(j7, d.f6593m) % 60);
        }
        int f10 = d(j7) ? 0 : (int) (f(j7, d.f6592l) % 60);
        int c7 = c(j7);
        boolean z8 = f8 != j;
        boolean z9 = f9 != 0;
        boolean z10 = f7 != 0;
        boolean z11 = (f10 == 0 && c7 == 0) ? false : true;
        if (z8) {
            sb.append(f8);
            sb.append('d');
            i2 = 1;
        }
        if (z9 || (z8 && (z10 || z11))) {
            int i7 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            sb.append(f9);
            sb.append('h');
            i2 = i7;
        }
        if (z10 || (z11 && (z9 || z8))) {
            int i8 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            sb.append(f7);
            sb.append('m');
            i2 = i8;
        }
        if (z11) {
            int i9 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            if (f10 != 0 || z8 || z9 || z10) {
                b(sb, f10, c7, 9, "s", false);
            } else if (c7 >= 1000000) {
                b(sb, c7 / 1000000, c7 % 1000000, 6, "ms", false);
            } else if (c7 >= 1000) {
                b(sb, c7 / 1000, c7 % 1000, 3, "us", false);
            } else {
                sb.append(c7);
                sb.append("ns");
            }
            i2 = i9;
        }
        if (z7 && i2 > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }
}
