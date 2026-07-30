package defpackage;

import android.graphics.Rect;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class cu2 {
    public final re PxuCJdSBwIXG;
    public final float lS5Rgt96tfkO;

    public cu2(Rect rect, float f) {
        this.PxuCJdSBwIXG = new re(rect);
        this.lS5Rgt96tfkO = f;
    }

    public final Rect PxuCJdSBwIXG() {
        re reVar = this.PxuCJdSBwIXG;
        reVar.getClass();
        return new Rect(reVar.PxuCJdSBwIXG, reVar.lS5Rgt96tfkO, reVar.TSizfFm2Yiuu, reVar.Y1f8riQaR6yg);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!cu2.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        cu2 cu2Var = (cu2) obj;
        return cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, cu2Var.PxuCJdSBwIXG) && this.lS5Rgt96tfkO == cu2Var.lS5Rgt96tfkO;
    }

    public final int hashCode() {
        return Float.hashCode(this.lS5Rgt96tfkO) + (this.PxuCJdSBwIXG.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WindowMetrics(_bounds=");
        sb.append(this.PxuCJdSBwIXG);
        sb.append(", density=");
        return o0.cpQdD2nAriOS(sb, this.lS5Rgt96tfkO, ')');
    }

    public cu2(re reVar, float f) {
        this.PxuCJdSBwIXG = reVar;
        this.lS5Rgt96tfkO = f;
    }
}
