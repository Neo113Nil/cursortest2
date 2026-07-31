package H1;

import F.I;
import I.C0105l;
import I.C0113p;
import I.InterfaceC0088c0;
import I.X;
import L1.z;
import e2.AbstractC0381e;
import r.AbstractC0813j;
import r.C0807d;
import r.C0810g;
import s.C0860c;

/* loaded from: classes.dex */
public final class p implements Y1.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1891d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0088c0 f1892e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y f1893f;

    public p(y yVar, InterfaceC0088c0 interfaceC0088c0) {
        this.f1893f = yVar;
        this.f1892e = interfaceC0088c0;
    }

    @Override // Y1.f
    public final Object f(Object obj, Object obj2, Object obj3) {
        z zVar = z.f2729a;
        X x3 = C0105l.f2272a;
        y yVar = this.f1893f;
        InterfaceC0088c0 interfaceC0088c0 = this.f1892e;
        switch (this.f1891d) {
            case 0:
                C0113p c0113p = (C0113p) obj2;
                int intValue = ((Number) obj3).intValue();
                Z1.i.f((C0860c) obj, "$this$item");
                if ((intValue & 17) != 16 || !c0113p.x()) {
                    boolean z3 = ((v) interfaceC0088c0.getValue()).f1911b == null;
                    c0113p.Q(336178825);
                    boolean h3 = c0113p.h(yVar);
                    Object G3 = c0113p.G();
                    if (h3 || G3 == x3) {
                        G3 = new D1.g(3, yVar);
                        c0113p.a0(G3);
                    }
                    c0113p.p(false);
                    I.a(z3, (Y1.a) G3, c.f1856a, null, false, null, null, null, null, null, null, null, c0113p, 384, 0);
                    break;
                } else {
                    c0113p.L();
                    break;
                }
                break;
            default:
                C0113p c0113p2 = (C0113p) obj2;
                int intValue2 = ((Number) obj3).intValue();
                Z1.i.f((C0860c) obj, "$this$item");
                if ((intValue2 & 17) != 16 || !c0113p2.x()) {
                    C0807d c0807d = AbstractC0813j.f7061a;
                    C0810g c0810g = new C0810g(8);
                    c0113p2.Q(-1656625201);
                    boolean f3 = c0113p2.f(interfaceC0088c0) | c0113p2.h(yVar);
                    Object G4 = c0113p2.G();
                    if (f3 || G4 == x3) {
                        G4 = new o(yVar, 0, interfaceC0088c0);
                        c0113p2.a0(G4);
                    }
                    c0113p2.p(false);
                    AbstractC0381e.e(null, null, null, false, c0810g, null, null, false, (Y1.c) G4, c0113p2, 24576);
                    break;
                } else {
                    c0113p2.L();
                    break;
                }
                break;
        }
        return zVar;
    }

    public p(InterfaceC0088c0 interfaceC0088c0, y yVar) {
        this.f1892e = interfaceC0088c0;
        this.f1893f = yVar;
    }
}
