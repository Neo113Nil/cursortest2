package m;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class t extends s0.n implements r1.o {

    /* renamed from: s, reason: collision with root package name */
    public final p.i f6256s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f6257t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f6258u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f6259v;

    public t(p.i iVar) {
        this.f6256s = iVar;
    }

    @Override // r1.o
    public final void c(r1.f0 f0Var) {
        f0Var.b();
        b1.c cVar = f0Var.f7767f;
        if (this.f6257t) {
            b1.e.t(f0Var, z0.u.b(z0.u.f10052b, 0.3f), 0L, cVar.d(), 122);
        } else if (this.f6258u || this.f6259v) {
            b1.e.t(f0Var, z0.u.b(z0.u.f10052b, 0.1f), 0L, cVar.d(), 122);
        }
    }

    @Override // s0.n
    public final void s0() {
        c7.a0.p(o0(), null, null, new f4.c(this, null, 5), 3);
    }
}
