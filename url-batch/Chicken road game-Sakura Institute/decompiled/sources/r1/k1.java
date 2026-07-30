package r1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k1 implements h1 {

    /* renamed from: f, reason: collision with root package name */
    public final p1.g0 f7829f;

    /* renamed from: g, reason: collision with root package name */
    public final o0 f7830g;

    public k1(p1.g0 g0Var, o0 o0Var) {
        this.f7829f = g0Var;
        this.f7830g = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return r6.k.a(this.f7829f, k1Var.f7829f) && r6.k.a(this.f7830g, k1Var.f7830g);
    }

    public final int hashCode() {
        return this.f7830g.hashCode() + (this.f7829f.hashCode() * 31);
    }

    public final String toString() {
        return "PlaceableResult(result=" + this.f7829f + ", placeable=" + this.f7830g + ')';
    }

    @Override // r1.h1
    public final boolean z() {
        return this.f7830g.s0().O();
    }
}
