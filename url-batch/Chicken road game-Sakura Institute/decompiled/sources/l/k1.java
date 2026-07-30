package l;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public final w1 f5559a;

    /* renamed from: b, reason: collision with root package name */
    public final g0.g1 f5560b = g0.d.J(null, g0.t0.f3903k);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f5561c;

    public k1(p1 p1Var, w1 w1Var, String str) {
        this.f5561c = p1Var;
        this.f5559a = w1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j1 a(q6.c cVar, q6.c cVar2) {
        g0.g1 g1Var = this.f5560b;
        j1 j1Var = (j1) g1Var.getValue();
        p1 p1Var = this.f5561c;
        if (j1Var == null) {
            Object f9 = cVar2.f(p1Var.f5610a.a());
            Object f10 = cVar2.f(p1Var.f5610a.a());
            w1 w1Var = this.f5559a;
            q qVar = (q) w1Var.f5702a.f(f10);
            qVar.d();
            n1 n1Var = new n1(p1Var, f9, qVar, w1Var);
            j1Var = new j1(this, n1Var, cVar, cVar2);
            g1Var.setValue(j1Var);
            p1Var.f5618i.add(n1Var);
        }
        j1Var.f5555h = (r6.l) cVar2;
        j1Var.f5554g = cVar;
        j1Var.a(p1Var.f());
        return j1Var;
    }
}
