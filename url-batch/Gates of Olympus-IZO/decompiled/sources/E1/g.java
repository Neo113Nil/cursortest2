package E1;

import H1.y;
import I.C0105l;
import I.C0113p;
import L1.z;
import M1.B;
import androidx.lifecycle.V;
import l.C0564i;
import q1.C0775D;
import q1.C0784h;
import r.InterfaceC0796H;

/* loaded from: classes.dex */
public final class g implements Y1.g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f753d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0775D f754e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0796H f755f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ V f756g;

    public /* synthetic */ g(V v3, C0775D c0775d, InterfaceC0796H interfaceC0796H, int i3) {
        this.f753d = i3;
        this.f756g = v3;
        this.f754e = c0775d;
        this.f755f = interfaceC0796H;
    }

    @Override // Y1.g
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f753d) {
            case 0:
                C0113p c0113p = (C0113p) obj3;
                ((Number) obj4).intValue();
                Z1.i.f((C0564i) obj, "$this$composable");
                Z1.i.f((C0784h) obj2, "it");
                c0113p.Q(-953496369);
                C0775D c0775d = this.f754e;
                boolean h3 = c0113p.h(c0775d);
                Object G3 = c0113p.G();
                if (h3 || G3 == C0105l.f2272a) {
                    G3 = new b(c0775d, 1);
                    c0113p.a0(G3);
                }
                c0113p.p(false);
                B.d((y) this.f756g, (Y1.c) G3, this.f755f, c0113p, 0);
                break;
            default:
                C0113p c0113p2 = (C0113p) obj3;
                ((Number) obj4).intValue();
                Z1.i.f((C0564i) obj, "$this$composable");
                Z1.i.f((C0784h) obj2, "it");
                c0113p2.Q(-953480465);
                C0775D c0775d2 = this.f754e;
                boolean h4 = c0113p2.h(c0775d2);
                Object G4 = c0113p2.G();
                if (h4 || G4 == C0105l.f2272a) {
                    G4 = new b(c0775d2, 2);
                    c0113p2.a0(G4);
                }
                c0113p2.p(false);
                B.h((J1.k) this.f756g, (Y1.c) G4, this.f755f, c0113p2, 0);
                break;
        }
        return z.f2729a;
    }
}
