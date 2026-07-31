package g2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class k0 implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f2970a;

    public k0(String str) {
        this.f2970a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k0) {
            return q6.i.a(this.f2970a, ((k0) obj).f2970a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2970a.hashCode();
    }

    public final String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.f2970a + ')';
    }
}
