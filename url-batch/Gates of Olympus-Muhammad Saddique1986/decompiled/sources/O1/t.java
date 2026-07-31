package O1;

import B.C0022x;
import I.InterfaceC0142c0;
import e2.InterfaceC0424c;
import java.util.List;
import s.C0937f;

/* loaded from: classes.dex */
public final /* synthetic */ class t implements InterfaceC0424c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3868e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3869f;

    public /* synthetic */ t(InterfaceC0142c0 interfaceC0142c0, Q1.j jVar) {
        this.f3867d = 1;
        this.f3868e = interfaceC0142c0;
        this.f3869f = jVar;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f3867d) {
            case 0:
                C0937f c0937f = (C0937f) obj;
                f2.j.f(c0937f, "$this$LazyColumn");
                J1.c cVar = (J1.c) this.f3869f;
                C0937f.a(c0937f, new Q.a(213243325, new u(0, cVar), true));
                C0937f.a(c0937f, new Q.a(1811478502, new u(1, cVar), true));
                InterfaceC0142c0 interfaceC0142c0 = (InterfaceC0142c0) this.f3868e;
                C0937f.a(c0937f, new Q.a(1396151685, new M1.f(cVar, 3, interfaceC0142c0), true));
                C0937f.a(c0937f, q.f3850a);
                if (((Q1.d) interfaceC0142c0.getValue()).f3973c.isEmpty()) {
                    C0937f.a(c0937f, q.f3851b);
                } else {
                    List list = ((Q1.d) interfaceC0142c0.getValue()).f3973c;
                    A2.i iVar = new A2.i(5);
                    c0937f.f8229a.a(list.size(), new G1.m(new C0022x(iVar, 12, list), new l(1, list), new Q.a(-632812321, new A1.b(2, list), true)));
                }
                break;
            case 1:
                C0937f c0937f2 = (C0937f) obj;
                f2.j.f(c0937f2, "$this$LazyColumn");
                List list2 = (List) ((InterfaceC0142c0) this.f3868e).getValue();
                A2.i iVar2 = new A2.i(7);
                c0937f2.f8229a.a(list2.size(), new G1.m(new C0022x(iVar2, 14, list2), new l(3, list2), new Q.a(-632812321, new E(list2, (Q1.j) this.f3869f), true)));
                break;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                ((r2.d) this.f3869f).f8204f.removeCallbacks((c1.z) this.f3868e);
                break;
            default:
                ((y2.c) this.f3869f).e(((y2.b) this.f3868e).f10397e);
                break;
        }
        return R1.y.f4171a;
    }

    public /* synthetic */ t(Object obj, int i3, Object obj2) {
        this.f3867d = i3;
        this.f3869f = obj;
        this.f3868e = obj2;
    }
}
