package H1;

import I.C0105l;
import I.C0113p;
import I.InterfaceC0088c0;
import L1.z;
import M1.B;
import java.util.List;
import s.C0860c;

/* loaded from: classes.dex */
public final class u extends Z1.j implements Y1.g {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f1906e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Y1.c f1907f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y f1908g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0088c0 f1909h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(List list, Y1.c cVar, y yVar, InterfaceC0088c0 interfaceC0088c0) {
        super(4);
        this.f1906e = list;
        this.f1907f = cVar;
        this.f1908g = yVar;
        this.f1909h = interfaceC0088c0;
    }

    @Override // Y1.g
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i3;
        Object obj5 = (C0860c) obj;
        int intValue = ((Number) obj2).intValue();
        C0113p c0113p = (C0113p) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i3 = (c0113p.f(obj5) ? 4 : 2) | intValue2;
        } else {
            i3 = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i3 |= c0113p.d(intValue) ? 32 : 16;
        }
        if ((i3 & 147) == 146 && c0113p.x()) {
            c0113p.L();
        } else {
            com.gates.olympus.miruv.data.b bVar = (com.gates.olympus.miruv.data.b) this.f1906e.get(intValue);
            c0113p.Q(184920073);
            boolean contains = ((v) this.f1909h.getValue()).f1912c.contains(bVar.getId());
            c0113p.Q(-1656598991);
            Y1.c cVar = this.f1907f;
            boolean f3 = c0113p.f(cVar) | c0113p.f(bVar);
            Object G3 = c0113p.G();
            Object obj6 = C0105l.f2272a;
            if (f3 || G3 == obj6) {
                G3 = new t(cVar, bVar, 0);
                c0113p.a0(G3);
            }
            Y1.a aVar = (Y1.a) G3;
            c0113p.p(false);
            c0113p.Q(-1656597070);
            y yVar = this.f1908g;
            boolean h3 = c0113p.h(yVar) | c0113p.f(bVar);
            Object G4 = c0113p.G();
            if (h3 || G4 == obj6) {
                G4 = new q(yVar, bVar, 1);
                c0113p.a0(G4);
            }
            c0113p.p(false);
            B.b(bVar, contains, aVar, (Y1.a) G4, c0113p, 0);
            c0113p.p(false);
        }
        return z.f2729a;
    }
}
