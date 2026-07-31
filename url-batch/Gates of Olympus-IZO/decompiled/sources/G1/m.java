package G1;

import B0.C;
import F.J;
import F.L;
import F.X0;
import F.a1;
import F.b1;
import H1.v;
import H2.AbstractC0080b;
import I.C0089d;
import I.C0113p;
import I.InterfaceC0088c0;
import I.InterfaceC0110n0;
import I.Y0;
import L1.z;
import M1.B;
import r.AbstractC0801M;
import r.AbstractC0813j;
import r.AbstractC0821s;
import r.C0802N;
import r.C0803O;
import r.C0807d;
import r.C0810g;
import r.C0823u;
import s.C0860c;
import t0.C0900h;
import t0.C0901i;
import t0.C0906n;
import t0.InterfaceC0902j;

/* loaded from: classes.dex */
public final class m implements Y1.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1561d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0088c0 f1562e;

    public /* synthetic */ m(InterfaceC0088c0 interfaceC0088c0, int i3) {
        this.f1561d = i3;
        this.f1562e = interfaceC0088c0;
    }

    @Override // Y1.f
    public final Object f(Object obj, Object obj2, Object obj3) {
        z zVar = z.f2729a;
        InterfaceC0088c0 interfaceC0088c0 = this.f1562e;
        switch (this.f1561d) {
            case 0:
                C0113p c0113p = (C0113p) obj2;
                int intValue = ((Number) obj3).intValue();
                Z1.i.f((C0803O) obj, "$this$Button");
                if ((intValue & 17) != 16 || !c0113p.x()) {
                    X0.b(((n) interfaceC0088c0.getValue()).f1564b + 1 >= ((n) interfaceC0088c0.getValue()).f1563a.size() ? "See result" : "Next question", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0113p, 0, 0, 131070);
                    break;
                } else {
                    c0113p.L();
                    break;
                }
            case 1:
                C0113p c0113p2 = (C0113p) obj2;
                int intValue2 = ((Number) obj3).intValue();
                Z1.i.f((C0860c) obj, "$this$item");
                if ((intValue2 & 17) != 16 || !c0113p2.x()) {
                    U.i iVar = U.i.f3302a;
                    C0823u a3 = AbstractC0821s.a(AbstractC0813j.f7063c, U.a.f3291o, c0113p2, 0);
                    int i3 = c0113p2.f2306P;
                    InterfaceC0110n0 m3 = c0113p2.m();
                    U.l c3 = U.m.c(c0113p2, iVar);
                    InterfaceC0902j.f7933c.getClass();
                    C0906n c0906n = C0901i.f7920b;
                    c0113p2.U();
                    if (c0113p2.f2305O) {
                        c0113p2.l(c0906n);
                    } else {
                        c0113p2.d0();
                    }
                    C0089d.Q(c0113p2, C0901i.f7923e, a3);
                    C0089d.Q(c0113p2, C0901i.f7922d, m3);
                    C0900h c0900h = C0901i.f7924f;
                    if (c0113p2.f2305O || !Z1.i.a(c0113p2.G(), Integer.valueOf(i3))) {
                        AbstractC0080b.p(i3, c0113p2, i3, c0900h);
                    }
                    C0089d.Q(c0113p2, C0901i.f7921c, c3);
                    Y0 y02 = b1.f1200a;
                    C c4 = ((a1) c0113p2.k(y02)).f1189f;
                    F0.l lVar = F0.l.f1457i;
                    Y0 y03 = L.f1045a;
                    X0.b("Joinery Library", null, ((J) c0113p2.k(y03)).f1006o, 0L, null, lVar, null, 0L, null, null, 0L, 0, false, 0, 0, null, c4, c0113p2, 196614, 0, 65498);
                    X0.b(((v) interfaceC0088c0.getValue()).f1910a.size() + " wood joining systems to explore", androidx.compose.foundation.layout.a.p(iVar, 0.0f, 2, 0.0f, 4, 5), ((J) c0113p2.k(y03)).f1009s, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((a1) c0113p2.k(y02)).f1194k, c0113p2, 48, 0, 65528);
                    c0113p2.p(true);
                    break;
                } else {
                    c0113p2.L();
                    break;
                }
                break;
            default:
                C0113p c0113p3 = (C0113p) obj2;
                int intValue3 = ((Number) obj3).intValue();
                Z1.i.f((C0860c) obj, "$this$item");
                if ((intValue3 & 17) != 16 || !c0113p3.x()) {
                    C0807d c0807d = AbstractC0813j.f7061a;
                    C0810g c0810g = new C0810g(12);
                    U.i iVar2 = U.i.f3302a;
                    C0802N a4 = AbstractC0801M.a(c0810g, U.a.f3289m, c0113p3, 6);
                    int i4 = c0113p3.f2306P;
                    InterfaceC0110n0 m4 = c0113p3.m();
                    U.l c5 = U.m.c(c0113p3, iVar2);
                    InterfaceC0902j.f7933c.getClass();
                    C0906n c0906n2 = C0901i.f7920b;
                    c0113p3.U();
                    if (c0113p3.f2305O) {
                        c0113p3.l(c0906n2);
                    } else {
                        c0113p3.d0();
                    }
                    C0089d.Q(c0113p3, C0901i.f7923e, a4);
                    C0089d.Q(c0113p3, C0901i.f7922d, m4);
                    C0900h c0900h2 = C0901i.f7924f;
                    if (c0113p3.f2305O || !Z1.i.a(c0113p3.G(), Integer.valueOf(i4))) {
                        AbstractC0080b.p(i4, c0113p3, i4, c0900h2);
                    }
                    C0089d.Q(c0113p3, C0901i.f7921c, c5);
                    C0803O c0803o = C0803O.f7016a;
                    com.gates.olympus.miruv.data.a aVar = ((J1.f) interfaceC0088c0.getValue()).f2602b;
                    String i5 = AbstractC0080b.i("Best ", aVar != null ? aVar.getBestScore() : 0, "/8");
                    com.gates.olympus.miruv.data.a aVar2 = ((J1.f) interfaceC0088c0.getValue()).f2602b;
                    B.i("Guess", i5, (aVar2 != null ? aVar2.getPlays() : 0) + " played", C0803O.a(c0803o, iVar2), c0113p3, 6);
                    com.gates.olympus.miruv.data.a aVar3 = ((J1.f) interfaceC0088c0.getValue()).f2603c;
                    String i6 = AbstractC0080b.i("Best ", aVar3 != null ? aVar3.getBestScore() : 0, "%");
                    com.gates.olympus.miruv.data.a aVar4 = ((J1.f) interfaceC0088c0.getValue()).f2603c;
                    B.i("Match", i6, (aVar4 != null ? aVar4.getPlays() : 0) + " played", C0803O.a(c0803o, iVar2), c0113p3, 6);
                    c0113p3.p(true);
                    break;
                } else {
                    c0113p3.L();
                    break;
                }
                break;
        }
        return zVar;
    }
}
