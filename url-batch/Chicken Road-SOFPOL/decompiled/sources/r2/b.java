package r2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class b {
    public static final long a(int i, int i8, int i9, int i10) {
        if (!((i9 >= 0) & (i8 >= i) & (i10 >= i9) & (i >= 0))) {
            h.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return g(i, i8, i9, i10);
    }

    public static /* synthetic */ long b(int i, int i8, int i9) {
        if ((i9 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i9 & 8) != 0) {
            i8 = Integer.MAX_VALUE;
        }
        return a(0, i, 0, i8);
    }

    public static final int c(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        return i < 262143 ? 18 : 255;
    }

    public static final long d(long j7, long j8) {
        int i = (int) (j8 >> 32);
        int j9 = a.j(j7);
        int h8 = a.h(j7);
        if (i < j9) {
            i = j9;
        }
        if (i <= h8) {
            h8 = i;
        }
        int i8 = (int) (j8 & 4294967295L);
        int i9 = a.i(j7);
        int g3 = a.g(j7);
        if (i8 < i9) {
            i8 = i9;
        }
        if (i8 <= g3) {
            g3 = i8;
        }
        return (h8 << 32) | (g3 & 4294967295L);
    }

    public static final int e(int i, long j7) {
        int i8 = a.i(j7);
        int g3 = a.g(j7);
        if (i < i8) {
            i = i8;
        }
        return i > g3 ? g3 : i;
    }

    public static final int f(int i, long j7) {
        int j8 = a.j(j7);
        int h8 = a.h(j7);
        if (i < j8) {
            i = j8;
        }
        return i > h8 ? h8 : i;
    }

    public static final long g(int i, int i8, int i9, int i10) {
        int i11 = i10 == Integer.MAX_VALUE ? i9 : i10;
        int c8 = c(i11);
        int i12 = i8 == Integer.MAX_VALUE ? i : i8;
        int c9 = c(i12);
        if (c8 + c9 > 31) {
            i(i12, i11);
        }
        int i13 = i8 + 1;
        int i14 = i10 + 1;
        int i15 = c9 - 13;
        return ((i13 & (~(i13 >> 31))) << 33) | ((i15 >> 1) + (i15 & 1)) | (i << 2) | (i9 << (c9 + 2)) | ((i14 & (~(i14 >> 31))) << (c9 + 33));
    }

    public static final long h(int i, int i8, long j7) {
        int j8 = a.j(j7) + i;
        if (j8 < 0) {
            j8 = 0;
        }
        int h8 = a.h(j7);
        if (h8 != Integer.MAX_VALUE && (h8 = h8 + i) < 0) {
            h8 = 0;
        }
        int i9 = a.i(j7) + i8;
        if (i9 < 0) {
            i9 = 0;
        }
        int g3 = a.g(j7);
        return a(j8, h8, i9, (g3 == Integer.MAX_VALUE || (g3 = g3 + i8) >= 0) ? g3 : 0);
    }

    public static final void i(int i, int i8) {
        throw new IllegalArgumentException("Can't represent a width of " + i + " and height of " + i8 + " in Constraints");
    }

    public static final Void j(int i) {
        throw new IllegalArgumentException("Can't represent a size of " + i + " in Constraints");
    }
}
