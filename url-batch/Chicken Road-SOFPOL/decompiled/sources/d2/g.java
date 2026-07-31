package d2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f2122a;

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f2122a == ((g) obj).f2122a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2122a);
    }

    public final String toString() {
        int i = this.f2122a;
        return i == 0 ? "Button" : i == 1 ? "Checkbox" : i == 2 ? "Switch" : i == 3 ? "RadioButton" : i == 4 ? "Tab" : i == 5 ? "Image" : i == 6 ? "DropdownList" : i == 7 ? "Picker" : i == 8 ? "Carousel" : "Unknown";
    }
}
