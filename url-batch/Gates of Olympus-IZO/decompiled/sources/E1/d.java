package E1;

import F.A0;
import F.AbstractC0062r0;
import F.C0043h0;
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
import I.InterfaceC0088c0;
import I.InterfaceC0110n0;
import I.Y0;
import L1.z;
import b0.C0288u;
import e2.AbstractC0381e;
import java.util.Iterator;
import java.util.List;
import q1.C0775D;
import q1.C0784h;
import q1.w;
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

/* loaded from: classes.dex */
public final class d implements Y1.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f741d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f742e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f743f;

    public /* synthetic */ d(Object obj, int i3, Object obj2) {
        this.f741d = i3;
        this.f742e = obj;
        this.f743f = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0327  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v3 */
    @Override // Y1.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Object obj, Object obj2, Object obj3) {
        boolean z3;
        boolean h3;
        ?? r14;
        Object obj4;
        long j3;
        long j4;
        long j5;
        long j6;
        C0043h0 c0043h0;
        Y1.a aVar;
        Q.a aVar2;
        long j7;
        z zVar = z.f2729a;
        Object obj5 = this.f742e;
        Object obj6 = this.f743f;
        switch (this.f741d) {
            case 0:
                C0803O c0803o = (C0803O) obj;
                C0113p c0113p = (C0113p) obj2;
                int intValue = ((Number) obj3).intValue();
                Z1.i.f(c0803o, "$this$NavigationBar");
                if ((intValue & 6) == 0) {
                    intValue |= c0113p.f(c0803o) ? 4 : 2;
                }
                int i3 = intValue;
                if ((i3 & 19) == 18 && c0113p.x()) {
                    c0113p.L();
                } else {
                    List list = j.f765a;
                    C0784h c0784h = (C0784h) ((InterfaceC0088c0) obj5).getValue();
                    w wVar = c0784h != null ? c0784h.f6895e : null;
                    C0113p c0113p2 = c0113p;
                    for (m mVar : j.f765a) {
                        if (wVar != null) {
                            int i4 = w.f6961l;
                            Iterator it = g2.i.Q(wVar).iterator();
                            while (it.hasNext()) {
                                if (Z1.i.a(((w) it.next()).f6968j, mVar.f769a)) {
                                    z3 = true;
                                    c0113p2.Q(108588124);
                                    C0775D c0775d = (C0775D) obj6;
                                    h3 = c0113p2.h(c0775d) | c0113p2.f(mVar);
                                    Object G3 = c0113p2.G();
                                    if (!h3 || G3 == C0105l.f2272a) {
                                        r14 = 0;
                                        a aVar3 = new a(c0775d, false ? 1 : 0, mVar);
                                        c0113p2.a0(aVar3);
                                        obj4 = aVar3;
                                    } else {
                                        r14 = 0;
                                        obj4 = G3;
                                    }
                                    Y1.a aVar4 = (Y1.a) obj4;
                                    c0113p2.p(r14);
                                    Q.a b2 = Q.f.b(629015803, new c(mVar, r14), c0113p2);
                                    Q.a b3 = Q.f.b(-1690802856, new c(mVar, 1), c0113p2);
                                    Y0 y02 = L.f1045a;
                                    j3 = ((J) c0113p2.k(y02)).f998g;
                                    j4 = ((J) c0113p2.k(y02)).f997f;
                                    z zVar2 = zVar;
                                    j5 = ((J) c0113p2.k(y02)).f997f;
                                    w wVar2 = wVar;
                                    Object obj7 = obj6;
                                    j6 = ((J) c0113p2.k(y02)).f1009s;
                                    long j8 = ((J) c0113p2.k(y02)).f1009s;
                                    long j9 = C0288u.f4296f;
                                    J j10 = (J) c0113p2.k(y02);
                                    C0113p c0113p3 = c0113p2;
                                    c0043h0 = j10.f991Q;
                                    if (c0043h0 != null) {
                                        float f3 = H.h.f1694a;
                                        aVar2 = b2;
                                        long c3 = L.c(j10, 15);
                                        long c4 = L.c(j10, 18);
                                        long c5 = L.c(j10, 32);
                                        int i5 = H.h.f1698e;
                                        long c6 = L.c(j10, i5);
                                        aVar = aVar4;
                                        int i6 = H.h.f1699f;
                                        j7 = j8;
                                        c0043h0 = new C0043h0(c3, c4, c5, c6, L.c(j10, i6), C0288u.b(L.c(j10, i5), 0.38f), C0288u.b(L.c(j10, i6), 0.38f));
                                        j10.f991Q = c0043h0;
                                    } else {
                                        aVar = aVar4;
                                        aVar2 = b2;
                                        j7 = j8;
                                    }
                                    if (j3 == 16) {
                                        j3 = c0043h0.f1253a;
                                    }
                                    long j11 = j3;
                                    if (j5 == 16) {
                                        j5 = c0043h0.f1254b;
                                    }
                                    long j12 = j5;
                                    if (j4 == 16) {
                                        j4 = c0043h0.f1255c;
                                    }
                                    long j13 = j4;
                                    if (j6 == 16) {
                                        j6 = c0043h0.f1256d;
                                    }
                                    long j14 = j6;
                                    long j15 = j7 == 16 ? j7 : c0043h0.f1257e;
                                    long j16 = j9 == 16 ? j9 : c0043h0.f1258f;
                                    long j17 = j9 == 16 ? j9 : c0043h0.f1259g;
                                    C0113p c0113p4 = c0113p3;
                                    AbstractC0062r0.b(c0803o, z3, aVar, aVar2, null, false, b3, false, new C0043h0(j11, j12, j13, j14, j15, j16, j17), null, c0113p4, (i3 & 14) | 1575936);
                                    wVar = wVar2;
                                    zVar = zVar2;
                                    obj6 = obj7;
                                    c0113p2 = c0113p4;
                                }
                            }
                        }
                        z3 = false;
                        c0113p2.Q(108588124);
                        C0775D c0775d2 = (C0775D) obj6;
                        h3 = c0113p2.h(c0775d2) | c0113p2.f(mVar);
                        Object G32 = c0113p2.G();
                        if (h3) {
                        }
                        r14 = 0;
                        a aVar32 = new a(c0775d2, false ? 1 : 0, mVar);
                        c0113p2.a0(aVar32);
                        obj4 = aVar32;
                        Y1.a aVar42 = (Y1.a) obj4;
                        c0113p2.p(r14);
                        Q.a b22 = Q.f.b(629015803, new c(mVar, r14), c0113p2);
                        Q.a b32 = Q.f.b(-1690802856, new c(mVar, 1), c0113p2);
                        Y0 y022 = L.f1045a;
                        j3 = ((J) c0113p2.k(y022)).f998g;
                        j4 = ((J) c0113p2.k(y022)).f997f;
                        z zVar22 = zVar;
                        j5 = ((J) c0113p2.k(y022)).f997f;
                        w wVar22 = wVar;
                        Object obj72 = obj6;
                        j6 = ((J) c0113p2.k(y022)).f1009s;
                        long j82 = ((J) c0113p2.k(y022)).f1009s;
                        long j92 = C0288u.f4296f;
                        J j102 = (J) c0113p2.k(y022);
                        C0113p c0113p32 = c0113p2;
                        c0043h0 = j102.f991Q;
                        if (c0043h0 != null) {
                        }
                        if (j3 == 16) {
                        }
                        long j112 = j3;
                        if (j5 == 16) {
                        }
                        long j122 = j5;
                        if (j4 == 16) {
                        }
                        long j132 = j4;
                        if (j6 == 16) {
                        }
                        long j142 = j6;
                        if (j7 == 16) {
                        }
                        if (j92 == 16) {
                        }
                        if (j92 == 16) {
                        }
                        C0113p c0113p42 = c0113p32;
                        AbstractC0062r0.b(c0803o, z3, aVar, aVar2, null, false, b32, false, new C0043h0(j112, j122, j132, j142, j15, j16, j17), null, c0113p42, (i3 & 14) | 1575936);
                        wVar = wVar22;
                        zVar = zVar22;
                        obj6 = obj72;
                        c0113p2 = c0113p42;
                    }
                }
                break;
            default:
                C0113p c0113p5 = (C0113p) obj2;
                int intValue2 = ((Number) obj3).intValue();
                Z1.i.f((C0824v) obj, "$this$Card");
                if ((intValue2 & 17) != 16 || !c0113p5.x()) {
                    U.i iVar = U.i.f3302a;
                    U.l l3 = androidx.compose.foundation.layout.a.l(iVar, 10);
                    C0802N a3 = AbstractC0801M.a(AbstractC0813j.f7061a, U.a.f3290n, c0113p5, 48);
                    int i7 = c0113p5.f2306P;
                    InterfaceC0110n0 m3 = c0113p5.m();
                    U.l c7 = U.m.c(c0113p5, l3);
                    InterfaceC0902j.f7933c.getClass();
                    C0906n c0906n = C0901i.f7920b;
                    c0113p5.U();
                    if (c0113p5.f2305O) {
                        c0113p5.l(c0906n);
                    } else {
                        c0113p5.d0();
                    }
                    C0900h c0900h = C0901i.f7923e;
                    C0089d.Q(c0113p5, c0900h, a3);
                    C0900h c0900h2 = C0901i.f7922d;
                    C0089d.Q(c0113p5, c0900h2, m3);
                    C0900h c0900h3 = C0901i.f7924f;
                    if (c0113p5.f2305O || !Z1.i.a(c0113p5.G(), Integer.valueOf(i7))) {
                        AbstractC0080b.p(i7, c0113p5, i7, c0900h3);
                    }
                    C0900h c0900h4 = C0901i.f7921c;
                    C0089d.Q(c0113p5, c0900h4, c7);
                    C0803O c0803o2 = C0803O.f7016a;
                    Y0 y03 = L.f1045a;
                    float f4 = 12;
                    com.gates.olympus.miruv.data.b bVar = (com.gates.olympus.miruv.data.b) obj6;
                    U0.a(androidx.compose.foundation.layout.a.q(iVar, 52), x.e.a(f4), ((J) c0113p5.k(y03)).f994c, 0L, 0.0f, 0.0f, null, Q.f.b(1201027896, new H1.f(bVar, 3), c0113p5), c0113p5, 12582918, 120);
                    AbstractC0381e.h(c0113p5, androidx.compose.foundation.layout.a.s(f4));
                    U.l a4 = C0803O.a(c0803o2, iVar);
                    C0823u a5 = AbstractC0821s.a(AbstractC0813j.f7063c, U.a.f3291o, c0113p5, 0);
                    int i8 = c0113p5.f2306P;
                    InterfaceC0110n0 m4 = c0113p5.m();
                    U.l c8 = U.m.c(c0113p5, a4);
                    c0113p5.U();
                    if (c0113p5.f2305O) {
                        c0113p5.l(c0906n);
                    } else {
                        c0113p5.d0();
                    }
                    C0089d.Q(c0113p5, c0900h, a5);
                    C0089d.Q(c0113p5, c0900h2, m4);
                    if (c0113p5.f2305O || !Z1.i.a(c0113p5.G(), Integer.valueOf(i8))) {
                        AbstractC0080b.p(i8, c0113p5, i8, c0900h3);
                    }
                    C0089d.Q(c0113p5, c0900h4, c8);
                    String name = bVar.getName();
                    Y0 y04 = b1.f1200a;
                    X0.b(name, null, ((J) c0113p5.k(y03)).f1007q, 0L, null, F0.l.f1456h, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((a1) c0113p5.k(y04)).f1191h, c0113p5, 196608, 0, 65498);
                    X0.b(bVar.getFamily().getLabel(), null, ((J) c0113p5.k(y03)).f997f, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((a1) c0113p5.k(y04)).f1197n, c0113p5, 0, 0, 65530);
                    c0113p5.p(true);
                    A0.d((Y1.a) obj5, null, false, null, null, J1.c.f2594e, c0113p5, 196608);
                    c0113p5.p(true);
                    break;
                } else {
                    c0113p5.L();
                    break;
                }
                break;
        }
        return zVar;
    }
}
