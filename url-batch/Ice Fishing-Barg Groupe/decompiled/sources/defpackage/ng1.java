package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ng1 extends nh1 {
    public static final ng1 TSizfFm2Yiuu = new ng1(0, 2, 1);

    @Override // defpackage.nh1
    public final void PxuCJdSBwIXG(of0 of0Var, r9 r9Var, e72 e72Var, ju1 ju1Var, oh1 oh1Var) {
        int i;
        er0 er0Var = (er0) of0Var.Y1f8riQaR6yg(0);
        int TSizfFm2Yiuu2 = e72Var.TSizfFm2Yiuu((nf0) of0Var.Y1f8riQaR6yg(1));
        if (e72Var.EcgxDIVH5in8 >= TSizfFm2Yiuu2) {
            mp.PxuCJdSBwIXG("Check failed");
        }
        kj0.xfACYKDMU6Dj(e72Var, r9Var, TSizfFm2Yiuu2);
        int i2 = e72Var.EcgxDIVH5in8;
        int i3 = e72Var.VhhvGxCb8gfr;
        while (i3 >= 0 && !e72Var.pnx5pC0XzaCw(i3)) {
            i3 = e72Var.rZjpSjn4zoMv(e72Var.lS5Rgt96tfkO, i3);
        }
        int i4 = i3 + 1;
        int i5 = 0;
        while (i4 < i2) {
            if (e72Var.VhhvGxCb8gfr(i2, i4)) {
                if (e72Var.pnx5pC0XzaCw(i4)) {
                    i5 = 0;
                }
                i4++;
            } else {
                i5 += e72Var.pnx5pC0XzaCw(i4) ? 1 : e72Var.lS5Rgt96tfkO[(e72Var.XL4ISE6Oc65B(i4) * 5) + 1] & 67108863;
                i4 += e72Var.S9EYkSpbGuxq(i4);
            }
        }
        while (true) {
            i = e72Var.EcgxDIVH5in8;
            if (i >= TSizfFm2Yiuu2) {
                break;
            }
            if (e72Var.VhhvGxCb8gfr(TSizfFm2Yiuu2, i)) {
                int i6 = e72Var.EcgxDIVH5in8;
                if (i6 < e72Var.S9EYkSpbGuxq && (e72Var.lS5Rgt96tfkO[(e72Var.XL4ISE6Oc65B(i6) * 5) + 1] & 1073741824) != 0) {
                    r9Var.Y1f8riQaR6yg(e72Var.kpCQ9veP6n3I(e72Var.EcgxDIVH5in8));
                    i5 = 0;
                }
                e72Var.gGoUzNp9JO5I();
            } else {
                i5 += e72Var.nLZGh9p8gVSu();
            }
        }
        if (i != TSizfFm2Yiuu2) {
            mp.PxuCJdSBwIXG("Check failed");
        }
        er0Var.PxuCJdSBwIXG = i5;
    }
}
