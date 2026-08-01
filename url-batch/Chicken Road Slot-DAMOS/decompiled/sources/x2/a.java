package x2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f10316a;

    public static long a(int i3, int i10, long j) {
        int h10 = h(j);
        int g = g(j);
        if (h10 < i3 || g < i10 || i3 < 0 || i10 < 0) {
            h.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return b.g(i3, h10, i10, g);
    }

    public static final boolean b(long j, long j3) {
        return j == j3;
    }

    public static final boolean c(long j) {
        int i3 = (int) (3 & j);
        int i10 = (((i3 & 2) >> 1) * 3) + ((i3 & 1) << 1);
        return (((int) (j >> (i10 + 46))) & ((1 << (18 - i10)) - 1)) != 0;
    }

    public static final boolean d(long j) {
        int i3 = (int) (3 & j);
        return (((int) (j >> 33)) & ((1 << (((((i3 & 2) >> 1) * 3) + ((i3 & 1) << 1)) + 13)) - 1)) != 0;
    }

    public static final boolean e(long j) {
        int i3 = (int) (3 & j);
        int i10 = (((i3 & 2) >> 1) * 3) + ((i3 & 1) << 1);
        int i11 = (1 << (18 - i10)) - 1;
        int i12 = ((int) (j >> (i10 + 15))) & i11;
        int i13 = ((int) (j >> (i10 + 46))) & i11;
        return i12 == (i13 == 0 ? Integer.MAX_VALUE : i13 - 1);
    }

    public static final boolean f(long j) {
        int i3 = (int) (3 & j);
        int i10 = (1 << (((((i3 & 2) >> 1) * 3) + ((i3 & 1) << 1)) + 13)) - 1;
        int i11 = ((int) (j >> 2)) & i10;
        int i12 = ((int) (j >> 33)) & i10;
        return i11 == (i12 == 0 ? Integer.MAX_VALUE : i12 - 1);
    }

    public static final int g(long j) {
        int i3 = (int) (3 & j);
        int i10 = (((i3 & 2) >> 1) * 3) + ((i3 & 1) << 1);
        int i11 = ((int) (j >> (i10 + 46))) & ((1 << (18 - i10)) - 1);
        if (i11 == 0) {
            return Integer.MAX_VALUE;
        }
        return i11 - 1;
    }

    public static final int h(long j) {
        int i3 = (int) (3 & j);
        int i10 = (int) (j >> 33);
        int i11 = i10 & ((1 << (((((i3 & 2) >> 1) * 3) + ((i3 & 1) << 1)) + 13)) - 1);
        if (i11 == 0) {
            return Integer.MAX_VALUE;
        }
        return i11 - 1;
    }

    public static final int i(long j) {
        int i3 = (int) (3 & j);
        int i10 = (((i3 & 2) >> 1) * 3) + ((i3 & 1) << 1);
        return ((int) (j >> (i10 + 15))) & ((1 << (18 - i10)) - 1);
    }

    public static final int j(long j) {
        int i3 = (int) (3 & j);
        return ((int) (j >> 2)) & ((1 << (((((i3 & 2) >> 1) * 3) + ((i3 & 1) << 1)) + 13)) - 1);
    }

    public static String k(long j) {
        int h10 = h(j);
        String valueOf = h10 == Integer.MAX_VALUE ? "Infinity" : String.valueOf(h10);
        int g = g(j);
        String valueOf2 = g != Integer.MAX_VALUE ? String.valueOf(g) : "Infinity";
        StringBuilder sb2 = new StringBuilder("Constraints(minWidth = ");
        sb2.append(j(j));
        sb2.append(", maxWidth = ");
        sb2.append(valueOf);
        sb2.append(", minHeight = ");
        sb2.append(i(j));
        sb2.append(", maxHeight = ");
        return n0.l.h(sb2, valueOf2, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f10316a == ((a) obj).f10316a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f10316a);
    }

    public final String toString() {
        return k(this.f10316a);
    }
}
