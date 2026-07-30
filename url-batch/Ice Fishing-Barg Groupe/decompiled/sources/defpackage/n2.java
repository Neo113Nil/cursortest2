package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class n2 extends kv0 implements pe0 {
    public final /* synthetic */ int OPXfSBeufaJ8;
    public final /* synthetic */ Object dgRBjINgWbAK;
    public final /* synthetic */ Object wdg6QnbFHrFF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n2(int i, Object obj, Object obj2) {
        super(2);
        this.OPXfSBeufaJ8 = i;
        this.wdg6QnbFHrFF = obj;
        this.dgRBjINgWbAK = obj2;
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        int i = this.OPXfSBeufaJ8;
        no2 no2Var = no2.PxuCJdSBwIXG;
        Object obj3 = this.dgRBjINgWbAK;
        Object obj4 = this.wdg6QnbFHrFF;
        switch (i) {
            case 0:
                int intValue = ((Number) obj).intValue();
                d32 d32Var = (d32) obj2;
                o2 o2Var = (o2) obj3;
                if (!((e32) obj4).lS5Rgt96tfkO.lS5Rgt96tfkO(d32Var.a92UlCVFR9N8)) {
                    o2Var.dgRBjINgWbAK(intValue, d32Var);
                    o2Var.QrzZRwfaDlRX.Y1f8riQaR6yg(no2Var);
                    break;
                }
                break;
            case 1:
                hp hpVar = (hp) obj;
                int intValue2 = ((Number) obj2).intValue();
                tf0 tf0Var = (tf0) hpVar;
                if (!tf0Var.Pf0ThKz3j5YS(intValue2 & 1, (intValue2 & 3) != 2)) {
                    tf0Var.i68hK7ahKtgp();
                    break;
                } else {
                    gg1 gg1Var = mp.PxuCJdSBwIXG;
                    Boolean bool = (Boolean) ((bx0) obj4).RAsUl2FVSrh6.getValue();
                    boolean booleanValue = bool.booleanValue();
                    pe0 pe0Var = (pe0) obj3;
                    tf0Var.bEKsvqmvPh2y(bool);
                    boolean RAsUl2FVSrh6 = tf0Var.RAsUl2FVSrh6(booleanValue);
                    if (booleanValue) {
                        pe0Var.rtx2ld2ELZv4(tf0Var, 0);
                    } else {
                        if (tf0Var.x50lh2ztY7Y5 != 0) {
                            mp.PxuCJdSBwIXG("No nodes can be emitted before calling deactivateToEndGroup");
                        }
                        if (!tf0Var.zf8DYfih6EZu) {
                            if (RAsUl2FVSrh6) {
                                z62 z62Var = tf0Var.ozEBbv0hFTAB;
                                int i2 = z62Var.RAsUl2FVSrh6;
                                int i3 = z62Var.rtx2ld2ELZv4;
                                jp jpVar = tf0Var.ryVscX7ZL4Ux;
                                jpVar.getClass();
                                jpVar.Y1f8riQaR6yg(false);
                                jpVar.lS5Rgt96tfkO.POWyO8hTM6YC.i68hK7ahKtgp(mg1.TSizfFm2Yiuu);
                                f2.a92UlCVFR9N8(tf0Var.RfyTYNmI9Srp, i2, i3);
                                tf0Var.ozEBbv0hFTAB.EcgxDIVH5in8();
                            } else {
                                tf0Var.POWyO8hTM6YC();
                            }
                        }
                    }
                    if (tf0Var.pnx5pC0XzaCw && tf0Var.ozEBbv0hFTAB.OPXfSBeufaJ8 == tf0Var.IAToe7bXGz4N) {
                        tf0Var.IAToe7bXGz4N = -1;
                        tf0Var.pnx5pC0XzaCw = false;
                    }
                    tf0Var.gPXPFXrUH4XX(false);
                    break;
                }
                break;
            default:
                gi giVar = (gi) obj;
                ph0 ph0Var = (ph0) obj2;
                pd1 pd1Var = (pd1) obj4;
                vw0 vw0Var = pd1Var.VhhvGxCb8gfr;
                if (!vw0Var.EpkonXwzFgDB()) {
                    pd1Var.i68hK7ahKtgp = true;
                    break;
                } else {
                    pd1Var.Pf0ThKz3j5YS = giVar;
                    pd1Var.amuv7NJvPxHu = ph0Var;
                    hi1 snapshotObserver = ((r1) yw0.PxuCJdSBwIXG(vw0Var)).getSnapshotObserver();
                    md1 md1Var = pd1.Companion;
                    snapshotObserver.PxuCJdSBwIXG.Y1f8riQaR6yg(pd1Var, k1.tmVwIGCQF4zR, (od1) obj3);
                    pd1Var.i68hK7ahKtgp = false;
                    break;
                }
        }
        return no2Var;
    }
}
