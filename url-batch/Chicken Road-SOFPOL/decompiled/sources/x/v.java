package x;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class v implements r0 {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f8301a;

    /* renamed from: b, reason: collision with root package name */
    public final r0 f8302b;

    public v(r0 r0Var, r0 r0Var2) {
        this.f8301a = r0Var;
        this.f8302b = r0Var2;
    }

    @Override // x.r0
    public final int a(r2.c cVar) {
        int a8 = this.f8301a.a(cVar) - this.f8302b.a(cVar);
        if (a8 < 0) {
            return 0;
        }
        return a8;
    }

    @Override // x.r0
    public final int b(r2.c cVar, r2.l lVar) {
        int b8 = this.f8301a.b(cVar, lVar) - this.f8302b.b(cVar, lVar);
        if (b8 < 0) {
            return 0;
        }
        return b8;
    }

    @Override // x.r0
    public final int c(r2.c cVar, r2.l lVar) {
        int c8 = this.f8301a.c(cVar, lVar) - this.f8302b.c(cVar, lVar);
        if (c8 < 0) {
            return 0;
        }
        return c8;
    }

    @Override // x.r0
    public final int d(r2.c cVar) {
        int d8 = this.f8301a.d(cVar) - this.f8302b.d(cVar);
        if (d8 < 0) {
            return 0;
        }
        return d8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return q6.i.a(vVar.f8301a, this.f8301a) && q6.i.a(vVar.f8302b, this.f8302b);
    }

    public final int hashCode() {
        return this.f8302b.hashCode() + (this.f8301a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.f8301a + " - " + this.f8302b + ')';
    }
}
