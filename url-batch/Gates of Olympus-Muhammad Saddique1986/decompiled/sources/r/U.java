package r;

/* loaded from: classes.dex */
public final class U implements X {

    /* renamed from: a, reason: collision with root package name */
    public final X f7996a;

    /* renamed from: b, reason: collision with root package name */
    public final X f7997b;

    public U(X x3, X x4) {
        this.f7996a = x3;
        this.f7997b = x4;
    }

    @Override // r.X
    public final int a(O0.b bVar, O0.k kVar) {
        return Math.max(this.f7996a.a(bVar, kVar), this.f7997b.a(bVar, kVar));
    }

    @Override // r.X
    public final int b(O0.b bVar) {
        return Math.max(this.f7996a.b(bVar), this.f7997b.b(bVar));
    }

    @Override // r.X
    public final int c(O0.b bVar, O0.k kVar) {
        return Math.max(this.f7996a.c(bVar, kVar), this.f7997b.c(bVar, kVar));
    }

    @Override // r.X
    public final int d(O0.b bVar) {
        return Math.max(this.f7996a.d(bVar), this.f7997b.d(bVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U)) {
            return false;
        }
        U u3 = (U) obj;
        return f2.j.a(u3.f7996a, this.f7996a) && f2.j.a(u3.f7997b, this.f7997b);
    }

    public final int hashCode() {
        return (this.f7997b.hashCode() * 31) + this.f7996a.hashCode();
    }

    public final String toString() {
        return "(" + this.f7996a + " ∪ " + this.f7997b + ')';
    }
}
