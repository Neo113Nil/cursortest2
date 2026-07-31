package d4;

/* loaded from: classes.dex */
final class m extends x {

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ m0 f15696j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ g0 f15697k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(g0 g0Var, m0 m0Var) {
        super(g0Var, true);
        this.f15697k = g0Var;
        this.f15696j = m0Var;
    }

    @Override // d4.x
    final void a() {
        p0 p0Var;
        p0Var = this.f15697k.f15679i;
        ((p0) r3.o.i(p0Var)).K1(this.f15696j);
    }

    @Override // d4.x
    protected final void b() {
        this.f15696j.x2(null);
    }
}
