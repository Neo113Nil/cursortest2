package q;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public float f7297a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7298b = true;

    /* renamed from: c, reason: collision with root package name */
    public v f7299c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return Float.compare(this.f7297a, k0Var.f7297a) == 0 && this.f7298b == k0Var.f7298b && r6.k.a(this.f7299c, k0Var.f7299c);
    }

    public final int hashCode() {
        int e9 = a0.m.e(Float.hashCode(this.f7297a) * 31, 31, this.f7298b);
        v vVar = this.f7299c;
        return (e9 + (vVar == null ? 0 : vVar.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f7297a + ", fill=" + this.f7298b + ", crossAxisAlignment=" + this.f7299c + ", flowLayoutData=null)";
    }
}
