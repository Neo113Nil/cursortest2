package s;

import com.android.installreferrer.api.InstallReferrerClient;
import g0.d1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a0 extends r6.l implements q6.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7978g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d0 f7979h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(d0 d0Var, int i7) {
        super(0);
        this.f7978g = i7;
        this.f7979h = d0Var;
    }

    @Override // q6.a
    public final Object a() {
        long G;
        switch (this.f7978g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                d0 d0Var = this.f7979h;
                r.s sVar = d0Var.f7992t.f7595a;
                if (sVar.g().f7642n == o.j0.f6657f) {
                    p1.g0 g0Var = sVar.g().f7645q;
                    G = j1.c.G(g0Var.n(), g0Var.f()) & 4294967295L;
                } else {
                    p1.g0 g0Var2 = sVar.g().f7645q;
                    G = j1.c.G(g0Var2.n(), g0Var2.f()) >> 32;
                }
                int i7 = (int) G;
                r.s sVar2 = d0Var.f7992t.f7595a;
                return Float.valueOf(i7 - ((-sVar2.g().f7639k) + sVar2.g().f7643o));
            case 1:
                r.s sVar3 = this.f7979h.f7992t.f7595a;
                return Float.valueOf((((d1) sVar3.f7677d.f1514b).e() * 500) + ((d1) sVar3.f7677d.f1515c).e());
            default:
                r.s sVar4 = this.f7979h.f7992t.f7595a;
                int e9 = ((d1) sVar4.f7677d.f1514b).e();
                int e10 = ((d1) sVar4.f7677d.f1515c).e();
                return Float.valueOf(sVar4.d() ? (e9 * 500) + e10 + 100 : (e9 * 500) + e10);
        }
    }
}
