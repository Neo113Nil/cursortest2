package x;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class o0 implements r0 {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f8257a;

    /* renamed from: b, reason: collision with root package name */
    public final r0 f8258b;

    public o0(r0 r0Var, r0 r0Var2) {
        this.f8257a = r0Var;
        this.f8258b = r0Var2;
    }

    @Override // x.r0
    public final int a(r2.c cVar) {
        return Math.max(this.f8257a.a(cVar), this.f8258b.a(cVar));
    }

    @Override // x.r0
    public final int b(r2.c cVar, r2.l lVar) {
        return Math.max(this.f8257a.b(cVar, lVar), this.f8258b.b(cVar, lVar));
    }

    @Override // x.r0
    public final int c(r2.c cVar, r2.l lVar) {
        return Math.max(this.f8257a.c(cVar, lVar), this.f8258b.c(cVar, lVar));
    }

    @Override // x.r0
    public final int d(r2.c cVar) {
        return Math.max(this.f8257a.d(cVar), this.f8258b.d(cVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return q6.i.a(o0Var.f8257a, this.f8257a) && q6.i.a(o0Var.f8258b, this.f8258b);
    }

    public final int hashCode() {
        return (this.f8258b.hashCode() * 31) + this.f8257a.hashCode();
    }

    public final String toString() {
        return "(" + this.f8257a + " ∪ " + this.f8258b + ')';
    }
}
