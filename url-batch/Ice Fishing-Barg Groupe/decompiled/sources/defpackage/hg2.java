package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class hg2 implements qe0 {
    public final /* synthetic */ boolean OPXfSBeufaJ8;
    public final /* synthetic */ z42 cpQdD2nAriOS;
    public final /* synthetic */ e81 dgRBjINgWbAK;
    public final /* synthetic */ pf2 r3s1LDPKFs1S;
    public final /* synthetic */ String rtx2ld2ELZv4;
    public final /* synthetic */ wr2 wdg6QnbFHrFF;
    public final /* synthetic */ pe0 x50lh2ztY7Y5;

    public hg2(String str, boolean z, wr2 wr2Var, e81 e81Var, pe0 pe0Var, z42 z42Var, pf2 pf2Var) {
        this.rtx2ld2ELZv4 = str;
        this.OPXfSBeufaJ8 = z;
        this.wdg6QnbFHrFF = wr2Var;
        this.dgRBjINgWbAK = e81Var;
        this.x50lh2ztY7Y5 = pe0Var;
        this.cpQdD2nAriOS = z42Var;
        this.r3s1LDPKFs1S = pf2Var;
    }

    @Override // defpackage.qe0
    public final Object a92UlCVFR9N8(Object obj, Object obj2, Object obj3) {
        pe0 pe0Var = (pe0) obj;
        hp hpVar = (hp) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= ((tf0) hpVar).rtx2ld2ELZv4(pe0Var) ? 4 : 2;
        }
        tf0 tf0Var = (tf0) hpVar;
        if (tf0Var.Pf0ThKz3j5YS(intValue & 1, (intValue & 19) != 18)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            ih0.pnx5pC0XzaCw.dgRBjINgWbAK(this.rtx2ld2ELZv4, pe0Var, this.OPXfSBeufaJ8, this.wdg6QnbFHrFF, this.dgRBjINgWbAK, this.x50lh2ztY7Y5, this.cpQdD2nAriOS, this.r3s1LDPKFs1S, null, null, tf0Var, (intValue << 3) & 112);
        } else {
            tf0Var.i68hK7ahKtgp();
        }
        return no2.PxuCJdSBwIXG;
    }
}
