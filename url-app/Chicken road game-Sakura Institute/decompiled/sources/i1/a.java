package i1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f4854a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f4854a == ((a) obj).f4854a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4854a);
    }

    public final String toString() {
        int i7 = this.f4854a;
        return i7 == 1 ? "Touch" : i7 == 2 ? "Keyboard" : "Error";
    }
}
