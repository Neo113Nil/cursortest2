package k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f5231a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5232b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5233c;

    public k0(float f9, float f10, long j8) {
        this.f5231a = f9;
        this.f5232b = f10;
        this.f5233c = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return Float.compare(this.f5231a, k0Var.f5231a) == 0 && Float.compare(this.f5232b, k0Var.f5232b) == 0 && this.f5233c == k0Var.f5233c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5233c) + a0.m.a(this.f5232b, Float.hashCode(this.f5231a) * 31, 31);
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.f5231a + ", distance=" + this.f5232b + ", duration=" + this.f5233c + ')';
    }
}
