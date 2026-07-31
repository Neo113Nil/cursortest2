package w2;

/* loaded from: classes.dex */
public final class Y extends S {

    /* renamed from: c, reason: collision with root package name */
    public static final Y f8643c = new Y(Z.f8644a);

    @Override // w2.AbstractC1035n, w2.AbstractC1022a
    public final void d(v2.a aVar, int i3, Object obj, boolean z3) {
        X x3 = (X) obj;
        Z1.i.f(x3, "builder");
        short y3 = aVar.y(this.f8634b, i3);
        x3.b(x3.d() + 1);
        short[] sArr = x3.f8641a;
        int i4 = x3.f8642b;
        x3.f8642b = i4 + 1;
        sArr[i4] = y3;
    }

    @Override // w2.AbstractC1022a
    public final Object e(Object obj) {
        short[] sArr = (short[]) obj;
        Z1.i.f(sArr, "<this>");
        X x3 = new X();
        x3.f8641a = sArr;
        x3.f8642b = sArr.length;
        x3.b(10);
        return x3;
    }

    @Override // w2.S
    public final Object h() {
        return new short[0];
    }
}
