package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class jq2 implements iw0 {
    public final ug2 PxuCJdSBwIXG;
    public final yk2 TSizfFm2Yiuu;
    public final ae0 Y1f8riQaR6yg;
    public final int lS5Rgt96tfkO;

    public jq2(ug2 ug2Var, int i, yk2 yk2Var, ae0 ae0Var) {
        this.PxuCJdSBwIXG = ug2Var;
        this.lS5Rgt96tfkO = i;
        this.TSizfFm2Yiuu = yk2Var;
        this.Y1f8riQaR6yg = ae0Var;
    }

    @Override // defpackage.iw0
    public final k51 e9gEMXR7LXtO(l51 l51Var, e51 e51Var, long j) {
        em1 e9gEMXR7LXtO = e51Var.e9gEMXR7LXtO(rr.PxuCJdSBwIXG(j, 0, 0, 0, Integer.MAX_VALUE, 7));
        int min = Math.min(e9gEMXR7LXtO.OPXfSBeufaJ8, rr.RAsUl2FVSrh6(j));
        return l51Var.jJwa0q7P5wHq(e9gEMXR7LXtO.rtx2ld2ELZv4, min, q50.rtx2ld2ELZv4, new xs1(this, e9gEMXR7LXtO, min));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jq2) {
            jq2 jq2Var = (jq2) obj;
            if (this.PxuCJdSBwIXG == jq2Var.PxuCJdSBwIXG && this.lS5Rgt96tfkO == jq2Var.lS5Rgt96tfkO && this.TSizfFm2Yiuu.equals(jq2Var.TSizfFm2Yiuu) && cs0.wdg6QnbFHrFF(this.Y1f8riQaR6yg, jq2Var.Y1f8riQaR6yg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.Y1f8riQaR6yg.hashCode() + ((this.TSizfFm2Yiuu.hashCode() + o0.lS5Rgt96tfkO(this.lS5Rgt96tfkO, this.PxuCJdSBwIXG.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.PxuCJdSBwIXG + ", cursorOffset=" + this.lS5Rgt96tfkO + ", transformedText=" + this.TSizfFm2Yiuu + ", textLayoutResultProvider=" + this.Y1f8riQaR6yg + ')';
    }
}
