package w2;

/* renamed from: w2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1033l extends S {

    /* renamed from: c, reason: collision with root package name */
    public static final C1033l f8678c = new C1033l(C1034m.f8680a);

    @Override // w2.AbstractC1035n, w2.AbstractC1022a
    public final void d(v2.a aVar, int i3, Object obj, boolean z3) {
        C1032k c1032k = (C1032k) obj;
        Z1.i.f(c1032k, "builder");
        char g3 = aVar.g(this.f8634b, i3);
        c1032k.b(c1032k.d() + 1);
        char[] cArr = c1032k.f8674a;
        int i4 = c1032k.f8675b;
        c1032k.f8675b = i4 + 1;
        cArr[i4] = g3;
    }

    @Override // w2.AbstractC1022a
    public final Object e(Object obj) {
        char[] cArr = (char[]) obj;
        Z1.i.f(cArr, "<this>");
        C1032k c1032k = new C1032k();
        c1032k.f8674a = cArr;
        c1032k.f8675b = cArr.length;
        c1032k.b(10);
        return c1032k;
    }

    @Override // w2.S
    public final Object h() {
        return new char[0];
    }
}
