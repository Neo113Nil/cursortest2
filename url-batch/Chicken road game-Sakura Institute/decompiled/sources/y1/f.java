package y1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f9803a;

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f9803a == ((f) obj).f9803a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9803a);
    }

    public final String toString() {
        int i7 = this.f9803a;
        return i7 == 0 ? "Button" : i7 == 1 ? "Checkbox" : i7 == 2 ? "Switch" : i7 == 3 ? "RadioButton" : i7 == 4 ? "Tab" : i7 == 5 ? "Image" : i7 == 6 ? "DropdownList" : "Unknown";
    }
}
