package o;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b1 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f1 f6568a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1 f6569b;

    public b1(f1 f1Var, d1 d1Var) {
        this.f6568a = f1Var;
        this.f6569b = d1Var;
    }

    @Override // o.n0
    public final float a(float f9) {
        f1 f1Var = this.f6568a;
        long d8 = f1Var.d(f1Var.g(f9));
        f1 f1Var2 = this.f6569b.f6593a;
        f1Var2.f6615g = 2;
        m.w0 w0Var = f1Var2.f6610b;
        return f1Var.c(f1Var.f((w0Var == null || !(f1Var2.f6609a.d() || f1Var2.f6609a.a())) ? f1.a(f1Var2, f1Var2.f6616h, d8, 2) : w0Var.a(d8, f1Var2.f6615g, f1Var2.f6618j)));
    }
}
