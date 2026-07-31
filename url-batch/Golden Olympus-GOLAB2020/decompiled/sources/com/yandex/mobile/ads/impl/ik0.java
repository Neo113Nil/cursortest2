package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.tw1;

/* loaded from: classes3.dex */
final class ik0 implements ww1 {

    /* renamed from: a, reason: collision with root package name */
    private final long f27223a;

    /* renamed from: b, reason: collision with root package name */
    private final os0 f27224b;

    /* renamed from: c, reason: collision with root package name */
    private final os0 f27225c;

    /* renamed from: d, reason: collision with root package name */
    private long f27226d;

    public ik0(long j4, long j5, long j6) {
        this.f27226d = j4;
        this.f27223a = j6;
        os0 os0Var = new os0();
        this.f27224b = os0Var;
        os0 os0Var2 = new os0();
        this.f27225c = os0Var2;
        os0Var.a(0L);
        os0Var2.a(j5);
    }

    @Override // com.yandex.mobile.ads.impl.ww1
    public final long a() {
        return this.f27223a;
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final boolean b() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final long c() {
        return this.f27226d;
    }

    final void d(long j4) {
        this.f27226d = j4;
    }

    @Override // com.yandex.mobile.ads.impl.ww1
    public final long a(long j4) {
        return this.f27224b.a(u82.a(this.f27225c, j4));
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final tw1.a b(long j4) {
        int a4 = u82.a(this.f27224b, j4);
        long a5 = this.f27224b.a(a4);
        vw1 vw1Var = new vw1(a5, this.f27225c.a(a4));
        if (a5 == j4 || a4 == this.f27224b.a() - 1) {
            return new tw1.a(vw1Var, vw1Var);
        }
        int i4 = a4 + 1;
        return new tw1.a(vw1Var, new vw1(this.f27224b.a(i4), this.f27225c.a(i4)));
    }

    public final boolean c(long j4) {
        os0 os0Var = this.f27224b;
        return j4 - os0Var.a(os0Var.a() - 1) < 100000;
    }

    public final void a(long j4, long j5) {
        if (c(j4)) {
            return;
        }
        this.f27224b.a(j4);
        this.f27225c.a(j5);
    }
}
