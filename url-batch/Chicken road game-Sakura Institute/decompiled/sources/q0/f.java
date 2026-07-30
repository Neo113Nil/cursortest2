package q0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: e, reason: collision with root package name */
    public final q6.c f7400e;

    /* renamed from: f, reason: collision with root package name */
    public int f7401f;

    public f(int i7, l lVar, q6.c cVar) {
        super(i7, lVar);
        this.f7400e = cVar;
        this.f7401f = 1;
    }

    @Override // q0.g
    public final void c() {
        if (this.f7404c) {
            return;
        }
        l();
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
        return this.f7400e;
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
        this.f7401f++;
    }

    @Override // q0.g
    public final void l() {
        int i7 = this.f7401f - 1;
        this.f7401f = i7;
        if (i7 == 0) {
            a();
        }
    }

    @Override // q0.g
    public final void n(u uVar) {
        b1.b bVar = n.f7426a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // q0.g
    public final g t(q6.c cVar) {
        n.d(this);
        return new e(this.f7403b, this.f7402a, n.l(cVar, this.f7400e, true), this);
    }

    @Override // q0.g
    public final void m() {
    }
}
