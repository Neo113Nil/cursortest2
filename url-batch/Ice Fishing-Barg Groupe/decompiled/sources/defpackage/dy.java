package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class dy implements m40 {
    public final int PxuCJdSBwIXG;
    public final int lS5Rgt96tfkO;

    public dy(int i, int i2) {
        this.PxuCJdSBwIXG = i;
        this.lS5Rgt96tfkO = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        fp0.PxuCJdSBwIXG("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // defpackage.m40
    public final void PxuCJdSBwIXG(o40 o40Var) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 < this.PxuCJdSBwIXG) {
                int i4 = i3 + 1;
                int i5 = o40Var.lS5Rgt96tfkO;
                if (i5 <= i4) {
                    i3 = i5;
                    break;
                } else {
                    i3 = (Character.isHighSurrogate(o40Var.lS5Rgt96tfkO((i5 - i4) + (-1))) && Character.isLowSurrogate(o40Var.lS5Rgt96tfkO(o40Var.lS5Rgt96tfkO - i4))) ? i3 + 2 : i4;
                    i2++;
                }
            } else {
                break;
            }
        }
        int i6 = 0;
        while (true) {
            if (i >= this.lS5Rgt96tfkO) {
                break;
            }
            int i7 = i6 + 1;
            int i8 = o40Var.TSizfFm2Yiuu;
            pj1 pj1Var = o40Var.PxuCJdSBwIXG;
            if (i8 + i7 >= pj1Var.PxuCJdSBwIXG()) {
                i6 = pj1Var.PxuCJdSBwIXG() - o40Var.TSizfFm2Yiuu;
                break;
            } else {
                i6 = (Character.isHighSurrogate(o40Var.lS5Rgt96tfkO((o40Var.TSizfFm2Yiuu + i7) + (-1))) && Character.isLowSurrogate(o40Var.lS5Rgt96tfkO(o40Var.TSizfFm2Yiuu + i7))) ? i6 + 2 : i7;
                i++;
            }
        }
        int i9 = o40Var.TSizfFm2Yiuu;
        o40Var.PxuCJdSBwIXG(i9, i6 + i9);
        int i10 = o40Var.lS5Rgt96tfkO;
        o40Var.PxuCJdSBwIXG(i10 - i3, i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dy)) {
            return false;
        }
        dy dyVar = (dy) obj;
        return this.PxuCJdSBwIXG == dyVar.PxuCJdSBwIXG && this.lS5Rgt96tfkO == dyVar.lS5Rgt96tfkO;
    }

    public final int hashCode() {
        return (this.PxuCJdSBwIXG * 31) + this.lS5Rgt96tfkO;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.PxuCJdSBwIXG);
        sb.append(", lengthAfterCursor=");
        return o0.r3s1LDPKFs1S(sb, this.lS5Rgt96tfkO, ')');
    }
}
