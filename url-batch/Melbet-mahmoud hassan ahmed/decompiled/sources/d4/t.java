package d4;

/* loaded from: classes.dex */
final class t extends x {

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ String f15724j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ m0 f15725k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ g0 f15726l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(g0 g0Var, String str, m0 m0Var) {
        super(g0Var, true);
        this.f15726l = g0Var;
        this.f15724j = str;
        this.f15725k = m0Var;
    }

    @Override // d4.x
    final void a() {
        p0 p0Var;
        p0Var = this.f15726l.f15679i;
        ((p0) r3.o.i(p0Var)).p6(this.f15724j, this.f15725k);
    }

    @Override // d4.x
    protected final void b() {
        this.f15725k.x2(null);
    }
}
