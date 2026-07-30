package o7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i1 extends s0 {

    /* renamed from: c, reason: collision with root package name */
    public static final i1 f6893c = new i1(j1.f6896a);

    @Override // o7.n, o7.a
    public final void d(n7.a aVar, int i7, Object obj) {
        h1 h1Var = (h1) obj;
        r6.k.f(h1Var, "builder");
        long d8 = aVar.w(this.f6944b, i7).d();
        h1Var.b(h1Var.d() + 1);
        long[] jArr = h1Var.f6888a;
        int i8 = h1Var.f6889b;
        h1Var.f6889b = i8 + 1;
        jArr[i8] = d8;
    }

    @Override // o7.a
    public final Object e(Object obj) {
        long[] jArr = ((d6.v) obj).f2635f;
        r6.k.f(jArr, "$this$toBuilder");
        h1 h1Var = new h1();
        h1Var.f6888a = jArr;
        h1Var.f6889b = jArr.length;
        h1Var.b(10);
        return h1Var;
    }

    @Override // o7.s0
    public final Object h() {
        return new d6.v(new long[0]);
    }
}
