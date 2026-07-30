package o7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f1 extends s0 {

    /* renamed from: c, reason: collision with root package name */
    public static final f1 f6879c = new f1(g1.f6883a);

    @Override // o7.n, o7.a
    public final void d(n7.a aVar, int i7, Object obj) {
        e1 e1Var = (e1) obj;
        r6.k.f(e1Var, "builder");
        int s5 = aVar.w(this.f6944b, i7).s();
        e1Var.b(e1Var.d() + 1);
        int[] iArr = e1Var.f6873a;
        int i8 = e1Var.f6874b;
        e1Var.f6874b = i8 + 1;
        iArr[i8] = s5;
    }

    @Override // o7.a
    public final Object e(Object obj) {
        int[] iArr = ((d6.t) obj).f2633f;
        r6.k.f(iArr, "$this$toBuilder");
        e1 e1Var = new e1();
        e1Var.f6873a = iArr;
        e1Var.f6874b = iArr.length;
        e1Var.b(10);
        return e1Var;
    }

    @Override // o7.s0
    public final Object h() {
        return new d6.t(new int[0]);
    }
}
