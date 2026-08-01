package te;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class y1 extends g1 {

    /* renamed from: c, reason: collision with root package name */
    public static final y1 f9470c;

    static {
        hd.a0.f4495e.getClass();
        f9470c = new y1(z1.f9472a);
    }

    @Override // te.a
    public final int h(Object obj) {
        return ((hd.b0) obj).f4497d.length;
    }

    @Override // te.q, te.a
    public final void j(y6.l lVar, int i3, Object obj) {
        x1 x1Var = (x1) obj;
        x1Var.getClass();
        f1 f1Var = this.f9380b;
        f1Var.getClass();
        lVar.b(f1Var.h(i3));
        long longValue = ((Long) lVar.e()).longValue();
        hd.z zVar = hd.a0.f4495e;
        x1Var.b(x1Var.d() + 1);
        long[] jArr = x1Var.f9465a;
        int i10 = x1Var.f9466b;
        x1Var.f9466b = i10 + 1;
        jArr[i10] = longValue;
    }

    @Override // te.a
    public final Object k(Object obj) {
        long[] jArr = ((hd.b0) obj).f4497d;
        x1 x1Var = new x1();
        x1Var.f9465a = jArr;
        x1Var.f9466b = jArr.length;
        x1Var.b(10);
        return x1Var;
    }

    @Override // te.g1
    public final Object n() {
        return new hd.b0(new long[0]);
    }

    @Override // te.g1
    public final void o(e3.o oVar, Object obj, int i3) {
        long[] jArr = ((hd.b0) obj).f4497d;
        for (int i10 = 0; i10 < i3; i10++) {
            e3.o h10 = oVar.h(this.f9380b, i10);
            long j = jArr[i10];
            hd.z zVar = hd.a0.f4495e;
            h10.j(j);
        }
    }
}
