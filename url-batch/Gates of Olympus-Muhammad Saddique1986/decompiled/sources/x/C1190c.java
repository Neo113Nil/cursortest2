package x;

import I.C0159l;
import I.C0167p;
import e2.InterfaceC0424c;
import e2.InterfaceC0427f;

/* renamed from: x.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1190c extends f2.k implements InterfaceC0427f {

    /* renamed from: e, reason: collision with root package name */
    public static final C1190c f10058e = new C1190c(3);

    @Override // e2.InterfaceC0427f
    public final Object g(Object obj, Object obj2, Object obj3) {
        U.q qVar = (U.q) obj;
        C0167p c0167p = (C0167p) obj2;
        ((Number) obj3).intValue();
        c0167p.Q(-2126899193);
        long j3 = ((B.j0) c0167p.k(B.k0.f418a)).f416a;
        U.n nVar = U.n.f4488a;
        boolean e3 = c0167p.e(j3);
        Object G3 = c0167p.G();
        if (e3 || G3 == C0159l.f2829a) {
            G3 = new C1189b(j3, 0);
            c0167p.a0(G3);
        }
        U.q i3 = qVar.i(androidx.compose.ui.draw.a.b(nVar, (InterfaceC0424c) G3));
        c0167p.p(false);
        return i3;
    }
}
