package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class cy implements m40 {
    public final int PxuCJdSBwIXG;
    public final int lS5Rgt96tfkO;

    public cy(int i, int i2) {
        this.PxuCJdSBwIXG = i;
        this.lS5Rgt96tfkO = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        fp0.PxuCJdSBwIXG("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // defpackage.m40
    public final void PxuCJdSBwIXG(o40 o40Var) {
        int i = o40Var.TSizfFm2Yiuu;
        pj1 pj1Var = o40Var.PxuCJdSBwIXG;
        int i2 = this.lS5Rgt96tfkO;
        int i3 = i + i2;
        if (((i ^ i3) & (i2 ^ i3)) < 0) {
            i3 = pj1Var.PxuCJdSBwIXG();
        }
        o40Var.PxuCJdSBwIXG(o40Var.TSizfFm2Yiuu, Math.min(i3, pj1Var.PxuCJdSBwIXG()));
        int i4 = o40Var.lS5Rgt96tfkO;
        int i5 = this.PxuCJdSBwIXG;
        int i6 = i4 - i5;
        if (((i5 ^ i4) & (i4 ^ i6)) < 0) {
            i6 = 0;
        }
        o40Var.PxuCJdSBwIXG(Math.max(0, i6), o40Var.lS5Rgt96tfkO);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cy)) {
            return false;
        }
        cy cyVar = (cy) obj;
        return this.PxuCJdSBwIXG == cyVar.PxuCJdSBwIXG && this.lS5Rgt96tfkO == cyVar.lS5Rgt96tfkO;
    }

    public final int hashCode() {
        return (this.PxuCJdSBwIXG * 31) + this.lS5Rgt96tfkO;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.PxuCJdSBwIXG);
        sb.append(", lengthAfterCursor=");
        return o0.r3s1LDPKFs1S(sb, this.lS5Rgt96tfkO, ')');
    }
}
