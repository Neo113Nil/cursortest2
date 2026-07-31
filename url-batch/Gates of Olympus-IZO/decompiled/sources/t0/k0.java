package t0;

/* loaded from: classes.dex */
public final class k0 implements h0 {

    /* renamed from: d, reason: collision with root package name */
    public final r0.B f7934d;

    /* renamed from: e, reason: collision with root package name */
    public final O f7935e;

    public k0(r0.B b2, O o3) {
        this.f7934d = b2;
        this.f7935e = o3;
    }

    @Override // t0.h0
    public final boolean H() {
        return this.f7935e.e0().n();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return Z1.i.a(this.f7934d, k0Var.f7934d) && Z1.i.a(this.f7935e, k0Var.f7935e);
    }

    public final int hashCode() {
        return this.f7935e.hashCode() + (this.f7934d.hashCode() * 31);
    }

    public final String toString() {
        return "PlaceableResult(result=" + this.f7934d + ", placeable=" + this.f7935e + ')';
    }
}
