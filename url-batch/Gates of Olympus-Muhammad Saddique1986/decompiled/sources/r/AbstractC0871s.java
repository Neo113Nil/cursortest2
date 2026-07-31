package r;

import I.C0159l;
import I.C0167p;

/* renamed from: r.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0871s {

    /* renamed from: a, reason: collision with root package name */
    public static final C0873u f8083a = new C0873u(AbstractC0864k.f8053c);

    public static final C0873u a(InterfaceC0862i interfaceC0862i, C0167p c0167p, int i3) {
        U.g gVar = U.b.f4473p;
        if (interfaceC0862i.equals(AbstractC0864k.f8053c) && gVar.equals(gVar)) {
            c0167p.Q(345962472);
            c0167p.p(false);
            return f8083a;
        }
        c0167p.Q(346016319);
        boolean z3 = true;
        if ((((i3 & 14) ^ 6) <= 4 || !c0167p.f(interfaceC0862i)) && (i3 & 6) != 4) {
            z3 = false;
        }
        boolean f3 = c0167p.f(gVar) | z3;
        Object G3 = c0167p.G();
        if (f3 || G3 == C0159l.f2829a) {
            G3 = new C0873u(interfaceC0862i);
            c0167p.a0(G3);
        }
        C0873u c0873u = (C0873u) G3;
        c0167p.p(false);
        return c0873u;
    }
}
