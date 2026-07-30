package a2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l extends m {

    /* renamed from: a, reason: collision with root package name */
    public final String f415a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f416b;

    public l(String str, i0 i0Var) {
        this.f415a = str;
        this.f416b = i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return r6.k.a(this.f415a, lVar.f415a) && r6.k.a(this.f416b, lVar.f416b);
    }

    public final int hashCode() {
        int hashCode = this.f415a.hashCode() * 31;
        i0 i0Var = this.f416b;
        return (hashCode + (i0Var != null ? i0Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "LinkAnnotation.Url(url=" + this.f415a + ')';
    }
}
