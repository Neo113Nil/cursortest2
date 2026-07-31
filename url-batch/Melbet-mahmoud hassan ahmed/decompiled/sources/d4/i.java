package d4;

/* loaded from: classes.dex */
final class i extends x {

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ String f15686j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ g0 f15687k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(g0 g0Var, String str) {
        super(g0Var, true);
        this.f15687k = g0Var;
        this.f15686j = str;
    }

    @Override // d4.x
    final void a() {
        p0 p0Var;
        p0Var = this.f15687k.f15679i;
        ((p0) r3.o.i(p0Var)).f1(this.f15686j, this.f15740g);
    }
}
