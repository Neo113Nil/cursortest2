package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ox1 implements z42 {
    public final eu PxuCJdSBwIXG;
    public final eu TSizfFm2Yiuu;
    public final eu Y1f8riQaR6yg;
    public final eu lS5Rgt96tfkO;

    public ox1(eu euVar, eu euVar2, eu euVar3, eu euVar4) {
        this.PxuCJdSBwIXG = euVar;
        this.lS5Rgt96tfkO = euVar2;
        this.TSizfFm2Yiuu = euVar3;
        this.Y1f8riQaR6yg = euVar4;
    }

    public static ox1 lS5Rgt96tfkO(ox1 ox1Var, eu euVar, eu euVar2, eu euVar3, eu euVar4, int i) {
        if ((i & 1) != 0) {
            euVar = ox1Var.PxuCJdSBwIXG;
        }
        if ((i & 2) != 0) {
            euVar2 = ox1Var.lS5Rgt96tfkO;
        }
        if ((i & 4) != 0) {
            euVar3 = ox1Var.TSizfFm2Yiuu;
        }
        if ((i & 8) != 0) {
            euVar4 = ox1Var.Y1f8riQaR6yg;
        }
        ox1Var.getClass();
        return new ox1(euVar, euVar2, euVar3, euVar4);
    }

    @Override // defpackage.z42
    public final th0 PxuCJdSBwIXG(long j, cw0 cw0Var, hy hyVar) {
        float PxuCJdSBwIXG = this.PxuCJdSBwIXG.PxuCJdSBwIXG(j, hyVar);
        float PxuCJdSBwIXG2 = this.lS5Rgt96tfkO.PxuCJdSBwIXG(j, hyVar);
        float PxuCJdSBwIXG3 = this.TSizfFm2Yiuu.PxuCJdSBwIXG(j, hyVar);
        float PxuCJdSBwIXG4 = this.Y1f8riQaR6yg.PxuCJdSBwIXG(j, hyVar);
        float lS5Rgt96tfkO = a62.lS5Rgt96tfkO(j);
        float f = PxuCJdSBwIXG + PxuCJdSBwIXG4;
        if (f > lS5Rgt96tfkO) {
            float f2 = lS5Rgt96tfkO / f;
            PxuCJdSBwIXG *= f2;
            PxuCJdSBwIXG4 *= f2;
        }
        float f3 = PxuCJdSBwIXG2 + PxuCJdSBwIXG3;
        if (f3 > lS5Rgt96tfkO) {
            float f4 = lS5Rgt96tfkO / f3;
            PxuCJdSBwIXG2 *= f4;
            PxuCJdSBwIXG3 *= f4;
        }
        if (PxuCJdSBwIXG < 0.0f || PxuCJdSBwIXG2 < 0.0f || PxuCJdSBwIXG3 < 0.0f || PxuCJdSBwIXG4 < 0.0f) {
            hp0.PxuCJdSBwIXG("Corner size in Px can't be negative(topStart = " + PxuCJdSBwIXG + ", topEnd = " + PxuCJdSBwIXG2 + ", bottomEnd = " + PxuCJdSBwIXG3 + ", bottomStart = " + PxuCJdSBwIXG4 + ")!");
        }
        if (PxuCJdSBwIXG + PxuCJdSBwIXG2 + PxuCJdSBwIXG3 + PxuCJdSBwIXG4 == 0.0f) {
            return new xh1(ni0.nxJAScVArhE9(j));
        }
        qt1 nxJAScVArhE9 = ni0.nxJAScVArhE9(j);
        cw0 cw0Var2 = cw0.rtx2ld2ELZv4;
        float f5 = cw0Var == cw0Var2 ? PxuCJdSBwIXG : PxuCJdSBwIXG2;
        long floatToRawIntBits = (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L);
        if (cw0Var == cw0Var2) {
            PxuCJdSBwIXG = PxuCJdSBwIXG2;
        }
        long floatToRawIntBits2 = (Float.floatToRawIntBits(PxuCJdSBwIXG) << 32) | (Float.floatToRawIntBits(PxuCJdSBwIXG) & 4294967295L);
        float f6 = cw0Var == cw0Var2 ? PxuCJdSBwIXG3 : PxuCJdSBwIXG4;
        long floatToRawIntBits3 = (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L);
        if (cw0Var != cw0Var2) {
            PxuCJdSBwIXG4 = PxuCJdSBwIXG3;
        }
        return new yh1(ki0.e9gEMXR7LXtO(nxJAScVArhE9, floatToRawIntBits, floatToRawIntBits2, floatToRawIntBits3, (Float.floatToRawIntBits(PxuCJdSBwIXG4) << 32) | (Float.floatToRawIntBits(PxuCJdSBwIXG4) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox1)) {
            return false;
        }
        ox1 ox1Var = (ox1) obj;
        return cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, ox1Var.PxuCJdSBwIXG) && cs0.wdg6QnbFHrFF(this.lS5Rgt96tfkO, ox1Var.lS5Rgt96tfkO) && cs0.wdg6QnbFHrFF(this.TSizfFm2Yiuu, ox1Var.TSizfFm2Yiuu) && cs0.wdg6QnbFHrFF(this.Y1f8riQaR6yg, ox1Var.Y1f8riQaR6yg);
    }

    public final int hashCode() {
        return this.Y1f8riQaR6yg.hashCode() + ((this.TSizfFm2Yiuu.hashCode() + ((this.lS5Rgt96tfkO.hashCode() + (this.PxuCJdSBwIXG.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.PxuCJdSBwIXG + ", topEnd = " + this.lS5Rgt96tfkO + ", bottomEnd = " + this.TSizfFm2Yiuu + ", bottomStart = " + this.Y1f8riQaR6yg + ')';
    }
}
