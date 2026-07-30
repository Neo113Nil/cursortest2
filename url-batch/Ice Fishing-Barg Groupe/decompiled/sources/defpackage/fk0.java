package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class fk0 implements iw0 {
    public final ug2 PxuCJdSBwIXG;
    public final yk2 TSizfFm2Yiuu;
    public final ae0 Y1f8riQaR6yg;
    public final int lS5Rgt96tfkO;

    public fk0(ug2 ug2Var, int i, yk2 yk2Var, ae0 ae0Var) {
        this.PxuCJdSBwIXG = ug2Var;
        this.lS5Rgt96tfkO = i;
        this.TSizfFm2Yiuu = yk2Var;
        this.Y1f8riQaR6yg = ae0Var;
    }

    @Override // defpackage.iw0
    public final k51 e9gEMXR7LXtO(l51 l51Var, e51 e51Var, long j) {
        long j2;
        if (e51Var.IXK6ba3ucyzm(rr.RAsUl2FVSrh6(j)) < rr.rtx2ld2ELZv4(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = rr.PxuCJdSBwIXG(j2, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        em1 e9gEMXR7LXtO = e51Var.e9gEMXR7LXtO(j);
        int min = Math.min(e9gEMXR7LXtO.rtx2ld2ELZv4, rr.rtx2ld2ELZv4(j2));
        return l51Var.jJwa0q7P5wHq(min, e9gEMXR7LXtO.OPXfSBeufaJ8, q50.rtx2ld2ELZv4, new qy(this, l51Var, e9gEMXR7LXtO, min, 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fk0) {
            fk0 fk0Var = (fk0) obj;
            if (this.PxuCJdSBwIXG == fk0Var.PxuCJdSBwIXG && this.lS5Rgt96tfkO == fk0Var.lS5Rgt96tfkO && this.TSizfFm2Yiuu.equals(fk0Var.TSizfFm2Yiuu) && cs0.wdg6QnbFHrFF(this.Y1f8riQaR6yg, fk0Var.Y1f8riQaR6yg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.Y1f8riQaR6yg.hashCode() + ((this.TSizfFm2Yiuu.hashCode() + o0.lS5Rgt96tfkO(this.lS5Rgt96tfkO, this.PxuCJdSBwIXG.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.PxuCJdSBwIXG + ", cursorOffset=" + this.lS5Rgt96tfkO + ", transformedText=" + this.TSizfFm2Yiuu + ", textLayoutResultProvider=" + this.Y1f8riQaR6yg + ')';
    }
}
