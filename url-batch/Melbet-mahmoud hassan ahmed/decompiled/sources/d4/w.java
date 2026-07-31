package d4;

/* loaded from: classes.dex */
final class w extends x {

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ String f15734j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ String f15735k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ Object f15736l;

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ boolean f15737m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ g0 f15738n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(g0 g0Var, String str, String str2, Object obj, boolean z6) {
        super(g0Var, true);
        this.f15738n = g0Var;
        this.f15734j = str;
        this.f15735k = str2;
        this.f15736l = obj;
        this.f15737m = z6;
    }

    @Override // d4.x
    final void a() {
        p0 p0Var;
        p0Var = this.f15738n.f15679i;
        ((p0) r3.o.i(p0Var)).J5(this.f15734j, this.f15735k, x3.b.B3(this.f15736l), this.f15737m, this.f15739f);
    }
}
