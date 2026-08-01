package te;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e extends g1 {

    /* renamed from: c, reason: collision with root package name */
    public static final e f9368c;

    static {
        wd.a.f10138a.getClass();
        f9368c = new e(f.f9372a);
    }

    @Override // te.a
    public final int h(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        return zArr.length;
    }

    @Override // te.q, te.a
    public final void j(y6.l lVar, int i3, Object obj) {
        d dVar = (d) obj;
        dVar.getClass();
        this.f9380b.getClass();
        boolean booleanValue = ((Boolean) lVar.e()).booleanValue();
        dVar.b(dVar.d() + 1);
        boolean[] zArr = dVar.f9351a;
        int i10 = dVar.f9352b;
        dVar.f9352b = i10 + 1;
        zArr[i10] = booleanValue;
    }

    @Override // te.a
    public final Object k(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        d dVar = new d();
        dVar.f9351a = zArr;
        dVar.f9352b = zArr.length;
        dVar.b(10);
        return dVar;
    }

    @Override // te.g1
    public final Object n() {
        return new boolean[0];
    }

    @Override // te.g1
    public final void o(e3.o oVar, Object obj, int i3) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        for (int i10 = 0; i10 < i3; i10++) {
            boolean z10 = zArr[i10];
            f1 f1Var = this.f9380b;
            f1Var.getClass();
            oVar.e(f1Var, i10);
            oVar.a(z10);
        }
    }
}
