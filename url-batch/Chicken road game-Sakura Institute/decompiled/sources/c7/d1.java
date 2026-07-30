package c7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d1 extends b1 {

    /* renamed from: j, reason: collision with root package name */
    public final f1 f1680j;

    /* renamed from: k, reason: collision with root package name */
    public final e1 f1681k;

    /* renamed from: l, reason: collision with root package name */
    public final l f1682l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f1683m;

    public d1(f1 f1Var, e1 e1Var, l lVar, Object obj) {
        this.f1680j = f1Var;
        this.f1681k = e1Var;
        this.f1682l = lVar;
        this.f1683m = obj;
    }

    @Override // c7.b1
    public final boolean k() {
        return false;
    }

    @Override // c7.b1
    public final void l(Throwable th) {
        l lVar = this.f1682l;
        l S = f1.S(lVar);
        f1 f1Var = this.f1680j;
        e1 e1Var = this.f1681k;
        Object obj = this.f1683m;
        if (S == null || !f1Var.c0(e1Var, S, obj)) {
            e1Var.f1690f.d(new h7.h(2), 2);
            l S2 = f1.S(lVar);
            if (S2 == null || !f1Var.c0(e1Var, S2, obj)) {
                f1Var.i(f1Var.y(e1Var, obj));
            }
        }
    }
}
