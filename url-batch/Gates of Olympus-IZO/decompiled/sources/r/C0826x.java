package r;

/* renamed from: r.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0826x implements U {

    /* renamed from: a, reason: collision with root package name */
    public final U f7104a;

    /* renamed from: b, reason: collision with root package name */
    public final U f7105b;

    public C0826x(U u3, U u4) {
        this.f7104a = u3;
        this.f7105b = u4;
    }

    @Override // r.U
    public final int a(M0.b bVar) {
        int a3 = this.f7104a.a(bVar) - this.f7105b.a(bVar);
        if (a3 < 0) {
            return 0;
        }
        return a3;
    }

    @Override // r.U
    public final int b(M0.b bVar, M0.j jVar) {
        int b2 = this.f7104a.b(bVar, jVar) - this.f7105b.b(bVar, jVar);
        if (b2 < 0) {
            return 0;
        }
        return b2;
    }

    @Override // r.U
    public final int c(M0.b bVar) {
        int c3 = this.f7104a.c(bVar) - this.f7105b.c(bVar);
        if (c3 < 0) {
            return 0;
        }
        return c3;
    }

    @Override // r.U
    public final int d(M0.b bVar, M0.j jVar) {
        int d3 = this.f7104a.d(bVar, jVar) - this.f7105b.d(bVar, jVar);
        if (d3 < 0) {
            return 0;
        }
        return d3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0826x)) {
            return false;
        }
        C0826x c0826x = (C0826x) obj;
        return Z1.i.a(c0826x.f7104a, this.f7104a) && Z1.i.a(c0826x.f7105b, this.f7105b);
    }

    public final int hashCode() {
        return this.f7105b.hashCode() + (this.f7104a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.f7104a + " - " + this.f7105b + ')';
    }
}
