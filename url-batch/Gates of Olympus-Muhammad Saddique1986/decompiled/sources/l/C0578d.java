package l;

import B.h0;
import C0.C0025a;
import I.C0156j0;
import I.C0159l;
import I.C0167p;
import S.C0217a;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import e2.InterfaceC0427f;
import m.l0;

/* renamed from: l.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0578d extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l0 f6480e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6481f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0424c f6482g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0586l f6483h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ S.t f6484i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Q.a f6485j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0578d(l0 l0Var, Object obj, InterfaceC0424c interfaceC0424c, C0586l c0586l, S.t tVar, Q.a aVar) {
        super(2);
        this.f6480e = l0Var;
        this.f6481f = obj;
        this.f6482g = interfaceC0424c;
        this.f6483h = c0586l;
        this.f6484i = tVar;
        this.f6485j = aVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        C0167p c0167p = (C0167p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0167p.x()) {
            c0167p.L();
        } else {
            Object G3 = c0167p.G();
            Object obj3 = C0159l.f2829a;
            InterfaceC0424c interfaceC0424c = this.f6482g;
            C0586l c0586l = this.f6483h;
            if (G3 == obj3) {
                G3 = (w) interfaceC0424c.n(c0586l);
                c0167p.a0(G3);
            }
            w wVar = (w) G3;
            l0 l0Var = this.f6480e;
            Object c2 = l0Var.f().c();
            Object obj4 = this.f6481f;
            boolean g3 = c0167p.g(f2.j.a(c2, obj4));
            Object G4 = c0167p.G();
            if (g3 || G4 == obj3) {
                G4 = f2.j.a(l0Var.f().c(), obj4) ? H.f6454b : ((w) interfaceC0424c.n(c0586l)).f6544b;
                c0167p.a0(G4);
            }
            H h3 = (H) G4;
            Object G5 = c0167p.G();
            C0156j0 c0156j0 = l0Var.f6839d;
            if (G5 == obj3) {
                G5 = new C0583i(f2.j.a(obj4, c0156j0.getValue()));
                c0167p.a0(G5);
            }
            C0583i c0583i = (C0583i) G5;
            G g4 = wVar.f6543a;
            U.n nVar = U.n.f4488a;
            boolean h4 = c0167p.h(wVar);
            Object G6 = c0167p.G();
            if (h4 || G6 == obj3) {
                G6 = new h0(2, wVar);
                c0167p.a0(G6);
            }
            U.q b3 = androidx.compose.ui.layout.a.b(nVar, (InterfaceC0427f) G6);
            c0583i.f6494a.setValue(Boolean.valueOf(f2.j.a(obj4, c0156j0.getValue())));
            U.q i3 = b3.i(c0583i);
            boolean h5 = c0167p.h(obj4);
            Object G7 = c0167p.G();
            if (h5 || G7 == obj3) {
                G7 = new C0217a(1, obj4);
                c0167p.a0(G7);
            }
            InterfaceC0424c interfaceC0424c2 = (InterfaceC0424c) G7;
            boolean f3 = c0167p.f(h3);
            Object G8 = c0167p.G();
            if (f3 || G8 == obj3) {
                G8 = new C0025a(8, h3);
                c0167p.a0(G8);
            }
            androidx.compose.animation.a.a(this.f6480e, interfaceC0424c2, i3, g4, h3, (InterfaceC0426e) G8, Q.f.b(-616195562, new C0577c(this.f6484i, obj4, c0586l, this.f6485j, 0), c0167p), c0167p, 12582912);
        }
        return R1.y.f4171a;
    }
}
