package w0;

import r.s1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d extends f {

    /* renamed from: e, reason: collision with root package name */
    public final p6.c f7512e;

    /* renamed from: f, reason: collision with root package name */
    public final f f7513f;

    public d(long j7, k kVar, p6.c cVar, f fVar) {
        super(j7, kVar);
        this.f7512e = cVar;
        this.f7513f = fVar;
        fVar.k();
    }

    @Override // w0.f
    public final void c() {
        f fVar = this.f7513f;
        if (this.f7518c) {
            return;
        }
        if (this.f7517b != fVar.g()) {
            a();
        }
        fVar.l();
        this.f7518c = true;
        synchronized (m.f7537c) {
            o();
        }
    }

    @Override // w0.f
    public final p6.c e() {
        return this.f7512e;
    }

    @Override // w0.f
    public final boolean f() {
        return true;
    }

    @Override // w0.f
    public final p6.c i() {
        return null;
    }

    @Override // w0.f
    public final void k() {
        q.l();
        throw null;
    }

    @Override // w0.f
    public final void l() {
        q.l();
        throw null;
    }

    @Override // w0.f
    public final void n(u uVar) {
        s1 s1Var = m.f7535a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // w0.f
    public final f u(p6.c cVar) {
        return new d(this.f7517b, this.f7516a, m.l(cVar, this.f7512e, true), this.f7513f);
    }

    @Override // w0.f
    public final void m() {
    }
}
