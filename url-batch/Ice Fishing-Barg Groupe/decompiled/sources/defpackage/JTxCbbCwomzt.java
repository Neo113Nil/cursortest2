package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class JTxCbbCwomzt extends yQRudnv4La6p {
    public static JTxCbbCwomzt e9gEMXR7LXtO;
    public ji2 TSizfFm2Yiuu;
    public d32 Y1f8riQaR6yg;
    public static final PsecLrZVVK61 Companion = new PsecLrZVVK61();
    public static final iv1 a92UlCVFR9N8 = iv1.OPXfSBeufaJ8;
    public static final iv1 RAsUl2FVSrh6 = iv1.rtx2ld2ELZv4;

    @Override // defpackage.yQRudnv4La6p
    public final int[] OPXfSBeufaJ8(int i) {
        int i2;
        if (TSizfFm2Yiuu().length() > 0 && i > 0) {
            try {
                d32 d32Var = this.Y1f8riQaR6yg;
                if (d32Var == null) {
                    cs0.tmVwIGCQF4zR("node");
                    throw null;
                }
                qt1 RAsUl2FVSrh62 = d32Var.RAsUl2FVSrh6();
                int round = Math.round(RAsUl2FVSrh62.Y1f8riQaR6yg - RAsUl2FVSrh62.lS5Rgt96tfkO);
                int length = TSizfFm2Yiuu().length();
                if (length <= i) {
                    i = length;
                }
                ji2 ji2Var = this.TSizfFm2Yiuu;
                if (ji2Var == null) {
                    cs0.tmVwIGCQF4zR("layoutResult");
                    throw null;
                }
                int Y1f8riQaR6yg = ji2Var.lS5Rgt96tfkO.Y1f8riQaR6yg(i);
                ji2 ji2Var2 = this.TSizfFm2Yiuu;
                if (ji2Var2 == null) {
                    cs0.tmVwIGCQF4zR("layoutResult");
                    throw null;
                }
                float a92UlCVFR9N82 = ji2Var2.lS5Rgt96tfkO.a92UlCVFR9N8(Y1f8riQaR6yg) - round;
                if (a92UlCVFR9N82 > 0.0f) {
                    ji2 ji2Var3 = this.TSizfFm2Yiuu;
                    if (ji2Var3 == null) {
                        cs0.tmVwIGCQF4zR("layoutResult");
                        throw null;
                    }
                    i2 = ji2Var3.lS5Rgt96tfkO.e9gEMXR7LXtO(a92UlCVFR9N82);
                } else {
                    i2 = 0;
                }
                if (i == TSizfFm2Yiuu().length() && i2 < Y1f8riQaR6yg) {
                    i2++;
                }
                return lS5Rgt96tfkO(wdg6QnbFHrFF(i2, a92UlCVFR9N8), i);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.yQRudnv4La6p
    public final int[] PxuCJdSBwIXG(int i) {
        int i2;
        if (TSizfFm2Yiuu().length() > 0 && i < TSizfFm2Yiuu().length()) {
            try {
                d32 d32Var = this.Y1f8riQaR6yg;
                if (d32Var == null) {
                    cs0.tmVwIGCQF4zR("node");
                    throw null;
                }
                qt1 RAsUl2FVSrh62 = d32Var.RAsUl2FVSrh6();
                int round = Math.round(RAsUl2FVSrh62.Y1f8riQaR6yg - RAsUl2FVSrh62.lS5Rgt96tfkO);
                if (i <= 0) {
                    i = 0;
                }
                ji2 ji2Var = this.TSizfFm2Yiuu;
                if (ji2Var == null) {
                    cs0.tmVwIGCQF4zR("layoutResult");
                    throw null;
                }
                int Y1f8riQaR6yg = ji2Var.lS5Rgt96tfkO.Y1f8riQaR6yg(i);
                ji2 ji2Var2 = this.TSizfFm2Yiuu;
                if (ji2Var2 == null) {
                    cs0.tmVwIGCQF4zR("layoutResult");
                    throw null;
                }
                float a92UlCVFR9N82 = ji2Var2.lS5Rgt96tfkO.a92UlCVFR9N8(Y1f8riQaR6yg) + round;
                ji2 ji2Var3 = this.TSizfFm2Yiuu;
                if (ji2Var3 == null) {
                    cs0.tmVwIGCQF4zR("layoutResult");
                    throw null;
                }
                float a92UlCVFR9N83 = ji2Var3.lS5Rgt96tfkO.a92UlCVFR9N8(r0.a92UlCVFR9N8 - 1);
                ji2 ji2Var4 = this.TSizfFm2Yiuu;
                if (a92UlCVFR9N82 < a92UlCVFR9N83) {
                    if (ji2Var4 == null) {
                        cs0.tmVwIGCQF4zR("layoutResult");
                        throw null;
                    }
                    i2 = ji2Var4.lS5Rgt96tfkO.e9gEMXR7LXtO(a92UlCVFR9N82);
                } else {
                    if (ji2Var4 == null) {
                        cs0.tmVwIGCQF4zR("layoutResult");
                        throw null;
                    }
                    i2 = ji2Var4.lS5Rgt96tfkO.a92UlCVFR9N8;
                }
                return lS5Rgt96tfkO(i, wdg6QnbFHrFF(i2 - 1, RAsUl2FVSrh6) + 1);
            } catch (IllegalStateException unused) {
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
        iv1 RAsUl2FVSrh62 = ji2Var2.RAsUl2FVSrh6(a92UlCVFR9N82);
        ji2 ji2Var3 = this.TSizfFm2Yiuu;
        if (iv1Var != RAsUl2FVSrh62) {
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
