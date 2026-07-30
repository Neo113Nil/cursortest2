package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class c7 implements ms2 {
    public final int PxuCJdSBwIXG;
    public final mj1 TSizfFm2Yiuu = sj0.tmVwIGCQF4zR(wp0.e9gEMXR7LXtO);
    public final mj1 Y1f8riQaR6yg = sj0.tmVwIGCQF4zR(Boolean.TRUE);
    public final String lS5Rgt96tfkO;

    public c7(String str, int i) {
        this.PxuCJdSBwIXG = i;
        this.lS5Rgt96tfkO = str;
    }

    @Override // defpackage.ms2
    public final int PxuCJdSBwIXG(hy hyVar) {
        return e9gEMXR7LXtO().Y1f8riQaR6yg;
    }

    public final void RAsUl2FVSrh6(rt2 rt2Var, int i) {
        int i2 = this.PxuCJdSBwIXG;
        if (i == 0 || (i & i2) != 0) {
            this.TSizfFm2Yiuu.setValue(rt2Var.PxuCJdSBwIXG.rtx2ld2ELZv4(i2));
            a92UlCVFR9N8(rt2Var.PxuCJdSBwIXG.EcgxDIVH5in8(i2));
        }
    }

    @Override // defpackage.ms2
    public final int TSizfFm2Yiuu(hy hyVar, cw0 cw0Var) {
        return e9gEMXR7LXtO().TSizfFm2Yiuu;
    }

    @Override // defpackage.ms2
    public final int Y1f8riQaR6yg(hy hyVar, cw0 cw0Var) {
        return e9gEMXR7LXtO().PxuCJdSBwIXG;
    }

    public final void a92UlCVFR9N8(boolean z) {
        this.Y1f8riQaR6yg.setValue(Boolean.valueOf(z));
    }

    public final wp0 e9gEMXR7LXtO() {
        return (wp0) this.TSizfFm2Yiuu.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c7) {
            return this.PxuCJdSBwIXG == ((c7) obj).PxuCJdSBwIXG;
        }
        return false;
    }

    public final int hashCode() {
        return this.PxuCJdSBwIXG;
    }

    @Override // defpackage.ms2
    public final int lS5Rgt96tfkO(hy hyVar) {
        return e9gEMXR7LXtO().lS5Rgt96tfkO;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.lS5Rgt96tfkO);
        sb.append('(');
        sb.append(e9gEMXR7LXtO().PxuCJdSBwIXG);
        sb.append(", ");
        sb.append(e9gEMXR7LXtO().lS5Rgt96tfkO);
        sb.append(", ");
        sb.append(e9gEMXR7LXtO().TSizfFm2Yiuu);
        sb.append(", ");
        return o0.r3s1LDPKFs1S(sb, e9gEMXR7LXtO().Y1f8riQaR6yg, ')');
    }
}
