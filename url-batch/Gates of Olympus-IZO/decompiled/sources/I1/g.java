package I1;

import B0.C;
import F.J;
import F.L;
import F.X0;
import F.a1;
import F.b1;
import H2.AbstractC0080b;
import I.C0089d;
import I.C0113p;
import I.InterfaceC0110n0;
import L1.z;
import M1.B;
import androidx.compose.foundation.layout.FillElement;
import r.AbstractC0818o;
import r.C0824v;
import r0.InterfaceC0827A;
import t0.C0900h;
import t0.C0901i;
import t0.C0906n;
import t0.InterfaceC0902j;

/* loaded from: classes.dex */
public final class g implements Y1.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f2466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f2467e;

    public g(boolean z3, c cVar) {
        this.f2466d = z3;
        this.f2467e = cVar;
    }

    @Override // Y1.f
    public final Object f(Object obj, Object obj2, Object obj3) {
        C0113p c0113p;
        C0113p c0113p2 = (C0113p) obj2;
        int intValue = ((Number) obj3).intValue();
        Z1.i.f((C0824v) obj, "$this$Card");
        if ((intValue & 17) == 16 && c0113p2.x()) {
            c0113p2.L();
        } else {
            FillElement fillElement = androidx.compose.foundation.layout.a.f3645b;
            U.l l3 = androidx.compose.foundation.layout.a.l(fillElement, 6);
            InterfaceC0827A e3 = AbstractC0818o.e(U.a.f3284h, false);
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
            C0089d.Q(c0113p2, C0901i.f7923e, e3);
            C0089d.Q(c0113p2, C0901i.f7922d, m3);
            C0900h c0900h = C0901i.f7924f;
            if (c0113p2.f2305O || !Z1.i.a(c0113p2.G(), Integer.valueOf(i3))) {
                AbstractC0080b.p(i3, c0113p2, i3, c0900h);
            }
            C0089d.Q(c0113p2, C0901i.f7921c, c3);
            if (this.f2466d) {
                c0113p = c0113p2;
                c cVar = this.f2467e;
                if (cVar.f2461e) {
                    c0113p.Q(-1351982735);
                    B.c(cVar.f2460d, fillElement, 0L, 0L, 0L, c0113p, 48);
                    c0113p.p(false);
                } else {
                    c0113p.Q(-1351873398);
                    C c4 = ((a1) c0113p.k(b1.f1200a)).f1197n;
                    X0.b(cVar.f2459c, null, ((J) c0113p.k(L.f1045a)).f1007q, 0L, null, F0.l.f1456h, null, 0L, null, new L0.f(3), 0L, 0, false, 0, 0, null, c4, c0113p, 196608, 0, 64986);
                    c0113p.p(false);
                }
            } else {
                c0113p2.Q(-1352220970);
                X0.b("MIRUV", null, ((J) c0113p2.k(L.f1045a)).f993b, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((a1) c0113p2.k(b1.f1200a)).f1198o, c0113p2, 6, 0, 65530);
                c0113p = c0113p2;
                c0113p.p(false);
            }
            c0113p.p(true);
        }
        return z.f2729a;
    }
}
