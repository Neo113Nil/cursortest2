package w2;

/* loaded from: classes.dex */
public final class c0 extends S {

    /* renamed from: c, reason: collision with root package name */
    public static final c0 f8651c = new c0(d0.f8654a);

    @Override // w2.AbstractC1035n, w2.AbstractC1022a
    public final void d(v2.a aVar, int i3, Object obj, boolean z3) {
        b0 b0Var = (b0) obj;
        Z1.i.f(b0Var, "builder");
        byte q2 = aVar.r(this.f8634b, i3).q();
        b0Var.b(b0Var.d() + 1);
        byte[] bArr = b0Var.f8648a;
        int i4 = b0Var.f8649b;
        b0Var.f8649b = i4 + 1;
        bArr[i4] = q2;
    }

    @Override // w2.AbstractC1022a
    public final Object e(Object obj) {
        byte[] bArr = ((L1.r) obj).f2721d;
        Z1.i.f(bArr, "$this$toBuilder");
        b0 b0Var = new b0();
        b0Var.f8648a = bArr;
        b0Var.f8649b = bArr.length;
        b0Var.b(10);
        return b0Var;
    }

    @Override // w2.S
    public final Object h() {
        return new L1.r(new byte[0]);
    }
}
