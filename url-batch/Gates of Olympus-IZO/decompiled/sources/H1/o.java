package H1;

import D1.E;
import F.D0;
import I.InterfaceC0088c0;
import L1.z;
import h1.C0438i;
import java.util.List;
import s.C0863f;
import s.C0864g;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Y1.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1889e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1890f;

    public /* synthetic */ o(InterfaceC0088c0 interfaceC0088c0, I1.m mVar) {
        this.f1888d = 1;
        this.f1889e = interfaceC0088c0;
        this.f1890f = mVar;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        switch (this.f1888d) {
            case 0:
                C0864g c0864g = (C0864g) obj;
                Z1.i.f(c0864g, "$this$LazyRow");
                y yVar = (y) this.f1890f;
                InterfaceC0088c0 interfaceC0088c0 = (InterfaceC0088c0) this.f1889e;
                C0864g.B(c0864g, new Q.a(1675643612, new p(yVar, interfaceC0088c0), true));
                List C02 = M1.l.C0(com.gates.olympus.miruv.data.d.getEntries());
                c0864g.f7365h.a(C02.size(), new C0863f(null, new r(0, C02), new Q.a(-632812321, new s(C02, yVar, interfaceC0088c0, 0), true)));
                break;
            case 1:
                t.g gVar = (t.g) obj;
                Z1.i.f(gVar, "$this$LazyVerticalGrid");
                List list = ((I1.i) ((InterfaceC0088c0) this.f1889e).getValue()).f2470a;
                E e3 = new E(2);
                gVar.f7585i.a(list.size(), new t.e(new D0(e3, 6, list), t.f.f7581f, new r(2, list), new Q.a(699646206, new I1.h(list, (I1.m) this.f1890f), true)));
                break;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                ((l2.d) this.f1890f).f5548f.removeCallbacks((a1.x) this.f1889e);
                break;
            default:
                ((s2.c) this.f1890f).e(((s2.b) this.f1889e).f7551e);
                break;
        }
        return z.f2729a;
    }

    public /* synthetic */ o(Object obj, int i3, Object obj2) {
        this.f1888d = i3;
        this.f1890f = obj;
        this.f1889e = obj2;
    }
}
