package o7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c1 extends s0 {

    /* renamed from: c, reason: collision with root package name */
    public static final c1 f6865c = new c1(d1.f6869a);

    @Override // o7.n, o7.a
    public final void d(n7.a aVar, int i7, Object obj) {
        b1 b1Var = (b1) obj;
        r6.k.f(b1Var, "builder");
        byte v5 = aVar.w(this.f6944b, i7).v();
        b1Var.b(b1Var.d() + 1);
        byte[] bArr = b1Var.f6860a;
        int i8 = b1Var.f6861b;
        b1Var.f6861b = i8 + 1;
        bArr[i8] = v5;
    }

    @Override // o7.a
    public final Object e(Object obj) {
        byte[] bArr = ((d6.r) obj).f2631f;
        r6.k.f(bArr, "$this$toBuilder");
        b1 b1Var = new b1();
        b1Var.f6860a = bArr;
        b1Var.f6861b = bArr.length;
        b1Var.b(10);
        return b1Var;
    }

    @Override // o7.s0
    public final Object h() {
        return new d6.r(new byte[0]);
    }
}
