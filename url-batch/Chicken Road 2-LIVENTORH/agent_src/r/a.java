package r;

import f3.d;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f3114a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final Object[] f3115b = new Object[0];

    public static final int a(int i, int i4, int[] iArr) {
        d.e(iArr, "array");
        int i5 = i - 1;
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

    public static final int b(long[] jArr, int i, long j4) {
        d.e(jArr, "array");
        int i4 = i - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            long j5 = jArr[i6];
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
}
