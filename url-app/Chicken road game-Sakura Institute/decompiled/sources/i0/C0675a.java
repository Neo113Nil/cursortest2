package i0;

/* renamed from: i0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0675a {

    /* renamed from: a, reason: collision with root package name */
    public final int f7000a;

    public final boolean equals(Object obj) {
        if (obj instanceof C0675a) {
            return this.f7000a == ((C0675a) obj).f7000a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7000a);
    }

    public final String toString() {
        int i2 = this.f7000a;
        return i2 == 1 ? "Touch" : i2 == 2 ? "Keyboard" : "Error";
    }
}
