package q0;

/* loaded from: classes.dex */
public final class g0 implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f15015a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15016b;

    public g0(b0 b0Var, long j4) {
        this.f15015a = b0Var;
        this.f15016b = j4;
    }

    @Override // q0.b0
    public final void a() {
        this.f15015a.a();
    }

    @Override // q0.b0
    public final boolean isReady() {
        return this.f15015a.isReady();
    }

    @Override // q0.b0
    public final int k(long j4) {
        return this.f15015a.k(j4 - this.f15016b);
    }

    @Override // q0.b0
    public final int n(l2.e eVar, Z.f fVar, int i4) {
        int n = this.f15015a.n(eVar, fVar, i4);
        if (n == -4) {
            fVar.f3783g += this.f15016b;
        }
        return n;
    }
}
