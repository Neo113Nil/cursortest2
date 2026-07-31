package w2;

/* renamed from: w2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1037p extends S {

    /* renamed from: c, reason: collision with root package name */
    public static final C1037p f8691c = new C1037p(C1038q.f8692a);

    @Override // w2.AbstractC1035n, w2.AbstractC1022a
    public final void d(v2.a aVar, int i3, Object obj, boolean z3) {
        C1036o c1036o = (C1036o) obj;
        Z1.i.f(c1036o, "builder");
        double x3 = aVar.x(this.f8634b, i3);
        c1036o.b(c1036o.d() + 1);
        double[] dArr = c1036o.f8687a;
        int i4 = c1036o.f8688b;
        c1036o.f8688b = i4 + 1;
        dArr[i4] = x3;
    }

    @Override // w2.AbstractC1022a
    public final Object e(Object obj) {
        double[] dArr = (double[]) obj;
        Z1.i.f(dArr, "<this>");
        C1036o c1036o = new C1036o();
        c1036o.f8687a = dArr;
        c1036o.f8688b = dArr.length;
        c1036o.b(10);
        return c1036o;
    }

    @Override // w2.S
    public final Object h() {
        return new double[0];
    }
}
