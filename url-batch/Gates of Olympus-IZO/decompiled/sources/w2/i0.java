package w2;

/* loaded from: classes.dex */
public final class i0 extends S {

    /* renamed from: c, reason: collision with root package name */
    public static final i0 f8671c = new i0(j0.f8672a);

    @Override // w2.AbstractC1035n, w2.AbstractC1022a
    public final void d(v2.a aVar, int i3, Object obj, boolean z3) {
        h0 h0Var = (h0) obj;
        Z1.i.f(h0Var, "builder");
        long d3 = aVar.r(this.f8634b, i3).d();
        h0Var.b(h0Var.d() + 1);
        long[] jArr = h0Var.f8667a;
        int i4 = h0Var.f8668b;
        h0Var.f8668b = i4 + 1;
        jArr[i4] = d3;
    }

    @Override // w2.AbstractC1022a
    public final Object e(Object obj) {
        long[] jArr = ((L1.v) obj).f2725d;
        Z1.i.f(jArr, "$this$toBuilder");
        h0 h0Var = new h0();
        h0Var.f8667a = jArr;
        h0Var.f8668b = jArr.length;
        h0Var.b(10);
        return h0Var;
    }

    @Override // w2.S
    public final Object h() {
        return new L1.v(new long[0]);
    }
}
