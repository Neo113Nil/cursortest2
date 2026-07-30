package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class xi1 {
    public final m4 PxuCJdSBwIXG;
    public final float RAsUl2FVSrh6;
    public final int TSizfFm2Yiuu;
    public final int Y1f8riQaR6yg;
    public final float a92UlCVFR9N8;
    public final int e9gEMXR7LXtO;
    public final int lS5Rgt96tfkO;

    public xi1(m4 m4Var, int i, int i2, int i3, int i4, float f, float f2) {
        this.PxuCJdSBwIXG = m4Var;
        this.lS5Rgt96tfkO = i;
        this.TSizfFm2Yiuu = i2;
        this.Y1f8riQaR6yg = i3;
        this.e9gEMXR7LXtO = i4;
        this.a92UlCVFR9N8 = f;
        this.RAsUl2FVSrh6 = f2;
    }

    public final qt1 PxuCJdSBwIXG(qt1 qt1Var) {
        return qt1Var.OPXfSBeufaJ8((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(this.a92UlCVFR9N8) & 4294967295L));
    }

    public final qt1 TSizfFm2Yiuu(qt1 qt1Var) {
        float f = -this.a92UlCVFR9N8;
        return qt1Var.OPXfSBeufaJ8((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
    }

    public final int Y1f8riQaR6yg(int i) {
        int i2 = this.TSizfFm2Yiuu;
        int i3 = this.lS5Rgt96tfkO;
        return ng0.wdg6QnbFHrFF(i, i3, i2) - i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xi1) {
            xi1 xi1Var = (xi1) obj;
            if (this.PxuCJdSBwIXG == xi1Var.PxuCJdSBwIXG && this.lS5Rgt96tfkO == xi1Var.lS5Rgt96tfkO && this.TSizfFm2Yiuu == xi1Var.TSizfFm2Yiuu && this.Y1f8riQaR6yg == xi1Var.Y1f8riQaR6yg && this.e9gEMXR7LXtO == xi1Var.e9gEMXR7LXtO && Float.compare(this.a92UlCVFR9N8, xi1Var.a92UlCVFR9N8) == 0 && Float.compare(this.RAsUl2FVSrh6, xi1Var.RAsUl2FVSrh6) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.RAsUl2FVSrh6) + o0.PxuCJdSBwIXG(this.a92UlCVFR9N8, o0.lS5Rgt96tfkO(this.e9gEMXR7LXtO, o0.lS5Rgt96tfkO(this.Y1f8riQaR6yg, o0.lS5Rgt96tfkO(this.TSizfFm2Yiuu, o0.lS5Rgt96tfkO(this.lS5Rgt96tfkO, this.PxuCJdSBwIXG.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final long lS5Rgt96tfkO(long j, boolean z) {
        if (z) {
            vi2.Companion.getClass();
            long j2 = vi2.lS5Rgt96tfkO;
            if (vi2.lS5Rgt96tfkO(j, j2)) {
                return j2;
            }
        }
        ui2 ui2Var = vi2.Companion;
        int i = this.lS5Rgt96tfkO;
        return jh0.rtx2ld2ELZv4(((int) (j >> 32)) + i, ((int) (j & 4294967295L)) + i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.PxuCJdSBwIXG);
        sb.append(", startIndex=");
        sb.append(this.lS5Rgt96tfkO);
        sb.append(", endIndex=");
        sb.append(this.TSizfFm2Yiuu);
        sb.append(", startLineIndex=");
        sb.append(this.Y1f8riQaR6yg);
        sb.append(", endLineIndex=");
        sb.append(this.e9gEMXR7LXtO);
        sb.append(", top=");
        sb.append(this.a92UlCVFR9N8);
        sb.append(", bottom=");
        return o0.cpQdD2nAriOS(sb, this.RAsUl2FVSrh6, ')');
    }
}
