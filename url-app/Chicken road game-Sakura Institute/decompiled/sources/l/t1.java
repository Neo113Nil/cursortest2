package l;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class t1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f5666a = d6.a.c(d6.h.f2616g, q1.f5624g);

    /* JADX WARN: Type inference failed for: r4v1, types: [q6.c, r6.l] */
    /* JADX WARN: Type inference failed for: r5v5, types: [q6.c, r6.l] */
    public static final k1 a(p1 p1Var, w1 w1Var, String str, g0.p pVar, int i7, int i8) {
        j1 j1Var;
        if ((i8 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean f9 = pVar.f(p1Var);
        Object G = pVar.G();
        Object obj = g0.l.f3784a;
        if (f9 || G == obj) {
            G = new k1(p1Var, w1Var, str);
            pVar.a0(G);
        }
        k1 k1Var = (k1) G;
        boolean f10 = pVar.f(p1Var) | pVar.h(k1Var);
        Object G2 = pVar.G();
        if (f10 || G2 == obj) {
            G2 = new a0.y(p1Var, 20, k1Var);
            pVar.a0(G2);
        }
        g0.d.d(k1Var, (q6.c) G2, pVar);
        if (p1Var.g() && (j1Var = (j1) k1Var.f5560b.getValue()) != null) {
            p1 p1Var2 = k1Var.f5561c;
            j1Var.f5553f.f(j1Var.f5555h.f(p1Var2.f().b()), j1Var.f5555h.f(p1Var2.f().c()), (a0) j1Var.f5554g.f(p1Var2.f()));
        }
        return k1Var;
    }

    public static final n1 b(p1 p1Var, Object obj, Object obj2, a0 a0Var, w1 w1Var, g0.p pVar, int i7) {
        boolean f9 = pVar.f(p1Var);
        Object G = pVar.G();
        Object obj3 = g0.l.f3784a;
        if (f9 || G == obj3) {
            q qVar = (q) w1Var.f5702a.f(obj2);
            qVar.d();
            G = new n1(p1Var, obj, qVar, w1Var);
            pVar.a0(G);
        }
        n1 n1Var = (n1) G;
        if (p1Var.g()) {
            n1Var.f(obj, obj2, a0Var);
        } else {
            n1Var.g(obj2, a0Var);
        }
        boolean f10 = pVar.f(p1Var) | pVar.f(n1Var);
        Object G2 = pVar.G();
        if (f10 || G2 == obj3) {
            G2 = new a0.y(p1Var, 21, n1Var);
            pVar.a0(G2);
        }
        g0.d.d(n1Var, (q6.c) G2, pVar);
        return n1Var;
    }

    public static final p1 c(Enum r42, g0.p pVar, int i7, int i8) {
        String str = (i8 & 2) != 0 ? null : "TextFieldInputState";
        Object G = pVar.G();
        g0.t0 t0Var = g0.l.f3784a;
        if (G == t0Var) {
            G = new p1(new m0(r42), null, str);
            pVar.a0(G);
        }
        p1 p1Var = (p1) G;
        p1Var.a(r42, pVar, (i7 & 14) | (i7 & 8) | 48);
        Object G2 = pVar.G();
        if (G2 == t0Var) {
            G2 = new s1(p1Var, 1);
            pVar.a0(G2);
        }
        g0.d.d(p1Var, (q6.c) G2, pVar);
        return p1Var;
    }
}
