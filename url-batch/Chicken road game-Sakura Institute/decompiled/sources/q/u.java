package q;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class u implements q1.c {

    /* renamed from: a, reason: collision with root package name */
    public final q6.c f7345a;

    /* renamed from: b, reason: collision with root package name */
    public s0 f7346b;

    public u(q6.c cVar) {
        this.f7345a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && ((u) obj).f7345a == this.f7345a;
    }

    @Override // q1.c
    public final void g(q1.g gVar) {
        s0 s0Var = (s0) gVar.g(w0.f7372a);
        if (r6.k.a(s0Var, this.f7346b)) {
            return;
        }
        this.f7346b = s0Var;
        this.f7345a.f(s0Var);
    }

    public final int hashCode() {
        return this.f7345a.hashCode();
    }
}
