package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
final class tz implements nu0 {

    /* renamed from: b, reason: collision with root package name */
    private final a22 f32746b;

    /* renamed from: c, reason: collision with root package name */
    private final a f32747c;

    /* renamed from: d, reason: collision with root package name */
    private so1 f32748d;

    /* renamed from: e, reason: collision with root package name */
    private nu0 f32749e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f32750f = true;

    /* renamed from: g, reason: collision with root package name */
    private boolean f32751g;

    public interface a {
    }

    public tz(a aVar, n32 n32Var) {
        this.f32747c = aVar;
        this.f32746b = new a22(n32Var);
    }

    public final void a(so1 so1Var) {
        if (so1Var == this.f32748d) {
            this.f32749e = null;
            this.f32748d = null;
            this.f32750f = true;
        }
    }

    public final void b(so1 so1Var) {
        nu0 nu0Var;
        nu0 l4 = so1Var.l();
        if (l4 == null || l4 == (nu0Var = this.f32749e)) {
            return;
        }
        if (nu0Var != null) {
            throw c60.a(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
        this.f32749e = l4;
        this.f32748d = so1Var;
        ((pu0) l4).a(this.f32746b.getPlaybackParameters());
    }

    @Override // com.yandex.mobile.ads.impl.nu0
    public final th1 getPlaybackParameters() {
        nu0 nu0Var = this.f32749e;
        return nu0Var != null ? nu0Var.getPlaybackParameters() : this.f32746b.getPlaybackParameters();
    }

    @Override // com.yandex.mobile.ads.impl.nu0
    public final long o() {
        if (this.f32750f) {
            return this.f32746b.o();
        }
        nu0 nu0Var = this.f32749e;
        nu0Var.getClass();
        return nu0Var.o();
    }

    public final void a(long j4) {
        this.f32746b.a(j4);
    }

    @Override // com.yandex.mobile.ads.impl.nu0
    public final void a(th1 th1Var) {
        nu0 nu0Var = this.f32749e;
        if (nu0Var != null) {
            nu0Var.a(th1Var);
            th1Var = this.f32749e.getPlaybackParameters();
        }
        this.f32746b.a(th1Var);
    }

    public final void b() {
        this.f32751g = false;
        this.f32746b.b();
    }

    public final void a() {
        this.f32751g = true;
        this.f32746b.a();
    }

    public final long a(boolean z4) {
        so1 so1Var = this.f32748d;
        if (so1Var != null && !so1Var.a() && (this.f32748d.d() || (!z4 && !this.f32748d.e()))) {
            nu0 nu0Var = this.f32749e;
            nu0Var.getClass();
            long o4 = nu0Var.o();
            if (this.f32750f) {
                if (o4 < this.f32746b.o()) {
                    this.f32746b.b();
                } else {
                    this.f32750f = false;
                    if (this.f32751g) {
                        this.f32746b.a();
                    }
                }
            }
            this.f32746b.a(o4);
            th1 playbackParameters = nu0Var.getPlaybackParameters();
            if (!playbackParameters.equals(this.f32746b.getPlaybackParameters())) {
                this.f32746b.a(playbackParameters);
                ((j60) this.f32747c).a(playbackParameters);
            }
        } else {
            this.f32750f = true;
            if (this.f32751g) {
                this.f32746b.a();
            }
        }
        return o();
    }
}
