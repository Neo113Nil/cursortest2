package j2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f4938a;

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f4938a == ((g) obj).f4938a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4938a);
    }

    public final String toString() {
        int i3 = this.f4938a;
        return i3 == 0 ? "Button" : i3 == 1 ? "Checkbox" : i3 == 2 ? "Switch" : i3 == 3 ? "RadioButton" : i3 == 4 ? "Tab" : i3 == 5 ? "Image" : i3 == 6 ? "DropdownList" : i3 == 7 ? "Picker" : i3 == 8 ? "Carousel" : "Unknown";
    }
}
