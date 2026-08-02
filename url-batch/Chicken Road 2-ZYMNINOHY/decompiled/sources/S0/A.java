package S0;

import W.J;
import a.AbstractC0124a;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final x f2382a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2383b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f2384c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f2385d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2386e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f2387f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f2388g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f2389h;

    /* renamed from: i, reason: collision with root package name */
    public final long f2390i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f2391j;

    public A(x xVar, long[] jArr, int[] iArr, int i4, long[] jArr2, int[] iArr2, int[] iArr3, boolean z, long j4, int i5) {
        AbstractC0124a.h(iArr.length == jArr2.length);
        AbstractC0124a.h(jArr.length == jArr2.length);
        AbstractC0124a.h(iArr2.length == jArr2.length);
        this.f2382a = xVar;
        this.f2384c = jArr;
        this.f2385d = iArr;
        this.f2386e = i4;
        this.f2387f = jArr2;
        this.f2388g = iArr2;
        this.f2389h = iArr3;
        this.f2391j = z;
        this.f2390i = j4;
        this.f2383b = i5;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j4) {
        boolean z = this.f2391j;
        int i4 = 0;
        long[] jArr = this.f2387f;
        if (z) {
            return J.f(jArr, j4, false);
        }
        int[] iArr = this.f2389h;
        int length = iArr.length - 1;
        int i5 = -1;
        while (i4 <= length) {
            int i6 = ((length - i4) / 2) + i4;
            if (jArr[iArr[i6]] <= j4) {
                i4 = i6 + 1;
                i5 = i6;
            } else {
                length = i6 - 1;
            }
        }
        if (i5 == -1) {
            return -1;
        }
        long j5 = jArr[iArr[i5]];
        if (j5 == j4) {
            while (i5 > 0 && jArr[iArr[i5 - 1]] == j5) {
                i5--;
            }
        }
        return iArr[i5];
    }

    public final int b(long j4) {
        boolean z = this.f2391j;
        long[] jArr = this.f2387f;
        if (z) {
            return J.b(jArr, j4, true);
        }
        int[] iArr = this.f2389h;
        int length = iArr.length - 1;
        int i4 = 0;
        int i5 = -1;
        while (i4 <= length) {
            int i6 = ((length - i4) / 2) + i4;
            if (jArr[iArr[i6]] >= j4) {
                length = i6 - 1;
                i5 = i6;
            } else {
                i4 = i6 + 1;
            }
        }
        if (i5 == -1) {
            return -1;
        }
        long j5 = jArr[iArr[i5]];
        if (j5 == j4) {
            while (i5 < iArr.length - 1) {
                int i7 = i5 + 1;
                if (jArr[iArr[i7]] != j5) {
                    break;
                }
                i5 = i7;
            }
        }
        return iArr[i5];
    }
}
