package j0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final long f3794a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3795b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3796c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3797d;

    public n(long j7, long j8, long j9, long j10) {
        this.f3794a = j7;
        this.f3795b = j8;
        this.f3796c = j9;
        this.f3797d = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return f1.s.c(this.f3794a, nVar.f3794a) && f1.s.c(this.f3795b, nVar.f3795b) && f1.s.c(this.f3796c, nVar.f3796c) && f1.s.c(this.f3797d, nVar.f3797d);
    }

    public final int hashCode() {
        int i = f1.s.i;
        return Long.hashCode(this.f3797d) + a0.q.c(a0.q.c(Long.hashCode(this.f3794a) * 31, 31, this.f3795b), 31, this.f3796c);
    }
}
