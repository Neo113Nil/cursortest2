package H1;

import F.A0;
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
import e2.AbstractC0381e;
import r.AbstractC0801M;
import r.AbstractC0813j;
import r.AbstractC0821s;
import r.C0802N;
import r.C0803O;
import r.C0823u;
import r.C0824v;
import t0.C0900h;
import t0.C0901i;
import t0.C0906n;
import t0.InterfaceC0902j;
import x.C1050d;

/* loaded from: classes.dex */
public final class h implements Y1.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1869d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.gates.olympus.miruv.data.b f1870e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f1871f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1872g;

    public h(Y1.a aVar, com.gates.olympus.miruv.data.b bVar, boolean z3) {
        this.f1872g = aVar;
        this.f1870e = bVar;
        this.f1871f = z3;
    }

    @Override // Y1.f
    public final Object f(Object obj, Object obj2, Object obj3) {
        switch (this.f1869d) {
            case 0:
                C0113p c0113p = (C0113p) obj2;
                int intValue = ((Number) obj3).intValue();
                Z1.i.f((C0803O) obj, "$this$CenterAlignedTopAppBar");
                if ((intValue & 17) == 16 && c0113p.x()) {
                    c0113p.L();
                } else {
                    com.gates.olympus.miruv.data.b bVar = this.f1870e;
                    if (bVar != null) {
                        c0113p.Q(2058047737);
                        y yVar = (y) this.f1872g;
                        boolean h3 = c0113p.h(yVar) | c0113p.f(bVar);
                        Object G3 = c0113p.G();
                        if (h3 || G3 == C0105l.f2272a) {
                            G3 = new E1.a(yVar, 2, bVar);
                            c0113p.a0(G3);
                        }
                        c0113p.p(false);
                        A0.d((Y1.a) G3, null, false, null, null, Q.f.b(2021957496, new g(0, this.f1871f), c0113p), c0113p, 196608);
                    }
                }
                break;
            default:
                C0113p c0113p2 = (C0113p) obj2;
                int intValue2 = ((Number) obj3).intValue();
                Z1.i.f((C0824v) obj, "$this$Card");
                if ((intValue2 & 17) == 16 && c0113p2.x()) {
                    c0113p2.L();
                } else {
                    U.i iVar = U.i.f3302a;
                    U.l l3 = androidx.compose.foundation.layout.a.l(iVar, 12);
                    C0802N a3 = AbstractC0801M.a(AbstractC0813j.f7061a, U.a.f3290n, c0113p2, 48);
                    int i3 = c0113p2.f2306P;
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
                    if (c0113p2.f2305O || !Z1.i.a(c0113p2.G(), Integer.valueOf(i3))) {
                        AbstractC0080b.p(i3, c0113p2, i3, c0900h3);
                    }
                    C0900h c0900h4 = C0901i.f7921c;
                    C0089d.Q(c0113p2, c0900h4, c3);
                    C0803O c0803o = C0803O.f7016a;
                    Y0 y02 = L.f1045a;
                    long j3 = ((J) c0113p2.k(y02)).f994c;
                    float f3 = 14;
                    C1050d a4 = x.e.a(f3);
                    U.l q2 = androidx.compose.foundation.layout.a.q(iVar, 64);
                    com.gates.olympus.miruv.data.b bVar2 = this.f1870e;
                    U0.a(q2, a4, j3, 0L, 0.0f, 0.0f, null, Q.f.b(-1759577327, new f(bVar2, 2), c0113p2), c0113p2, 12582918, 120);
                    AbstractC0381e.h(c0113p2, androidx.compose.foundation.layout.a.s(f3));
                    U.l a5 = C0803O.a(c0803o, iVar);
                    C0823u a6 = AbstractC0821s.a(AbstractC0813j.f7063c, U.a.f3291o, c0113p2, 0);
                    int i4 = c0113p2.f2306P;
                    InterfaceC0110n0 m4 = c0113p2.m();
                    U.l c4 = U.m.c(c0113p2, a5);
                    c0113p2.U();
                    if (c0113p2.f2305O) {
                        c0113p2.l(c0906n);
                    } else {
                        c0113p2.d0();
                    }
                    C0089d.Q(c0113p2, c0900h, a6);
                    C0089d.Q(c0113p2, c0900h2, m4);
                    if (c0113p2.f2305O || !Z1.i.a(c0113p2.G(), Integer.valueOf(i4))) {
                        AbstractC0080b.p(i4, c0113p2, i4, c0900h3);
                    }
                    C0089d.Q(c0113p2, c0900h4, c4);
                    String name = bVar2.getName();
                    Y0 y03 = b1.f1200a;
                    X0.b(name, null, ((J) c0113p2.k(y02)).f1007q, 0L, null, F0.l.f1456h, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((a1) c0113p2.k(y03)).f1191h, c0113p2, 196608, 0, 65498);
                    X0.b(bVar2.getFamily().getLabel(), null, ((J) c0113p2.k(y02)).f997f, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((a1) c0113p2.k(y03)).f1197n, c0113p2, 0, 0, 65530);
                    AbstractC0381e.h(c0113p2, androidx.compose.foundation.layout.a.i(iVar, 6));
                    I2.d.g("Strength", bVar2.getStrength(), 0, 0L, null, c0113p2, 6, 28);
                    c0113p2.p(true);
                    A0.d((Y1.a) this.f1872g, null, false, null, null, Q.f.b(-341580333, new g(1, this.f1871f), c0113p2), c0113p2, 196608);
                    c0113p2.p(true);
                }
                break;
        }
        return z.f2729a;
    }

    public h(com.gates.olympus.miruv.data.b bVar, y yVar, boolean z3) {
        this.f1870e = bVar;
        this.f1872g = yVar;
        this.f1871f = z3;
    }
}
