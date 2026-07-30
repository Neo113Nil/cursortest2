package o7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a0 extends s0 {

    /* renamed from: c, reason: collision with root package name */
    public static final a0 f6855c = new a0(b0.f6858a);

    @Override // o7.n, o7.a
    public final void d(n7.a aVar, int i7, Object obj) {
        z zVar = (z) obj;
        r6.k.f(zVar, "builder");
        int r8 = aVar.r(this.f6944b, i7);
        zVar.b(zVar.d() + 1);
        int[] iArr = zVar.f6961a;
        int i8 = zVar.f6962b;
        zVar.f6962b = i8 + 1;
        iArr[i8] = r8;
    }

    @Override // o7.a
    public final Object e(Object obj) {
        int[] iArr = (int[]) obj;
        r6.k.f(iArr, "<this>");
        z zVar = new z();
        zVar.f6961a = iArr;
        zVar.f6962b = iArr.length;
        zVar.b(10);
        return zVar;
    }

    @Override // o7.s0
    public final Object h() {
        return new int[0];
    }
}
