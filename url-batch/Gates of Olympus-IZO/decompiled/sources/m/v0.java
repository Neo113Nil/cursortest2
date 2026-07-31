package m;

import I.C0089d;
import I.C0105l;
import I.C0113p;

/* loaded from: classes.dex */
public abstract class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f5874a = I2.d.E(L1.h.f2706e, t0.f5855e);

    /* JADX WARN: Type inference failed for: r10v3, types: [Y1.c, Z1.j] */
    /* JADX WARN: Type inference failed for: r7v5, types: [Y1.c, Z1.j] */
    /* JADX WARN: Type inference failed for: r9v3, types: [Y1.c, Z1.j] */
    public static final l0 a(s0 s0Var, y0 y0Var, String str, C0113p c0113p, int i3, int i4) {
        k0 k0Var;
        if ((i4 & 2) != 0) {
            str = "DeferredAnimation";
        }
        int i5 = (i3 & 14) ^ 6;
        boolean z3 = true;
        boolean z4 = (i5 > 4 && c0113p.f(s0Var)) || (i3 & 6) == 4;
        Object G3 = c0113p.G();
        Object obj = C0105l.f2272a;
        if (z4 || G3 == obj) {
            G3 = new l0(s0Var, y0Var, str);
            c0113p.a0(G3);
        }
        l0 l0Var = (l0) G3;
        if ((i5 <= 4 || !c0113p.f(s0Var)) && (i3 & 6) != 4) {
            z3 = false;
        }
        boolean h3 = c0113p.h(l0Var) | z3;
        Object G4 = c0113p.G();
        if (h3 || G4 == obj) {
            G4 = new F.D0(s0Var, 17, l0Var);
            c0113p.a0(G4);
        }
        C0089d.c(l0Var, (Y1.c) G4, c0113p);
        if (s0Var.g() && (k0Var = (k0) l0Var.f5800b.getValue()) != null) {
            ?? r7 = k0Var.f5797f;
            s0 s0Var2 = l0Var.f5801c;
            k0Var.f5795d.f(r7.j(s0Var2.f().b()), k0Var.f5797f.j(s0Var2.f().c()), (InterfaceC0615z) k0Var.f5796e.j(s0Var2.f()));
        }
        return l0Var;
    }
}
