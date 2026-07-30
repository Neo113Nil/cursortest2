package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class km2 implements e80 {
    public final int PxuCJdSBwIXG;
    public final z30 TSizfFm2Yiuu;
    public final int lS5Rgt96tfkO;

    public km2(int i, int i2, z30 z30Var) {
        this.PxuCJdSBwIXG = i;
        this.lS5Rgt96tfkO = i2;
        this.TSizfFm2Yiuu = z30Var;
    }

    @Override // defpackage.i8
    public final sp2 PxuCJdSBwIXG(lm2 lm2Var) {
        return new lm0(this.PxuCJdSBwIXG, this.lS5Rgt96tfkO, this.TSizfFm2Yiuu);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof km2) {
            km2 km2Var = (km2) obj;
            if (km2Var.PxuCJdSBwIXG == this.PxuCJdSBwIXG && km2Var.lS5Rgt96tfkO == this.lS5Rgt96tfkO && cs0.wdg6QnbFHrFF(km2Var.TSizfFm2Yiuu, this.TSizfFm2Yiuu)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.TSizfFm2Yiuu.hashCode() + (this.PxuCJdSBwIXG * 31)) * 31) + this.lS5Rgt96tfkO;
    }
}
