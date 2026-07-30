package o7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class u extends s0 {

    /* renamed from: c, reason: collision with root package name */
    public static final u f6949c = new u(v.f6951a);

    @Override // o7.n, o7.a
    public final void d(n7.a aVar, int i7, Object obj) {
        t tVar = (t) obj;
        r6.k.f(tVar, "builder");
        float e9 = aVar.e(this.f6944b, i7);
        tVar.b(tVar.d() + 1);
        float[] fArr = tVar.f6945a;
        int i8 = tVar.f6946b;
        tVar.f6946b = i8 + 1;
        fArr[i8] = e9;
    }

    @Override // o7.a
    public final Object e(Object obj) {
        float[] fArr = (float[]) obj;
        r6.k.f(fArr, "<this>");
        t tVar = new t();
        tVar.f6945a = fArr;
        tVar.f6946b = fArr.length;
        tVar.b(10);
        return tVar;
    }

    @Override // o7.s0
    public final Object h() {
        return new float[0];
    }
}
