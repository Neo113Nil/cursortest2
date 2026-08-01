package t1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f9223a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f9223a == ((a) obj).f9223a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9223a);
    }

    public final String toString() {
        int i3 = this.f9223a;
        return i3 == 1 ? "Touch" : i3 == 2 ? "Keyboard" : "Error";
    }
}
