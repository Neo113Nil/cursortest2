package q;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class w implements s0 {

    /* renamed from: a, reason: collision with root package name */
    public final s0 f7370a;

    /* renamed from: b, reason: collision with root package name */
    public final s0 f7371b;

    public w(s0 s0Var, s0 s0Var2) {
        this.f7370a = s0Var;
        this.f7371b = s0Var2;
    }

    @Override // q.s0
    public final int a(m2.b bVar, m2.k kVar) {
        int a3 = this.f7370a.a(bVar, kVar) - this.f7371b.a(bVar, kVar);
        if (a3 < 0) {
            return 0;
        }
        return a3;
    }

    @Override // q.s0
    public final int b(m2.b bVar) {
        int b9 = this.f7370a.b(bVar) - this.f7371b.b(bVar);
        if (b9 < 0) {
            return 0;
        }
        return b9;
    }

    @Override // q.s0
    public final int c(m2.b bVar, m2.k kVar) {
        int c4 = this.f7370a.c(bVar, kVar) - this.f7371b.c(bVar, kVar);
        if (c4 < 0) {
            return 0;
        }
        return c4;
    }

    @Override // q.s0
    public final int d(m2.b bVar) {
        int d8 = this.f7370a.d(bVar) - this.f7371b.d(bVar);
        if (d8 < 0) {
            return 0;
        }
        return d8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return r6.k.a(wVar.f7370a, this.f7370a) && r6.k.a(wVar.f7371b, this.f7371b);
    }

    public final int hashCode() {
        return this.f7371b.hashCode() + (this.f7370a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.f7370a + " - " + this.f7371b + ')';
    }
}
