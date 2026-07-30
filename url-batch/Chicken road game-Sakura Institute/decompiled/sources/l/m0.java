package l;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class m0 extends u1 {

    /* renamed from: b, reason: collision with root package name */
    public final g0.g1 f5570b;

    /* renamed from: c, reason: collision with root package name */
    public final g0.g1 f5571c;

    public m0(Enum r32) {
        super(0);
        g0.t0 t0Var = g0.t0.f3903k;
        this.f5570b = g0.d.J(r32, t0Var);
        this.f5571c = g0.d.J(r32, t0Var);
    }

    @Override // l.u1
    public final Object a() {
        return this.f5570b.getValue();
    }

    @Override // l.u1
    public final Object b() {
        return this.f5571c.getValue();
    }

    @Override // l.u1
    public final void c(Object obj) {
        this.f5570b.setValue(obj);
    }

    @Override // l.u1
    public final void e() {
    }

    @Override // l.u1
    public final void d(p1 p1Var) {
    }
}
