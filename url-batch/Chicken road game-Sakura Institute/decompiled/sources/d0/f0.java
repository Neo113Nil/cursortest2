package d0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f1943a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1944b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1945c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1946d;

    public f0(long j8, long j9, long j10, long j11) {
        this.f1943a = j8;
        this.f1944b = j9;
        this.f1945c = j10;
        this.f1946d = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return z0.u.c(this.f1943a, f0Var.f1943a) && z0.u.c(this.f1944b, f0Var.f1944b) && z0.u.c(this.f1945c, f0Var.f1945c) && z0.u.c(this.f1946d, f0Var.f1946d);
    }

    public final int hashCode() {
        int i7 = z0.u.f10058h;
        return Long.hashCode(this.f1946d) + a0.m.d(a0.m.d(Long.hashCode(this.f1943a) * 31, 31, this.f1944b), 31, this.f1945c);
    }
}
