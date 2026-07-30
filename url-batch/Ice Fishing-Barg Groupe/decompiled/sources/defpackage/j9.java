package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class j9 {
    public final int PxuCJdSBwIXG;
    public final fe2 TSizfFm2Yiuu;
    public final String Y1f8riQaR6yg;
    public final op0 lS5Rgt96tfkO;

    public j9(op0 op0Var, fe2 fe2Var, String str) {
        this.lS5Rgt96tfkO = op0Var;
        this.TSizfFm2Yiuu = fe2Var;
        this.Y1f8riQaR6yg = str;
        this.PxuCJdSBwIXG = Arrays.hashCode(new Object[]{op0Var, fe2Var, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j9)) {
            return false;
        }
        j9 j9Var = (j9) obj;
        return ni0.BRwzKIf41E4i(this.lS5Rgt96tfkO, j9Var.lS5Rgt96tfkO) && ni0.BRwzKIf41E4i(this.TSizfFm2Yiuu, j9Var.TSizfFm2Yiuu) && ni0.BRwzKIf41E4i(this.Y1f8riQaR6yg, j9Var.Y1f8riQaR6yg);
    }

    public final int hashCode() {
        return this.PxuCJdSBwIXG;
    }
}
