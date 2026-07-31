package r;

/* loaded from: classes.dex */
public final class Q implements U {

    /* renamed from: a, reason: collision with root package name */
    public final U f7022a;

    /* renamed from: b, reason: collision with root package name */
    public final U f7023b;

    public Q(U u3, U u4) {
        this.f7022a = u3;
        this.f7023b = u4;
    }

    @Override // r.U
    public final int a(M0.b bVar) {
        return Math.max(this.f7022a.a(bVar), this.f7023b.a(bVar));
    }

    @Override // r.U
    public final int b(M0.b bVar, M0.j jVar) {
        return Math.max(this.f7022a.b(bVar, jVar), this.f7023b.b(bVar, jVar));
    }

    @Override // r.U
    public final int c(M0.b bVar) {
        return Math.max(this.f7022a.c(bVar), this.f7023b.c(bVar));
    }

    @Override // r.U
    public final int d(M0.b bVar, M0.j jVar) {
        return Math.max(this.f7022a.d(bVar, jVar), this.f7023b.d(bVar, jVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q2 = (Q) obj;
        return Z1.i.a(q2.f7022a, this.f7022a) && Z1.i.a(q2.f7023b, this.f7023b);
    }

    public final int hashCode() {
        return (this.f7023b.hashCode() * 31) + this.f7022a.hashCode();
    }

    public final String toString() {
        return "(" + this.f7022a + " ∪ " + this.f7023b + ')';
    }
}
