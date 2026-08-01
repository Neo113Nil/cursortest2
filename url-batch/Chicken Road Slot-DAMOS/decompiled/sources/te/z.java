package te;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class z extends g1 {

    /* renamed from: c, reason: collision with root package name */
    public static final z f9471c;

    static {
        wd.k.f10158a.getClass();
        f9471c = new z(a0.f9333a);
    }

    @Override // te.a
    public final int h(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        return fArr.length;
    }

    @Override // te.q, te.a
    public final void j(y6.l lVar, int i3, Object obj) {
        y yVar = (y) obj;
        yVar.getClass();
        this.f9380b.getClass();
        float floatValue = ((Float) lVar.e()).floatValue();
        yVar.b(yVar.d() + 1);
        float[] fArr = yVar.f9467a;
        int i10 = yVar.f9468b;
        yVar.f9468b = i10 + 1;
        fArr[i10] = floatValue;
    }

    @Override // te.a
    public final Object k(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        y yVar = new y();
        yVar.f9467a = fArr;
        yVar.f9468b = fArr.length;
        yVar.b(10);
        return yVar;
    }

    @Override // te.g1
    public final Object n() {
        return new float[0];
    }

    @Override // te.g1
    public final void o(e3.o oVar, Object obj, int i3) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        for (int i10 = 0; i10 < i3; i10++) {
            float f3 = fArr[i10];
            f1 f1Var = this.f9380b;
            f1Var.getClass();
            oVar.e(f1Var, i10);
            oVar.f(f3);
        }
    }
}
