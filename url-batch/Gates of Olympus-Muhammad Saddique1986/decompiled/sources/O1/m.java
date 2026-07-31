package O1;

import I.C0159l;
import I.C0167p;
import I.InterfaceC0142c0;
import I.W;
import e2.InterfaceC0422a;
import e2.InterfaceC0428g;
import h2.AbstractC0508a;
import java.util.List;
import s.C0934c;

/* loaded from: classes.dex */
public final class m extends f2.k implements InterfaceC0428g {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f3809e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Q1.c f3810f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142c0 f3811g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142c0 f3812h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(List list, Q1.c cVar, InterfaceC0142c0 interfaceC0142c0, InterfaceC0142c0 interfaceC0142c02) {
        super(4);
        this.f3809e = list;
        this.f3810f = cVar;
        this.f3811g = interfaceC0142c0;
        this.f3812h = interfaceC0142c02;
    }

    @Override // e2.InterfaceC0428g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i3;
        C0934c c0934c = (C0934c) obj;
        int intValue = ((Number) obj2).intValue();
        C0167p c0167p = (C0167p) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i3 = (c0167p.f(c0934c) ? 4 : 2) | intValue2;
        } else {
            i3 = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i3 |= c0167p.d(intValue) ? 32 : 16;
        }
        if ((i3 & 147) == 146 && c0167p.x()) {
            c0167p.L();
        } else {
            J1.b bVar = (J1.b) this.f3809e.get(intValue);
            c0167p.Q(-1364242812);
            c0167p.Q(-321100102);
            boolean f3 = c0167p.f(bVar);
            Object G3 = c0167p.G();
            W w2 = C0159l.f2829a;
            if (f3 || G3 == w2) {
                G3 = new k(bVar, this.f3811g, this.f3812h);
                c0167p.a0(G3);
            }
            InterfaceC0422a interfaceC0422a = (InterfaceC0422a) G3;
            c0167p.p(false);
            c0167p.Q(-321097622);
            Q1.c cVar = this.f3810f;
            boolean h3 = c0167p.h(cVar) | c0167p.f(bVar);
            Object G4 = c0167p.G();
            if (h3 || G4 == w2) {
                G4 = new N2.l(cVar, bVar, 1);
                c0167p.a0(G4);
            }
            c0167p.p(false);
            AbstractC0508a.a(bVar, interfaceC0422a, (InterfaceC0422a) G4, c0167p, 0);
            c0167p.p(false);
        }
        return R1.y.f4171a;
    }
}
