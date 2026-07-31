package O1;

import F.d1;
import I.C0159l;
import I.C0167p;
import I.InterfaceC0142c0;
import e2.InterfaceC0422a;
import e2.InterfaceC0426e;
import e2.InterfaceC0429h;

/* loaded from: classes.dex */
public final class B implements InterfaceC0426e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0429h f3756d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Double f3757e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f3758f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142c0 f3759g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142c0 f3760h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142c0 f3761i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142c0 f3762j;

    public B(InterfaceC0429h interfaceC0429h, Double d3, boolean z3, InterfaceC0142c0 interfaceC0142c0, InterfaceC0142c0 interfaceC0142c02, InterfaceC0142c0 interfaceC0142c03, InterfaceC0142c0 interfaceC0142c04) {
        this.f3756d = interfaceC0429h;
        this.f3757e = d3;
        this.f3758f = z3;
        this.f3759g = interfaceC0142c0;
        this.f3760h = interfaceC0142c02;
        this.f3761i = interfaceC0142c03;
        this.f3762j = interfaceC0142c04;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        C0167p c0167p = (C0167p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0167p.x()) {
            c0167p.L();
        } else {
            c0167p.Q(89338629);
            boolean f3 = c0167p.f(this.f3756d) | c0167p.f(this.f3757e);
            Object G3 = c0167p.G();
            if (f3 || G3 == C0159l.f2829a) {
                final InterfaceC0142c0 interfaceC0142c0 = this.f3759g;
                final InterfaceC0142c0 interfaceC0142c02 = this.f3760h;
                final InterfaceC0429h interfaceC0429h = this.f3756d;
                final Double d3 = this.f3757e;
                final InterfaceC0142c0 interfaceC0142c03 = this.f3761i;
                final InterfaceC0142c0 interfaceC0142c04 = this.f3762j;
                G3 = new InterfaceC0422a() { // from class: O1.A
                    @Override // e2.InterfaceC0422a
                    public final Object b() {
                        J1.a aVar = (J1.a) interfaceC0142c0.getValue();
                        String str = (String) interfaceC0142c02.getValue();
                        String str2 = (String) interfaceC0142c03.getValue();
                        Double d4 = d3;
                        InterfaceC0429h.this.i(aVar, str, str2, Double.valueOf(d4 != null ? d4.doubleValue() : 0.0d), (String) interfaceC0142c04.getValue());
                        return R1.y.f4171a;
                    }
                };
                c0167p.a0(G3);
            }
            c0167p.p(false);
            d1.e((InterfaceC0422a) G3, null, this.f3758f, null, null, null, null, null, null, s.f3857d, c0167p, 805306368, 506);
        }
        return R1.y.f4171a;
    }
}
