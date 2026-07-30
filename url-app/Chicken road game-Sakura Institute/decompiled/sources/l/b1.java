package l;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b1 implements k {

    /* renamed from: a, reason: collision with root package name */
    public final k f5412a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5413b;

    public b1(a0 a0Var, long j8) {
        this.f5412a = a0Var;
        this.f5413b = j8;
    }

    @Override // l.k
    public final y1 a(w1 w1Var) {
        return new c1(this.f5412a.a(w1Var), this.f5413b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return b1Var.f5413b == this.f5413b && r6.k.a(b1Var.f5412a, this.f5412a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f5413b) + (this.f5412a.hashCode() * 31);
    }
}
