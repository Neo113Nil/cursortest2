package t;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f9193a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f9194b = new long[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f9195c = new Object[0];

    public static final int a(int i3, int i10, int[] iArr) {
        iArr.getClass();
        int i11 = i3 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = iArr[i13];
            if (i14 < i10) {
                i12 = i13 + 1;
            } else {
                if (i14 <= i10) {
                    return i13;
                }
                i11 = i13 - 1;
            }
        }
        return ~i12;
    }

    public static final int b(long[] jArr, int i3, long j) {
        jArr.getClass();
        int i10 = i3 - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            long j3 = jArr[i12];
            if (j3 < j) {
                i11 = i12 + 1;
            } else {
                if (j3 <= j) {
                    return i12;
                }
                i10 = i12 - 1;
            }
        }
        return ~i11;
    }
}
