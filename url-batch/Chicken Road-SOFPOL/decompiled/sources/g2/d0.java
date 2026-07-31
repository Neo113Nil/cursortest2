package g2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d0 implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f2926a;

    public final boolean equals(Object obj) {
        if (obj instanceof d0) {
            return q6.i.a(this.f2926a, ((d0) obj).f2926a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2926a.hashCode();
    }

    public final String toString() {
        return "StringAnnotation(value=" + this.f2926a + ')';
    }
}
