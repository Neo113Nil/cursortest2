package w2;

/* loaded from: classes.dex */
public final class f0 extends S {

    /* renamed from: c, reason: collision with root package name */
    public static final f0 f8661c = new f0(g0.f8664a);

    @Override // w2.AbstractC1035n, w2.AbstractC1022a
    public final void d(v2.a aVar, int i3, Object obj, boolean z3) {
        e0 e0Var = (e0) obj;
        Z1.i.f(e0Var, "builder");
        int l3 = aVar.r(this.f8634b, i3).l();
        e0Var.b(e0Var.d() + 1);
        int[] iArr = e0Var.f8657a;
        int i4 = e0Var.f8658b;
        e0Var.f8658b = i4 + 1;
        iArr[i4] = l3;
    }

    @Override // w2.AbstractC1022a
    public final Object e(Object obj) {
        int[] iArr = ((L1.t) obj).f2723d;
        Z1.i.f(iArr, "$this$toBuilder");
        e0 e0Var = new e0();
        e0Var.f8657a = iArr;
        e0Var.f8658b = iArr.length;
        e0Var.b(10);
        return e0Var;
    }

    @Override // w2.S
    public final Object h() {
        return new L1.t(new int[0]);
    }
}
