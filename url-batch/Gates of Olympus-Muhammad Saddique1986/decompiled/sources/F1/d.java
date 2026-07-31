package F1;

import F.d1;
import I.C0143d;
import I.C0156j0;
import I.C0159l;
import I.C0167p;
import I.C0174t;
import I.InterfaceC0142c0;
import I.W;
import L1.r;
import L1.s;
import L1.t;
import O1.p;
import Q.f;
import R1.y;
import a.AbstractC0235a;
import com.gatesof.olympus.martu.marku.ChairActivity;
import e2.InterfaceC0422a;
import e2.InterfaceC0426e;
import e2.InterfaceC0427f;
import f2.j;
import n2.AbstractC0730j;

/* loaded from: classes.dex */
public final class d implements InterfaceC0426e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1958d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1959e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1960f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1961g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142c0 f1962h;

    public /* synthetic */ d(C0156j0 c0156j0, ChairActivity chairActivity, C0174t c0174t, C0156j0 c0156j02, int i3) {
        this.f1958d = i3;
        this.f1959e = c0156j0;
        this.f1960f = chairActivity;
        this.f1961g = c0174t;
        this.f1962h = c0156j02;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        W w2 = C0159l.f2829a;
        y yVar = y.f4171a;
        Object obj3 = this.f1961g;
        Object obj4 = this.f1960f;
        final InterfaceC0142c0 interfaceC0142c0 = this.f1962h;
        Object obj5 = this.f1959e;
        switch (this.f1958d) {
            case 0:
                C0167p c0167p = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0167p.x()) {
                    c0167p.Q(1326855413);
                    C0156j0 c0156j0 = (C0156j0) obj5;
                    boolean f3 = c0167p.f(c0156j0);
                    Object G3 = c0167p.G();
                    if (f3 || G3 == w2) {
                        G3 = new b(c0156j0, null);
                        c0167p.a0(G3);
                    }
                    c0167p.p(false);
                    C0143d.e(c0167p, (InterfaceC0426e) G3, yVar);
                    int i3 = ChairActivity.f5624x;
                    if (((Boolean) c0156j0.getValue()).booleanValue()) {
                        C0156j0 c0156j02 = (C0156j0) interfaceC0142c0;
                        if (!(((t) c0156j02.getValue()) instanceof s)) {
                            if (!(((t) c0156j02.getValue()) instanceof r)) {
                                c0167p.Q(1326875338);
                                AbstractC0235a.f((C0174t) obj3, c0167p, 0);
                                c0167p.p(false);
                                break;
                            } else {
                                c0167p.Q(-1816851355);
                                t tVar = (t) c0156j02.getValue();
                                j.d(tVar, "null cannot be cast to non-null type com.gatesof.olympus.martu.marku.salon.SalonRoute.Page");
                                r rVar = (r) tVar;
                                c0167p.Q(1326868415);
                                ChairActivity chairActivity = (ChairActivity) obj4;
                                boolean f4 = c0167p.f(chairActivity) | c0167p.f(rVar);
                                Object G4 = c0167p.G();
                                if (f4 || G4 == w2) {
                                    G4 = new c(chairActivity, rVar, null);
                                    c0167p.a0(G4);
                                }
                                c0167p.p(false);
                                C0143d.e(c0167p, (InterfaceC0426e) G4, yVar);
                                c0167p.p(false);
                                break;
                            }
                        }
                    }
                    c0167p.Q(1326862884);
                    l0.c.g(0, c0167p);
                    c0167p.p(false);
                    break;
                } else {
                    c0167p.L();
                    break;
                }
                break;
            case 1:
                C0167p c0167p2 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0167p2.x()) {
                    P1.b.a(false, f.b(-1845152163, new d((C0156j0) obj5, (ChairActivity) obj4, (C0174t) obj3, (C0156j0) interfaceC0142c0, 0), c0167p2), c0167p2, 48);
                    break;
                } else {
                    c0167p2.L();
                    break;
                }
                break;
            default:
                C0167p c0167p3 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0167p3.x()) {
                    c0167p3.Q(-570192398);
                    final InterfaceC0427f interfaceC0427f = (InterfaceC0427f) obj5;
                    boolean f5 = c0167p3.f(interfaceC0427f);
                    Object G5 = c0167p3.G();
                    if (f5 || G5 == w2) {
                        final InterfaceC0142c0 interfaceC0142c02 = (InterfaceC0142c0) obj4;
                        final InterfaceC0142c0 interfaceC0142c03 = (InterfaceC0142c0) obj3;
                        G5 = new InterfaceC0422a() { // from class: O1.f
                            @Override // e2.InterfaceC0422a
                            public final Object b() {
                                InterfaceC0427f.this.g((String) interfaceC0142c0.getValue(), (String) interfaceC0142c02.getValue(), (String) interfaceC0142c03.getValue());
                                return R1.y.f4171a;
                            }
                        };
                        c0167p3.a0(G5);
                    }
                    c0167p3.p(false);
                    d1.e((InterfaceC0422a) G5, null, !AbstractC0730j.K((String) interfaceC0142c0.getValue()), null, null, null, null, null, null, p.f3845e, c0167p3, 805306368, 506);
                    break;
                } else {
                    c0167p3.L();
                    break;
                }
                break;
        }
        return yVar;
    }

    public d(InterfaceC0427f interfaceC0427f, InterfaceC0142c0 interfaceC0142c0, InterfaceC0142c0 interfaceC0142c02, InterfaceC0142c0 interfaceC0142c03) {
        this.f1958d = 2;
        this.f1959e = interfaceC0427f;
        this.f1962h = interfaceC0142c0;
        this.f1960f = interfaceC0142c02;
        this.f1961g = interfaceC0142c03;
    }
}
