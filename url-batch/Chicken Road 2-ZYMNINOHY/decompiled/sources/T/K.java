package T;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public final C0095m f2668a;

    public K(C0095m c0095m) {
        this.f2668a = c0095m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof K) {
            return this.f2668a.equals(((K) obj).f2668a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2668a.f2805a.hashCode();
    }
}
