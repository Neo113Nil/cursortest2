package l;

import F.C0036e;
import I.C0102j0;
import I.C0105l;
import I.C0113p;
import S.C0154a;
import m.s0;

/* renamed from: l.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0560e extends Z1.j implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s0 f5460e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5461f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Y1.c f5462g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0568m f5463h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ S.t f5464i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Q.a f5465j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0560e(s0 s0Var, Object obj, Y1.c cVar, C0568m c0568m, S.t tVar, Q.a aVar) {
        super(2);
        this.f5460e = s0Var;
        this.f5461f = obj;
        this.f5462g = cVar;
        this.f5463h = c0568m;
        this.f5464i = tVar;
        this.f5465j = aVar;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        C0113p c0113p = (C0113p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0113p.x()) {
            c0113p.L();
        } else {
            Object G3 = c0113p.G();
            Object obj3 = C0105l.f2272a;
            Y1.c cVar = this.f5462g;
            C0568m c0568m = this.f5463h;
            if (G3 == obj3) {
                G3 = (w) cVar.j(c0568m);
                c0113p.a0(G3);
            }
            w wVar = (w) G3;
            s0 s0Var = this.f5460e;
            Object c3 = s0Var.f().c();
            Object obj4 = this.f5461f;
            boolean g3 = c0113p.g(Z1.i.a(c3, obj4));
            Object G4 = c0113p.G();
            if (g3 || G4 == obj3) {
                G4 = Z1.i.a(s0Var.f().c(), obj4) ? G.f5433b : ((w) cVar.j(c0568m)).f5511b;
                c0113p.a0(G4);
            }
            G g4 = (G) G4;
            Object G5 = c0113p.G();
            C0102j0 c0102j0 = s0Var.f5844d;
            if (G5 == obj3) {
                G5 = new C0565j(Z1.i.a(obj4, c0102j0.getValue()));
                c0113p.a0(G5);
            }
            C0565j c0565j = (C0565j) G5;
            F f3 = wVar.f5510a;
            boolean h3 = c0113p.h(wVar);
            Object G6 = c0113p.G();
            if (h3 || G6 == obj3) {
                G6 = new C0558c(0, wVar);
                c0113p.a0(G6);
            }
            U.l b2 = androidx.compose.ui.layout.a.b((Y1.f) G6);
            c0565j.f5472a.setValue(Boolean.valueOf(Z1.i.a(obj4, c0102j0.getValue())));
            U.l e3 = b2.e(c0565j);
            boolean h4 = c0113p.h(obj4);
            Object G7 = c0113p.G();
            if (h4 || G7 == obj3) {
                G7 = new C0154a(1, obj4);
                c0113p.a0(G7);
            }
            Y1.c cVar2 = (Y1.c) G7;
            boolean f4 = c0113p.f(g4);
            Object G8 = c0113p.G();
            if (f4 || G8 == obj3) {
                G8 = new C0036e(8, g4);
                c0113p.a0(G8);
            }
            androidx.compose.animation.a.a(this.f5460e, cVar2, e3, f3, g4, (Y1.e) G8, Q.f.b(-616195562, new C0559d(this.f5464i, obj4, c0568m, this.f5465j), c0113p), c0113p, 12582912);
        }
        return L1.z.f2729a;
    }
}
