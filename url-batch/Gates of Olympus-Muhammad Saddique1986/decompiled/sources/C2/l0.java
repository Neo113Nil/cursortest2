package C2;

/* loaded from: classes.dex */
public final class l0 extends S {

    /* renamed from: c, reason: collision with root package name */
    public static final l0 f766c = new l0(m0.f769a);

    @Override // C2.AbstractC0051n, C2.AbstractC0038a
    public final void d(B2.a aVar, int i3, Object obj, boolean z3) {
        k0 k0Var = (k0) obj;
        f2.j.f(k0Var, "builder");
        short s3 = aVar.E(this.f721b, i3).s();
        k0Var.b(k0Var.d() + 1);
        short[] sArr = k0Var.f763a;
        int i4 = k0Var.f764b;
        k0Var.f764b = i4 + 1;
        sArr[i4] = s3;
    }

    @Override // C2.AbstractC0038a
    public final Object e(Object obj) {
        short[] sArr = ((R1.x) obj).f4170d;
        f2.j.f(sArr, "$this$toBuilder");
        k0 k0Var = new k0();
        k0Var.f763a = sArr;
        k0Var.f764b = sArr.length;
        k0Var.b(10);
        return k0Var;
    }

    @Override // C2.S
    public final Object h() {
        return new R1.x(new short[0]);
    }
}
