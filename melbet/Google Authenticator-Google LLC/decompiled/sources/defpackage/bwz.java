package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bwz implements bwx {
    public static final hkh c = hkh.l("com/google/android/apps/authenticator2/main/dataservice/OtpSyncOnStartDataServiceImpl");
    public final car d;
    public final iyi e;
    private final hvl f;
    private final hvl g;
    private final iwq h;

    public bwz(car carVar, iwq iwqVar, iyi iyiVar, hvl hvlVar, hvl hvlVar2) {
        this.d = carVar;
        this.h = iwqVar;
        this.e = iyiVar;
        this.f = hvlVar;
        this.g = hvlVar2;
    }

    public final hvi a(boolean z) {
        iyi iyiVar = this.e;
        hvi z2 = iyiVar.z(bxe.IN_PROGRESS);
        gdo gdoVar = b;
        iwq iwqVar = this.h;
        iwqVar.k(z2, gdoVar);
        gwu g = gwu.g(z2);
        bwv bwvVar = new bwv(2);
        hvl hvlVar = this.f;
        gwu i = g.d(Exception.class, bwvVar, hvlVar).i(new bpn(this, 12), this.g);
        iwqVar.k(i, bxa.a);
        gwu d = gwu.g(i).h(new bwv(3), hvlVar).d(can.class, new bwy(z, 0), hvlVar).d(kbt.class, new bwy(z, 2), hvlVar).d(kbr.class, new bwy(z, 3), hvlVar);
        iwqVar.k(hoq.au(d, new bpn(iyiVar, 13), hvlVar), gdoVar);
        return d;
    }
}
