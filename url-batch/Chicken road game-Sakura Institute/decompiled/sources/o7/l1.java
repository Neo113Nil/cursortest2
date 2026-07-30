package o7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l1 extends s0 {

    /* renamed from: c, reason: collision with root package name */
    public static final l1 f6905c = new l1(m1.f6909a);

    @Override // o7.n, o7.a
    public final void d(n7.a aVar, int i7, Object obj) {
        k1 k1Var = (k1) obj;
        r6.k.f(k1Var, "builder");
        short x8 = aVar.w(this.f6944b, i7).x();
        k1Var.b(k1Var.d() + 1);
        short[] sArr = k1Var.f6901a;
        int i8 = k1Var.f6902b;
        k1Var.f6902b = i8 + 1;
        sArr[i8] = x8;
    }

    @Override // o7.a
    public final Object e(Object obj) {
        short[] sArr = ((d6.y) obj).f2638f;
        r6.k.f(sArr, "$this$toBuilder");
        k1 k1Var = new k1();
        k1Var.f6901a = sArr;
        k1Var.f6902b = sArr.length;
        k1Var.b(10);
        return k1Var;
    }

    @Override // o7.s0
    public final Object h() {
        return new d6.y(new short[0]);
    }
}
