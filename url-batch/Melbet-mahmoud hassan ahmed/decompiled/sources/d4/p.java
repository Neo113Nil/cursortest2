package d4;

/* loaded from: classes.dex */
final class p extends x {

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ String f15704j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ String f15705k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ boolean f15706l;

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ m0 f15707m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ g0 f15708n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(g0 g0Var, String str, String str2, boolean z6, m0 m0Var) {
        super(g0Var, true);
        this.f15708n = g0Var;
        this.f15704j = str;
        this.f15705k = str2;
        this.f15706l = z6;
        this.f15707m = m0Var;
    }

    @Override // d4.x
    final void a() {
        p0 p0Var;
        p0Var = this.f15708n.f15679i;
        ((p0) r3.o.i(p0Var)).i6(this.f15704j, this.f15705k, this.f15706l, this.f15707m);
    }

    @Override // d4.x
    protected final void b() {
        this.f15707m.x2(null);
    }
}
