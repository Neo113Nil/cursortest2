package C2;

/* loaded from: classes.dex */
public final class i0 extends S {

    /* renamed from: c, reason: collision with root package name */
    public static final i0 f758c = new i0(j0.f759a);

    @Override // C2.AbstractC0051n, C2.AbstractC0038a
    public final void d(B2.a aVar, int i3, Object obj, boolean z3) {
        h0 h0Var = (h0) obj;
        f2.j.f(h0Var, "builder");
        long c2 = aVar.E(this.f721b, i3).c();
        h0Var.b(h0Var.d() + 1);
        long[] jArr = h0Var.f754a;
        int i4 = h0Var.f755b;
        h0Var.f755b = i4 + 1;
        jArr[i4] = c2;
    }

    @Override // C2.AbstractC0038a
    public final Object e(Object obj) {
        long[] jArr = ((R1.u) obj).f4167d;
        f2.j.f(jArr, "$this$toBuilder");
        h0 h0Var = new h0();
        h0Var.f754a = jArr;
        h0Var.f755b = jArr.length;
        h0Var.b(10);
        return h0Var;
    }

    @Override // C2.S
    public final Object h() {
        return new R1.u(new long[0]);
    }
}
