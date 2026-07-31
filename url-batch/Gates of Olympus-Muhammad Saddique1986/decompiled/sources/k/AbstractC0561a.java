package k;

import f2.j;

/* renamed from: k.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0561a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f6408a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f6409b = new long[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f6410c = new Object[0];

    public static final int a(int[] iArr, int i3, int i4) {
        j.f(iArr, "array");
        int i5 = i3 - 1;
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

    public static final int b(long[] jArr, int i3, long j3) {
        j.f(jArr, "array");
        int i4 = i3 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            long j4 = jArr[i6];
            if (j4 < j3) {
                i5 = i6 + 1;
            } else {
                if (j4 <= j3) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    public static final void c(String str) {
        j.f(str, "message");
        throw new IllegalArgumentException(str);
    }
}
