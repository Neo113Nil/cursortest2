package M0;

import A.AbstractC0017m;
import a.AbstractC0345a;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f3539a;

    public /* synthetic */ a(long j4) {
        this.f3539a = j4;
    }

    public static final long a(int i2, int i4, int i5, int i6) {
        if (!(i5 >= 0 && i2 >= 0)) {
            AbstractC0345a.I("minHeight(" + i5 + ") and minWidth(" + i2 + ") must be >= 0");
            throw null;
        }
        if (!(i4 >= i2)) {
            AbstractC0345a.I("maxWidth(" + i4 + ") must be >= minWidth(" + i2 + ')');
            throw null;
        }
        if (i6 >= i5) {
            return u3.d.t(i2, i4, i5, i6);
        }
        AbstractC0345a.I("maxHeight(" + i6 + ") must be >= minHeight(" + i5 + ')');
        throw null;
    }

    public static /* synthetic */ long b(long j4, int i2, int i4, int i5, int i6, int i7) {
        if ((i7 & 1) != 0) {
            i2 = k(j4);
        }
        if ((i7 & 2) != 0) {
            i4 = i(j4);
        }
        if ((i7 & 4) != 0) {
            i5 = j(j4);
        }
        if ((i7 & 8) != 0) {
            i6 = h(j4);
        }
        return a(i2, i4, i5, i6);
    }

    public static final boolean c(long j4, long j5) {
        return j4 == j5;
    }

    public static final boolean d(long j4) {
        int i2 = (int) (3 & j4);
        int i4 = (((i2 & 2) >> 1) * 3) + ((i2 & 1) << 1);
        return (((int) (j4 >> (i4 + 46))) & ((1 << (18 - i4)) - 1)) != 0;
    }

    public static final boolean e(long j4) {
        int i2 = (int) (3 & j4);
        return (((int) (j4 >> 33)) & ((1 << (((((i2 & 2) >> 1) * 3) + ((i2 & 1) << 1)) + 13)) - 1)) != 0;
    }

    public static final boolean f(long j4) {
        int i2 = (int) (3 & j4);
        int i4 = (((i2 & 2) >> 1) * 3) + ((i2 & 1) << 1);
        int i5 = (1 << (18 - i4)) - 1;
        int i6 = ((int) (j4 >> (i4 + 15))) & i5;
        int i7 = ((int) (j4 >> (i4 + 46))) & i5;
        return i6 == (i7 == 0 ? Integer.MAX_VALUE : i7 - 1);
    }

    public static final boolean g(long j4) {
        int i2 = (int) (3 & j4);
        int i4 = (1 << (((((i2 & 2) >> 1) * 3) + ((i2 & 1) << 1)) + 13)) - 1;
        int i5 = ((int) (j4 >> 2)) & i4;
        int i6 = ((int) (j4 >> 33)) & i4;
        return i5 == (i6 == 0 ? Integer.MAX_VALUE : i6 - 1);
    }

    public static final int h(long j4) {
        int i2 = (int) (3 & j4);
        int i4 = (((i2 & 2) >> 1) * 3) + ((i2 & 1) << 1);
        int i5 = ((int) (j4 >> (i4 + 46))) & ((1 << (18 - i4)) - 1);
        if (i5 == 0) {
            return Integer.MAX_VALUE;
        }
        return i5 - 1;
    }

    public static final int i(long j4) {
        int i2 = (int) (3 & j4);
        int i4 = (int) (j4 >> 33);
        int i5 = i4 & ((1 << (((((i2 & 2) >> 1) * 3) + ((i2 & 1) << 1)) + 13)) - 1);
        if (i5 == 0) {
            return Integer.MAX_VALUE;
        }
        return i5 - 1;
    }

    public static final int j(long j4) {
        int i2 = (int) (3 & j4);
        int i4 = (((i2 & 2) >> 1) * 3) + ((i2 & 1) << 1);
        return ((int) (j4 >> (i4 + 15))) & ((1 << (18 - i4)) - 1);
    }

    public static final int k(long j4) {
        int i2 = (int) (3 & j4);
        return ((int) (j4 >> 2)) & ((1 << (((((i2 & 2) >> 1) * 3) + ((i2 & 1) << 1)) + 13)) - 1);
    }

    public static String l(long j4) {
        int i2 = i(j4);
        String valueOf = i2 == Integer.MAX_VALUE ? "Infinity" : String.valueOf(i2);
        int h4 = h(j4);
        String valueOf2 = h4 != Integer.MAX_VALUE ? String.valueOf(h4) : "Infinity";
        StringBuilder sb = new StringBuilder("Constraints(minWidth = ");
        sb.append(k(j4));
        sb.append(", maxWidth = ");
        sb.append(valueOf);
        sb.append(", minHeight = ");
        sb.append(j(j4));
        sb.append(", maxHeight = ");
        return AbstractC0017m.m(sb, valueOf2, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f3539a == ((a) obj).f3539a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3539a);
    }

    public final String toString() {
        return l(this.f3539a);
    }
}
