package H0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f2594a;

    public static final boolean a(int i3, int i4) {
        return i3 == i4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f2594a == ((i) obj).f2594a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2594a);
    }

    public final String toString() {
        int i3 = this.f2594a;
        return a(i3, 0) ? "Normal" : a(i3, 1) ? "Italic" : "Invalid";
    }
}
