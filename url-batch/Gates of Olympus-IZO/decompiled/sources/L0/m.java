package L0;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    public static final m f2693c = new m(2, false);

    /* renamed from: d, reason: collision with root package name */
    public static final m f2694d = new m(1, true);

    /* renamed from: a, reason: collision with root package name */
    public final int f2695a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2696b;

    public m(int i3, boolean z3) {
        this.f2695a = i3;
        this.f2696b = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f2695a == mVar.f2695a && this.f2696b == mVar.f2696b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2696b) + (Integer.hashCode(this.f2695a) * 31);
    }

    public final String toString() {
        return equals(f2693c) ? "TextMotion.Static" : equals(f2694d) ? "TextMotion.Animated" : "Invalid";
    }
}
