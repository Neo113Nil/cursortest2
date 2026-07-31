package x;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final q f8256a = new q(i.f8223c, y0.b.f8692p);

    public static final q a(h hVar, y0.c cVar, m0.s sVar, int i) {
        if (q6.i.a(hVar, i.f8223c) && cVar.equals(y0.b.f8692p)) {
            sVar.V(-1446569784);
            sVar.p(false);
            return f8256a;
        }
        sVar.V(-1446515937);
        boolean z3 = true;
        boolean z7 = (((i & 14) ^ 6) > 4 && sVar.f(hVar)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !sVar.f(cVar)) && (i & 48) != 32) {
            z3 = false;
        }
        boolean z8 = z7 | z3;
        Object K = sVar.K();
        if (z8 || K == m0.n.f5019a) {
            K = new q(hVar, cVar);
            sVar.f0(K);
        }
        q qVar = (q) K;
        sVar.p(false);
        return qVar;
    }
}
