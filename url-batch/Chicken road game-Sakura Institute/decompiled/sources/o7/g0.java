package o7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g0 extends s0 {

    /* renamed from: c, reason: collision with root package name */
    public static final g0 f6882c = new g0(h0.f6886a);

    @Override // o7.n, o7.a
    public final void d(n7.a aVar, int i7, Object obj) {
        f0 f0Var = (f0) obj;
        r6.k.f(f0Var, "builder");
        long i8 = aVar.i(this.f6944b, i7);
        f0Var.b(f0Var.d() + 1);
        long[] jArr = f0Var.f6877a;
        int i9 = f0Var.f6878b;
        f0Var.f6878b = i9 + 1;
        jArr[i9] = i8;
    }

    @Override // o7.a
    public final Object e(Object obj) {
        long[] jArr = (long[]) obj;
        r6.k.f(jArr, "<this>");
        f0 f0Var = new f0();
        f0Var.f6877a = jArr;
        f0Var.f6878b = jArr.length;
        f0Var.b(10);
        return f0Var;
    }

    @Override // o7.s0
    public final Object h() {
        return new long[0];
    }
}
