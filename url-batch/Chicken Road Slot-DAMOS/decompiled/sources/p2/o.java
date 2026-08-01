package p2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f7639a;

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f7639a == ((o) obj).f7639a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7639a);
    }

    public final String toString() {
        int i3 = this.f7639a;
        return i3 == 0 ? "Normal" : i3 == 1 ? "Italic" : "Invalid";
    }
}
