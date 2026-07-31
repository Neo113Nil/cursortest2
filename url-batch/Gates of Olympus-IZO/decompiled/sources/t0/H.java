package t0;

import u0.C0997t;

/* loaded from: classes.dex */
public final class H extends Z1.j implements Y1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ L f7751e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g0 f7752f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f7753g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(L l3, g0 g0Var, long j3) {
        super(0);
        this.f7751e = l3;
        this.f7752f = g0Var;
        this.f7753g = j3;
    }

    @Override // Y1.a
    public final Object b() {
        P z02;
        L l3 = this.f7751e;
        r0.G g3 = null;
        if (AbstractC0898f.p(l3.f7797a)) {
            a0 a0Var = l3.a().f7878q;
            if (a0Var != null) {
                g3 = a0Var.f7826l;
            }
        } else {
            a0 a0Var2 = l3.a().f7878q;
            if (a0Var2 != null && (z02 = a0Var2.z0()) != null) {
                g3 = z02.f7826l;
            }
        }
        if (g3 == null) {
            g3 = ((C0997t) this.f7752f).getPlacementScope();
        }
        P z03 = l3.a().z0();
        Z1.i.c(z03);
        r0.G.e(g3, z03, this.f7753g);
        return L1.z.f2729a;
    }
}
