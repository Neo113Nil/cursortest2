package j0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f3846a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3847b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3848c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3849d;

    public p0(long j7, long j8, long j9, long j10) {
        this.f3846a = j7;
        this.f3847b = j8;
        this.f3848c = j9;
        this.f3849d = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return f1.s.c(this.f3846a, p0Var.f3846a) && f1.s.c(this.f3847b, p0Var.f3847b) && f1.s.c(this.f3848c, p0Var.f3848c) && f1.s.c(this.f3849d, p0Var.f3849d);
    }

    public final int hashCode() {
        int i = f1.s.i;
        return Long.hashCode(this.f3849d) + a0.q.c(a0.q.c(Long.hashCode(this.f3846a) * 31, 31, this.f3847b), 31, this.f3848c);
    }
}
