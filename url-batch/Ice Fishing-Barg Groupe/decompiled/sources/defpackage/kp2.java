package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class kp2 implements ms2 {
    public final String PxuCJdSBwIXG;
    public final mj1 lS5Rgt96tfkO;

    public kp2(aq0 aq0Var, String str) {
        this.PxuCJdSBwIXG = str;
        this.lS5Rgt96tfkO = sj0.tmVwIGCQF4zR(aq0Var);
    }

    @Override // defpackage.ms2
    public final int PxuCJdSBwIXG(hy hyVar) {
        return e9gEMXR7LXtO().Y1f8riQaR6yg;
    }

    @Override // defpackage.ms2
    public final int TSizfFm2Yiuu(hy hyVar, cw0 cw0Var) {
        return e9gEMXR7LXtO().TSizfFm2Yiuu;
    }

    @Override // defpackage.ms2
    public final int Y1f8riQaR6yg(hy hyVar, cw0 cw0Var) {
        return e9gEMXR7LXtO().PxuCJdSBwIXG;
    }

    public final void a92UlCVFR9N8(aq0 aq0Var) {
        this.lS5Rgt96tfkO.setValue(aq0Var);
    }

    public final aq0 e9gEMXR7LXtO() {
        return (aq0) this.lS5Rgt96tfkO.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kp2) {
            return cs0.wdg6QnbFHrFF(e9gEMXR7LXtO(), ((kp2) obj).e9gEMXR7LXtO());
        }
        return false;
    }

    public final int hashCode() {
        return this.PxuCJdSBwIXG.hashCode();
    }

    @Override // defpackage.ms2
    public final int lS5Rgt96tfkO(hy hyVar) {
        return e9gEMXR7LXtO().lS5Rgt96tfkO;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.PxuCJdSBwIXG);
        sb.append("(left=");
        sb.append(e9gEMXR7LXtO().PxuCJdSBwIXG);
        sb.append(", top=");
        sb.append(e9gEMXR7LXtO().lS5Rgt96tfkO);
        sb.append(", right=");
        sb.append(e9gEMXR7LXtO().TSizfFm2Yiuu);
        sb.append(", bottom=");
        return o0.r3s1LDPKFs1S(sb, e9gEMXR7LXtO().Y1f8riQaR6yg, ')');
    }
}
