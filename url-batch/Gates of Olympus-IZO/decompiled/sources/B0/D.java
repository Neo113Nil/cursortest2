package B0;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final String f238a;

    public D(String str) {
        this.f238a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof D) {
            return Z1.i.a(this.f238a, ((D) obj).f238a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f238a.hashCode();
    }

    public final String toString() {
        return "UrlAnnotation(url=" + this.f238a + ')';
    }
}
