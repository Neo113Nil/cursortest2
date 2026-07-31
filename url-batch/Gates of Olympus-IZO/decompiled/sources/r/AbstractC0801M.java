package r;

import I.C0105l;
import I.C0113p;

/* renamed from: r.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0801M {

    /* renamed from: a, reason: collision with root package name */
    public static final C0802N f7013a = new C0802N(AbstractC0813j.f7061a, U.a.f3289m);

    public static final C0802N a(InterfaceC0808e interfaceC0808e, U.c cVar, C0113p c0113p, int i3) {
        if (Z1.i.a(interfaceC0808e, AbstractC0813j.f7061a) && cVar.equals(U.a.f3289m)) {
            c0113p.Q(-849081669);
            c0113p.p(false);
            return f7013a;
        }
        c0113p.Q(-849030798);
        boolean z3 = true;
        boolean z4 = (((i3 & 14) ^ 6) > 4 && c0113p.f(interfaceC0808e)) || (i3 & 6) == 4;
        if ((((i3 & 112) ^ 48) <= 32 || !c0113p.f(cVar)) && (i3 & 48) != 32) {
            z3 = false;
        }
        boolean z5 = z4 | z3;
        Object G3 = c0113p.G();
        if (z5 || G3 == C0105l.f2272a) {
            G3 = new C0802N(interfaceC0808e, cVar);
            c0113p.a0(G3);
        }
        C0802N c0802n = (C0802N) G3;
        c0113p.p(false);
        return c0802n;
    }
}
