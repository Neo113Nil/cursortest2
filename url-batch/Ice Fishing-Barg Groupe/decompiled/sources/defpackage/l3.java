package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class l3 {
    public final Context PxuCJdSBwIXG;
    public final long TSizfFm2Yiuu;
    public final mi1 Y1f8riQaR6yg;
    public final hy lS5Rgt96tfkO;

    public l3(Context context, hy hyVar, long j, mi1 mi1Var) {
        this.PxuCJdSBwIXG = context;
        this.lS5Rgt96tfkO = hyVar;
        this.TSizfFm2Yiuu = j;
        this.Y1f8riQaR6yg = mi1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!l3.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        l3 l3Var = (l3) obj;
        return cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, l3Var.PxuCJdSBwIXG) && cs0.wdg6QnbFHrFF(this.lS5Rgt96tfkO, l3Var.lS5Rgt96tfkO) && hl.TSizfFm2Yiuu(this.TSizfFm2Yiuu, l3Var.TSizfFm2Yiuu) && cs0.wdg6QnbFHrFF(this.Y1f8riQaR6yg, l3Var.Y1f8riQaR6yg);
    }

    public final int hashCode() {
        int hashCode = (this.lS5Rgt96tfkO.hashCode() + (this.PxuCJdSBwIXG.hashCode() * 31)) * 31;
        gl glVar = hl.Companion;
        return this.Y1f8riQaR6yg.hashCode() + o0.TSizfFm2Yiuu(hashCode, 31, this.TSizfFm2Yiuu);
    }
}
