package r;

import I.C0105l;
import I.C0113p;

/* renamed from: r.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0821s {

    /* renamed from: a, reason: collision with root package name */
    public static final C0823u f7093a = new C0823u(AbstractC0813j.f7063c, U.a.f3291o);

    public static final C0823u a(InterfaceC0811h interfaceC0811h, U.b bVar, C0113p c0113p, int i3) {
        if (interfaceC0811h.equals(AbstractC0813j.f7063c) && bVar.equals(U.a.f3291o)) {
            c0113p.Q(345962472);
            c0113p.p(false);
            return f7093a;
        }
        c0113p.Q(346016319);
        boolean z3 = true;
        boolean z4 = (((i3 & 14) ^ 6) > 4 && c0113p.f(interfaceC0811h)) || (i3 & 6) == 4;
        if ((((i3 & 112) ^ 48) <= 32 || !c0113p.f(bVar)) && (i3 & 48) != 32) {
            z3 = false;
        }
        boolean z5 = z4 | z3;
        Object G3 = c0113p.G();
        if (z5 || G3 == C0105l.f2272a) {
            G3 = new C0823u(interfaceC0811h, bVar);
            c0113p.a0(G3);
        }
        C0823u c0823u = (C0823u) G3;
        c0113p.p(false);
        return c0823u;
    }
}
