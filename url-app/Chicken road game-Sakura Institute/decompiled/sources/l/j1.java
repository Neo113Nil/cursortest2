package l;

import g0.m2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j1 implements m2 {

    /* renamed from: f, reason: collision with root package name */
    public final n1 f5553f;

    /* renamed from: g, reason: collision with root package name */
    public q6.c f5554g;

    /* renamed from: h, reason: collision with root package name */
    public r6.l f5555h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ k1 f5556i;

    /* JADX WARN: Multi-variable type inference failed */
    public j1(k1 k1Var, n1 n1Var, q6.c cVar, q6.c cVar2) {
        this.f5556i = k1Var;
        this.f5553f = n1Var;
        this.f5554g = cVar;
        this.f5555h = (r6.l) cVar2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [q6.c, r6.l] */
    /* JADX WARN: Type inference failed for: r1v5, types: [q6.c, r6.l] */
    public final void a(l1 l1Var) {
        Object f9 = this.f5555h.f(l1Var.c());
        boolean g9 = this.f5556i.f5561c.g();
        n1 n1Var = this.f5553f;
        if (g9) {
            n1Var.f(this.f5555h.f(l1Var.b()), f9, (a0) this.f5554g.f(l1Var));
        } else {
            n1Var.g(f9, (a0) this.f5554g.f(l1Var));
        }
    }

    @Override // g0.m2
    public final Object getValue() {
        a(this.f5556i.f5561c.f());
        return this.f5553f.f5586o.getValue();
    }
}
