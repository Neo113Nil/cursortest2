package g0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f3663a;

    public a1(String str) {
        this.f3663a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a1) && r6.k.a(this.f3663a, ((a1) obj).f3663a);
    }

    public final int hashCode() {
        return this.f3663a.hashCode();
    }

    public final String toString() {
        return "OpaqueKey(key=" + this.f3663a + ')';
    }
}
