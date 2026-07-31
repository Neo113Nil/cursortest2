package B1;

import B0.C;
import D1.s;
import D1.t;
import D1.u;
import D1.v;
import E1.j;
import F.J;
import F.L;
import F.X0;
import F.a1;
import F.b1;
import H2.AbstractC0080b;
import I.C0089d;
import I.C0102j0;
import I.C0105l;
import I.C0113p;
import I.InterfaceC0088c0;
import I.InterfaceC0110n0;
import I.X;
import I.Y0;
import L1.f;
import L1.z;
import U.l;
import U.m;
import Y1.e;
import Z1.i;
import com.gates.olympus.miruv.WorkbenchActivity;
import r.AbstractC0813j;
import r.AbstractC0821s;
import r.C0807d;
import r.C0810g;
import r.C0823u;
import t0.C0900h;
import t0.C0901i;
import t0.C0906n;
import t0.InterfaceC0902j;

/* loaded from: classes.dex */
public final class d implements e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f408d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f409e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f410f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f411g;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i3) {
        this.f408d = i3;
        this.f409e = obj;
        this.f410f = obj2;
        this.f411g = obj3;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        int i3 = 0;
        z zVar = z.f2729a;
        Object obj3 = this.f411g;
        Object obj4 = this.f410f;
        Object obj5 = this.f409e;
        switch (this.f408d) {
            case 0:
                C0113p c0113p = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0113p.x()) {
                    c0113p.L();
                } else {
                    c0113p.Q(-1522272426);
                    Object G3 = c0113p.G();
                    X x3 = C0105l.f2272a;
                    if (G3 == x3) {
                        G3 = C0089d.J(Boolean.FALSE, X.f2228i);
                        c0113p.a0(G3);
                    }
                    InterfaceC0088c0 interfaceC0088c0 = (InterfaceC0088c0) G3;
                    c0113p.p(false);
                    c0113p.Q(-1522270067);
                    Object G4 = c0113p.G();
                    if (G4 == x3) {
                        G4 = new b(interfaceC0088c0, null);
                        c0113p.a0(G4);
                    }
                    c0113p.p(false);
                    C0089d.e(c0113p, (e) G4, zVar);
                    int i4 = WorkbenchActivity.f4422x;
                    v vVar = (v) ((C0102j0) obj3).getValue();
                    if ((vVar instanceof u) || !((Boolean) interfaceC0088c0.getValue()).booleanValue()) {
                        c0113p.Q(54445687);
                        I2.d.f(0, c0113p);
                        c0113p.p(false);
                    } else {
                        c0113p.Q(54516336);
                        if (vVar instanceof t) {
                            c0113p.Q(-1522260568);
                            c0113p.Q(-1522260010);
                            WorkbenchActivity workbenchActivity = (WorkbenchActivity) obj5;
                            boolean f3 = c0113p.f(workbenchActivity) | c0113p.h(vVar);
                            Object G5 = c0113p.G();
                            if (f3 || G5 == x3) {
                                G5 = new c(workbenchActivity, (t) vVar, null);
                                c0113p.a0(G5);
                            }
                            c0113p.p(false);
                            C0089d.e(c0113p, (e) G5, vVar);
                            c0113p.p(false);
                        } else if (i.a(vVar, s.f570a)) {
                            c0113p.Q(-1522253675);
                            j.a((com.gates.olympus.miruv.data.e) obj4, c0113p, 0);
                            c0113p.p(false);
                        } else {
                            if (!i.a(vVar, u.f573a)) {
                                c0113p.Q(-1522262062);
                                c0113p.p(false);
                                throw new f();
                            }
                            c0113p.Q(-1522251261);
                            I2.d.f(0, c0113p);
                            c0113p.p(false);
                        }
                        c0113p.p(false);
                    }
                }
                return zVar;
            case 1:
                C0113p c0113p2 = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0113p2.x()) {
                    c0113p2.L();
                } else {
                    K1.b.a(false, Q.f.b(-1489829089, new d((WorkbenchActivity) obj5, (com.gates.olympus.miruv.data.e) obj4, (C0102j0) obj3, i3), c0113p2), c0113p2, 48);
                }
                return zVar;
            default:
                C0113p c0113p3 = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0113p3.x()) {
                    c0113p3.L();
                } else {
                    l l3 = androidx.compose.foundation.layout.a.l(U.i.f3302a, 14);
                    C0807d c0807d = AbstractC0813j.f7061a;
                    C0823u a3 = AbstractC0821s.a(new C0810g(2), U.a.f3291o, c0113p3, 6);
                    int i5 = c0113p3.f2306P;
                    InterfaceC0110n0 m3 = c0113p3.m();
                    l c3 = m.c(c0113p3, l3);
                    InterfaceC0902j.f7933c.getClass();
                    C0906n c0906n = C0901i.f7920b;
                    c0113p3.U();
                    if (c0113p3.f2305O) {
                        c0113p3.l(c0906n);
                    } else {
                        c0113p3.d0();
                    }
                    C0089d.Q(c0113p3, C0901i.f7923e, a3);
                    C0089d.Q(c0113p3, C0901i.f7922d, m3);
                    C0900h c0900h = C0901i.f7924f;
                    if (c0113p3.f2305O || !i.a(c0113p3.G(), Integer.valueOf(i5))) {
                        AbstractC0080b.p(i5, c0113p3, i5, c0900h);
                    }
                    C0089d.Q(c0113p3, C0901i.f7921c, c3);
                    Y0 y02 = b1.f1200a;
                    C c4 = ((a1) c0113p3.k(y02)).f1196m;
                    Y0 y03 = L.f1045a;
                    long j3 = ((J) c0113p3.k(y03)).f997f;
                    F0.l lVar = F0.l.f1457i;
                    X0.b((String) obj5, null, j3, 0L, null, lVar, null, 0L, null, null, 0L, 0, false, 0, 0, null, c4, c0113p3, 196608, 0, 65498);
                    X0.b((String) obj4, null, ((J) c0113p3.k(y03)).f995d, 0L, null, lVar, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((a1) c0113p3.k(y02)).f1191h, c0113p3, 196608, 0, 65498);
                    X0.b((String) obj3, null, ((J) c0113p3.k(y03)).f995d, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((a1) c0113p3.k(y02)).f1195l, c0113p3, 0, 0, 65530);
                    c0113p3.p(true);
                }
                return zVar;
        }
    }
}
