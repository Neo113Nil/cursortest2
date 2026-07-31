package C2;

/* loaded from: classes.dex */
public final class Y extends S {

    /* renamed from: c, reason: collision with root package name */
    public static final Y f730c = new Y(Z.f731a);

    @Override // C2.AbstractC0051n, C2.AbstractC0038a
    public final void d(B2.a aVar, int i3, Object obj, boolean z3) {
        X x3 = (X) obj;
        f2.j.f(x3, "builder");
        short x4 = aVar.x(this.f721b, i3);
        x3.b(x3.d() + 1);
        short[] sArr = x3.f728a;
        int i4 = x3.f729b;
        x3.f729b = i4 + 1;
        sArr[i4] = x4;
    }

    @Override // C2.AbstractC0038a
    public final Object e(Object obj) {
        short[] sArr = (short[]) obj;
        f2.j.f(sArr, "<this>");
        X x3 = new X();
        x3.f728a = sArr;
        x3.f729b = sArr.length;
        x3.b(10);
        return x3;
    }

    @Override // C2.S
    public final Object h() {
        return new short[0];
    }
}
