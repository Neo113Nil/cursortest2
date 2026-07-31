package B0;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: a, reason: collision with root package name */
    public final String f264a;

    /* renamed from: b, reason: collision with root package name */
    public final A f265b;

    public g(String str, A a3) {
        this.f264a = str;
        this.f265b = a3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!Z1.i.a(this.f264a, gVar.f264a)) {
            return false;
        }
        if (!Z1.i.a(this.f265b, gVar.f265b)) {
            return false;
        }
        gVar.getClass();
        return Z1.i.a(null, null);
    }

    public final int hashCode() {
        int hashCode = this.f264a.hashCode() * 31;
        A a3 = this.f265b;
        return (hashCode + (a3 != null ? a3.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "LinkAnnotation.Clickable(tag=" + this.f264a + ')';
    }
}
