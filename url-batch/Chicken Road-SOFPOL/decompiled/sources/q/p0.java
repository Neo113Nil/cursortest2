package q;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f5890a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5891b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5892c;

    public p0(float f6, float f8, long j7) {
        this.f5890a = f6;
        this.f5891b = f8;
        this.f5892c = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return Float.compare(this.f5890a, p0Var.f5890a) == 0 && Float.compare(this.f5891b, p0Var.f5891b) == 0 && this.f5892c == p0Var.f5892c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5892c) + a0.q.a(this.f5891b, Float.hashCode(this.f5890a) * 31, 31);
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.f5890a + ", distance=" + this.f5891b + ", duration=" + this.f5892c + ')';
    }
}
