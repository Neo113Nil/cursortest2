package w1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class r0 extends q6.j implements p6.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s0 f7754e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k1 f7755f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f7756g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(s0 s0Var, k1 k1Var, long j7) {
        super(0);
        this.f7754e = s0Var;
        this.f7755f = k1Var;
        this.f7756g = j7;
    }

    @Override // p6.a
    public final Object b() {
        o0 C0;
        j0 j0Var = this.f7754e.i;
        u1.k0 k0Var = null;
        if (f.q(j0Var.f7686a) || j0Var.f7688c) {
            d1 d1Var = j0Var.a().f7616t;
            if (d1Var != null) {
                k0Var = d1Var.f7731o;
            }
        } else {
            d1 d1Var2 = j0Var.a().f7616t;
            if (d1Var2 != null && (C0 = d1Var2.C0()) != null) {
                k0Var = C0.f7731o;
            }
        }
        if (k0Var == null) {
            k0Var = ((x1.t) this.f7755f).getPlacementScope();
        }
        o0 C02 = j0Var.a().C0();
        q6.i.b(C02);
        u1.k0.h(k0Var, C02, this.f7756g);
        return c6.m.f1757a;
    }
}
