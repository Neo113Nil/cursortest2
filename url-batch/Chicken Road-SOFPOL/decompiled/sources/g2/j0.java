package g2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j0 implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f2969a;

    public j0(String str) {
        this.f2969a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j0) {
            return q6.i.a(this.f2969a, ((j0) obj).f2969a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2969a.hashCode();
    }

    public final String toString() {
        return "UrlAnnotation(url=" + this.f2969a + ')';
    }
}
