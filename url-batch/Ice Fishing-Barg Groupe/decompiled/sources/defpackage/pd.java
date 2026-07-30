package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class pd implements s {
    public final float PxuCJdSBwIXG;
    public final float lS5Rgt96tfkO;

    public pd(float f, float f2) {
        this.PxuCJdSBwIXG = f;
        this.lS5Rgt96tfkO = f2;
    }

    @Override // defpackage.s
    public final long PxuCJdSBwIXG(long j, long j2, cw0 cw0Var) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        cw0 cw0Var2 = cw0.rtx2ld2ELZv4;
        float f3 = this.PxuCJdSBwIXG;
        if (cw0Var != cw0Var2) {
            f3 *= -1.0f;
        }
        float f4 = (1.0f + this.lS5Rgt96tfkO) * f2;
        int round = Math.round((f3 + 1.0f) * f);
        return (Math.round(f4) & 4294967295L) | (round << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pd)) {
            return false;
        }
        pd pdVar = (pd) obj;
        return Float.compare(this.PxuCJdSBwIXG, pdVar.PxuCJdSBwIXG) == 0 && Float.compare(this.lS5Rgt96tfkO, pdVar.lS5Rgt96tfkO) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.lS5Rgt96tfkO) + (Float.hashCode(this.PxuCJdSBwIXG) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.PxuCJdSBwIXG);
        sb.append(", verticalBias=");
        return o0.cpQdD2nAriOS(sb, this.lS5Rgt96tfkO, ')');
    }
}
