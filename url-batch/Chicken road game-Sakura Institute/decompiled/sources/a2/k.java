package a2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k extends m {

    /* renamed from: a, reason: collision with root package name */
    public final String f409a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f410b;

    public k(String str, i0 i0Var) {
        this.f409a = str;
        this.f410b = i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return r6.k.a(this.f409a, kVar.f409a) && r6.k.a(this.f410b, kVar.f410b);
    }

    public final int hashCode() {
        int hashCode = this.f409a.hashCode() * 31;
        i0 i0Var = this.f410b;
        return (hashCode + (i0Var != null ? i0Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "LinkAnnotation.Clickable(tag=" + this.f409a + ')';
    }
}
