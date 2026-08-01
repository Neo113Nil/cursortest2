package w2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: c, reason: collision with root package name */
    public static final s f10056c = new s(2, false);

    /* renamed from: d, reason: collision with root package name */
    public static final s f10057d = new s(1, true);

    /* renamed from: a, reason: collision with root package name */
    public final int f10058a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10059b;

    public s(int i3, boolean z10) {
        this.f10058a = i3;
        this.f10059b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f10058a == sVar.f10058a && this.f10059b == sVar.f10059b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10059b) + (Integer.hashCode(this.f10058a) * 31);
    }

    public final String toString() {
        return equals(f10056c) ? "TextMotion.Static" : equals(f10057d) ? "TextMotion.Animated" : "Invalid";
    }
}
