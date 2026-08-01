package x2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class b {
    public static final long a(int i3, int i10, int i11, int i12) {
        if (!((i11 >= 0) & (i10 >= i3) & (i12 >= i11) & (i3 >= 0))) {
            h.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return g(i3, i10, i11, i12);
    }

    public static /* synthetic */ long b(int i3, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        if ((i11 & 8) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        return a(0, i3, 0, i10);
    }

    public static final int c(int i3) {
        if (i3 < 8191) {
            return 13;
        }
        if (i3 < 32767) {
            return 15;
        }
        if (i3 < 65535) {
            return 16;
        }
        return i3 < 262143 ? 18 : 255;
    }

    public static final long d(long j, long j3) {
        int i3 = (int) (j3 >> 32);
        int j10 = a.j(j);
        int h10 = a.h(j);
        if (i3 < j10) {
            i3 = j10;
        }
        if (i3 <= h10) {
            h10 = i3;
        }
        int i10 = (int) (j3 & 4294967295L);
        int i11 = a.i(j);
        int g = a.g(j);
        if (i10 < i11) {
            i10 = i11;
        }
        if (i10 <= g) {
            g = i10;
        }
        return (h10 << 32) | (g & 4294967295L);
    }

    public static final int e(int i3, long j) {
        int i10 = a.i(j);
        int g = a.g(j);
        if (i3 < i10) {
            i3 = i10;
        }
        return i3 > g ? g : i3;
    }

    public static final int f(int i3, long j) {
        int j3 = a.j(j);
        int h10 = a.h(j);
        if (i3 < j3) {
            i3 = j3;
        }
        return i3 > h10 ? h10 : i3;
    }

    public static final long g(int i3, int i10, int i11, int i12) {
        int i13 = i12 == Integer.MAX_VALUE ? i11 : i12;
        int c10 = c(i13);
        int i14 = i10 == Integer.MAX_VALUE ? i3 : i10;
        int c11 = c(i14);
        if (c10 + c11 > 31) {
            i(i14, i13);
        }
        int i15 = i10 + 1;
        int i16 = i12 + 1;
        int i17 = c11 - 13;
        return ((i15 & (~(i15 >> 31))) << 33) | ((i17 >> 1) + (i17 & 1)) | (i3 << 2) | (i11 << (c11 + 2)) | ((i16 & (~(i16 >> 31))) << (c11 + 33));
    }

    public static final long h(int i3, int i10, long j) {
        int j3 = a.j(j) + i3;
        if (j3 < 0) {
            j3 = 0;
        }
        int h10 = a.h(j);
        if (h10 != Integer.MAX_VALUE && (h10 = h10 + i3) < 0) {
            h10 = 0;
        }
        int i11 = a.i(j) + i10;
        if (i11 < 0) {
            i11 = 0;
        }
        int g = a.g(j);
        return a(j3, h10, i11, (g == Integer.MAX_VALUE || (g = g + i10) >= 0) ? g : 0);
    }

    public static final void i(int i3, int i10) {
        throw new IllegalArgumentException("Can't represent a width of " + i3 + " and height of " + i10 + " in Constraints");
    }

    public static final Void j(int i3) {
        throw new IllegalArgumentException(n0.l.f(i3, "Can't represent a size of ", " in Constraints"));
    }
}
