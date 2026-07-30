package d0;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a1 extends r6.l implements q6.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1818g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b1 f1819h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(b1 b1Var, int i7) {
        super(0);
        this.f1818g = i7;
        this.f1819h = b1Var;
    }

    @Override // q6.a
    public final Object a() {
        int i7 = this.f1818g;
        b1 b1Var = this.f1819h;
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return d3.f1911a;
            default:
                if (((c3) r1.f.i(b1Var, e3.f1940b)) == null) {
                    c0.q qVar = b1Var.f1855y;
                    if (qVar != null) {
                        b1Var.B0(qVar);
                    }
                } else if (b1Var.f1855y == null) {
                    z0 z0Var = new z0(b1Var);
                    a1 a1Var = new a1(b1Var, 0);
                    p.i iVar = b1Var.f1851u;
                    boolean z8 = b1Var.f1852v;
                    float f9 = b1Var.f1853w;
                    l.v1 v1Var = c0.p.f1494a;
                    c0.q cVar = c0.u.f1507a ? new c0.c(iVar, z8, f9, z0Var, a1Var) : new c0.b(iVar, z8, f9, z0Var, a1Var);
                    b1Var.A0(cVar);
                    b1Var.f1855y = cVar;
                }
                return d6.z.f2639a;
        }
    }
}
