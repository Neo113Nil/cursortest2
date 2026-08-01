package te;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i0 extends g1 {

    /* renamed from: c, reason: collision with root package name */
    public static final i0 f9388c;

    static {
        wd.o.f10160a.getClass();
        f9388c = new i0(j0.f9391a);
    }

    @Override // te.a
    public final int h(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        return iArr.length;
    }

    @Override // te.q, te.a
    public final void j(y6.l lVar, int i3, Object obj) {
        h0 h0Var = (h0) obj;
        h0Var.getClass();
        this.f9380b.getClass();
        int c10 = lVar.c();
        h0Var.b(h0Var.d() + 1);
        int[] iArr = h0Var.f9382a;
        int i10 = h0Var.f9383b;
        h0Var.f9383b = i10 + 1;
        iArr[i10] = c10;
    }

    @Override // te.a
    public final Object k(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        h0 h0Var = new h0();
        h0Var.f9382a = iArr;
        h0Var.f9383b = iArr.length;
        h0Var.b(10);
        return h0Var;
    }

    @Override // te.g1
    public final Object n() {
        return new int[0];
    }

    @Override // te.g1
    public final void o(e3.o oVar, Object obj, int i3) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        for (int i10 = 0; i10 < i3; i10++) {
            int i11 = iArr[i10];
            f1 f1Var = this.f9380b;
            f1Var.getClass();
            oVar.e(f1Var, i10);
            oVar.i(i11);
        }
    }
}
