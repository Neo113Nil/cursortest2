package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.tw1;

/* loaded from: classes3.dex */
final class dj2 implements tw1 {

    /* renamed from: a, reason: collision with root package name */
    private final bj2 f24648a;

    /* renamed from: b, reason: collision with root package name */
    private final int f24649b;

    /* renamed from: c, reason: collision with root package name */
    private final long f24650c;

    /* renamed from: d, reason: collision with root package name */
    private final long f24651d;

    /* renamed from: e, reason: collision with root package name */
    private final long f24652e;

    public dj2(bj2 bj2Var, int i4, long j4, long j5) {
        this.f24648a = bj2Var;
        this.f24649b = i4;
        this.f24650c = j4;
        long j6 = (j5 - j4) / bj2Var.f23837d;
        this.f24651d = j6;
        this.f24652e = c(j6);
    }

    private long c(long j4) {
        return u82.a(j4 * this.f24649b, 1000000L, this.f24648a.f23836c);
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final boolean b() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final tw1.a b(long j4) {
        long j5 = this.f24651d - 1;
        int i4 = u82.f32873a;
        long max = Math.max(0L, Math.min((this.f24648a.f23836c * j4) / (this.f24649b * 1000000), j5));
        long j6 = (this.f24648a.f23837d * max) + this.f24650c;
        long c4 = c(max);
        vw1 vw1Var = new vw1(c4, j6);
        if (c4 >= j4 || max == this.f24651d - 1) {
            return new tw1.a(vw1Var, vw1Var);
        }
        long j7 = max + 1;
        return new tw1.a(vw1Var, new vw1(c(j7), (this.f24648a.f23837d * j7) + this.f24650c));
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final long c() {
        return this.f24652e;
    }
}
