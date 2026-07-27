package r;

/* renamed from: r.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1394d {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f11683a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final Object[] f11684b = new Object[0];

    public static int a(int i2, int i3, int[] iArr) {
        int i6 = i2 - 1;
        int i7 = 0;
        while (i7 <= i6) {
            int i8 = (i7 + i6) >>> 1;
            int i9 = iArr[i8];
            if (i9 < i3) {
                i7 = i8 + 1;
            } else {
                if (i9 <= i3) {
                    return i8;
                }
                i6 = i8 - 1;
            }
        }
        return ~i7;
    }

    public static int b(long[] jArr, int i2, long j2) {
        int i3 = i2 - 1;
        int i6 = 0;
        while (i6 <= i3) {
            int i7 = (i6 + i3) >>> 1;
            long j6 = jArr[i7];
            if (j6 < j2) {
                i6 = i7 + 1;
            } else {
                if (j6 <= j2) {
                    return i7;
                }
                i3 = i7 - 1;
            }
        }
        return ~i6;
    }
}
