package q;

/* renamed from: q.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0584d {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f5714a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final Object[] f5715b = new Object[0];

    public static int a(int i7, int i8, int[] iArr) {
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
        return ~i10;
    }

    public static int b(long[] jArr, int i7, long j4) {
        int i8 = i7 - 1;
        int i9 = 0;
        while (i9 <= i8) {
            int i10 = (i9 + i8) >>> 1;
            long j7 = jArr[i10];
            if (j7 < j4) {
                i9 = i10 + 1;
            } else {
                if (j7 <= j4) {
                    return i10;
                }
                i8 = i10 - 1;
            }
        }
        return ~i9;
    }
}
