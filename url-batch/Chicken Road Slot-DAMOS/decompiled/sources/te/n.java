package te;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n extends g1 {

    /* renamed from: c, reason: collision with root package name */
    public static final n f9407c;

    static {
        wd.e.f10150a.getClass();
        f9407c = new n(o.f9410a);
    }

    @Override // te.a
    public final int h(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        return cArr.length;
    }

    @Override // te.q, te.a
    public final void j(y6.l lVar, int i3, Object obj) {
        m mVar = (m) obj;
        mVar.getClass();
        this.f9380b.getClass();
        char charValue = ((Character) lVar.e()).charValue();
        mVar.b(mVar.d() + 1);
        char[] cArr = mVar.f9401a;
        int i10 = mVar.f9402b;
        mVar.f9402b = i10 + 1;
        cArr[i10] = charValue;
    }

    @Override // te.a
    public final Object k(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        m mVar = new m();
        mVar.f9401a = cArr;
        mVar.f9402b = cArr.length;
        mVar.b(10);
        return mVar;
    }

    @Override // te.g1
    public final Object n() {
        return new char[0];
    }

    @Override // te.g1
    public final void o(e3.o oVar, Object obj, int i3) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        for (int i10 = 0; i10 < i3; i10++) {
            char c10 = cArr[i10];
            f1 f1Var = this.f9380b;
            f1Var.getClass();
            oVar.e(f1Var, i10);
            oVar.c(c10);
        }
    }
}
