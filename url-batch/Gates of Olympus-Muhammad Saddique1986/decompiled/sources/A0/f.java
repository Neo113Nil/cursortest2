package A0;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f98a;

    public static final boolean a(int i3, int i4) {
        return i3 == i4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f98a == ((f) obj).f98a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f98a);
    }

    public final String toString() {
        int i3 = this.f98a;
        return a(i3, 0) ? "Button" : a(i3, 1) ? "Checkbox" : a(i3, 2) ? "Switch" : a(i3, 3) ? "RadioButton" : a(i3, 4) ? "Tab" : a(i3, 5) ? "Image" : a(i3, 6) ? "DropdownList" : "Unknown";
    }
}
