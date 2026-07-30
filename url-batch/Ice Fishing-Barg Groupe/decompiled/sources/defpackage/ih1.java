package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ih1 extends nh1 {
    public static final ih1 TSizfFm2Yiuu = new ih1(1, 0, 2);

    @Override // defpackage.nh1
    public final void PxuCJdSBwIXG(of0 of0Var, r9 r9Var, e72 e72Var, ju1 ju1Var, oh1 oh1Var) {
        int TSizfFm2Yiuu2 = of0Var.TSizfFm2Yiuu(0);
        int i = e72Var.VhhvGxCb8gfr;
        int amuv7NJvPxHu = e72Var.amuv7NJvPxHu(e72Var.lS5Rgt96tfkO, e72Var.XL4ISE6Oc65B(i));
        int RAsUl2FVSrh6 = e72Var.RAsUl2FVSrh6(e72Var.lS5Rgt96tfkO, e72Var.XL4ISE6Oc65B(i + 1));
        for (int max = Math.max(amuv7NJvPxHu, RAsUl2FVSrh6 - TSizfFm2Yiuu2); max < RAsUl2FVSrh6; max++) {
            Object obj = e72Var.TSizfFm2Yiuu[e72Var.rtx2ld2ELZv4(max)];
            if (obj instanceof yf0) {
                ju1Var.e9gEMXR7LXtO((yf0) obj);
            } else if (obj instanceof zs1) {
                ((zs1) obj).TSizfFm2Yiuu();
            }
        }
        if (TSizfFm2Yiuu2 <= 0) {
            mp.PxuCJdSBwIXG("Check failed");
        }
        int i2 = e72Var.VhhvGxCb8gfr;
        int amuv7NJvPxHu2 = e72Var.amuv7NJvPxHu(e72Var.lS5Rgt96tfkO, e72Var.XL4ISE6Oc65B(i2));
        int RAsUl2FVSrh62 = e72Var.RAsUl2FVSrh6(e72Var.lS5Rgt96tfkO, e72Var.XL4ISE6Oc65B(i2 + 1)) - TSizfFm2Yiuu2;
        if (RAsUl2FVSrh62 < amuv7NJvPxHu2) {
            mp.PxuCJdSBwIXG("Check failed");
        }
        e72Var.EpkonXwzFgDB(RAsUl2FVSrh62, TSizfFm2Yiuu2, i2);
        int i3 = e72Var.OPXfSBeufaJ8;
        if (i3 >= amuv7NJvPxHu2) {
            e72Var.OPXfSBeufaJ8 = i3 - TSizfFm2Yiuu2;
        }
    }
}
