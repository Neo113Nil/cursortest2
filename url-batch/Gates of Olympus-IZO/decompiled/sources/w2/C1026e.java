package w2;

/* renamed from: w2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1026e extends S {

    /* renamed from: c, reason: collision with root package name */
    public static final C1026e f8656c = new C1026e(C1027f.f8659a);

    @Override // w2.AbstractC1035n, w2.AbstractC1022a
    public final void d(v2.a aVar, int i3, Object obj, boolean z3) {
        C1025d c1025d = (C1025d) obj;
        Z1.i.f(c1025d, "builder");
        boolean b2 = aVar.b(this.f8634b, i3);
        c1025d.b(c1025d.d() + 1);
        boolean[] zArr = c1025d.f8652a;
        int i4 = c1025d.f8653b;
        c1025d.f8653b = i4 + 1;
        zArr[i4] = b2;
    }

    @Override // w2.AbstractC1022a
    public final Object e(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        Z1.i.f(zArr, "<this>");
        C1025d c1025d = new C1025d();
        c1025d.f8652a = zArr;
        c1025d.f8653b = zArr.length;
        c1025d.b(10);
        return c1025d;
    }

    @Override // w2.S
    public final Object h() {
        return new boolean[0];
    }
}
