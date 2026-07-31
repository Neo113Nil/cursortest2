package l;

import I.C0089d;
import I.C0105l;
import I.C0113p;
import I.X;
import j.C0506x;

/* renamed from: l.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0559d extends Z1.j implements Y1.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ S.t f5456e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5457f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0568m f5458g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Q.a f5459h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0559d(S.t tVar, Object obj, C0568m c0568m, Q.a aVar) {
        super(3);
        this.f5456e = tVar;
        this.f5457f = obj;
        this.f5458g = c0568m;
        this.f5459h = aVar;
    }

    @Override // Y1.f
    public final Object f(Object obj, Object obj2, Object obj3) {
        s sVar = (s) obj;
        C0113p c0113p = (C0113p) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= (intValue & 8) == 0 ? c0113p.f(sVar) : c0113p.h(sVar) ? 4 : 2;
        }
        if ((intValue & 19) == 18 && c0113p.x()) {
            c0113p.L();
        } else {
            S.t tVar = this.f5456e;
            boolean f3 = c0113p.f(tVar);
            Object obj4 = this.f5457f;
            boolean h3 = f3 | c0113p.h(obj4);
            C0568m c0568m = this.f5458g;
            boolean h4 = h3 | c0113p.h(c0568m);
            Object G3 = c0113p.G();
            X x3 = C0105l.f2272a;
            if (h4 || G3 == x3) {
                G3 = new R.h(tVar, obj4, c0568m, 4);
                c0113p.a0(G3);
            }
            C0089d.c(sVar, (Y1.c) G3, c0113p);
            C0506x c0506x = c0568m.f5482d;
            Z1.i.d(sVar, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
            c0506x.i(obj4, ((t) sVar).f5503a);
            Object G4 = c0113p.G();
            if (G4 == x3) {
                G4 = new C0564i();
                c0113p.a0(G4);
            }
            this.f5459h.e((C0564i) G4, obj4, c0113p, 0);
        }
        return L1.z.f2729a;
    }
}
