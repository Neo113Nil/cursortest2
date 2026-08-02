package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bxc implements bxa {
    public static final hkh b = hkh.l("com/google/android/apps/authenticator2/main/dataservice/OtpsDataServiceImpl");
    public final car c;
    public final iyi d;
    private final hvl e;
    private final hvl f;
    private final iwq g;

    public bxc(car carVar, iwq iwqVar, iyi iyiVar, hvl hvlVar, hvl hvlVar2) {
        this.c = carVar;
        this.d = iyiVar;
        this.g = iwqVar;
        this.e = hvlVar;
        this.f = hvlVar2;
    }

    @Override // defpackage.bxa
    public final cam a(bpc bpcVar) {
        cam a = this.c.a(bpcVar);
        d(a, bxb.ADD_OTP);
        return a;
    }

    @Override // defpackage.bxa
    public final cam b(hvi hviVar) {
        cam b2 = this.c.b(hviVar);
        d(b2, bxb.ADD_OTP);
        return b2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.bxa
    public final cam c(bpc bpcVar, long j) {
        car carVar = this.c;
        hvi e = ((bpr) carVar.d).e(bpcVar.g, j);
        bwu bwuVar = new bwu(6);
        ?? r6 = carVar.c;
        hvi ap = hoq.ap(e, Exception.class, bwuVar, r6);
        hvi h = carVar.h();
        cam camVar = new cam(e, hoq.aX(ap, h).t(new cap(carVar, h, bpcVar, 3, null), r6));
        d(camVar, bxb.DELETE_OTP);
        return camVar;
    }

    public final void d(cam camVar, bxb bxbVar) {
        iwq iwqVar = this.g;
        iwqVar.k(camVar.a, a);
        gwu g = gwu.g(camVar.b);
        bwv bwvVar = new bwv(4);
        hvl hvlVar = this.e;
        int i = 14;
        iwqVar.k(g.h(bwvVar, hvlVar).d(can.class, new bpf(bxbVar, 13), hvlVar).d(kbt.class, new bpf(bxbVar, i), hvlVar).d(kbr.class, new bpf(bxbVar, 15), hvlVar).i(new bpn(this, i), this.f), bwx.b);
    }
}
