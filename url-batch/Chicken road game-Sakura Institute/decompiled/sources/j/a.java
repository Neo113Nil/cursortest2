package j;

import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f4966a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f4967b = new long[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f4968c = new Object[0];

    public static final int a(int[] iArr, int i7, int i8) {
        k.f(iArr, "array");
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

    public static final int b(long[] jArr, int i7, long j8) {
        k.f(jArr, "array");
        int i8 = i7 - 1;
        int i9 = 0;
        while (i9 <= i8) {
            int i10 = (i9 + i8) >>> 1;
            long j9 = jArr[i10];
            if (j9 < j8) {
                i9 = i10 + 1;
            } else {
                if (j9 <= j8) {
                    return i10;
                }
                i8 = i10 - 1;
            }
        }
        return ~i9;
    }

    public static final void c(String str) {
        k.f(str, "message");
        throw new IllegalArgumentException(str);
    }
}
