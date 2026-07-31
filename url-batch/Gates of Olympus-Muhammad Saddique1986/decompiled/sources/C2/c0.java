package C2;

/* loaded from: classes.dex */
public final class c0 extends S {

    /* renamed from: c, reason: collision with root package name */
    public static final c0 f738c = new c0(d0.f741a);

    @Override // C2.AbstractC0051n, C2.AbstractC0038a
    public final void d(B2.a aVar, int i3, Object obj, boolean z3) {
        b0 b0Var = (b0) obj;
        f2.j.f(b0Var, "builder");
        byte o3 = aVar.E(this.f721b, i3).o();
        b0Var.b(b0Var.d() + 1);
        byte[] bArr = b0Var.f735a;
        int i4 = b0Var.f736b;
        b0Var.f736b = i4 + 1;
        bArr[i4] = o3;
    }

    @Override // C2.AbstractC0038a
    public final Object e(Object obj) {
        byte[] bArr = ((R1.q) obj).f4163d;
        f2.j.f(bArr, "$this$toBuilder");
        b0 b0Var = new b0();
        b0Var.f735a = bArr;
        b0Var.f736b = bArr.length;
        b0Var.b(10);
        return b0Var;
    }

    @Override // C2.S
    public final Object h() {
        return new R1.q(new byte[0]);
    }
}
