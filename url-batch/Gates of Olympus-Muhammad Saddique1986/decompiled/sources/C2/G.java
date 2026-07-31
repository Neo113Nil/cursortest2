package C2;

/* loaded from: classes.dex */
public final class G extends S {

    /* renamed from: c, reason: collision with root package name */
    public static final G f697c = new G(H.f698a);

    @Override // C2.AbstractC0051n, C2.AbstractC0038a
    public final void d(B2.a aVar, int i3, Object obj, boolean z3) {
        F f3 = (F) obj;
        f2.j.f(f3, "builder");
        long p3 = aVar.p(this.f721b, i3);
        f3.b(f3.d() + 1);
        long[] jArr = f3.f695a;
        int i4 = f3.f696b;
        f3.f696b = i4 + 1;
        jArr[i4] = p3;
    }

    @Override // C2.AbstractC0038a
    public final Object e(Object obj) {
        long[] jArr = (long[]) obj;
        f2.j.f(jArr, "<this>");
        F f3 = new F();
        f3.f695a = jArr;
        f3.f696b = jArr.length;
        f3.b(10);
        return f3;
    }

    @Override // C2.S
    public final Object h() {
        return new long[0];
    }
}
