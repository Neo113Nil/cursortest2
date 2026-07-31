package N0;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: c, reason: collision with root package name */
    public static final p f3560c = new p(2, false);

    /* renamed from: d, reason: collision with root package name */
    public static final p f3561d = new p(1, true);

    /* renamed from: a, reason: collision with root package name */
    public final int f3562a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3563b;

    public p(int i3, boolean z3) {
        this.f3562a = i3;
        this.f3563b = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f3562a == pVar.f3562a && this.f3563b == pVar.f3563b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3563b) + (Integer.hashCode(this.f3562a) * 31);
    }

    public final String toString() {
        return equals(f3560c) ? "TextMotion.Static" : equals(f3561d) ? "TextMotion.Animated" : "Invalid";
    }
}
