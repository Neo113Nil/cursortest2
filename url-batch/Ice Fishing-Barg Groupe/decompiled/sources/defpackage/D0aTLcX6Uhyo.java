package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class D0aTLcX6Uhyo extends yQRudnv4La6p {
    public static D0aTLcX6Uhyo Y1f8riQaR6yg;
    public ji2 TSizfFm2Yiuu;
    public static final jJwa0q7P5wHq Companion = new jJwa0q7P5wHq();
    public static final iv1 e9gEMXR7LXtO = iv1.OPXfSBeufaJ8;
    public static final iv1 a92UlCVFR9N8 = iv1.rtx2ld2ELZv4;

    @Override // defpackage.yQRudnv4La6p
    public final int[] OPXfSBeufaJ8(int i) {
        int i2;
        if (TSizfFm2Yiuu().length() > 0 && i > 0) {
            int length = TSizfFm2Yiuu().length();
            ji2 ji2Var = this.TSizfFm2Yiuu;
            iv1 iv1Var = a92UlCVFR9N8;
            if (i > length) {
                if (ji2Var == null) {
                    cs0.tmVwIGCQF4zR("layoutResult");
                    throw null;
                }
                i2 = ji2Var.lS5Rgt96tfkO.Y1f8riQaR6yg(TSizfFm2Yiuu().length());
            } else {
                if (ji2Var == null) {
                    cs0.tmVwIGCQF4zR("layoutResult");
                    throw null;
                }
                int Y1f8riQaR6yg2 = ji2Var.lS5Rgt96tfkO.Y1f8riQaR6yg(i);
                i2 = wdg6QnbFHrFF(Y1f8riQaR6yg2, iv1Var) + 1 == i ? Y1f8riQaR6yg2 : Y1f8riQaR6yg2 - 1;
            }
            if (i2 >= 0) {
                return lS5Rgt96tfkO(wdg6QnbFHrFF(i2, e9gEMXR7LXtO), wdg6QnbFHrFF(i2, iv1Var) + 1);
            }
        }
        return null;
    }

    @Override // defpackage.yQRudnv4La6p
    public final int[] PxuCJdSBwIXG(int i) {
        int i2;
        if (TSizfFm2Yiuu().length() > 0 && i < TSizfFm2Yiuu().length()) {
            ji2 ji2Var = this.TSizfFm2Yiuu;
            iv1 iv1Var = e9gEMXR7LXtO;
            if (i < 0) {
                if (ji2Var == null) {
                    cs0.tmVwIGCQF4zR("layoutResult");
                    throw null;
                }
                i2 = ji2Var.lS5Rgt96tfkO.Y1f8riQaR6yg(0);
            } else {
                if (ji2Var == null) {
                    cs0.tmVwIGCQF4zR("layoutResult");
                    throw null;
                }
                int Y1f8riQaR6yg2 = ji2Var.lS5Rgt96tfkO.Y1f8riQaR6yg(i);
                i2 = wdg6QnbFHrFF(Y1f8riQaR6yg2, iv1Var) == i ? Y1f8riQaR6yg2 : Y1f8riQaR6yg2 + 1;
            }
            ji2 ji2Var2 = this.TSizfFm2Yiuu;
            if (ji2Var2 == null) {
                cs0.tmVwIGCQF4zR("layoutResult");
                throw null;
            }
            if (i2 < ji2Var2.lS5Rgt96tfkO.a92UlCVFR9N8) {
                return lS5Rgt96tfkO(wdg6QnbFHrFF(i2, iv1Var), wdg6QnbFHrFF(i2, a92UlCVFR9N8) + 1);
            }
        }
        return null;
    }

    public final int wdg6QnbFHrFF(int i, iv1 iv1Var) {
        ji2 ji2Var = this.TSizfFm2Yiuu;
        if (ji2Var == null) {
            cs0.tmVwIGCQF4zR("layoutResult");
            throw null;
        }
        int a92UlCVFR9N82 = ji2Var.a92UlCVFR9N8(i);
        ji2 ji2Var2 = this.TSizfFm2Yiuu;
        if (ji2Var2 == null) {
            cs0.tmVwIGCQF4zR("layoutResult");
            throw null;
        }
        iv1 RAsUl2FVSrh6 = ji2Var2.RAsUl2FVSrh6(a92UlCVFR9N82);
        ji2 ji2Var3 = this.TSizfFm2Yiuu;
        if (iv1Var != RAsUl2FVSrh6) {
            if (ji2Var3 != null) {
                return ji2Var3.a92UlCVFR9N8(i);
            }
            cs0.tmVwIGCQF4zR("layoutResult");
            throw null;
        }
        if (ji2Var3 != null) {
            return ji2Var3.lS5Rgt96tfkO.TSizfFm2Yiuu(i, false) - 1;
        }
        cs0.tmVwIGCQF4zR("layoutResult");
        throw null;
    }
}
