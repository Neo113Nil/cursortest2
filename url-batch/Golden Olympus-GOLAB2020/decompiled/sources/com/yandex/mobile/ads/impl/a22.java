package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class a22 implements nu0 {

    /* renamed from: b, reason: collision with root package name */
    private final wo f23134b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f23135c;

    /* renamed from: d, reason: collision with root package name */
    private long f23136d;

    /* renamed from: e, reason: collision with root package name */
    private long f23137e;

    /* renamed from: f, reason: collision with root package name */
    private th1 f23138f = th1.f32439e;

    public a22(n32 n32Var) {
        this.f23134b = n32Var;
    }

    public final void a(long j4) {
        this.f23136d = j4;
        if (this.f23135c) {
            this.f23137e = this.f23134b.b();
        }
    }

    public final void b() {
        if (this.f23135c) {
            a(o());
            this.f23135c = false;
        }
    }

    @Override // com.yandex.mobile.ads.impl.nu0
    public final th1 getPlaybackParameters() {
        return this.f23138f;
    }

    @Override // com.yandex.mobile.ads.impl.nu0
    public final long o() {
        long j4 = this.f23136d;
        if (!this.f23135c) {
            return j4;
        }
        long b4 = this.f23134b.b() - this.f23137e;
        th1 th1Var = this.f23138f;
        return (th1Var.f32440b == 1.0f ? u82.a(b4) : th1Var.a(b4)) + j4;
    }

    @Override // com.yandex.mobile.ads.impl.nu0
    public final void a(th1 th1Var) {
        if (this.f23135c) {
            a(o());
        }
        this.f23138f = th1Var;
    }

    public final void a() {
        if (this.f23135c) {
            return;
        }
        this.f23137e = this.f23134b.b();
        this.f23135c = true;
    }
}
