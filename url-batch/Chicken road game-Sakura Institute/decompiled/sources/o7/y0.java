package o7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class y0 extends s0 {

    /* renamed from: c, reason: collision with root package name */
    public static final y0 f6960c = new y0(z0.f6963a);

    @Override // o7.n, o7.a
    public final void d(n7.a aVar, int i7, Object obj) {
        x0 x0Var = (x0) obj;
        r6.k.f(x0Var, "builder");
        short f9 = aVar.f(this.f6944b, i7);
        x0Var.b(x0Var.d() + 1);
        short[] sArr = x0Var.f6957a;
        int i8 = x0Var.f6958b;
        x0Var.f6958b = i8 + 1;
        sArr[i8] = f9;
    }

    @Override // o7.a
    public final Object e(Object obj) {
        short[] sArr = (short[]) obj;
        r6.k.f(sArr, "<this>");
        x0 x0Var = new x0();
        x0Var.f6957a = sArr;
        x0Var.f6958b = sArr.length;
        x0Var.b(10);
        return x0Var;
    }

    @Override // o7.s0
    public final Object h() {
        return new short[0];
    }
}
