package O1;

import F.Z0;
import I.C0143d;
import I.C0159l;
import I.C0167p;
import I.InterfaceC0142c0;
import I.InterfaceC0164n0;
import I.W;
import e2.InterfaceC0422a;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import java.util.List;
import r.AbstractC0864k;
import r.AbstractC0868o;
import r.AbstractC0871s;
import r.C0855b;
import r.C0861h;
import r.C0873u;
import r0.InterfaceC0885G;
import t0.C0995h;
import t0.C0996i;
import t0.C1001n;
import t0.InterfaceC0997j;
import x.P;

/* loaded from: classes.dex */
public final class D implements InterfaceC0426e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142c0 f3766d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142c0 f3767e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f3768f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142c0 f3769g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142c0 f3770h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142c0 f3771i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142c0 f3772j;

    public D(InterfaceC0142c0 interfaceC0142c0, InterfaceC0142c0 interfaceC0142c02, List list, InterfaceC0142c0 interfaceC0142c03, InterfaceC0142c0 interfaceC0142c04, InterfaceC0142c0 interfaceC0142c05, InterfaceC0142c0 interfaceC0142c06) {
        this.f3766d = interfaceC0142c0;
        this.f3767e = interfaceC0142c02;
        this.f3768f = list;
        this.f3769g = interfaceC0142c03;
        this.f3770h = interfaceC0142c04;
        this.f3771i = interfaceC0142c05;
        this.f3772j = interfaceC0142c06;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        String str;
        C0167p c0167p = (C0167p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0167p.x()) {
            c0167p.L();
        } else {
            C0855b c0855b = AbstractC0864k.f8051a;
            C0861h c0861h = new C0861h(8);
            U.n nVar = U.n.f4488a;
            C0873u a3 = AbstractC0871s.a(c0861h, c0167p, 6);
            int i3 = c0167p.f2864P;
            InterfaceC0164n0 m3 = c0167p.m();
            U.q d3 = U.a.d(c0167p, nVar);
            InterfaceC0997j.f8759c.getClass();
            C1001n c1001n = C0996i.f8754b;
            c0167p.U();
            if (c0167p.f2863O) {
                c0167p.l(c1001n);
            } else {
                c0167p.d0();
            }
            C0995h c0995h = C0996i.f8757e;
            C0143d.R(c0167p, c0995h, a3);
            C0995h c0995h2 = C0996i.f8756d;
            C0143d.R(c0167p, c0995h2, m3);
            C0995h c0995h3 = C0996i.f8758f;
            if (c0167p.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i3))) {
                A.k.o(i3, c0167p, i3, c0995h3);
            }
            C0995h c0995h4 = C0996i.f8755c;
            C0143d.R(c0167p, c0995h4, d3);
            InterfaceC0885G e3 = AbstractC0868o.e(U.b.f4461d, false);
            int i4 = c0167p.f2864P;
            InterfaceC0164n0 m4 = c0167p.m();
            U.q d4 = U.a.d(c0167p, nVar);
            c0167p.U();
            if (c0167p.f2863O) {
                c0167p.l(c1001n);
            } else {
                c0167p.d0();
            }
            C0143d.R(c0167p, c0995h, e3);
            C0143d.R(c0167p, c0995h2, m4);
            if (c0167p.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i4))) {
                A.k.o(i4, c0167p, i4, c0995h3);
            }
            C0143d.R(c0167p, c0995h4, d4);
            androidx.compose.foundation.layout.a aVar = androidx.compose.foundation.layout.a.f4827a;
            InterfaceC0142c0 interfaceC0142c0 = this.f3766d;
            J1.a aVar2 = (J1.a) interfaceC0142c0.getValue();
            if (aVar2 == null || (str = aVar2.f3160b) == null) {
                str = "Walk-in";
            }
            U.q c2 = androidx.compose.foundation.layout.c.c(nVar, 1.0f);
            c0167p.Q(-1513628131);
            Object G3 = c0167p.G();
            W w2 = C0159l.f2829a;
            InterfaceC0142c0 interfaceC0142c02 = this.f3767e;
            if (G3 == w2) {
                G3 = new C0209c(interfaceC0142c02, 3);
                c0167p.a0(G3);
            }
            c0167p.p(false);
            U.q d5 = androidx.compose.foundation.a.d(c2, false, null, (InterfaceC0422a) G3, 7);
            c0167p.Q(-1513636788);
            Object G4 = c0167p.G();
            if (G4 == w2) {
                G4 = new A2.i(8);
                c0167p.a0(G4);
            }
            c0167p.p(false);
            Z0.a(str, (InterfaceC0424c) G4, d5, false, true, null, s.f3860g, null, null, s.f3861h, null, null, null, false, null, null, null, false, 0, 0, null, null, null, c0167p, 806906928, 0, 0, 8388000);
            U.q b3 = aVar.b();
            c0167p.Q(-1513622691);
            Object G5 = c0167p.G();
            if (G5 == w2) {
                G5 = new C0209c(interfaceC0142c02, 4);
                c0167p.a0(G5);
            }
            c0167p.p(false);
            AbstractC0868o.a(androidx.compose.foundation.a.d(b3, false, null, (InterfaceC0422a) G5, 7), c0167p, 0);
            boolean booleanValue = ((Boolean) interfaceC0142c02.getValue()).booleanValue();
            c0167p.Q(-1513618978);
            Object G6 = c0167p.G();
            if (G6 == w2) {
                G6 = new C0209c(interfaceC0142c02, 5);
                c0167p.a0(G6);
            }
            c0167p.p(false);
            F.r.a(booleanValue, (InterfaceC0422a) G6, null, 0L, null, null, null, 0L, 0.0f, 0.0f, null, Q.f.b(920818158, new C0211e(this.f3768f, interfaceC0142c0, interfaceC0142c02, 1), c0167p), c0167p, 48, 48);
            c0167p.p(true);
            c0167p.Q(2097084887);
            if (((J1.a) interfaceC0142c0.getValue()) == null) {
                InterfaceC0142c0 interfaceC0142c03 = this.f3769g;
                String str2 = (String) interfaceC0142c03.getValue();
                c0167p.Q(2097089178);
                Object G7 = c0167p.G();
                if (G7 == w2) {
                    G7 = new i(interfaceC0142c03, 3);
                    c0167p.a0(G7);
                }
                c0167p.p(false);
                Z0.a(str2, (InterfaceC0424c) G7, null, false, false, null, s.f3863j, null, null, null, null, null, null, false, null, null, null, true, 0, 0, null, null, null, c0167p, 1572912, 12582912, 0, 8257468);
            }
            c0167p.p(false);
            InterfaceC0142c0 interfaceC0142c04 = this.f3770h;
            String str3 = (String) interfaceC0142c04.getValue();
            c0167p.Q(2097096379);
            Object G8 = c0167p.G();
            if (G8 == w2) {
                G8 = new i(interfaceC0142c04, 4);
                c0167p.a0(G8);
            }
            c0167p.p(false);
            Z0.a(str3, (InterfaceC0424c) G8, null, false, false, null, s.f3864k, null, null, null, null, null, null, false, null, null, null, true, 0, 0, null, null, null, c0167p, 1572912, 12582912, 0, 8257468);
            InterfaceC0142c0 interfaceC0142c05 = this.f3771i;
            String str4 = (String) interfaceC0142c05.getValue();
            P p3 = new P(9, 123);
            c0167p.Q(2097102013);
            Object G9 = c0167p.G();
            if (G9 == w2) {
                G9 = new i(interfaceC0142c05, 5);
                c0167p.a0(G9);
            }
            c0167p.p(false);
            Z0.a(str4, (InterfaceC0424c) G9, null, false, false, null, s.f3865l, null, null, null, null, null, null, false, null, p3, null, true, 0, 0, null, null, null, c0167p, 1572912, 12779520, 0, 8224700);
            InterfaceC0142c0 interfaceC0142c06 = this.f3772j;
            String str5 = (String) interfaceC0142c06.getValue();
            c0167p.Q(2097110968);
            Object G10 = c0167p.G();
            if (G10 == w2) {
                G10 = new i(interfaceC0142c06, 6);
                c0167p.a0(G10);
            }
            c0167p.p(false);
            Z0.a(str5, (InterfaceC0424c) G10, null, false, false, null, s.f3866m, null, null, null, null, null, null, false, null, null, null, false, 0, 0, null, null, null, c0167p, 1572912, 0, 0, 8388540);
            c0167p.p(true);
        }
        return R1.y.f4171a;
    }
}
