package I;

/* renamed from: I.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0144d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f2803a;

    public C0144d0(String str) {
        this.f2803a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0144d0) && f2.j.a(this.f2803a, ((C0144d0) obj).f2803a);
    }

    public final int hashCode() {
        return this.f2803a.hashCode();
    }

    public final String toString() {
        return "OpaqueKey(key=" + this.f2803a + ')';
    }
}
