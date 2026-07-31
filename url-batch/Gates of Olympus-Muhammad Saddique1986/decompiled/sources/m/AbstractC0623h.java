package m;

import I.C0143d;
import I.C0159l;
import I.C0167p;
import I.InterfaceC0142c0;
import I.W0;
import a.AbstractC0235a;
import e2.InterfaceC0422a;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;

/* renamed from: m.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0623h {

    /* renamed from: a, reason: collision with root package name */
    public static final W f6803a = AbstractC0620e.i(0.0f, null, 7);

    static {
        Object obj = z0.f6914a;
        AbstractC0235a.e(0.5f, 0.5f);
        l0.c.e(0.5f, 0.5f);
    }

    public static final W0 a(Object obj, u0 u0Var, InterfaceC0627l interfaceC0627l, Float f3, String str, InterfaceC0424c interfaceC0424c, C0167p c0167p, int i3, int i4) {
        InterfaceC0627l interfaceC0627l2 = interfaceC0627l;
        Object obj2 = C0159l.f2829a;
        Float f4 = (i4 & 8) != 0 ? null : f3;
        Object G3 = c0167p.G();
        if (G3 == obj2) {
            G3 = C0143d.K(null, I.W.f2783i);
            c0167p.a0(G3);
        }
        InterfaceC0142c0 interfaceC0142c0 = (InterfaceC0142c0) G3;
        Object G4 = c0167p.G();
        if (G4 == obj2) {
            G4 = new C0619d(obj, u0Var, f4);
            c0167p.a0(G4);
        }
        C0619d c0619d = (C0619d) G4;
        InterfaceC0142c0 N3 = C0143d.N(interfaceC0424c, c0167p);
        if (f4 != null && (interfaceC0627l2 instanceof W)) {
            W w2 = (W) interfaceC0627l2;
            if (!f2.j.a(w2.f6697c, f4)) {
                interfaceC0627l2 = new W(w2.f6695a, w2.f6696b, f4);
            }
        }
        InterfaceC0142c0 N4 = C0143d.N(interfaceC0627l2, c0167p);
        Object G5 = c0167p.G();
        if (G5 == obj2) {
            G5 = n.r.a(-1, 6, null);
            c0167p.a0(G5);
        }
        s2.k kVar = (s2.k) G5;
        boolean h3 = c0167p.h(kVar) | ((((i3 & 14) ^ 6) > 4 && c0167p.h(obj)) || (i3 & 6) == 4);
        Object G6 = c0167p.G();
        if (h3 || G6 == obj2) {
            G6 = new B.f0(kVar, 5, obj);
            c0167p.a0(G6);
        }
        C0143d.g((InterfaceC0422a) G6, c0167p);
        boolean h4 = c0167p.h(kVar) | c0167p.h(c0619d) | c0167p.f(N4) | c0167p.f(N3);
        Object G7 = c0167p.G();
        if (h4 || G7 == obj2) {
            G7 = new C0622g(kVar, c0619d, N4, N3, null);
            c0167p.a0(G7);
        }
        C0143d.e(c0167p, (InterfaceC0426e) G7, kVar);
        W0 w02 = (W0) interfaceC0142c0.getValue();
        return w02 == null ? c0619d.f6759c : w02;
    }
}
