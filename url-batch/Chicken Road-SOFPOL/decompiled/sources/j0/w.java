package j0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final long f3929a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3930b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3931c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3932d;

    public w(long j7, long j8, long j9, long j10) {
        this.f3929a = j7;
        this.f3930b = j8;
        this.f3931c = j9;
        this.f3932d = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return f1.s.c(this.f3929a, wVar.f3929a) && f1.s.c(this.f3930b, wVar.f3930b) && f1.s.c(this.f3931c, wVar.f3931c) && f1.s.c(this.f3932d, wVar.f3932d);
    }

    public final int hashCode() {
        int i = f1.s.i;
        return Long.hashCode(this.f3932d) + a0.q.c(a0.q.c(Long.hashCode(this.f3929a) * 31, 31, this.f3930b), 31, this.f3931c);
    }
}
