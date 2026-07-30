package m;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final float f6209a;

    /* renamed from: b, reason: collision with root package name */
    public final z0.r0 f6210b;

    public n(float f9, z0.r0 r0Var) {
        this.f6209a = f9;
        this.f6210b = r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return m2.e.a(this.f6209a, nVar.f6209a) && this.f6210b.equals(nVar.f6210b);
    }

    public final int hashCode() {
        return this.f6210b.hashCode() + (Float.hashCode(this.f6209a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) m2.e.e(this.f6209a)) + ", brush=" + this.f6210b + ')';
    }
}
