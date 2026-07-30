package f2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f3275a;

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f3275a == ((i) obj).f3275a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3275a);
    }

    public final String toString() {
        int i7 = this.f3275a;
        return i7 == 0 ? "Normal" : i7 == 1 ? "Italic" : "Invalid";
    }
}
