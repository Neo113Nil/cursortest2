package w2;

/* renamed from: w2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1029h extends S {

    /* renamed from: c, reason: collision with root package name */
    public static final C1029h f8666c = new C1029h(C1030i.f8669a);

    @Override // w2.AbstractC1035n, w2.AbstractC1022a
    public final void d(v2.a aVar, int i3, Object obj, boolean z3) {
        C1028g c1028g = (C1028g) obj;
        Z1.i.f(c1028g, "builder");
        byte f3 = aVar.f(this.f8634b, i3);
        c1028g.b(c1028g.d() + 1);
        byte[] bArr = c1028g.f8662a;
        int i4 = c1028g.f8663b;
        c1028g.f8663b = i4 + 1;
        bArr[i4] = f3;
    }

    @Override // w2.AbstractC1022a
    public final Object e(Object obj) {
        byte[] bArr = (byte[]) obj;
        Z1.i.f(bArr, "<this>");
        C1028g c1028g = new C1028g();
        c1028g.f8662a = bArr;
        c1028g.f8663b = bArr.length;
        c1028g.b(10);
        return c1028g;
    }

    @Override // w2.S
    public final Object h() {
        return new byte[0];
    }
}
