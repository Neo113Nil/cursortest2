package d0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final long f2481a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2482b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2483c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2484d;

    public w(long j8, long j9, long j10, long j11) {
        this.f2481a = j8;
        this.f2482b = j9;
        this.f2483c = j10;
        this.f2484d = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return z0.u.c(this.f2481a, wVar.f2481a) && z0.u.c(this.f2482b, wVar.f2482b) && z0.u.c(this.f2483c, wVar.f2483c) && z0.u.c(this.f2484d, wVar.f2484d);
    }

    public final int hashCode() {
        int i7 = z0.u.f10058h;
        return Long.hashCode(this.f2484d) + a0.m.d(a0.m.d(Long.hashCode(this.f2481a) * 31, 31, this.f2482b), 31, this.f2483c);
    }
}
