package com.anythink.basead.exoplayer;

/* loaded from: classes.dex */
final class e implements com.anythink.basead.exoplayer.k.n {

    /* renamed from: a, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.k.z f7042a;

    /* renamed from: b, reason: collision with root package name */
    private final a f7043b;

    /* renamed from: c, reason: collision with root package name */
    private y f7044c;

    /* renamed from: d, reason: collision with root package name */
    private com.anythink.basead.exoplayer.k.n f7045d;

    public interface a {
        void a(v vVar);
    }

    public e(a aVar, com.anythink.basead.exoplayer.k.c cVar) {
        this.f7043b = aVar;
        this.f7042a = new com.anythink.basead.exoplayer.k.z(cVar);
    }

    private void f() {
        this.f7042a.a(this.f7045d.d());
        v e6 = this.f7045d.e();
        if (e6.equals(this.f7042a.e())) {
            return;
        }
        this.f7042a.a(e6);
        this.f7043b.a(e6);
    }

    private boolean g() {
        y yVar = this.f7044c;
        if (yVar == null || yVar.v()) {
            return false;
        }
        return this.f7044c.u() || !this.f7044c.g();
    }

    public final void a() {
        this.f7042a.a();
    }

    public final void b() {
        this.f7042a.b();
    }

    public final long c() {
        if (!g()) {
            return this.f7042a.d();
        }
        f();
        return this.f7045d.d();
    }

    @Override // com.anythink.basead.exoplayer.k.n
    public final long d() {
        return g() ? this.f7045d.d() : this.f7042a.d();
    }

    @Override // com.anythink.basead.exoplayer.k.n
    public final v e() {
        com.anythink.basead.exoplayer.k.n nVar = this.f7045d;
        return nVar != null ? nVar.e() : this.f7042a.e();
    }

    public final void a(long j9) {
        this.f7042a.a(j9);
    }

    public final void b(y yVar) {
        if (yVar == this.f7044c) {
            this.f7045d = null;
            this.f7044c = null;
        }
    }

    public final void a(y yVar) {
        com.anythink.basead.exoplayer.k.n nVar;
        com.anythink.basead.exoplayer.k.n c4 = yVar.c();
        if (c4 == null || c4 == (nVar = this.f7045d)) {
            return;
        }
        if (nVar == null) {
            this.f7045d = c4;
            this.f7044c = yVar;
            c4.a(this.f7042a.e());
            f();
            return;
        }
        throw g.a(new IllegalStateException("Multiple renderer media clocks enabled."));
    }

    @Override // com.anythink.basead.exoplayer.k.n
    public final v a(v vVar) {
        com.anythink.basead.exoplayer.k.n nVar = this.f7045d;
        if (nVar != null) {
            vVar = nVar.a(vVar);
        }
        this.f7042a.a(vVar);
        this.f7043b.a(vVar);
        return vVar;
    }
}
