package O1;

import F.Z0;
import I.C0143d;
import I.C0159l;
import I.C0167p;
import I.InterfaceC0142c0;
import I.InterfaceC0164n0;
import I.W;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import r.AbstractC0864k;
import r.AbstractC0871s;
import r.C0855b;
import r.C0861h;
import r.C0873u;
import t0.C0995h;
import t0.C0996i;
import t0.C1001n;
import t0.InterfaceC0997j;

/* loaded from: classes.dex */
public final class j implements InterfaceC0426e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142c0 f3801d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142c0 f3802e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142c0 f3803f;

    public j(InterfaceC0142c0 interfaceC0142c0, InterfaceC0142c0 interfaceC0142c02, InterfaceC0142c0 interfaceC0142c03) {
        this.f3801d = interfaceC0142c0;
        this.f3802e = interfaceC0142c02;
        this.f3803f = interfaceC0142c03;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
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
            C0143d.R(c0167p, C0996i.f8757e, a3);
            C0143d.R(c0167p, C0996i.f8756d, m3);
            C0995h c0995h = C0996i.f8758f;
            if (c0167p.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i3))) {
                A.k.o(i3, c0167p, i3, c0995h);
            }
            C0143d.R(c0167p, C0996i.f8755c, d3);
            InterfaceC0142c0 interfaceC0142c0 = this.f3801d;
            String str = (String) interfaceC0142c0.getValue();
            c0167p.Q(1784026785);
            Object G3 = c0167p.G();
            W w2 = C0159l.f2829a;
            if (G3 == w2) {
                G3 = new i(interfaceC0142c0, 0);
                c0167p.a0(G3);
            }
            c0167p.p(false);
            Z0.a(str, (InterfaceC0424c) G3, null, false, false, null, p.f3847g, null, null, null, null, null, null, false, null, null, null, true, 0, 0, null, null, null, c0167p, 1572912, 12582912, 0, 8257468);
            InterfaceC0142c0 interfaceC0142c02 = this.f3802e;
            String str2 = (String) interfaceC0142c02.getValue();
            c0167p.Q(1784030786);
            Object G4 = c0167p.G();
            if (G4 == w2) {
                G4 = new i(interfaceC0142c02, 1);
                c0167p.a0(G4);
            }
            c0167p.p(false);
            Z0.a(str2, (InterfaceC0424c) G4, null, false, false, null, p.f3848h, null, null, null, null, null, null, false, null, null, null, true, 0, 0, null, null, null, c0167p, 1572912, 12582912, 0, 8257468);
            InterfaceC0142c0 interfaceC0142c03 = this.f3803f;
            String str3 = (String) interfaceC0142c03.getValue();
            c0167p.Q(1784035169);
            Object G5 = c0167p.G();
            if (G5 == w2) {
                G5 = new i(interfaceC0142c03, 2);
                c0167p.a0(G5);
            }
            c0167p.p(false);
            Z0.a(str3, (InterfaceC0424c) G5, null, false, false, null, p.f3849i, null, null, null, null, null, null, false, null, null, null, false, 0, 0, null, null, null, c0167p, 1572912, 0, 0, 8388540);
            c0167p.p(true);
        }
        return R1.y.f4171a;
    }
}
