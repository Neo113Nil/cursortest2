package j0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f3637a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3638b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3639c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3640d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3641e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3642f;

    /* renamed from: g, reason: collision with root package name */
    public final long f3643g;

    public f1(long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        this.f3637a = j7;
        this.f3638b = j8;
        this.f3639c = j9;
        this.f3640d = j10;
        this.f3641e = j11;
        this.f3642f = j12;
        this.f3643g = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return f1.s.c(this.f3637a, f1Var.f3637a) && f1.s.c(this.f3640d, f1Var.f3640d) && f1.s.c(this.f3638b, f1Var.f3638b) && f1.s.c(this.f3641e, f1Var.f3641e) && f1.s.c(this.f3639c, f1Var.f3639c) && f1.s.c(this.f3642f, f1Var.f3642f) && f1.s.c(this.f3643g, f1Var.f3643g);
    }

    public final int hashCode() {
        int i = f1.s.i;
        return Long.hashCode(this.f3643g) + a0.q.c(a0.q.c(a0.q.c(a0.q.c(a0.q.c(Long.hashCode(this.f3637a) * 31, 31, this.f3640d), 31, this.f3638b), 31, this.f3641e), 31, this.f3639c), 31, this.f3642f);
    }
}
