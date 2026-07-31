package F0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f1451a;

    public static final boolean a(int i3, int i4) {
        return i3 == i4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f1451a == ((j) obj).f1451a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1451a);
    }

    public final String toString() {
        int i3 = this.f1451a;
        return a(i3, 0) ? "Normal" : a(i3, 1) ? "Italic" : "Invalid";
    }
}
