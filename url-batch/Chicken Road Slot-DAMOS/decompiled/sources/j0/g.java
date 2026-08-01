package j0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final long f4855a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4856b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4857c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4858d;

    public g(long j, long j3, long j10, long j11) {
        this.f4855a = j;
        this.f4856b = j3;
        this.f4857c = j10;
        this.f4858d = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return k1.p.c(this.f4855a, gVar.f4855a) && k1.p.c(this.f4856b, gVar.f4856b) && k1.p.c(this.f4857c, gVar.f4857c) && k1.p.c(this.f4858d, gVar.f4858d);
    }

    public final int hashCode() {
        int i3 = k1.p.f5341h;
        hd.z zVar = hd.a0.f4495e;
        return Long.hashCode(this.f4858d) + n0.l.c(n0.l.c(Long.hashCode(this.f4855a) * 31, 31, this.f4856b), 31, this.f4857c);
    }
}
