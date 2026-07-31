package C2;

/* renamed from: C2.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0057u extends S {

    /* renamed from: c, reason: collision with root package name */
    public static final C0057u f790c = new C0057u(C0058v.f791a);

    @Override // C2.AbstractC0051n, C2.AbstractC0038a
    public final void d(B2.a aVar, int i3, Object obj, boolean z3) {
        C0056t c0056t = (C0056t) obj;
        f2.j.f(c0056t, "builder");
        float l3 = aVar.l(this.f721b, i3);
        c0056t.b(c0056t.d() + 1);
        float[] fArr = c0056t.f788a;
        int i4 = c0056t.f789b;
        c0056t.f789b = i4 + 1;
        fArr[i4] = l3;
    }

    @Override // C2.AbstractC0038a
    public final Object e(Object obj) {
        float[] fArr = (float[]) obj;
        f2.j.f(fArr, "<this>");
        C0056t c0056t = new C0056t();
        c0056t.f788a = fArr;
        c0056t.f789b = fArr.length;
        c0056t.b(10);
        return c0056t;
    }

    @Override // C2.S
    public final Object h() {
        return new float[0];
    }
}
