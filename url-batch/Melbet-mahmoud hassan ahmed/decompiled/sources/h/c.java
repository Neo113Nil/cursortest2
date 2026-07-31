package h;

/* loaded from: classes.dex */
class c {

    /* renamed from: a, reason: collision with root package name */
    static final int[] f16697a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    static final long[] f16698b = new long[0];

    /* renamed from: c, reason: collision with root package name */
    static final Object[] f16699c = new Object[0];

    static int a(int[] iArr, int i7, int i8) {
        int i9 = i7 - 1;
        int i10 = 0;
        while (i10 <= i9) {
            int i11 = (i10 + i9) >>> 1;
            int i12 = iArr[i11];
            if (i12 < i8) {
                i10 = i11 + 1;
            } else {
                if (i12 <= i8) {
                    return i11;
                }
                i9 = i11 - 1;
            }
        }
        return i10 ^ (-1);
    }

    public static boolean b(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int c(int i7) {
        for (int i8 = 4; i8 < 32; i8++) {
            int i9 = (1 << i8) - 12;
            if (i7 <= i9) {
                return i9;
            }
        }
        return i7;
    }

    public static int d(int i7) {
        return c(i7 * 4) / 4;
    }
}
