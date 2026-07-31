package r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class o1 {

    /* renamed from: a, reason: collision with root package name */
    public static final j0.l f6382a = new j0.l(18);

    /* renamed from: b, reason: collision with root package name */
    public static final Object f6383b = a.a.q(c6.e.f1745d, new c.e(20));

    /* JADX WARN: Type inference failed for: r4v1, types: [p6.c, q6.j] */
    /* JADX WARN: Type inference failed for: r5v5, types: [p6.c, q6.j] */
    public static final f1 a(l1 l1Var, r1 r1Var, String str, m0.s sVar, int i, int i8) {
        e1 e1Var;
        if ((i8 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean f6 = sVar.f(l1Var);
        Object K = sVar.K();
        Object obj = m0.n.f5019a;
        if (f6 || K == obj) {
            K = new f1(l1Var, r1Var, str);
            sVar.f0(K);
        }
        f1 f1Var = (f1) K;
        boolean f8 = sVar.f(l1Var) | sVar.h(f1Var);
        Object K2 = sVar.K();
        if (f8 || K2 == obj) {
            K2 = new a0.v0(14, l1Var, f1Var);
            sVar.f0(K2);
        }
        m0.b.d(f1Var, (p6.c) K2, sVar);
        if (l1Var.g() && (e1Var = (e1) f1Var.f6293b.getValue()) != null) {
            l1 l1Var2 = f1Var.f6294c;
            e1Var.f6285d.f(e1Var.f6287f.i(l1Var2.f().b()), e1Var.f6287f.i(l1Var2.f().c()), (v) e1Var.f6286e.i(l1Var2.f()));
        }
        return f1Var;
    }
}
