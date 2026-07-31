package G1;

import F.A0;
import F.C0067u;
import F.J;
import F.L;
import F.U0;
import F.X0;
import F.a1;
import F.b1;
import H2.AbstractC0080b;
import I.C0089d;
import I.C0105l;
import I.C0113p;
import I.InterfaceC0110n0;
import I.Y0;
import L1.z;
import a.AbstractC0157a;
import androidx.compose.foundation.layout.FillElement;
import e2.AbstractC0381e;
import n.f0;
import n.k0;
import r.AbstractC0801M;
import r.AbstractC0813j;
import r.AbstractC0818o;
import r.AbstractC0821s;
import r.C0802N;
import r.C0807d;
import r.C0810g;
import r.C0823u;
import r.C0824v;
import r.InterfaceC0796H;
import r0.InterfaceC0827A;
import t0.C0900h;
import t0.C0901i;
import t0.C0906n;
import t0.InterfaceC0902j;
import x.C1050d;

/* loaded from: classes.dex */
public final class l implements Y1.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1559d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.gates.olympus.miruv.data.b f1560e;

    public /* synthetic */ l(com.gates.olympus.miruv.data.b bVar, int i3) {
        this.f1559d = i3;
        this.f1560e = bVar;
    }

    @Override // Y1.f
    public final Object f(Object obj, Object obj2, Object obj3) {
        U.l g3;
        U.l g4;
        U.l g5;
        z zVar = z.f2729a;
        U.i iVar = U.i.f3302a;
        com.gates.olympus.miruv.data.b bVar = this.f1560e;
        int i3 = 1;
        switch (this.f1559d) {
            case 0:
                C0113p c0113p = (C0113p) obj2;
                int intValue = ((Number) obj3).intValue();
                Z1.i.f((C0824v) obj, "$this$Card");
                if ((intValue & 17) != 16 || !c0113p.x()) {
                    X0.b(bVar.getName(), androidx.compose.foundation.layout.a.l(iVar, 16), ((J) c0113p.k(L.f1045a)).f1007q, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((a1) c0113p.k(b1.f1200a)).f1191h, c0113p, 48, 0, 65528);
                    break;
                } else {
                    c0113p.L();
                    break;
                }
            case 1:
                C0113p c0113p2 = (C0113p) obj2;
                int intValue2 = ((Number) obj3).intValue();
                Z1.i.f((C0824v) obj, "$this$Card");
                if ((intValue2 & 17) != 16 || !c0113p2.x()) {
                    U.l l3 = androidx.compose.foundation.layout.a.l(iVar, 16);
                    C0807d c0807d = AbstractC0813j.f7061a;
                    C0823u a3 = AbstractC0821s.a(new C0810g(10), U.a.f3291o, c0113p2, 6);
                    int i4 = c0113p2.f2306P;
                    InterfaceC0110n0 m3 = c0113p2.m();
                    U.l c3 = U.m.c(c0113p2, l3);
                    InterfaceC0902j.f7933c.getClass();
                    C0906n c0906n = C0901i.f7920b;
                    c0113p2.U();
                    if (c0113p2.f2305O) {
                        c0113p2.l(c0906n);
                    } else {
                        c0113p2.d0();
                    }
                    C0900h c0900h = C0901i.f7923e;
                    C0089d.Q(c0113p2, c0900h, a3);
                    C0900h c0900h2 = C0901i.f7922d;
                    C0089d.Q(c0113p2, c0900h2, m3);
                    C0900h c0900h3 = C0901i.f7924f;
                    if (c0113p2.f2305O || !Z1.i.a(c0113p2.G(), Integer.valueOf(i4))) {
                        AbstractC0080b.p(i4, c0113p2, i4, c0900h3);
                    }
                    C0900h c0900h4 = C0901i.f7921c;
                    C0089d.Q(c0113p2, c0900h4, c3);
                    g3 = androidx.compose.foundation.layout.a.g(U.i.f3302a, 1.0f);
                    C0802N a4 = AbstractC0801M.a(new C0810g(24), U.a.f3289m, c0113p2, 6);
                    int i5 = c0113p2.f2306P;
                    InterfaceC0110n0 m4 = c0113p2.m();
                    U.l c4 = U.m.c(c0113p2, g3);
                    c0113p2.U();
                    if (c0113p2.f2305O) {
                        c0113p2.l(c0906n);
                    } else {
                        c0113p2.d0();
                    }
                    C0089d.Q(c0113p2, c0900h, a4);
                    C0089d.Q(c0113p2, c0900h2, m4);
                    if (c0113p2.f2305O || !Z1.i.a(c0113p2.G(), Integer.valueOf(i5))) {
                        AbstractC0080b.p(i5, c0113p2, i5, c0900h3);
                    }
                    C0089d.Q(c0113p2, c0900h4, c4);
                    I2.d.g("Strength", bVar.getStrength(), 0, 0L, null, c0113p2, 6, 28);
                    c0113p2.p(true);
                    I2.d.g("Difficulty", bVar.getDifficulty(), 0, ((J) c0113p2.k(L.f1045a)).f1001j, null, c0113p2, 6, 20);
                    AbstractC0157a.e(bVar.getFamily().getLabel(), c0113p2, 6);
                    c0113p2.p(true);
                    break;
                } else {
                    c0113p2.L();
                    break;
                }
            default:
                InterfaceC0796H interfaceC0796H = (InterfaceC0796H) obj;
                C0113p c0113p3 = (C0113p) obj2;
                int intValue3 = ((Number) obj3).intValue();
                Z1.i.f(interfaceC0796H, "inner");
                if ((intValue3 & 6) == 0) {
                    intValue3 |= c0113p3.f(interfaceC0796H) ? 4 : 2;
                }
                if ((intValue3 & 19) != 18 || !c0113p3.x()) {
                    c0113p3.Q(-586243905);
                    FillElement fillElement = androidx.compose.foundation.layout.a.f3645b;
                    if (bVar != null) {
                        c0113p3.p(false);
                        U.l k3 = androidx.compose.foundation.layout.a.k(fillElement, interfaceC0796H);
                        Object[] objArr = new Object[0];
                        C2.c cVar = k0.f6105i;
                        boolean d3 = c0113p3.d(0);
                        Object G3 = c0113p3.G();
                        if (d3 || G3 == C0105l.f2272a) {
                            G3 = new f0(0);
                            c0113p3.a0(G3);
                        }
                        U.l l4 = androidx.compose.foundation.layout.a.l(k3.e(new U.g(new androidx.compose.foundation.d((k0) I2.d.H(objArr, cVar, (Y1.a) G3, c0113p3, 0, 4), false, null, true))), 16);
                        C0807d c0807d2 = AbstractC0813j.f7061a;
                        C0823u a5 = AbstractC0821s.a(new C0810g(14), U.a.f3291o, c0113p3, 6);
                        int i6 = c0113p3.f2306P;
                        InterfaceC0110n0 m5 = c0113p3.m();
                        U.l c5 = U.m.c(c0113p3, l4);
                        InterfaceC0902j.f7933c.getClass();
                        C0906n c0906n2 = C0901i.f7920b;
                        c0113p3.U();
                        if (c0113p3.f2305O) {
                            c0113p3.l(c0906n2);
                        } else {
                            c0113p3.d0();
                        }
                        C0089d.Q(c0113p3, C0901i.f7923e, a5);
                        C0089d.Q(c0113p3, C0901i.f7922d, m5);
                        C0900h c0900h5 = C0901i.f7924f;
                        if (c0113p3.f2305O || !Z1.i.a(c0113p3.G(), Integer.valueOf(i6))) {
                            AbstractC0080b.p(i6, c0113p3, i6, c0900h5);
                        }
                        C0089d.Q(c0113p3, C0901i.f7921c, c5);
                        Y0 y02 = L.f1045a;
                        long j3 = ((J) c0113p3.k(y02)).f994c;
                        C1050d a6 = x.e.a(20);
                        g4 = androidx.compose.foundation.layout.a.g(U.i.f3302a, 1.0f);
                        U0.a(androidx.compose.foundation.layout.a.i(g4, 180), a6, j3, 0L, 0.0f, 0.0f, null, Q.f.b(-1108577926, new H1.f(bVar, i3), c0113p3), c0113p3, 12582918, 120);
                        X0.b(bVar.getSummary(), null, ((J) c0113p3.k(y02)).f1006o, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((a1) c0113p3.k(b1.f1200a)).f1191h, c0113p3, 0, 0, 65530);
                        C0067u f3 = A0.f(((J) c0113p3.k(y02)).p, c0113p3);
                        g5 = androidx.compose.foundation.layout.a.g(U.i.f3302a, 1.0f);
                        A0.b(g5, null, f3, null, null, Q.f.b(363207811, new l(bVar, i3), c0113p3), c0113p3, 196614);
                        AbstractC0157a.c("About this joint", bVar.getDescription(), c0113p3, 6);
                        AbstractC0157a.c("Where it is used", bVar.getUses(), c0113p3, 6);
                        AbstractC0157a.c("Tools", bVar.getTools(), c0113p3, 6);
                        AbstractC0157a.b(bVar.getTip(), c0113p3, 6);
                        AbstractC0381e.h(c0113p3, androidx.compose.foundation.layout.a.i(iVar, 8));
                        c0113p3.p(true);
                        break;
                    } else {
                        InterfaceC0827A e3 = AbstractC0818o.e(U.a.f3284h, false);
                        int i7 = c0113p3.f2306P;
                        InterfaceC0110n0 m6 = c0113p3.m();
                        U.l c6 = U.m.c(c0113p3, fillElement);
                        InterfaceC0902j.f7933c.getClass();
                        C0906n c0906n3 = C0901i.f7920b;
                        c0113p3.U();
                        if (c0113p3.f2305O) {
                            c0113p3.l(c0906n3);
                        } else {
                            c0113p3.d0();
                        }
                        C0089d.Q(c0113p3, C0901i.f7923e, e3);
                        C0089d.Q(c0113p3, C0901i.f7922d, m6);
                        C0900h c0900h6 = C0901i.f7924f;
                        if (c0113p3.f2305O || !Z1.i.a(c0113p3.G(), Integer.valueOf(i7))) {
                            AbstractC0080b.p(i7, c0113p3, i7, c0900h6);
                        }
                        C0089d.Q(c0113p3, C0901i.f7921c, c6);
                        X0.b("Joint not found", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0113p3, 6, 0, 131070);
                        c0113p3.p(true);
                        c0113p3.p(false);
                        break;
                    }
                } else {
                    c0113p3.L();
                    break;
                }
                break;
        }
        return zVar;
    }
}
