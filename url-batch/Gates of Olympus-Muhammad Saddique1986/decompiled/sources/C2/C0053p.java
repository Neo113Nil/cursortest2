package C2;

/* renamed from: C2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0053p extends S {

    /* renamed from: c, reason: collision with root package name */
    public static final C0053p f778c = new C0053p(C0054q.f779a);

    @Override // C2.AbstractC0051n, C2.AbstractC0038a
    public final void d(B2.a aVar, int i3, Object obj, boolean z3) {
        C0052o c0052o = (C0052o) obj;
        f2.j.f(c0052o, "builder");
        double q3 = aVar.q(this.f721b, i3);
        c0052o.b(c0052o.d() + 1);
        double[] dArr = c0052o.f774a;
        int i4 = c0052o.f775b;
        c0052o.f775b = i4 + 1;
        dArr[i4] = q3;
    }

    @Override // C2.AbstractC0038a
    public final Object e(Object obj) {
        double[] dArr = (double[]) obj;
        f2.j.f(dArr, "<this>");
        C0052o c0052o = new C0052o();
        c0052o.f774a = dArr;
        c0052o.f775b = dArr.length;
        c0052o.b(10);
        return c0052o;
    }

    @Override // C2.S
    public final Object h() {
        return new double[0];
    }
}
