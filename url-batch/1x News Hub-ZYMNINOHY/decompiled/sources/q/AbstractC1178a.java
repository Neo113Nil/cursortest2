package q;

import kotlin.jvm.internal.j;

/* renamed from: q.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1178a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f10226a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final Object[] f10227b = new Object[0];

    public static final int a(int i3, int i4, int[] array) {
        j.e(array, "array");
        int i5 = i3 - 1;
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

    public static final int b(long[] array, int i3, long j3) {
        j.e(array, "array");
        int i4 = i3 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            long j4 = array[i6];
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
}
