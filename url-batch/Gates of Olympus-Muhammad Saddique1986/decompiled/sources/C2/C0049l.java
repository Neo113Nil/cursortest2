package C2;

/* renamed from: C2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0049l extends S {

    /* renamed from: c, reason: collision with root package name */
    public static final C0049l f765c = new C0049l(C0050m.f767a);

    @Override // C2.AbstractC0051n, C2.AbstractC0038a
    public final void d(B2.a aVar, int i3, Object obj, boolean z3) {
        C0048k c0048k = (C0048k) obj;
        f2.j.f(c0048k, "builder");
        char k3 = aVar.k(this.f721b, i3);
        c0048k.b(c0048k.d() + 1);
        char[] cArr = c0048k.f761a;
        int i4 = c0048k.f762b;
        c0048k.f762b = i4 + 1;
        cArr[i4] = k3;
    }

    @Override // C2.AbstractC0038a
    public final Object e(Object obj) {
        char[] cArr = (char[]) obj;
        f2.j.f(cArr, "<this>");
        C0048k c0048k = new C0048k();
        c0048k.f761a = cArr;
        c0048k.f762b = cArr.length;
        c0048k.b(10);
        return c0048k;
    }

    @Override // C2.S
    public final Object h() {
        return new char[0];
    }
}
