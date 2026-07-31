package a3;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f87a;

    /* renamed from: b, reason: collision with root package name */
    public final double f88b;

    /* renamed from: c, reason: collision with root package name */
    public final double f89c;

    /* renamed from: d, reason: collision with root package name */
    public final double f90d;

    /* renamed from: e, reason: collision with root package name */
    public final int f91e;

    public i0(String str, double d7, double d8, double d9, int i7) {
        this.f87a = str;
        this.f89c = d7;
        this.f88b = d8;
        this.f90d = d9;
        this.f91e = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return r3.n.a(this.f87a, i0Var.f87a) && this.f88b == i0Var.f88b && this.f89c == i0Var.f89c && this.f91e == i0Var.f91e && Double.compare(this.f90d, i0Var.f90d) == 0;
    }

    public final int hashCode() {
        return r3.n.b(this.f87a, Double.valueOf(this.f88b), Double.valueOf(this.f89c), Double.valueOf(this.f90d), Integer.valueOf(this.f91e));
    }

    public final String toString() {
        return r3.n.c(this).a("name", this.f87a).a("minBound", Double.valueOf(this.f89c)).a("maxBound", Double.valueOf(this.f88b)).a("percent", Double.valueOf(this.f90d)).a("count", Integer.valueOf(this.f91e)).toString();
    }
}
