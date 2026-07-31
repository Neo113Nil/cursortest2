package C2;

/* renamed from: C2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0045h extends S {

    /* renamed from: c, reason: collision with root package name */
    public static final C0045h f753c = new C0045h(C0046i.f756a);

    @Override // C2.AbstractC0051n, C2.AbstractC0038a
    public final void d(B2.a aVar, int i3, Object obj, boolean z3) {
        C0044g c0044g = (C0044g) obj;
        f2.j.f(c0044g, "builder");
        byte y3 = aVar.y(this.f721b, i3);
        c0044g.b(c0044g.d() + 1);
        byte[] bArr = c0044g.f749a;
        int i4 = c0044g.f750b;
        c0044g.f750b = i4 + 1;
        bArr[i4] = y3;
    }

    @Override // C2.AbstractC0038a
    public final Object e(Object obj) {
        byte[] bArr = (byte[]) obj;
        f2.j.f(bArr, "<this>");
        C0044g c0044g = new C0044g();
        c0044g.f749a = bArr;
        c0044g.f750b = bArr.length;
        c0044g.b(10);
        return c0044g;
    }

    @Override // C2.S
    public final Object h() {
        return new byte[0];
    }
}
