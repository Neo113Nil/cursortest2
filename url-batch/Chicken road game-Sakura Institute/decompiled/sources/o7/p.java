package o7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class p extends s0 {

    /* renamed from: c, reason: collision with root package name */
    public static final p f6922c = new p(q.f6934a);

    @Override // o7.n, o7.a
    public final void d(n7.a aVar, int i7, Object obj) {
        o oVar = (o) obj;
        r6.k.f(oVar, "builder");
        double u8 = aVar.u(this.f6944b, i7);
        oVar.b(oVar.d() + 1);
        double[] dArr = oVar.f6916a;
        int i8 = oVar.f6917b;
        oVar.f6917b = i8 + 1;
        dArr[i8] = u8;
    }

    @Override // o7.a
    public final Object e(Object obj) {
        double[] dArr = (double[]) obj;
        r6.k.f(dArr, "<this>");
        o oVar = new o();
        oVar.f6916a = dArr;
        oVar.f6917b = dArr.length;
        oVar.b(10);
        return oVar;
    }

    @Override // o7.s0
    public final Object h() {
        return new double[0];
    }
}
