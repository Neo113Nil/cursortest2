package w2;

/* loaded from: classes.dex */
public final class l0 extends S {

    /* renamed from: c, reason: collision with root package name */
    public static final l0 f8679c = new l0(m0.f8682a);

    @Override // w2.AbstractC1035n, w2.AbstractC1022a
    public final void d(v2.a aVar, int i3, Object obj, boolean z3) {
        k0 k0Var = (k0) obj;
        Z1.i.f(k0Var, "builder");
        short t3 = aVar.r(this.f8634b, i3).t();
        k0Var.b(k0Var.d() + 1);
        short[] sArr = k0Var.f8676a;
        int i4 = k0Var.f8677b;
        k0Var.f8677b = i4 + 1;
        sArr[i4] = t3;
    }

    @Override // w2.AbstractC1022a
    public final Object e(Object obj) {
        short[] sArr = ((L1.y) obj).f2728d;
        Z1.i.f(sArr, "$this$toBuilder");
        k0 k0Var = new k0();
        k0Var.f8676a = sArr;
        k0Var.f8677b = sArr.length;
        k0Var.b(10);
        return k0Var;
    }

    @Override // w2.S
    public final Object h() {
        return new L1.y(new short[0]);
    }
}
