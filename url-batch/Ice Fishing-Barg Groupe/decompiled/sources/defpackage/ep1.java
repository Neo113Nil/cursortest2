package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ep1 {
    public final int PxuCJdSBwIXG;
    public final boolean TSizfFm2Yiuu;
    public final boolean Y1f8riQaR6yg;
    public final int a92UlCVFR9N8;
    public final boolean e9gEMXR7LXtO;
    public final boolean lS5Rgt96tfkO;

    public ep1(boolean z, m12 m12Var, boolean z2) {
        fq fqVar = j5.PxuCJdSBwIXG;
        int i = !z ? 262152 : 262144;
        i = m12Var == m12.OPXfSBeufaJ8 ? i | 8192 : i;
        i = z2 ? i : i | 512;
        boolean z3 = m12Var == m12.rtx2ld2ELZv4;
        this.PxuCJdSBwIXG = i;
        this.lS5Rgt96tfkO = z3;
        this.TSizfFm2Yiuu = true;
        this.Y1f8riQaR6yg = true;
        this.e9gEMXR7LXtO = true;
        this.a92UlCVFR9N8 = 1002;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ep1)) {
            return false;
        }
        ep1 ep1Var = (ep1) obj;
        return this.PxuCJdSBwIXG == ep1Var.PxuCJdSBwIXG && this.lS5Rgt96tfkO == ep1Var.lS5Rgt96tfkO && this.TSizfFm2Yiuu == ep1Var.TSizfFm2Yiuu && this.Y1f8riQaR6yg == ep1Var.Y1f8riQaR6yg && this.e9gEMXR7LXtO == ep1Var.e9gEMXR7LXtO && this.a92UlCVFR9N8 == ep1Var.a92UlCVFR9N8;
    }

    public final int hashCode() {
        return (o0.Y1f8riQaR6yg(o0.Y1f8riQaR6yg(o0.Y1f8riQaR6yg(o0.Y1f8riQaR6yg(o0.Y1f8riQaR6yg(this.PxuCJdSBwIXG * 31, 31, this.lS5Rgt96tfkO), 31, this.TSizfFm2Yiuu), 31, this.Y1f8riQaR6yg), 31, this.e9gEMXR7LXtO), 31, false) + this.a92UlCVFR9N8) * 31;
    }
}
