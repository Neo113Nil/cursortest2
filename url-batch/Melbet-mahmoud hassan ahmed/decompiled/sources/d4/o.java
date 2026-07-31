package d4;

/* loaded from: classes.dex */
final class o extends x {

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ m0 f15702j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ g0 f15703k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(g0 g0Var, m0 m0Var) {
        super(g0Var, true);
        this.f15703k = g0Var;
        this.f15702j = m0Var;
    }

    @Override // d4.x
    final void a() {
        p0 p0Var;
        p0Var = this.f15703k.f15679i;
        ((p0) r3.o.i(p0Var)).s3(this.f15702j);
    }

    @Override // d4.x
    protected final void b() {
        this.f15702j.x2(null);
    }
}
