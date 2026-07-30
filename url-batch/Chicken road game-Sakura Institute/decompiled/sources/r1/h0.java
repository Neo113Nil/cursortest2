package r1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h0 extends r6.l implements q6.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l0 f7777g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g1 f7778h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f7779i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(l0 l0Var, g1 g1Var, long j8) {
        super(0);
        this.f7777g = l0Var;
        this.f7778h = g1Var;
        this.f7779i = j8;
    }

    @Override // q6.a
    public final Object a() {
        p0 K0;
        l0 l0Var = this.f7777g;
        p1.m0 m0Var = null;
        if (f.p(l0Var.f7831a)) {
            a1 a1Var = l0Var.a().f7702s;
            if (a1Var != null) {
                m0Var = a1Var.f7866n;
            }
        } else {
            a1 a1Var2 = l0Var.a().f7702s;
            if (a1Var2 != null && (K0 = a1Var2.K0()) != null) {
                m0Var = K0.f7866n;
            }
        }
        if (m0Var == null) {
            m0Var = ((s1.r) this.f7778h).getPlacementScope();
        }
        p0 K02 = l0Var.a().K0();
        r6.k.c(K02);
        p1.m0.e(m0Var, K02, this.f7779i);
        return d6.z.f2639a;
    }
}
