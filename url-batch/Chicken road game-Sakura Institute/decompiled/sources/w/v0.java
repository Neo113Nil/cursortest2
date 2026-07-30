package w;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class v0 implements o.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o.y0 f9445a;

    /* renamed from: b, reason: collision with root package name */
    public final g0.e0 f9446b;

    /* renamed from: c, reason: collision with root package name */
    public final g0.e0 f9447c;

    public v0(o.y0 y0Var, x0 x0Var) {
        this.f9445a = y0Var;
        this.f9446b = g0.d.C(new u0(x0Var, 1));
        this.f9447c = g0.d.C(new u0(x0Var, 0));
    }

    @Override // o.y0
    public final boolean a() {
        return ((Boolean) this.f9447c.getValue()).booleanValue();
    }

    @Override // o.y0
    public final Object b(m.p0 p0Var, q6.e eVar, j6.c cVar) {
        return this.f9445a.b(p0Var, eVar, cVar);
    }

    @Override // o.y0
    public final boolean c() {
        return this.f9445a.c();
    }

    @Override // o.y0
    public final boolean d() {
        return ((Boolean) this.f9446b.getValue()).booleanValue();
    }

    @Override // o.y0
    public final float e(float f9) {
        return this.f9445a.e(f9);
    }
}
