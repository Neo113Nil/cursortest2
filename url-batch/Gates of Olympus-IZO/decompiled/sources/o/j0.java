package o;

/* loaded from: classes.dex */
public final class j0 implements N {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o0 f6547a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f6548b;

    public j0(o0 o0Var, l0 l0Var) {
        this.f6547a = o0Var;
        this.f6548b = l0Var;
    }

    @Override // o.N
    public final float a(float f3) {
        o0 o0Var = this.f6547a;
        long d3 = o0Var.d(o0Var.g(f3));
        o0 o0Var2 = this.f6548b.f6573a;
        o0Var2.f6598g = 2;
        n.e0 e0Var = o0Var2.f6593b;
        return o0Var.c(o0Var.f((e0Var == null || !(o0Var2.f6592a.a() || o0Var2.f6592a.c())) ? o0.a(o0Var2, o0Var2.f6599h, d3, 2) : e0Var.c(d3, o0Var2.f6598g, o0Var2.f6601j)));
    }
}
