package w0;

import r.s1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: e, reason: collision with root package name */
    public final p6.c f7514e;

    /* renamed from: f, reason: collision with root package name */
    public int f7515f;

    public e(long j7, k kVar, p6.c cVar) {
        super(j7, kVar);
        this.f7514e = cVar;
        this.f7515f = 1;
    }

    @Override // w0.f
    public final void c() {
        if (this.f7518c) {
            return;
        }
        l();
        this.f7518c = true;
        synchronized (m.f7537c) {
            o();
        }
    }

    @Override // w0.f
    public final p6.c e() {
        return this.f7514e;
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
        this.f7515f++;
    }

    @Override // w0.f
    public final void l() {
        int i = this.f7515f - 1;
        this.f7515f = i;
        if (i == 0) {
            a();
        }
    }

    @Override // w0.f
    public final void n(u uVar) {
        s1 s1Var = m.f7535a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // w0.f
    public final f u(p6.c cVar) {
        m.d(this);
        return new d(this.f7517b, this.f7516a, m.l(cVar, this.f7514e, true), this);
    }

    @Override // w0.f
    public final void m() {
    }
}
