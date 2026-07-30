package m;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i extends s0.n implements r1.o, r1.c1 {

    /* renamed from: s, reason: collision with root package name */
    public long f6173s;

    /* renamed from: t, reason: collision with root package name */
    public z0.p0 f6174t;

    /* renamed from: u, reason: collision with root package name */
    public long f6175u;

    /* renamed from: v, reason: collision with root package name */
    public m2.k f6176v;

    /* renamed from: w, reason: collision with root package name */
    public z0.j0 f6177w;

    /* renamed from: x, reason: collision with root package name */
    public z0.p0 f6178x;

    @Override // r1.c1
    public final void I() {
        this.f6175u = 9205357640488583168L;
        this.f6176v = null;
        this.f6177w = null;
        this.f6178x = null;
        r1.f.m(this);
    }

    @Override // r1.o
    public final void c(r1.f0 f0Var) {
        r1.f0 f0Var2;
        b1.c cVar = f0Var.f7767f;
        if (this.f6174t != z0.l0.f10006a) {
            f0Var2 = f0Var;
            r6.v vVar = new r6.v();
            if (y0.f.a(cVar.d(), this.f6175u) && f0Var2.getLayoutDirection() == this.f6176v && r6.k.a(this.f6178x, this.f6174t)) {
                z0.j0 j0Var = this.f6177w;
                r6.k.c(j0Var);
                vVar.f7968f = j0Var;
            } else {
                r1.f.q(this, new h(vVar, this, f0Var2, 0));
            }
            this.f6177w = (z0.j0) vVar.f7968f;
            this.f6175u = cVar.d();
            this.f6176v = f0Var2.getLayoutDirection();
            this.f6178x = this.f6174t;
            Object obj = vVar.f7968f;
            r6.k.c(obj);
            z0.j0 j0Var2 = (z0.j0) obj;
            if (!z0.u.c(this.f6173s, z0.u.f10057g)) {
                z0.l0.m(f0Var2, j0Var2, this.f6173s);
            }
        } else if (z0.u.c(this.f6173s, z0.u.f10057g)) {
            f0Var2 = f0Var;
        } else {
            f0Var2 = f0Var;
            b1.e.t(f0Var2, this.f6173s, 0L, 0L, 126);
        }
        f0Var2.b();
    }
}
