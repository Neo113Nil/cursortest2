package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ux1 {
    public final vx1 PxuCJdSBwIXG;
    public final Throwable TSizfFm2Yiuu;
    public final vx1 lS5Rgt96tfkO;

    public ux1(vx1 vx1Var, nq nqVar, Throwable th) {
        this.PxuCJdSBwIXG = vx1Var;
        this.lS5Rgt96tfkO = nqVar;
        this.TSizfFm2Yiuu = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ux1)) {
            return false;
        }
        ux1 ux1Var = (ux1) obj;
        return cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, ux1Var.PxuCJdSBwIXG) && cs0.wdg6QnbFHrFF(this.lS5Rgt96tfkO, ux1Var.lS5Rgt96tfkO) && cs0.wdg6QnbFHrFF(this.TSizfFm2Yiuu, ux1Var.TSizfFm2Yiuu);
    }

    public final int hashCode() {
        int hashCode = this.PxuCJdSBwIXG.hashCode() * 31;
        vx1 vx1Var = this.lS5Rgt96tfkO;
        int hashCode2 = (hashCode + (vx1Var == null ? 0 : vx1Var.hashCode())) * 31;
        Throwable th = this.TSizfFm2Yiuu;
        return hashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "ConnectResult(plan=" + this.PxuCJdSBwIXG + ", nextPlan=" + this.lS5Rgt96tfkO + ", throwable=" + this.TSizfFm2Yiuu + ')';
    }

    public /* synthetic */ ux1(vx1 vx1Var, Throwable th, int i) {
        this(vx1Var, (nq) null, (i & 4) != 0 ? null : th);
    }
}
