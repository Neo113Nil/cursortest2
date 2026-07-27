package y0;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f11545a;

    public static final boolean a(int i2, int i4) {
        return i2 == i4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f11545a == ((f) obj).f11545a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11545a);
    }

    public final String toString() {
        int i2 = this.f11545a;
        return a(i2, 0) ? "Button" : a(i2, 1) ? "Checkbox" : a(i2, 2) ? "Switch" : a(i2, 3) ? "RadioButton" : a(i2, 4) ? "Tab" : a(i2, 5) ? "Image" : a(i2, 6) ? "DropdownList" : "Unknown";
    }
}
