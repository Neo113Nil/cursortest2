package k0;

/* renamed from: k0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0562a {

    /* renamed from: a, reason: collision with root package name */
    public final int f6411a;

    public final boolean equals(Object obj) {
        if (obj instanceof C0562a) {
            return this.f6411a == ((C0562a) obj).f6411a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6411a);
    }

    public final String toString() {
        int i3 = this.f6411a;
        return i3 == 1 ? "Touch" : i3 == 2 ? "Keyboard" : "Error";
    }
}
