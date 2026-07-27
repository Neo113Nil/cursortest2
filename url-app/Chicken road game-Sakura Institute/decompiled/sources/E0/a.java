package E0;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f2262a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final Object[] f2263b = new Object[0];

    public static final int a(int[] iArr, int i2, int i4) {
        int i5 = i2 - 1;
        int i6 = 0;
        while (i6 <= i5) {
            int i7 = (i6 + i5) >>> 1;
            int i8 = iArr[i7];
            if (i8 < i4) {
                i6 = i7 + 1;
            } else {
                if (i8 <= i4) {
                    return i7;
                }
                i5 = i7 - 1;
            }
        }
        return ~i6;
    }
}
