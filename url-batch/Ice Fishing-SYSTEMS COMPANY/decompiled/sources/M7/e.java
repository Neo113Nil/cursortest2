package M7;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f1931a;

    /* renamed from: b, reason: collision with root package name */
    public final J7.c f1932b;

    public e(String str, J7.c cVar) {
        this.f1931a = str;
        this.f1932b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.h.a(this.f1931a, eVar.f1931a) && kotlin.jvm.internal.h.a(this.f1932b, eVar.f1932b);
    }

    public final int hashCode() {
        return this.f1932b.hashCode() + (this.f1931a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f1931a + ", range=" + this.f1932b + ')';
    }
}
