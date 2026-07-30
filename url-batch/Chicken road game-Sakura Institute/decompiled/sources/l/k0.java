package l;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final Float f5557a;

    /* renamed from: b, reason: collision with root package name */
    public y f5558b;

    public k0(Float f9, y yVar) {
        this.f5557a = f9;
        this.f5558b = yVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return k0Var.f5557a.equals(this.f5557a) && r6.k.a(k0Var.f5558b, this.f5558b);
    }

    public final int hashCode() {
        return this.f5558b.hashCode() + h.c(0, this.f5557a.hashCode() * 31, 31);
    }
}
