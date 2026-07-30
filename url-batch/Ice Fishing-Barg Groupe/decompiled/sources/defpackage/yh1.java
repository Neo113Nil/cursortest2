package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class yh1 extends th0 {
    public final mx1 TSizfFm2Yiuu;
    public final r4 Y1f8riQaR6yg;

    public yh1(mx1 mx1Var) {
        r4 r4Var;
        this.TSizfFm2Yiuu = mx1Var;
        if (ki0.zf8DYfih6EZu(mx1Var)) {
            r4Var = null;
        } else {
            r4Var = t4.PxuCJdSBwIXG();
            yj1.TSizfFm2Yiuu(r4Var, mx1Var);
        }
        this.Y1f8riQaR6yg = r4Var;
    }

    @Override // defpackage.th0
    public final qt1 RfyTYNmI9Srp() {
        mx1 mx1Var = this.TSizfFm2Yiuu;
        return new qt1(mx1Var.PxuCJdSBwIXG, mx1Var.lS5Rgt96tfkO, mx1Var.TSizfFm2Yiuu, mx1Var.Y1f8riQaR6yg);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yh1) {
            return this.TSizfFm2Yiuu.equals(((yh1) obj).TSizfFm2Yiuu);
        }
        return false;
    }

    public final int hashCode() {
        return this.TSizfFm2Yiuu.hashCode();
    }
}
