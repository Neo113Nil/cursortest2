package m0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4880a;

    public b1(String str) {
        this.f4880a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b1) && q6.i.a(this.f4880a, ((b1) obj).f4880a);
    }

    public final int hashCode() {
        return this.f4880a.hashCode();
    }

    public final String toString() {
        return "OpaqueKey(key=" + this.f4880a + ')';
    }
}
