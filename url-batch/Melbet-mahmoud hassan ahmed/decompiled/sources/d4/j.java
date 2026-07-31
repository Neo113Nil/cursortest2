package d4;

/* loaded from: classes.dex */
final class j extends x {

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ String f15688j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ g0 f15689k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(g0 g0Var, String str) {
        super(g0Var, true);
        this.f15689k = g0Var;
        this.f15688j = str;
    }

    @Override // d4.x
    final void a() {
        p0 p0Var;
        p0Var = this.f15689k.f15679i;
        ((p0) r3.o.i(p0Var)).S4(this.f15688j, this.f15740g);
    }
}
