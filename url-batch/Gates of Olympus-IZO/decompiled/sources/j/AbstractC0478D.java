package j;

/* renamed from: j.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0478D {

    /* renamed from: a, reason: collision with root package name */
    public static final long[] f5136a = {-9187201950435737345L, -1};

    static {
        new C0506x(0);
    }

    public static final void a(long[] jArr, int i3) {
        Z1.i.f(jArr, "metadata");
        int i4 = (i3 + 7) >> 3;
        for (int i5 = 0; i5 < i4; i5++) {
            long j3 = jArr[i5] & (-9187201950435737472L);
            jArr[i5] = (-72340172838076674L) & ((~j3) + (j3 >>> 7));
        }
        int length = jArr.length;
        int i6 = length - 1;
        int i7 = length - 2;
        jArr[i7] = (jArr[i7] & 72057594037927935L) | (-72057594037927936L);
        jArr[i6] = jArr[0];
    }

    public static final int b(long[] jArr, int i3, int i4) {
        Z1.i.f(jArr, "metadata");
        while (i3 < i4) {
            if (((jArr[i3 >> 3] >> ((i3 & 7) << 3)) & 255) == 128) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    public static final int c(int i3) {
        if (i3 == 7) {
            return 6;
        }
        return i3 - (i3 / 8);
    }

    public static final int d(int i3) {
        if (i3 == 0) {
            return 6;
        }
        return (i3 * 2) + 1;
    }

    public static final int e(int i3) {
        if (i3 > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i3);
        }
        return 0;
    }

    public static final int f(int i3) {
        if (i3 == 7) {
            return 8;
        }
        return ((i3 - 1) / 7) + i3;
    }
}
