package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
final class q52 {

    /* renamed from: a, reason: collision with root package name */
    public final k52 f30677a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30678b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f30679c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f30680d;

    /* renamed from: e, reason: collision with root package name */
    public final int f30681e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f30682f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f30683g;

    /* renamed from: h, reason: collision with root package name */
    public final long f30684h;

    public q52(k52 k52Var, long[] jArr, int[] iArr, int i4, long[] jArr2, int[] iArr2, long j4) {
        C2253tf.a(iArr.length == jArr2.length);
        C2253tf.a(jArr.length == jArr2.length);
        C2253tf.a(iArr2.length == jArr2.length);
        this.f30677a = k52Var;
        this.f30679c = jArr;
        this.f30680d = iArr;
        this.f30681e = i4;
        this.f30682f = jArr2;
        this.f30683g = iArr2;
        this.f30684h = j4;
        this.f30678b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j4) {
        for (int a4 = u82.a(this.f30682f, j4, true); a4 < this.f30682f.length; a4++) {
            if ((this.f30683g[a4] & 1) != 0) {
                return a4;
            }
        }
        return -1;
    }
}
