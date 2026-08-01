package te;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class s extends g1 {

    /* renamed from: c, reason: collision with root package name */
    public static final s f9436c;

    static {
        wd.j.f10157a.getClass();
        f9436c = new s(t.f9439a);
    }

    @Override // te.a
    public final int h(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        return dArr.length;
    }

    @Override // te.q, te.a
    public final void j(y6.l lVar, int i3, Object obj) {
        r rVar = (r) obj;
        rVar.getClass();
        this.f9380b.getClass();
        double doubleValue = ((Double) lVar.e()).doubleValue();
        rVar.b(rVar.d() + 1);
        double[] dArr = rVar.f9428a;
        int i10 = rVar.f9429b;
        rVar.f9429b = i10 + 1;
        dArr[i10] = doubleValue;
    }

    @Override // te.a
    public final Object k(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        r rVar = new r();
        rVar.f9428a = dArr;
        rVar.f9429b = dArr.length;
        rVar.b(10);
        return rVar;
    }

    @Override // te.g1
    public final Object n() {
        return new double[0];
    }

    @Override // te.g1
    public final void o(e3.o oVar, Object obj, int i3) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        for (int i10 = 0; i10 < i3; i10++) {
            double d10 = dArr[i10];
            f1 f1Var = this.f9380b;
            f1Var.getClass();
            oVar.e(f1Var, i10);
            oVar.d(d10);
        }
    }
}
