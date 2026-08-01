package te;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b2 extends g1 {

    /* renamed from: c, reason: collision with root package name */
    public static final b2 f9341c;

    static {
        hd.e0.f4499e.getClass();
        f9341c = new b2(c2.f9349a);
    }

    @Override // te.a
    public final int h(Object obj) {
        return ((hd.f0) obj).f4504d.length;
    }

    @Override // te.q, te.a
    public final void j(y6.l lVar, int i3, Object obj) {
        a2 a2Var = (a2) obj;
        a2Var.getClass();
        f1 f1Var = this.f9380b;
        f1Var.getClass();
        lVar.b(f1Var.h(i3));
        short shortValue = ((Short) lVar.e()).shortValue();
        hd.d0 d0Var = hd.e0.f4499e;
        a2Var.b(a2Var.d() + 1);
        short[] sArr = a2Var.f9335a;
        int i10 = a2Var.f9336b;
        a2Var.f9336b = i10 + 1;
        sArr[i10] = shortValue;
    }

    @Override // te.a
    public final Object k(Object obj) {
        short[] sArr = ((hd.f0) obj).f4504d;
        a2 a2Var = new a2();
        a2Var.f9335a = sArr;
        a2Var.f9336b = sArr.length;
        a2Var.b(10);
        return a2Var;
    }

    @Override // te.g1
    public final Object n() {
        return new hd.f0(new short[0]);
    }

    @Override // te.g1
    public final void o(e3.o oVar, Object obj, int i3) {
        short[] sArr = ((hd.f0) obj).f4504d;
        for (int i10 = 0; i10 < i3; i10++) {
            e3.o h10 = oVar.h(this.f9380b, i10);
            short s3 = sArr[i10];
            hd.d0 d0Var = hd.e0.f4499e;
            h10.m(s3);
        }
    }
}
