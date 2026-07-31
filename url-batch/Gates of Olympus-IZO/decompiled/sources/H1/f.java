package H1;

import F.X0;
import H2.AbstractC0080b;
import I.C0089d;
import I.C0113p;
import I.InterfaceC0110n0;
import L1.z;
import M1.B;
import h1.C0438i;
import r.AbstractC0818o;
import r0.InterfaceC0827A;
import t0.C0900h;
import t0.C0901i;
import t0.C0906n;
import t0.InterfaceC0902j;

/* loaded from: classes.dex */
public final class f implements Y1.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1865d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.gates.olympus.miruv.data.b f1866e;

    public /* synthetic */ f(com.gates.olympus.miruv.data.b bVar, int i3) {
        this.f1865d = i3;
        this.f1866e = bVar;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        String str;
        switch (this.f1865d) {
            case 0:
                C0113p c0113p = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0113p.x()) {
                    c0113p.L();
                } else {
                    com.gates.olympus.miruv.data.b bVar = this.f1866e;
                    if (bVar == null || (str = bVar.getName()) == null) {
                        str = "Joint";
                    }
                    X0.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0113p, 0, 0, 131070);
                }
                break;
            case 1:
                C0113p c0113p2 = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0113p2.x()) {
                    c0113p2.L();
                } else {
                    U.d dVar = U.a.f3284h;
                    U.i iVar = U.i.f3302a;
                    InterfaceC0827A e3 = AbstractC0818o.e(dVar, false);
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
                    C0089d.Q(c0113p2, C0901i.f7923e, e3);
                    C0089d.Q(c0113p2, C0901i.f7922d, m3);
                    C0900h c0900h = C0901i.f7924f;
                    if (c0113p2.f2305O || !Z1.i.a(c0113p2.G(), Integer.valueOf(i3))) {
                        AbstractC0080b.p(i3, c0113p2, i3, c0900h);
                    }
                    C0089d.Q(c0113p2, C0901i.f7921c, c3);
                    B.c(this.f1866e.getShape(), androidx.compose.foundation.layout.a.q(iVar, 120), 0L, 0L, 0L, c0113p2, 48);
                    c0113p2.p(true);
                }
                break;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                C0113p c0113p3 = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0113p3.x()) {
                    c0113p3.L();
                } else {
                    U.d dVar2 = U.a.f3284h;
                    U.i iVar2 = U.i.f3302a;
                    InterfaceC0827A e4 = AbstractC0818o.e(dVar2, false);
                    int i4 = c0113p3.f2306P;
                    InterfaceC0110n0 m4 = c0113p3.m();
                    U.l c4 = U.m.c(c0113p3, iVar2);
                    InterfaceC0902j.f7933c.getClass();
                    C0906n c0906n2 = C0901i.f7920b;
                    c0113p3.U();
                    if (c0113p3.f2305O) {
                        c0113p3.l(c0906n2);
                    } else {
                        c0113p3.d0();
                    }
                    C0089d.Q(c0113p3, C0901i.f7923e, e4);
                    C0089d.Q(c0113p3, C0901i.f7922d, m4);
                    C0900h c0900h2 = C0901i.f7924f;
                    if (c0113p3.f2305O || !Z1.i.a(c0113p3.G(), Integer.valueOf(i4))) {
                        AbstractC0080b.p(i4, c0113p3, i4, c0900h2);
                    }
                    C0089d.Q(c0113p3, C0901i.f7921c, c4);
                    B.c(this.f1866e.getShape(), androidx.compose.foundation.layout.a.q(iVar2, 48), 0L, 0L, 0L, c0113p3, 48);
                    c0113p3.p(true);
                }
                break;
            default:
                C0113p c0113p4 = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0113p4.x()) {
                    c0113p4.L();
                } else {
                    U.d dVar3 = U.a.f3284h;
                    U.i iVar3 = U.i.f3302a;
                    InterfaceC0827A e5 = AbstractC0818o.e(dVar3, false);
                    int i5 = c0113p4.f2306P;
                    InterfaceC0110n0 m5 = c0113p4.m();
                    U.l c5 = U.m.c(c0113p4, iVar3);
                    InterfaceC0902j.f7933c.getClass();
                    C0906n c0906n3 = C0901i.f7920b;
                    c0113p4.U();
                    if (c0113p4.f2305O) {
                        c0113p4.l(c0906n3);
                    } else {
                        c0113p4.d0();
                    }
                    C0089d.Q(c0113p4, C0901i.f7923e, e5);
                    C0089d.Q(c0113p4, C0901i.f7922d, m5);
                    C0900h c0900h3 = C0901i.f7924f;
                    if (c0113p4.f2305O || !Z1.i.a(c0113p4.G(), Integer.valueOf(i5))) {
                        AbstractC0080b.p(i5, c0113p4, i5, c0900h3);
                    }
                    C0089d.Q(c0113p4, C0901i.f7921c, c5);
                    B.c(this.f1866e.getShape(), androidx.compose.foundation.layout.a.q(iVar3, 38), 0L, 0L, 0L, c0113p4, 48);
                    c0113p4.p(true);
                }
                break;
        }
        return z.f2729a;
    }
}
