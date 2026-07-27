package F0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f2611a;

    public static final boolean a(int i2, int i4) {
        return i2 == i4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f2611a == ((i) obj).f2611a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2611a);
    }

    public final String toString() {
        int i2 = this.f2611a;
        return a(i2, 0) ? "Normal" : a(i2, 1) ? "Italic" : "Invalid";
    }
}
