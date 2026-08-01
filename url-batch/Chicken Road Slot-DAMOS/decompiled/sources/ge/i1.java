package ge;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i1 extends g1 {

    /* renamed from: s, reason: collision with root package name */
    public final k1 f4362s;

    /* renamed from: t, reason: collision with root package name */
    public final j1 f4363t;

    /* renamed from: u, reason: collision with root package name */
    public final l f4364u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f4365v;

    public i1(k1 k1Var, j1 j1Var, l lVar, Object obj) {
        this.f4362s = k1Var;
        this.f4363t = j1Var;
        this.f4364u = lVar;
        this.f4365v = obj;
    }

    @Override // ge.g1
    public final boolean k() {
        return false;
    }

    @Override // ge.g1
    public final void l(Throwable th) {
        l lVar = this.f4364u;
        l V = k1.V(lVar);
        k1 k1Var = this.f4362s;
        j1 j1Var = this.f4363t;
        Object obj = this.f4365v;
        if (V == null || !k1Var.e0(j1Var, V, obj)) {
            j1Var.f4371d.c(new le.i(2), 2);
            l V2 = k1.V(lVar);
            if (V2 == null || !k1Var.e0(j1Var, V2, obj)) {
                k1Var.k(k1Var.D(j1Var, obj));
            }
        }
    }
}
