package te;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n0 extends g1 {

    /* renamed from: c, reason: collision with root package name */
    public static final n0 f9408c;

    static {
        wd.q.f10161a.getClass();
        f9408c = new n0(o0.f9412a);
    }

    @Override // te.a
    public final int h(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        return jArr.length;
    }

    @Override // te.q, te.a
    public final void j(y6.l lVar, int i3, Object obj) {
        m0 m0Var = (m0) obj;
        m0Var.getClass();
        this.f9380b.getClass();
        long longValue = ((Long) lVar.e()).longValue();
        m0Var.b(m0Var.d() + 1);
        long[] jArr = m0Var.f9403a;
        int i10 = m0Var.f9404b;
        m0Var.f9404b = i10 + 1;
        jArr[i10] = longValue;
    }

    @Override // te.a
    public final Object k(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        m0 m0Var = new m0();
        m0Var.f9403a = jArr;
        m0Var.f9404b = jArr.length;
        m0Var.b(10);
        return m0Var;
    }

    @Override // te.g1
    public final Object n() {
        return new long[0];
    }

    @Override // te.g1
    public final void o(e3.o oVar, Object obj, int i3) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        for (int i10 = 0; i10 < i3; i10++) {
            long j = jArr[i10];
            f1 f1Var = this.f9380b;
            f1Var.getClass();
            oVar.e(f1Var, i10);
            oVar.j(j);
        }
    }
}
