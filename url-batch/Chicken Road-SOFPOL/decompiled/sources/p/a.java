package p;

import java.util.NoSuchElementException;
import q6.i;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f5707a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f5708b = new long[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f5709c = new Object[0];

    public static final int a(int i, int i8, int[] iArr) {
        i.e(iArr, "array");
        int i9 = i - 1;
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

    public static final int b(long[] jArr, int i, long j7) {
        i.e(jArr, "array");
        int i8 = i - 1;
        int i9 = 0;
        while (i9 <= i8) {
            int i10 = (i9 + i8) >>> 1;
            long j8 = jArr[i10];
            if (j8 < j7) {
                i9 = i10 + 1;
            } else {
                if (j8 <= j7) {
                    return i10;
                }
                i8 = i10 - 1;
            }
        }
        return ~i9;
    }

    public static final void c(String str) {
        i.e(str, "message");
        throw new IllegalArgumentException(str);
    }

    public static final void d(String str) {
        i.e(str, "message");
        throw new IndexOutOfBoundsException(str);
    }

    public static final void e(String str) {
        i.e(str, "message");
        throw new NoSuchElementException(str);
    }
}
