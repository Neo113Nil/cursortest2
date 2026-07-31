package b0;

/* renamed from: b0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0253D {

    /* renamed from: a, reason: collision with root package name */
    public final int f4210a;

    public static final boolean a(int i3, int i4) {
        return i3 == i4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0253D) {
            return this.f4210a == ((C0253D) obj).f4210a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4210a);
    }

    public final String toString() {
        int i3 = this.f4210a;
        return a(i3, 0) ? "Argb8888" : a(i3, 1) ? "Alpha8" : a(i3, 2) ? "Rgb565" : a(i3, 3) ? "F16" : a(i3, 4) ? "Gpu" : "Unknown";
    }
}
