package te;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n1 extends g1 {

    /* renamed from: c, reason: collision with root package name */
    public static final n1 f9409c;

    static {
        wd.e0.f10151a.getClass();
        f9409c = new n1(o1.f9414a);
    }

    @Override // te.a
    public final int h(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        return sArr.length;
    }

    @Override // te.q, te.a
    public final void j(y6.l lVar, int i3, Object obj) {
        m1 m1Var = (m1) obj;
        m1Var.getClass();
        this.f9380b.getClass();
        short shortValue = ((Short) lVar.e()).shortValue();
        m1Var.b(m1Var.d() + 1);
        short[] sArr = m1Var.f9405a;
        int i10 = m1Var.f9406b;
        m1Var.f9406b = i10 + 1;
        sArr[i10] = shortValue;
    }

    @Override // te.a
    public final Object k(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        m1 m1Var = new m1();
        m1Var.f9405a = sArr;
        m1Var.f9406b = sArr.length;
        m1Var.b(10);
        return m1Var;
    }

    @Override // te.g1
    public final Object n() {
        return new short[0];
    }

    @Override // te.g1
    public final void o(e3.o oVar, Object obj, int i3) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        for (int i10 = 0; i10 < i3; i10++) {
            short s3 = sArr[i10];
            f1 f1Var = this.f9380b;
            f1Var.getClass();
            oVar.e(f1Var, i10);
            oVar.m(s3);
        }
    }
}
