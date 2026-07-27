package j;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: j.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0705a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f7119a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f7120b = new long[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f7121c = new Object[0];

    public static final int a(int[] array, int i2, int i4) {
        Intrinsics.checkNotNullParameter(array, "array");
        int i5 = i2 - 1;
        int i6 = 0;
        while (i6 <= i5) {
            int i7 = (i6 + i5) >>> 1;
            int i8 = array[i7];
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

    public static final int b(long[] array, int i2, long j4) {
        Intrinsics.checkNotNullParameter(array, "array");
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            long j5 = array[i6];
            if (j5 < j4) {
                i5 = i6 + 1;
            } else {
                if (j5 <= j4) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    public static final void c(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        throw new IllegalArgumentException(message);
    }
}
