package d4;

/* loaded from: classes.dex */
final class e extends x {

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ String f15657j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ String f15658k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ m0 f15659l;

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ g0 f15660m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(g0 g0Var, String str, String str2, m0 m0Var) {
        super(g0Var, true);
        this.f15660m = g0Var;
        this.f15657j = str;
        this.f15658k = str2;
        this.f15659l = m0Var;
    }

    @Override // d4.x
    final void a() {
        p0 p0Var;
        p0Var = this.f15660m.f15679i;
        ((p0) r3.o.i(p0Var)).f2(this.f15657j, this.f15658k, this.f15659l);
    }

    @Override // d4.x
    protected final void b() {
        this.f15659l.x2(null);
    }
}
