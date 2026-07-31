package G1;

import B0.C;
import F.A0;
import F.J;
import F.L;
import F.X0;
import F.a1;
import F.b1;
import H2.AbstractC0080b;
import I.C0089d;
import I.C0113p;
import I.InterfaceC0088c0;
import I.InterfaceC0110n0;
import I.Y0;
import L1.z;
import M1.B;
import h1.C0438i;
import r.AbstractC0813j;
import r.AbstractC0818o;
import r.AbstractC0821s;
import r.C0807d;
import r.C0810g;
import r.C0823u;
import r0.InterfaceC0827A;
import t0.C0900h;
import t0.C0901i;
import t0.C0906n;
import t0.InterfaceC0902j;

/* loaded from: classes.dex */
public final class k implements Y1.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1557d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1558e;

    public /* synthetic */ k(int i3, Object obj) {
        this.f1557d = i3;
        this.f1558e = obj;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        U.i iVar = U.i.f3302a;
        z zVar = z.f2729a;
        Object obj3 = this.f1558e;
        switch (this.f1557d) {
            case 0:
                C0113p c0113p = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0113p.x()) {
                    InterfaceC0827A e3 = AbstractC0818o.e(U.a.f3284h, false);
                    int i3 = c0113p.f2306P;
                    InterfaceC0110n0 m3 = c0113p.m();
                    U.l c3 = U.m.c(c0113p, iVar);
                    InterfaceC0902j.f7933c.getClass();
                    C0906n c0906n = C0901i.f7920b;
                    c0113p.U();
                    if (c0113p.f2305O) {
                        c0113p.l(c0906n);
                    } else {
                        c0113p.d0();
                    }
                    C0089d.Q(c0113p, C0901i.f7923e, e3);
                    C0089d.Q(c0113p, C0901i.f7922d, m3);
                    C0900h c0900h = C0901i.f7924f;
                    if (c0113p.f2305O || !Z1.i.a(c0113p.G(), Integer.valueOf(i3))) {
                        AbstractC0080b.p(i3, c0113p, i3, c0900h);
                    }
                    C0089d.Q(c0113p, C0901i.f7921c, c3);
                    B.c(((g) obj3).f1544a.getShape(), androidx.compose.foundation.layout.a.q(iVar, 120), 0L, 0L, 0L, c0113p, 48);
                    c0113p.p(true);
                    break;
                } else {
                    c0113p.L();
                    break;
                }
            case 1:
                C0113p c0113p2 = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0113p2.x()) {
                    U.l l3 = androidx.compose.foundation.layout.a.l(iVar, 14);
                    C0807d c0807d = AbstractC0813j.f7061a;
                    C0823u a3 = AbstractC0821s.a(new C0810g(4), U.a.f3291o, c0113p2, 6);
                    int i4 = c0113p2.f2306P;
                    InterfaceC0110n0 m4 = c0113p2.m();
                    U.l c4 = U.m.c(c0113p2, l3);
                    InterfaceC0902j.f7933c.getClass();
                    C0906n c0906n2 = C0901i.f7920b;
                    c0113p2.U();
                    if (c0113p2.f2305O) {
                        c0113p2.l(c0906n2);
                    } else {
                        c0113p2.d0();
                    }
                    C0089d.Q(c0113p2, C0901i.f7923e, a3);
                    C0089d.Q(c0113p2, C0901i.f7922d, m4);
                    C0900h c0900h2 = C0901i.f7924f;
                    if (c0113p2.f2305O || !Z1.i.a(c0113p2.G(), Integer.valueOf(i4))) {
                        AbstractC0080b.p(i4, c0113p2, i4, c0900h2);
                    }
                    C0089d.Q(c0113p2, C0901i.f7921c, c4);
                    Y0 y02 = b1.f1200a;
                    C c5 = ((a1) c0113p2.k(y02)).f1192i;
                    F0.l lVar = F0.l.f1457i;
                    Y0 y03 = L.f1045a;
                    X0.b("Bench tip", null, ((J) c0113p2.k(y03)).f997f, 0L, null, lVar, null, 0L, null, null, 0L, 0, false, 0, 0, null, c5, c0113p2, 196608, 0, 65498);
                    X0.b((String) obj3, null, ((J) c0113p2.k(y03)).f1006o, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((a1) c0113p2.k(y02)).f1194k, c0113p2, 0, 0, 65530);
                    c0113p2.p(true);
                    break;
                } else {
                    c0113p2.L();
                    break;
                }
                break;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                C0113p c0113p3 = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0113p3.x()) {
                    A0.d((Y1.a) obj3, null, false, null, null, H1.b.f1855a, c0113p3, 196608);
                    break;
                } else {
                    c0113p3.L();
                    break;
                }
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                C0113p c0113p4 = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0113p4.x()) {
                    X0.b(((com.gates.olympus.miruv.data.d) obj3).getLabel(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0113p4, 0, 0, 131070);
                    break;
                } else {
                    c0113p4.L();
                    break;
                }
            default:
                C0113p c0113p5 = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0113p5.x()) {
                    InterfaceC0088c0 interfaceC0088c0 = (InterfaceC0088c0) obj3;
                    String str = "Moves " + ((I1.i) interfaceC0088c0.getValue()).f2471b + "   ·   Pairs " + ((I1.i) interfaceC0088c0.getValue()).f2472c + "/" + ((I1.i) interfaceC0088c0.getValue()).f2473d + "   ·   Best " + ((I1.i) interfaceC0088c0.getValue()).f2476g + "%";
                    C c6 = ((a1) c0113p5.k(b1.f1200a)).f1194k;
                    X0.b(str, androidx.compose.foundation.layout.a.m(iVar, 14, 10), ((J) c0113p5.k(L.f1045a)).f1009s, 0L, null, F0.l.f1456h, null, 0L, null, null, 0L, 0, false, 0, 0, null, c6, c0113p5, 196656, 0, 65496);
                    break;
                } else {
                    c0113p5.L();
                    break;
                }
        }
        return zVar;
    }
}
