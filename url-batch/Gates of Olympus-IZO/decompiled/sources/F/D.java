package F;

import H2.AbstractC0080b;
import I.C0089d;
import I.C0113p;
import I.InterfaceC0110n0;
import b0.C0288u;
import r.AbstractC0801M;
import r.AbstractC0813j;
import r.AbstractC0818o;
import r.C0797I;
import r.C0802N;
import r0.InterfaceC0827A;
import t0.C0900h;
import t0.C0901i;
import t0.C0906n;
import t0.InterfaceC0902j;

/* loaded from: classes.dex */
public final class D extends Z1.j implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f879e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0797I f880f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Y1.e f881g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Y1.e f882h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f883i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Q.a f884j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f885k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(float f3, C0797I c0797i, Y1.e eVar, Y1.e eVar2, long j3, Q.a aVar, long j4) {
        super(2);
        this.f879e = f3;
        this.f880f = c0797i;
        this.f881g = eVar;
        this.f882h = eVar2;
        this.f883i = j3;
        this.f884j = aVar;
        this.f885k = j4;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        boolean z3;
        C0113p c0113p = (C0113p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0113p.x()) {
            c0113p.L();
        } else {
            U.l k3 = androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.a.f(U.i.f3302a, Float.NaN, this.f879e), this.f880f);
            C c3 = C.f875a;
            int i3 = c0113p.f2306P;
            InterfaceC0110n0 m3 = c0113p.m();
            U.l c4 = U.m.c(c0113p, k3);
            InterfaceC0902j.f7933c.getClass();
            C0906n c0906n = C0901i.f7920b;
            c0113p.U();
            if (c0113p.f2305O) {
                c0113p.l(c0906n);
            } else {
                c0113p.d0();
            }
            C0900h c0900h = C0901i.f7923e;
            C0089d.Q(c0113p, c0900h, c3);
            C0900h c0900h2 = C0901i.f7922d;
            C0089d.Q(c0113p, c0900h2, m3);
            C0900h c0900h3 = C0901i.f7924f;
            if (c0113p.f2305O || !Z1.i.a(c0113p.G(), Integer.valueOf(i3))) {
                AbstractC0080b.p(i3, c0113p, i3, c0900h3);
            }
            C0900h c0900h4 = C0901i.f7921c;
            C0089d.Q(c0113p, c0900h4, c4);
            c0113p.Q(-1293169671);
            U.d dVar = U.a.f3284h;
            Y1.e eVar = this.f881g;
            if (eVar != null) {
                U.l c5 = androidx.compose.ui.layout.a.c("leadingIcon");
                InterfaceC0827A e3 = AbstractC0818o.e(dVar, false);
                int i4 = c0113p.f2306P;
                InterfaceC0110n0 m4 = c0113p.m();
                U.l c6 = U.m.c(c0113p, c5);
                c0113p.U();
                if (c0113p.f2305O) {
                    c0113p.l(c0906n);
                } else {
                    c0113p.d0();
                }
                C0089d.Q(c0113p, c0900h, e3);
                C0089d.Q(c0113p, c0900h2, m4);
                if (c0113p.f2305O || !Z1.i.a(c0113p.G(), Integer.valueOf(i4))) {
                    AbstractC0080b.p(i4, c0113p, i4, c0900h3);
                }
                C0089d.Q(c0113p, c0900h4, c6);
                if (eVar != null) {
                    c0113p.Q(832788565);
                    C0089d.a(P.f1079a.a(new C0288u(this.f883i)), eVar, c0113p, 8);
                    c0113p.p(false);
                } else {
                    c0113p.Q(833040347);
                    c0113p.p(false);
                }
                c0113p.p(true);
            }
            c0113p.p(false);
            U.l m5 = androidx.compose.foundation.layout.a.m(androidx.compose.ui.layout.a.c("label"), I.f970a, 0);
            C0802N a3 = AbstractC0801M.a(AbstractC0813j.f7061a, U.a.f3290n, c0113p, 54);
            int i5 = c0113p.f2306P;
            InterfaceC0110n0 m6 = c0113p.m();
            U.l c7 = U.m.c(c0113p, m5);
            c0113p.U();
            if (c0113p.f2305O) {
                c0113p.l(c0906n);
            } else {
                c0113p.d0();
            }
            C0089d.Q(c0113p, c0900h, a3);
            C0089d.Q(c0113p, c0900h2, m6);
            if (c0113p.f2305O || !Z1.i.a(c0113p.G(), Integer.valueOf(i5))) {
                AbstractC0080b.p(i5, c0113p, i5, c0900h3);
            }
            C0089d.Q(c0113p, c0900h4, c7);
            this.f884j.g(c0113p, 0);
            c0113p.p(true);
            c0113p.Q(-1293135324);
            Y1.e eVar2 = this.f882h;
            if (eVar2 != null) {
                U.l c8 = androidx.compose.ui.layout.a.c("trailingIcon");
                InterfaceC0827A e4 = AbstractC0818o.e(dVar, false);
                int i6 = c0113p.f2306P;
                InterfaceC0110n0 m7 = c0113p.m();
                U.l c9 = U.m.c(c0113p, c8);
                c0113p.U();
                if (c0113p.f2305O) {
                    c0113p.l(c0906n);
                } else {
                    c0113p.d0();
                }
                C0089d.Q(c0113p, c0900h, e4);
                C0089d.Q(c0113p, c0900h2, m7);
                if (c0113p.f2305O || !Z1.i.a(c0113p.G(), Integer.valueOf(i6))) {
                    AbstractC0080b.p(i6, c0113p, i6, c0900h3);
                }
                C0089d.Q(c0113p, c0900h4, c9);
                C0089d.a(P.f1079a.a(new C0288u(this.f885k)), eVar2, c0113p, 8);
                z3 = true;
                c0113p.p(true);
            } else {
                z3 = true;
            }
            c0113p.p(false);
            c0113p.p(z3);
        }
        return L1.z.f2729a;
    }
}
