package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class o42 implements m40 {
    public final int PxuCJdSBwIXG;
    public final int lS5Rgt96tfkO;

    public o42(int i, int i2) {
        this.PxuCJdSBwIXG = i;
        this.lS5Rgt96tfkO = i2;
    }

    @Override // defpackage.m40
    public final void PxuCJdSBwIXG(o40 o40Var) {
        boolean z = o40Var.Y1f8riQaR6yg != -1;
        pj1 pj1Var = o40Var.PxuCJdSBwIXG;
        if (z) {
            o40Var.Y1f8riQaR6yg = -1;
            o40Var.e9gEMXR7LXtO = -1;
        }
        int wdg6QnbFHrFF = ng0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, 0, pj1Var.PxuCJdSBwIXG());
        int wdg6QnbFHrFF2 = ng0.wdg6QnbFHrFF(this.lS5Rgt96tfkO, 0, pj1Var.PxuCJdSBwIXG());
        if (wdg6QnbFHrFF != wdg6QnbFHrFF2) {
            if (wdg6QnbFHrFF < wdg6QnbFHrFF2) {
                o40Var.e9gEMXR7LXtO(wdg6QnbFHrFF, wdg6QnbFHrFF2);
            } else {
                o40Var.e9gEMXR7LXtO(wdg6QnbFHrFF2, wdg6QnbFHrFF);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o42)) {
            return false;
        }
        o42 o42Var = (o42) obj;
        return this.PxuCJdSBwIXG == o42Var.PxuCJdSBwIXG && this.lS5Rgt96tfkO == o42Var.lS5Rgt96tfkO;
    }

    public final int hashCode() {
        return (this.PxuCJdSBwIXG * 31) + this.lS5Rgt96tfkO;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.PxuCJdSBwIXG);
        sb.append(", end=");
        return o0.r3s1LDPKFs1S(sb, this.lS5Rgt96tfkO, ')');
    }
}
