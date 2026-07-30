package o7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l extends s0 {

    /* renamed from: c, reason: collision with root package name */
    public static final l f6903c = new l(m.f6906a);

    @Override // o7.n, o7.a
    public final void d(n7.a aVar, int i7, Object obj) {
        k kVar = (k) obj;
        r6.k.f(kVar, "builder");
        char k8 = aVar.k(this.f6944b, i7);
        kVar.b(kVar.d() + 1);
        char[] cArr = kVar.f6898a;
        int i8 = kVar.f6899b;
        kVar.f6899b = i8 + 1;
        cArr[i8] = k8;
    }

    @Override // o7.a
    public final Object e(Object obj) {
        char[] cArr = (char[]) obj;
        r6.k.f(cArr, "<this>");
        k kVar = new k();
        kVar.f6898a = cArr;
        kVar.f6899b = cArr.length;
        kVar.b(10);
        return kVar;
    }

    @Override // o7.s0
    public final Object h() {
        return new char[0];
    }
}
