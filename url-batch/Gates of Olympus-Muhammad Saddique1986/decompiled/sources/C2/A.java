package C2;

/* loaded from: classes.dex */
public final class A extends S {

    /* renamed from: c, reason: collision with root package name */
    public static final A f688c = new A(B.f689a);

    @Override // C2.AbstractC0051n, C2.AbstractC0038a
    public final void d(B2.a aVar, int i3, Object obj, boolean z3) {
        C0062z c0062z = (C0062z) obj;
        f2.j.f(c0062z, "builder");
        int A3 = aVar.A(this.f721b, i3);
        c0062z.b(c0062z.d() + 1);
        int[] iArr = c0062z.f795a;
        int i4 = c0062z.f796b;
        c0062z.f796b = i4 + 1;
        iArr[i4] = A3;
    }

    @Override // C2.AbstractC0038a
    public final Object e(Object obj) {
        int[] iArr = (int[]) obj;
        f2.j.f(iArr, "<this>");
        C0062z c0062z = new C0062z();
        c0062z.f795a = iArr;
        c0062z.f796b = iArr.length;
        c0062z.b(10);
        return c0062z;
    }

    @Override // C2.S
    public final Object h() {
        return new int[0];
    }
}
