package j0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class x1 implements t.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3945a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3946b;

    public x1(long j7, boolean z3) {
        this.f3945a = z3;
        this.f3946b = j7;
    }

    @Override // t.i0
    public final w1.k a(v.i iVar) {
        return new m0(iVar, this.f3945a, new b1.b(16, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj;
        if (this.f3945a == x1Var.f3945a && r2.f.a(Float.NaN, Float.NaN)) {
            return f1.s.c(this.f3946b, x1Var.f3946b);
        }
        return false;
    }

    @Override // t.i0
    public final int hashCode() {
        int a8 = a0.q.a(Float.NaN, Boolean.hashCode(this.f3945a) * 31, 961);
        int i = f1.s.i;
        return Long.hashCode(this.f3946b) + a8;
    }
}
