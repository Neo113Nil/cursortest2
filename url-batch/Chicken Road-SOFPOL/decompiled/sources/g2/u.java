package g2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final t f3004a;

    public u(t tVar) {
        this.f3004a = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            return q6.i.a(this.f3004a, ((u) obj).f3004a);
        }
        return false;
    }

    public final int hashCode() {
        t tVar = this.f3004a;
        if (tVar != null) {
            return tVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=null, paragraphSyle=" + this.f3004a + ')';
    }
}
