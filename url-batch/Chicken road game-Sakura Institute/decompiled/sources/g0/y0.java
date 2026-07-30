package g0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final i.x f3973a;

    public final boolean equals(Object obj) {
        if (obj instanceof y0) {
            return r6.k.a(this.f3973a, ((y0) obj).f3973a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3973a.hashCode();
    }

    public final String toString() {
        return "MutableScatterMultiMap(map=" + this.f3973a + ')';
    }
}
