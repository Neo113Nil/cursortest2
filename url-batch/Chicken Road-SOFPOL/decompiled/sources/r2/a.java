package r2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f6514a;

    public static long a(long j7, int i, int i8, int i9, int i10, int i11) {
        if ((i11 & 1) != 0) {
            i = j(j7);
        }
        if ((i11 & 2) != 0) {
            i8 = h(j7);
        }
        if ((i11 & 4) != 0) {
            i9 = i(j7);
        }
        if ((i11 & 8) != 0) {
            i10 = g(j7);
        }
        if (i8 < i || i10 < i9 || i < 0 || i9 < 0) {
            h.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return b.g(i, i8, i9, i10);
    }

    public static final boolean b(long j7, long j8) {
        return j7 == j8;
    }

    public static final boolean c(long j7) {
        int i = (int) (3 & j7);
        int i8 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return (((int) (j7 >> (i8 + 46))) & ((1 << (18 - i8)) - 1)) != 0;
    }

    public static final boolean d(long j7) {
        int i = (int) (3 & j7);
        return (((int) (j7 >> 33)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1)) != 0;
    }

    public static final boolean e(long j7) {
        int i = (int) (3 & j7);
        int i8 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i9 = (1 << (18 - i8)) - 1;
        int i10 = ((int) (j7 >> (i8 + 15))) & i9;
        int i11 = ((int) (j7 >> (i8 + 46))) & i9;
        return i10 == (i11 == 0 ? Integer.MAX_VALUE : i11 - 1);
    }

    public static final boolean f(long j7) {
        int i = (int) (3 & j7);
        int i8 = (1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1;
        int i9 = ((int) (j7 >> 2)) & i8;
        int i10 = ((int) (j7 >> 33)) & i8;
        return i9 == (i10 == 0 ? Integer.MAX_VALUE : i10 - 1);
    }

    public static final int g(long j7) {
        int i = (int) (3 & j7);
        int i8 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i9 = ((int) (j7 >> (i8 + 46))) & ((1 << (18 - i8)) - 1);
        if (i9 == 0) {
            return Integer.MAX_VALUE;
        }
        return i9 - 1;
    }

    public static final int h(long j7) {
        int i = (int) (3 & j7);
        int i8 = (int) (j7 >> 33);
        int i9 = i8 & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
        if (i9 == 0) {
            return Integer.MAX_VALUE;
        }
        return i9 - 1;
    }

    public static final int i(long j7) {
        int i = (int) (3 & j7);
        int i8 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((int) (j7 >> (i8 + 15))) & ((1 << (18 - i8)) - 1);
    }

    public static final int j(long j7) {
        int i = (int) (3 & j7);
        return ((int) (j7 >> 2)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
    }

    public static String k(long j7) {
        int h8 = h(j7);
        String valueOf = h8 == Integer.MAX_VALUE ? "Infinity" : String.valueOf(h8);
        int g3 = g(j7);
        return "Constraints(minWidth = " + j(j7) + ", maxWidth = " + valueOf + ", minHeight = " + i(j7) + ", maxHeight = " + (g3 != Integer.MAX_VALUE ? String.valueOf(g3) : "Infinity") + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f6514a == ((a) obj).f6514a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6514a);
    }

    public final String toString() {
        return k(this.f6514a);
    }
}
