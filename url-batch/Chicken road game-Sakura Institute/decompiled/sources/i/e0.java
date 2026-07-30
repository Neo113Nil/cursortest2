package i;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final long[] f4736a = {-9187201950435737345L, -1};

    static {
        new x(0);
    }

    public static final void a(long[] jArr, int i7) {
        r6.k.f(jArr, "metadata");
        int i8 = (i7 + 7) >> 3;
        for (int i9 = 0; i9 < i8; i9++) {
            long j8 = jArr[i9] & (-9187201950435737472L);
            jArr[i9] = (-72340172838076674L) & ((~j8) + (j8 >>> 7));
        }
        int length = jArr.length;
        int i10 = length - 1;
        int i11 = length - 2;
        jArr[i11] = (jArr[i11] & 72057594037927935L) | (-72057594037927936L);
        jArr[i10] = jArr[0];
    }

    public static final int b(long[] jArr, int i7, int i8) {
        r6.k.f(jArr, "metadata");
        while (i7 < i8) {
            if (((jArr[i7 >> 3] >> ((i7 & 7) << 3)) & 255) == 128) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    public static final int c(int i7) {
        if (i7 == 7) {
            return 6;
        }
        return i7 - (i7 / 8);
    }

    public static final int d(int i7) {
        if (i7 == 0) {
            return 6;
        }
        return (i7 * 2) + 1;
    }

    public static final int e(int i7) {
        if (i7 > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i7);
        }
        return 0;
    }

    public static final int f(int i7) {
        if (i7 == 7) {
            return 8;
        }
        return ((i7 - 1) / 7) + i7;
    }
}
