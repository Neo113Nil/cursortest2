package L0;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: c, reason: collision with root package name */
    public static final q f3524c = new q(2, false);

    /* renamed from: d, reason: collision with root package name */
    public static final q f3525d = new q(1, true);

    /* renamed from: a, reason: collision with root package name */
    public final int f3526a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3527b;

    public q(int i2, boolean z4) {
        this.f3526a = i2;
        this.f3527b = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f3526a == qVar.f3526a && this.f3527b == qVar.f3527b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3527b) + (Integer.hashCode(this.f3526a) * 31);
    }

    public final String toString() {
        return equals(f3524c) ? "TextMotion.Static" : equals(f3525d) ? "TextMotion.Animated" : "Invalid";
    }
}
