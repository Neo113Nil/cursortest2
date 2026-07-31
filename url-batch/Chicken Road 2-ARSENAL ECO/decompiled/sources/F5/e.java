package F5;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f800a;

    /* renamed from: b, reason: collision with root package name */
    public final C5.c f801b;

    public e(String str, C5.c cVar) {
        this.f800a = str;
        this.f801b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.i.a(this.f800a, eVar.f800a) && kotlin.jvm.internal.i.a(this.f801b, eVar.f801b);
    }

    public final int hashCode() {
        return this.f801b.hashCode() + (this.f800a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f800a + ", range=" + this.f801b + ')';
    }
}
