package C2;

/* renamed from: C2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0042e extends S {

    /* renamed from: c, reason: collision with root package name */
    public static final C0042e f743c = new C0042e(C0043f.f746a);

    @Override // C2.AbstractC0051n, C2.AbstractC0038a
    public final void d(B2.a aVar, int i3, Object obj, boolean z3) {
        C0041d c0041d = (C0041d) obj;
        f2.j.f(c0041d, "builder");
        boolean e3 = aVar.e(this.f721b, i3);
        c0041d.b(c0041d.d() + 1);
        boolean[] zArr = c0041d.f739a;
        int i4 = c0041d.f740b;
        c0041d.f740b = i4 + 1;
        zArr[i4] = e3;
    }

    @Override // C2.AbstractC0038a
    public final Object e(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        f2.j.f(zArr, "<this>");
        C0041d c0041d = new C0041d();
        c0041d.f739a = zArr;
        c0041d.f740b = zArr.length;
        c0041d.b(10);
        return c0041d;
    }

    @Override // C2.S
    public final Object h() {
        return new boolean[0];
    }
}
