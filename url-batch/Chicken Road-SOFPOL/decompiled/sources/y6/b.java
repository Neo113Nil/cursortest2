package y6;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f8991a;

    /* renamed from: b, reason: collision with root package name */
    public final v6.d f8992b;

    public b(String str, v6.d dVar) {
        this.f8991a = str;
        this.f8992b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return q6.i.a(this.f8991a, bVar.f8991a) && q6.i.a(this.f8992b, bVar.f8992b);
    }

    public final int hashCode() {
        return this.f8992b.hashCode() + (this.f8991a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f8991a + ", range=" + this.f8992b + ')';
    }
}
