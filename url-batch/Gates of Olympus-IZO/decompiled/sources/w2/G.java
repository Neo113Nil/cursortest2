package w2;

/* loaded from: classes.dex */
public final class G extends S {

    /* renamed from: c, reason: collision with root package name */
    public static final G f8610c = new G(H.f8611a);

    @Override // w2.AbstractC1035n, w2.AbstractC1022a
    public final void d(v2.a aVar, int i3, Object obj, boolean z3) {
        F f3 = (F) obj;
        Z1.i.f(f3, "builder");
        long n3 = aVar.n(this.f8634b, i3);
        f3.b(f3.d() + 1);
        long[] jArr = f3.f8608a;
        int i4 = f3.f8609b;
        f3.f8609b = i4 + 1;
        jArr[i4] = n3;
    }

    @Override // w2.AbstractC1022a
    public final Object e(Object obj) {
        long[] jArr = (long[]) obj;
        Z1.i.f(jArr, "<this>");
        F f3 = new F();
        f3.f8608a = jArr;
        f3.f8609b = jArr.length;
        f3.b(10);
        return f3;
    }

    @Override // w2.S
    public final Object h() {
        return new long[0];
    }
}
