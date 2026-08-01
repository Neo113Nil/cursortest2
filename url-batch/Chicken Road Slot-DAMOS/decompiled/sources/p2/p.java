package p2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f7640a;

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f7640a == ((p) obj).f7640a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7640a);
    }

    public final String toString() {
        int i3 = this.f7640a;
        return i3 == 0 ? "None" : i3 == 1 ? "Weight" : i3 == 2 ? "Style" : i3 == 65535 ? "All" : "Invalid";
    }
}
