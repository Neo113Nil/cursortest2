package q0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e extends g {

    /* renamed from: e, reason: collision with root package name */
    public final q6.c f7398e;

    /* renamed from: f, reason: collision with root package name */
    public final g f7399f;

    public e(int i7, l lVar, q6.c cVar, g gVar) {
        super(i7, lVar);
        this.f7398e = cVar;
        this.f7399f = gVar;
        gVar.k();
    }

    @Override // q0.g
    public final void c() {
        g gVar = this.f7399f;
        if (this.f7404c) {
            return;
        }
        if (this.f7403b != gVar.d()) {
            a();
        }
        gVar.l();
        this.f7404c = true;
        synchronized (n.f7427b) {
            int i7 = this.f7405d;
            if (i7 >= 0) {
                n.u(i7);
                this.f7405d = -1;
            }
        }
    }

    @Override // q0.g
    public final q6.c f() {
        return this.f7398e;
    }

    @Override // q0.g
    public final boolean g() {
        return true;
    }

    @Override // q0.g
    public final q6.c i() {
        return null;
    }

    @Override // q0.g
    public final void k() {
        r.g();
        throw null;
    }

    @Override // q0.g
    public final void l() {
        r.g();
        throw null;
    }

    @Override // q0.g
    public final void n(u uVar) {
        b1.b bVar = n.f7426a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // q0.g
    public final g t(q6.c cVar) {
        return new e(this.f7403b, this.f7402a, n.l(cVar, this.f7398e, true), this.f7399f);
    }

    @Override // q0.g
    public final void m() {
    }
}
