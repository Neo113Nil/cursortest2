package u1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class v0 extends q6.j implements p6.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7286e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w0 f7287f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(w0 w0Var, int i) {
        super(2);
        this.f7286e = i;
        this.f7287f = w0Var;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f7286e) {
            case 0:
                this.f7287f.a().f7170e = (m0.v) obj2;
                break;
            case 1:
                w1.f0 f0Var = (w1.f0) obj;
                x xVar = new x(this.f7287f.a(), (p6.e) obj2);
                if (!q6.i.a(f0Var.f7658x, xVar)) {
                    f0Var.f7658x = xVar;
                    f0Var.C();
                }
                break;
            default:
                w1.f0 f0Var2 = (w1.f0) obj;
                w0 w0Var = this.f7287f;
                y0 y0Var = w0Var.f7293a;
                a0 a0Var = f0Var2.H;
                if (a0Var == null) {
                    a0Var = new a0(f0Var2, y0Var);
                    f0Var2.H = a0Var;
                }
                w0Var.f7294b = a0Var;
                w0Var.a().e();
                a0 a8 = w0Var.a();
                if (a8.f7171f != y0Var) {
                    a8.f7171f = y0Var;
                    a8.f(false);
                    w1.f0.U(a8.f7169d, false, 7);
                }
                break;
        }
        return c6.m.f1757a;
    }
}
