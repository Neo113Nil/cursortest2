package a2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f417a;

    public l0(String str) {
        this.f417a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l0) {
            return r6.k.a(this.f417a, ((l0) obj).f417a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f417a.hashCode();
    }

    public final String toString() {
        return "UrlAnnotation(url=" + this.f417a + ')';
    }
}
