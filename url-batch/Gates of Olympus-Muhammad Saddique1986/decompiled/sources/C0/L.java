package C0;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public final String f574a;

    public L(String str) {
        this.f574a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof L) {
            return f2.j.a(this.f574a, ((L) obj).f574a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f574a.hashCode();
    }

    public final String toString() {
        return "UrlAnnotation(url=" + this.f574a + ')';
    }
}
