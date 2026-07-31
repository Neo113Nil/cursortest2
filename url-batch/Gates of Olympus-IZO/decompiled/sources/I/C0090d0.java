package I;

/* renamed from: I.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0090d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f2246a;

    public C0090d0(String str) {
        this.f2246a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0090d0) && Z1.i.a(this.f2246a, ((C0090d0) obj).f2246a);
    }

    public final int hashCode() {
        return this.f2246a.hashCode();
    }

    public final String toString() {
        return "OpaqueKey(key=" + this.f2246a + ')';
    }
}
