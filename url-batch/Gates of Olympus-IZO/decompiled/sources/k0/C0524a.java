package k0;

/* renamed from: k0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0524a {

    /* renamed from: a, reason: collision with root package name */
    public final int f5307a;

    public final boolean equals(Object obj) {
        if (obj instanceof C0524a) {
            return this.f5307a == ((C0524a) obj).f5307a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5307a);
    }

    public final String toString() {
        int i3 = this.f5307a;
        return i3 == 1 ? "Touch" : i3 == 2 ? "Keyboard" : "Error";
    }
}
