package g4;

import com.android.installreferrer.api.InstallReferrerClient;
import d0.d3;
import d0.l1;
import d0.r2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d0 implements q6.e {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4269f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g0.z0 f4270g;

    public /* synthetic */ d0(g0.z0 z0Var, int i7) {
        this.f4269f = i7;
        this.f4270g = z0Var;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f4269f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                g0.p pVar = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && pVar.x()) {
                    pVar.L();
                } else {
                    pVar.Q(251190556);
                    Object G = pVar.G();
                    if (G == g0.l.f3784a) {
                        G = new b0(this.f4270g, 1);
                        pVar.a0(G);
                    }
                    pVar.p(false);
                    l1.a((q6.a) G, null, null, 0L, 0L, null, w.f4427c, pVar, 12582918);
                }
                break;
            case 1:
                g0.p pVar2 = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && pVar2.x()) {
                    pVar2.L();
                } else {
                    pVar2.Q(251264765);
                    Object G2 = pVar2.G();
                    if (G2 == g0.l.f3784a) {
                        G2 = new b0(this.f4270g, 2);
                        pVar2.a0(G2);
                    }
                    pVar2.p(false);
                    d3.e((q6.a) G2, null, false, null, null, null, w.f4431g, pVar2, 805306374, 510);
                }
                break;
            case 2:
                g0.p pVar3 = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && pVar3.x()) {
                    pVar3.L();
                } else {
                    g0.z0 z0Var = this.f4270g;
                    String str = (String) z0Var.getValue();
                    pVar3.Q(251269848);
                    Object G3 = pVar3.G();
                    if (G3 == g0.l.f3784a) {
                        G3 = new m(z0Var, 4);
                        pVar3.a0(G3);
                    }
                    pVar3.p(false);
                    r2.a(str, (q6.c) G3, null, false, null, w.f4433i, null, null, null, true, 0, 0, null, null, pVar3, 1572912, 12582912, 8257468);
                }
                break;
            default:
                g0.p pVar4 = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && pVar4.x()) {
                    pVar4.L();
                } else {
                    pVar4.Q(-908553792);
                    Object G4 = pVar4.G();
                    if (G4 == g0.l.f3784a) {
                        G4 = new b0(this.f4270g, 5);
                        pVar4.a0(G4);
                    }
                    pVar4.p(false);
                    l1.a((q6.a) G4, null, null, 0L, 0L, null, x.f4437c, pVar4, 12582918);
                }
                break;
        }
        return d6.z.f2639a;
    }
}
