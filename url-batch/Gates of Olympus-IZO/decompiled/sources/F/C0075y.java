package F;

import H2.AbstractC0080b;
import I.C0089d;
import I.C0113p;
import I.InterfaceC0110n0;
import r.AbstractC0813j;
import r.AbstractC0821s;
import r.C0823u;
import r.C0824v;
import t0.C0900h;
import t0.C0901i;
import t0.C0906n;
import t0.InterfaceC0902j;

/* renamed from: F.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0075y extends Z1.j implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1426e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Q.a f1427f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0075y(Q.a aVar, int i3) {
        super(2);
        this.f1426e = i3;
        this.f1427f = aVar;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f1426e) {
            case 0:
                C0113p c0113p = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0113p.x()) {
                    c0113p.L();
                } else {
                    U.i iVar = U.i.f3302a;
                    C0823u a3 = AbstractC0821s.a(AbstractC0813j.f7063c, U.a.f3291o, c0113p, 0);
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
                    C0089d.Q(c0113p, C0901i.f7923e, a3);
                    C0089d.Q(c0113p, C0901i.f7922d, m3);
                    C0900h c0900h = C0901i.f7924f;
                    if (c0113p.f2305O || !Z1.i.a(c0113p.G(), Integer.valueOf(i3))) {
                        AbstractC0080b.p(i3, c0113p, i3, c0900h);
                    }
                    C0089d.Q(c0113p, C0901i.f7921c, c3);
                    this.f1427f.f(C0824v.f7101a, c0113p, 6);
                    c0113p.p(true);
                }
                break;
            default:
                C0113p c0113p2 = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0113p2.x()) {
                    c0113p2.L();
                } else {
                    U.i iVar2 = U.i.f3302a;
                    C0823u a4 = AbstractC0821s.a(AbstractC0813j.f7063c, U.a.f3291o, c0113p2, 0);
                    int i4 = c0113p2.f2306P;
                    InterfaceC0110n0 m4 = c0113p2.m();
                    U.l c4 = U.m.c(c0113p2, iVar2);
                    InterfaceC0902j.f7933c.getClass();
                    C0906n c0906n2 = C0901i.f7920b;
                    c0113p2.U();
                    if (c0113p2.f2305O) {
                        c0113p2.l(c0906n2);
                    } else {
                        c0113p2.d0();
                    }
                    C0089d.Q(c0113p2, C0901i.f7923e, a4);
                    C0089d.Q(c0113p2, C0901i.f7922d, m4);
                    C0900h c0900h2 = C0901i.f7924f;
                    if (c0113p2.f2305O || !Z1.i.a(c0113p2.G(), Integer.valueOf(i4))) {
                        AbstractC0080b.p(i4, c0113p2, i4, c0900h2);
                    }
                    C0089d.Q(c0113p2, C0901i.f7921c, c4);
                    this.f1427f.f(C0824v.f7101a, c0113p2, 6);
                    c0113p2.p(true);
                }
                break;
        }
        return L1.z.f2729a;
    }
}
