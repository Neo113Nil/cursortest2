package x;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final l0 f8235a = new l0(i.f8221a, y0.b.f8689m);

    public static final l0 a(e eVar, y0.d dVar, m0.s sVar, int i) {
        if (q6.i.a(eVar, i.f8221a) && dVar.equals(y0.b.f8689m)) {
            sVar.V(-1073795767);
            sVar.p(false);
            return f8235a;
        }
        sVar.V(-1073744896);
        boolean z3 = (((i & 112) ^ 48) > 32 && sVar.f(dVar)) || (i & 48) == 32;
        Object K = sVar.K();
        if (z3 || K == m0.n.f5019a) {
            K = new l0(eVar, dVar);
            sVar.f0(K);
        }
        l0 l0Var = (l0) K;
        sVar.p(false);
        return l0Var;
    }
}
