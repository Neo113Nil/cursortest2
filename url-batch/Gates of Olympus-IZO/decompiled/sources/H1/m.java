package H1;

import D1.E;
import F.D0;
import I.InterfaceC0088c0;
import L1.z;
import androidx.lifecycle.V;
import java.util.ArrayList;
import java.util.List;
import s.C0863f;
import s.C0864g;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements Y1.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1879d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0088c0 f1880e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Y1.c f1881f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ V f1882g;

    public /* synthetic */ m(InterfaceC0088c0 interfaceC0088c0, y yVar, Y1.c cVar) {
        this.f1880e = interfaceC0088c0;
        this.f1882g = yVar;
        this.f1881f = cVar;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        C0864g c0864g = (C0864g) obj;
        switch (this.f1879d) {
            case 0:
                Z1.i.f(c0864g, "$this$LazyColumn");
                InterfaceC0088c0 interfaceC0088c0 = this.f1880e;
                C0864g.B(c0864g, new Q.a(1341541457, new G1.m(interfaceC0088c0, 1), true));
                y yVar = (y) this.f1882g;
                C0864g.B(c0864g, new Q.a(-38310982, new p(interfaceC0088c0, yVar), true));
                v vVar = (v) interfaceC0088c0.getValue();
                List list = vVar.f1910a;
                com.gates.olympus.miruv.data.d dVar = vVar.f1911b;
                if (dVar != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (((com.gates.olympus.miruv.data.b) obj2).getFamily() == dVar) {
                            arrayList.add(obj2);
                        }
                    }
                    list = arrayList;
                }
                E e3 = new E(1);
                c0864g.f7365h.a(list.size(), new C0863f(new D0(e3, 1, list), new r(1, list), new Q.a(-632812321, new u(list, this.f1881f, yVar, interfaceC0088c0), true)));
                break;
            default:
                Z1.i.f(c0864g, "$this$LazyColumn");
                C0864g.B(c0864g, J1.c.f2590a);
                InterfaceC0088c0 interfaceC0088c02 = this.f1880e;
                C0864g.B(c0864g, new Q.a(-827595462, new G1.m(interfaceC0088c02, 2), true));
                C0864g.B(c0864g, J1.c.f2591b);
                if (((J1.f) interfaceC0088c02.getValue()).f2601a.isEmpty()) {
                    C0864g.B(c0864g, J1.c.f2593d);
                } else {
                    List list2 = ((J1.f) interfaceC0088c02.getValue()).f2601a;
                    E e4 = new E(3);
                    c0864g.f7365h.a(list2.size(), new C0863f(new D0(e4, 7, list2), new r(3, list2), new Q.a(-632812321, new s(list2, this.f1881f, (J1.k) this.f1882g, 1), true)));
                }
                break;
        }
        return z.f2729a;
    }

    public /* synthetic */ m(InterfaceC0088c0 interfaceC0088c0, Y1.c cVar, J1.k kVar) {
        this.f1880e = interfaceC0088c0;
        this.f1881f = cVar;
        this.f1882g = kVar;
    }
}
