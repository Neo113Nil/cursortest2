package r;

import I.C0159l;
import I.C0167p;

/* loaded from: classes.dex */
public abstract class P {

    /* renamed from: a, reason: collision with root package name */
    public static final Q f7987a = new Q(AbstractC0864k.f8051a, U.b.f4470m);

    public static final Q a(InterfaceC0859f interfaceC0859f, U.h hVar, C0167p c0167p, int i3) {
        if (f2.j.a(interfaceC0859f, AbstractC0864k.f8051a) && f2.j.a(hVar, U.b.f4470m)) {
            c0167p.Q(-849081669);
            c0167p.p(false);
            return f7987a;
        }
        c0167p.Q(-849030798);
        boolean z3 = true;
        boolean z4 = (((i3 & 14) ^ 6) > 4 && c0167p.f(interfaceC0859f)) || (i3 & 6) == 4;
        if ((((i3 & 112) ^ 48) <= 32 || !c0167p.f(hVar)) && (i3 & 48) != 32) {
            z3 = false;
        }
        boolean z5 = z4 | z3;
        Object G3 = c0167p.G();
        if (z5 || G3 == C0159l.f2829a) {
            G3 = new Q(interfaceC0859f, hVar);
            c0167p.a0(G3);
        }
        Q q3 = (Q) G3;
        c0167p.p(false);
        return q3;
    }
}
