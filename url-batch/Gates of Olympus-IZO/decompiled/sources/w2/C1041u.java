package w2;

/* renamed from: w2.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1041u extends S {

    /* renamed from: c, reason: collision with root package name */
    public static final C1041u f8703c = new C1041u(C1042v.f8704a);

    @Override // w2.AbstractC1035n, w2.AbstractC1022a
    public final void d(v2.a aVar, int i3, Object obj, boolean z3) {
        C1040t c1040t = (C1040t) obj;
        Z1.i.f(c1040t, "builder");
        float j3 = aVar.j(this.f8634b, i3);
        c1040t.b(c1040t.d() + 1);
        float[] fArr = c1040t.f8701a;
        int i4 = c1040t.f8702b;
        c1040t.f8702b = i4 + 1;
        fArr[i4] = j3;
    }

    @Override // w2.AbstractC1022a
    public final Object e(Object obj) {
        float[] fArr = (float[]) obj;
        Z1.i.f(fArr, "<this>");
        C1040t c1040t = new C1040t();
        c1040t.f8701a = fArr;
        c1040t.f8702b = fArr.length;
        c1040t.b(10);
        return c1040t;
    }

    @Override // w2.S
    public final Object h() {
        return new float[0];
    }
}
