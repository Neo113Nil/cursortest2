package g0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f0 implements u1 {

    /* renamed from: f, reason: collision with root package name */
    public final q6.c f3723f;

    /* renamed from: g, reason: collision with root package name */
    public g0 f3724g;

    public f0(q6.c cVar) {
        this.f3723f = cVar;
    }

    @Override // g0.u1
    public final void a() {
        this.f3724g = (g0) this.f3723f.f(d.f3707h);
    }

    @Override // g0.u1
    public final void c() {
        g0 g0Var = this.f3724g;
        if (g0Var != null) {
            g0Var.a();
        }
        this.f3724g = null;
    }

    @Override // g0.u1
    public final void b() {
    }
}
