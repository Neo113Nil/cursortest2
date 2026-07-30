package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ig1 extends nh1 {
    public static final ig1 TSizfFm2Yiuu = new ig1(0, 2, 1);

    @Override // defpackage.nh1
    public final void PxuCJdSBwIXG(of0 of0Var, r9 r9Var, e72 e72Var, ju1 ju1Var, oh1 oh1Var) {
        nf0 nf0Var = (nf0) of0Var.Y1f8riQaR6yg(0);
        Object Y1f8riQaR6yg = of0Var.Y1f8riQaR6yg(1);
        if (Y1f8riQaR6yg instanceof yf0) {
            yf0 yf0Var = (yf0) Y1f8riQaR6yg;
            ju1Var.e9gEMXR7LXtO.lS5Rgt96tfkO(yf0Var);
            ju1Var.Y1f8riQaR6yg.PxuCJdSBwIXG(yf0Var);
        }
        if (e72Var.r3s1LDPKFs1S != 0) {
            mp.PxuCJdSBwIXG("Can only append a slot if not current inserting");
        }
        int i = e72Var.OPXfSBeufaJ8;
        int i2 = e72Var.wdg6QnbFHrFF;
        int TSizfFm2Yiuu2 = e72Var.TSizfFm2Yiuu(nf0Var);
        int RAsUl2FVSrh6 = e72Var.RAsUl2FVSrh6(e72Var.lS5Rgt96tfkO, e72Var.XL4ISE6Oc65B(TSizfFm2Yiuu2 + 1));
        e72Var.OPXfSBeufaJ8 = RAsUl2FVSrh6;
        e72Var.wdg6QnbFHrFF = RAsUl2FVSrh6;
        e72Var.ZbWwgt3aGe7A(1, TSizfFm2Yiuu2);
        if (i >= RAsUl2FVSrh6) {
            i++;
            i2++;
        }
        e72Var.TSizfFm2Yiuu[RAsUl2FVSrh6] = Y1f8riQaR6yg;
        e72Var.OPXfSBeufaJ8 = i;
        e72Var.wdg6QnbFHrFF = i2;
    }
}
