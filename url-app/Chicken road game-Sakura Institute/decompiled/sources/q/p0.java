package q;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class p0 implements s0 {

    /* renamed from: a, reason: collision with root package name */
    public final s0 f7327a;

    /* renamed from: b, reason: collision with root package name */
    public final s0 f7328b;

    public p0(s0 s0Var, s0 s0Var2) {
        this.f7327a = s0Var;
        this.f7328b = s0Var2;
    }

    @Override // q.s0
    public final int a(m2.b bVar, m2.k kVar) {
        return Math.max(this.f7327a.a(bVar, kVar), this.f7328b.a(bVar, kVar));
    }

    @Override // q.s0
    public final int b(m2.b bVar) {
        return Math.max(this.f7327a.b(bVar), this.f7328b.b(bVar));
    }

    @Override // q.s0
    public final int c(m2.b bVar, m2.k kVar) {
        return Math.max(this.f7327a.c(bVar, kVar), this.f7328b.c(bVar, kVar));
    }

    @Override // q.s0
    public final int d(m2.b bVar) {
        return Math.max(this.f7327a.d(bVar), this.f7328b.d(bVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return r6.k.a(p0Var.f7327a, this.f7327a) && r6.k.a(p0Var.f7328b, this.f7328b);
    }

    public final int hashCode() {
        return (this.f7328b.hashCode() * 31) + this.f7327a.hashCode();
    }

    public final String toString() {
        return "(" + this.f7327a + " ∪ " + this.f7328b + ')';
    }
}
