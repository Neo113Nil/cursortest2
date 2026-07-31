package u;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f6949a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6950b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6951c;

    public d0(long j7, long j8, boolean z3) {
        this.f6949a = j7;
        this.f6950b = j8;
        this.f6951c = z3;
    }

    public final d0 a(d0 d0Var) {
        return new d0(e1.b.e(this.f6949a, d0Var.f6949a), Math.max(this.f6950b, d0Var.f6950b), this.f6951c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return e1.b.b(this.f6949a, d0Var.f6949a) && this.f6950b == d0Var.f6950b && this.f6951c == d0Var.f6951c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6951c) + a0.q.c(Long.hashCode(this.f6949a) * 31, 31, this.f6950b);
    }

    public final String toString() {
        return "MouseWheelScrollDelta(value=" + ((Object) e1.b.g(this.f6949a)) + ", timeMillis=" + this.f6950b + ", shouldApplyImmediately=" + this.f6951c + ')';
    }
}
