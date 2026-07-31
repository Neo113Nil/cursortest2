package w2;

/* loaded from: classes.dex */
public final class A extends S {

    /* renamed from: c, reason: collision with root package name */
    public static final A f8601c = new A(B.f8602a);

    @Override // w2.AbstractC1035n, w2.AbstractC1022a
    public final void d(v2.a aVar, int i3, Object obj, boolean z3) {
        C1046z c1046z = (C1046z) obj;
        Z1.i.f(c1046z, "builder");
        int w3 = aVar.w(this.f8634b, i3);
        c1046z.b(c1046z.d() + 1);
        int[] iArr = c1046z.f8708a;
        int i4 = c1046z.f8709b;
        c1046z.f8709b = i4 + 1;
        iArr[i4] = w3;
    }

    @Override // w2.AbstractC1022a
    public final Object e(Object obj) {
        int[] iArr = (int[]) obj;
        Z1.i.f(iArr, "<this>");
        C1046z c1046z = new C1046z();
        c1046z.f8708a = iArr;
        c1046z.f8709b = iArr.length;
        c1046z.b(10);
        return c1046z;
    }

    @Override // w2.S
    public final Object h() {
        return new int[0];
    }
}
