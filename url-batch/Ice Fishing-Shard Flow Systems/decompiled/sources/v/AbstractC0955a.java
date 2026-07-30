package v;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: v.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0955a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f8126a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final Object[] f8127b = new Object[0];

    public static final int a(int i2, int i5, int[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int i7 = i2 - 1;
        int i8 = 0;
        while (i8 <= i7) {
            int i9 = (i8 + i7) >>> 1;
            int i10 = array[i9];
            if (i10 < i5) {
                i8 = i9 + 1;
            } else {
                if (i10 <= i5) {
                    return i9;
                }
                i7 = i9 - 1;
            }
        }
        return ~i8;
    }

    public static final int b(long[] array, int i2, long j) {
        Intrinsics.checkNotNullParameter(array, "array");
        int i5 = i2 - 1;
        int i7 = 0;
        while (i7 <= i5) {
            int i8 = (i7 + i5) >>> 1;
            long j7 = array[i8];
            if (j7 < j) {
                i7 = i8 + 1;
            } else {
                if (j7 <= j) {
                    return i8;
                }
                i5 = i8 - 1;
            }
        }
        return ~i7;
    }
}
