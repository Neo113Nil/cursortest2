package e1;

import o2.m0;

/* loaded from: classes.dex */
final class r {

    /* renamed from: a, reason: collision with root package name */
    public final o f16004a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16005b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f16006c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f16007d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16008e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f16009f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f16010g;

    /* renamed from: h, reason: collision with root package name */
    public final long f16011h;

    public r(o oVar, long[] jArr, int[] iArr, int i7, long[] jArr2, int[] iArr2, long j7) {
        o2.a.a(iArr.length == jArr2.length);
        o2.a.a(jArr.length == jArr2.length);
        o2.a.a(iArr2.length == jArr2.length);
        this.f16004a = oVar;
        this.f16006c = jArr;
        this.f16007d = iArr;
        this.f16008e = i7;
        this.f16009f = jArr2;
        this.f16010g = iArr2;
        this.f16011h = j7;
        this.f16005b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int a(long j7) {
        for (int i7 = m0.i(this.f16009f, j7, true, false); i7 >= 0; i7--) {
            if ((this.f16010g[i7] & 1) != 0) {
                return i7;
            }
        }
        return -1;
    }

    public int b(long j7) {
        for (int e7 = m0.e(this.f16009f, j7, true, false); e7 < this.f16009f.length; e7++) {
            if ((this.f16010g[e7] & 1) != 0) {
                return e7;
            }
        }
        return -1;
    }
}
