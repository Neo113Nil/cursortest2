package m2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f6306a;

    public /* synthetic */ a(long j8) {
        this.f6306a = j8;
    }

    public static long a(long j8, int i7, int i8, int i9, int i10, int i11) {
        if ((i11 & 1) != 0) {
            i7 = j(j8);
        }
        if ((i11 & 2) != 0) {
            i8 = h(j8);
        }
        if ((i11 & 4) != 0) {
            i9 = i(j8);
        }
        if ((i11 & 8) != 0) {
            i10 = g(j8);
        }
        if (i9 < 0 || i7 < 0) {
            a8.d.c0("minHeight(" + i9 + ") and minWidth(" + i7 + ") must be >= 0");
            throw null;
        }
        if (i8 < i7) {
            a8.d.c0("maxWidth(" + i8 + ") must be >= minWidth(" + i7 + ')');
            throw null;
        }
        if (i10 >= i9) {
            return r4.a.z(i7, i8, i9, i10);
        }
        a8.d.c0("maxHeight(" + i10 + ") must be >= minHeight(" + i9 + ')');
        throw null;
    }

    public static final boolean b(long j8, long j9) {
        return j8 == j9;
    }

    public static final boolean c(long j8) {
        int i7 = (int) (3 & j8);
        int i8 = (((i7 & 2) >> 1) * 3) + ((i7 & 1) << 1);
        return (((int) (j8 >> (i8 + 46))) & ((1 << (18 - i8)) - 1)) != 0;
    }

    public static final boolean d(long j8) {
        int i7 = (int) (3 & j8);
        return (((int) (j8 >> 33)) & ((1 << (((((i7 & 2) >> 1) * 3) + ((i7 & 1) << 1)) + 13)) - 1)) != 0;
    }

    public static final boolean e(long j8) {
        int i7 = (int) (3 & j8);
        int i8 = (((i7 & 2) >> 1) * 3) + ((i7 & 1) << 1);
        int i9 = (1 << (18 - i8)) - 1;
        int i10 = ((int) (j8 >> (i8 + 15))) & i9;
        int i11 = ((int) (j8 >> (i8 + 46))) & i9;
        return i10 == (i11 == 0 ? Integer.MAX_VALUE : i11 - 1);
    }

    public static final boolean f(long j8) {
        int i7 = (int) (3 & j8);
        int i8 = (1 << (((((i7 & 2) >> 1) * 3) + ((i7 & 1) << 1)) + 13)) - 1;
        int i9 = ((int) (j8 >> 2)) & i8;
        int i10 = ((int) (j8 >> 33)) & i8;
        return i9 == (i10 == 0 ? Integer.MAX_VALUE : i10 - 1);
    }

    public static final int g(long j8) {
        int i7 = (int) (3 & j8);
        int i8 = (((i7 & 2) >> 1) * 3) + ((i7 & 1) << 1);
        int i9 = ((int) (j8 >> (i8 + 46))) & ((1 << (18 - i8)) - 1);
        if (i9 == 0) {
            return Integer.MAX_VALUE;
        }
        return i9 - 1;
    }

    public static final int h(long j8) {
        int i7 = (int) (3 & j8);
        int i8 = (int) (j8 >> 33);
        int i9 = i8 & ((1 << (((((i7 & 2) >> 1) * 3) + ((i7 & 1) << 1)) + 13)) - 1);
        if (i9 == 0) {
            return Integer.MAX_VALUE;
        }
        return i9 - 1;
    }

    public static final int i(long j8) {
        int i7 = (int) (3 & j8);
        int i8 = (((i7 & 2) >> 1) * 3) + ((i7 & 1) << 1);
        return ((int) (j8 >> (i8 + 15))) & ((1 << (18 - i8)) - 1);
    }

    public static final int j(long j8) {
        int i7 = (int) (3 & j8);
        return ((int) (j8 >> 2)) & ((1 << (((((i7 & 2) >> 1) * 3) + ((i7 & 1) << 1)) + 13)) - 1);
    }

    public static String k(long j8) {
        int h3 = h(j8);
        String valueOf = h3 == Integer.MAX_VALUE ? "Infinity" : String.valueOf(h3);
        int g9 = g(j8);
        return "Constraints(minWidth = " + j(j8) + ", maxWidth = " + valueOf + ", minHeight = " + i(j8) + ", maxHeight = " + (g9 != Integer.MAX_VALUE ? String.valueOf(g9) : "Infinity") + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f6306a == ((a) obj).f6306a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6306a);
    }

    public final String toString() {
        return k(this.f6306a);
    }
}
