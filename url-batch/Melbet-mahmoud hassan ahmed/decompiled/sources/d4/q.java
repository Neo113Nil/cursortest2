package d4;

/* loaded from: classes.dex */
final class q extends x {

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ String f15709j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ Object f15710k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ g0 f15711l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(g0 g0Var, boolean z6, int i7, String str, Object obj, Object obj2, Object obj3) {
        super(g0Var, false);
        this.f15711l = g0Var;
        this.f15709j = str;
        this.f15710k = obj;
    }

    @Override // d4.x
    final void a() {
        p0 p0Var;
        p0Var = this.f15711l.f15679i;
        ((p0) r3.o.i(p0Var)).s1(5, this.f15709j, x3.b.B3(this.f15710k), x3.b.B3(null), x3.b.B3(null));
    }
}
