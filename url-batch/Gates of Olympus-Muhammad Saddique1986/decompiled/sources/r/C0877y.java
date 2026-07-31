package r;

/* renamed from: r.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0877y implements X {

    /* renamed from: a, reason: collision with root package name */
    public final X f8094a;

    /* renamed from: b, reason: collision with root package name */
    public final X f8095b;

    public C0877y(X x3, X x4) {
        this.f8094a = x3;
        this.f8095b = x4;
    }

    @Override // r.X
    public final int a(O0.b bVar, O0.k kVar) {
        int a3 = this.f8094a.a(bVar, kVar) - this.f8095b.a(bVar, kVar);
        if (a3 < 0) {
            return 0;
        }
        return a3;
    }

    @Override // r.X
    public final int b(O0.b bVar) {
        int b3 = this.f8094a.b(bVar) - this.f8095b.b(bVar);
        if (b3 < 0) {
            return 0;
        }
        return b3;
    }

    @Override // r.X
    public final int c(O0.b bVar, O0.k kVar) {
        int c2 = this.f8094a.c(bVar, kVar) - this.f8095b.c(bVar, kVar);
        if (c2 < 0) {
            return 0;
        }
        return c2;
    }

    @Override // r.X
    public final int d(O0.b bVar) {
        int d3 = this.f8094a.d(bVar) - this.f8095b.d(bVar);
        if (d3 < 0) {
            return 0;
        }
        return d3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0877y)) {
            return false;
        }
        C0877y c0877y = (C0877y) obj;
        return f2.j.a(c0877y.f8094a, this.f8094a) && f2.j.a(c0877y.f8095b, this.f8095b);
    }

    public final int hashCode() {
        return this.f8095b.hashCode() + (this.f8094a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.f8094a + " - " + this.f8095b + ')';
    }
}
