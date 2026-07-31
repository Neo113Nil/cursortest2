package m;

import B.C0022x;
import I.C0143d;
import I.C0159l;
import I.C0167p;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;

/* loaded from: classes.dex */
public abstract class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f6876a = R1.a.c(R1.g.f4148e, m0.f6854e);

    /* JADX WARN: Type inference failed for: r10v3, types: [e2.c, f2.k] */
    /* JADX WARN: Type inference failed for: r7v5, types: [e2.c, f2.k] */
    /* JADX WARN: Type inference failed for: r9v3, types: [e2.c, f2.k] */
    public static final f0 a(l0 l0Var, u0 u0Var, String str, C0167p c0167p, int i3, int i4) {
        e0 e0Var;
        if ((i4 & 2) != 0) {
            str = "DeferredAnimation";
        }
        int i5 = (i3 & 14) ^ 6;
        boolean z3 = true;
        boolean z4 = (i5 > 4 && c0167p.f(l0Var)) || (i3 & 6) == 4;
        Object G3 = c0167p.G();
        Object obj = C0159l.f2829a;
        if (z4 || G3 == obj) {
            G3 = new f0(l0Var, u0Var, str);
            c0167p.a0(G3);
        }
        f0 f0Var = (f0) G3;
        if ((i5 <= 4 || !c0167p.f(l0Var)) && (i3 & 6) != 4) {
            z3 = false;
        }
        boolean h3 = c0167p.h(f0Var) | z3;
        Object G4 = c0167p.G();
        if (h3 || G4 == obj) {
            G4 = new C0022x(l0Var, 23, f0Var);
            c0167p.a0(G4);
        }
        C0143d.c(f0Var, (InterfaceC0424c) G4, c0167p);
        if (l0Var.g() && (e0Var = (e0) f0Var.f6794b.getValue()) != null) {
            ?? r7 = e0Var.f6786f;
            l0 l0Var2 = f0Var.f6795c;
            e0Var.f6784d.f(r7.n(l0Var2.f().b()), e0Var.f6786f.n(l0Var2.f().c()), (InterfaceC0640z) e0Var.f6785e.n(l0Var2.f()));
        }
        return f0Var;
    }

    public static final i0 b(l0 l0Var, Object obj, Object obj2, InterfaceC0640z interfaceC0640z, u0 u0Var, C0167p c0167p, int i3) {
        boolean f3 = c0167p.f(l0Var);
        Object G3 = c0167p.G();
        Object obj3 = C0159l.f2829a;
        if (f3 || G3 == obj3) {
            r rVar = (r) u0Var.f6889a.n(obj2);
            rVar.d();
            G3 = new i0(l0Var, obj, rVar, u0Var);
            c0167p.a0(G3);
        }
        i0 i0Var = (i0) G3;
        if (l0Var.g()) {
            i0Var.f(obj, obj2, interfaceC0640z);
        } else {
            i0Var.g(obj2, interfaceC0640z);
        }
        boolean f4 = c0167p.f(l0Var) | c0167p.f(i0Var);
        Object G4 = c0167p.G();
        if (f4 || G4 == obj3) {
            G4 = new C0022x(l0Var, 24, i0Var);
            c0167p.a0(G4);
        }
        C0143d.c(i0Var, (InterfaceC0424c) G4, c0167p);
        return i0Var;
    }

    public static final l0 c(s0 s0Var, String str, C0167p c0167p, int i3) {
        int i4 = (i3 & 14) ^ 6;
        boolean z3 = true;
        boolean z4 = (i4 > 4 && c0167p.f(s0Var)) || (i3 & 6) == 4;
        Object G3 = c0167p.G();
        Object obj = C0159l.f2829a;
        if (z4 || G3 == obj) {
            G3 = new l0(s0Var, null, str);
            c0167p.a0(G3);
        }
        l0 l0Var = (l0) G3;
        if (s0Var instanceof U) {
            c0167p.Q(1030413636);
            U u3 = (U) s0Var;
            Object value = u3.f6673c.getValue();
            Object value2 = u3.f6672b.getValue();
            if ((i4 <= 4 || !c0167p.f(s0Var)) && (i3 & 6) != 4) {
                z3 = false;
            }
            Object G4 = c0167p.G();
            if (z3 || G4 == obj) {
                G4 = new o0(s0Var, null);
                c0167p.a0(G4);
            }
            C0143d.f(value, value2, (InterfaceC0426e) G4, c0167p);
            c0167p.p(false);
        } else {
            c0167p.Q(1030875195);
            l0Var.a(s0Var.b(), c0167p, 0);
            c0167p.p(false);
        }
        boolean f3 = c0167p.f(l0Var);
        Object G5 = c0167p.G();
        if (f3 || G5 == obj) {
            G5 = new q0(l0Var, 0);
            c0167p.a0(G5);
        }
        C0143d.c(l0Var, (InterfaceC0424c) G5, c0167p);
        return l0Var;
    }

    public static final l0 d(Object obj, String str, C0167p c0167p, int i3) {
        Object G3 = c0167p.G();
        I.W w2 = C0159l.f2829a;
        if (G3 == w2) {
            G3 = new l0(new C0610F(obj), null, str);
            c0167p.a0(G3);
        }
        l0 l0Var = (l0) G3;
        l0Var.a(obj, c0167p, (i3 & 8) | 48 | (i3 & 14));
        Object G4 = c0167p.G();
        if (G4 == w2) {
            G4 = new q0(l0Var, 1);
            c0167p.a0(G4);
        }
        C0143d.c(l0Var, (InterfaceC0424c) G4, c0167p);
        return l0Var;
    }
}
