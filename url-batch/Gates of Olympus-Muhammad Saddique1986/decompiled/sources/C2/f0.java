package C2;

/* loaded from: classes.dex */
public final class f0 extends S {

    /* renamed from: c, reason: collision with root package name */
    public static final f0 f748c = new f0(g0.f751a);

    @Override // C2.AbstractC0051n, C2.AbstractC0038a
    public final void d(B2.a aVar, int i3, Object obj, boolean z3) {
        e0 e0Var = (e0) obj;
        f2.j.f(e0Var, "builder");
        int i4 = aVar.E(this.f721b, i3).i();
        e0Var.b(e0Var.d() + 1);
        int[] iArr = e0Var.f744a;
        int i5 = e0Var.f745b;
        e0Var.f745b = i5 + 1;
        iArr[i5] = i4;
    }

    @Override // C2.AbstractC0038a
    public final Object e(Object obj) {
        int[] iArr = ((R1.s) obj).f4165d;
        f2.j.f(iArr, "$this$toBuilder");
        e0 e0Var = new e0();
        e0Var.f744a = iArr;
        e0Var.f745b = iArr.length;
        e0Var.b(10);
        return e0Var;
    }

    @Override // C2.S
    public final Object h() {
        return new R1.s(new int[0]);
    }
}
