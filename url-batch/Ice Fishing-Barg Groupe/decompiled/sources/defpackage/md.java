package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class md implements s {
    public final float PxuCJdSBwIXG;

    public md(float f) {
        this.PxuCJdSBwIXG = f;
    }

    @Override // defpackage.s
    public final long PxuCJdSBwIXG(long j, long j2, cw0 cw0Var) {
        long j3 = ((((int) (j2 >> 32)) - ((int) (j >> 32))) << 32) | ((((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) & 4294967295L);
        return (Math.round((((int) (j3 & 4294967295L)) / 2.0f) * 0.0f) & 4294967295L) | (Math.round((1.0f + this.PxuCJdSBwIXG) * (((int) (j3 >> 32)) / 2.0f)) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof md) && Float.compare(this.PxuCJdSBwIXG, ((md) obj).PxuCJdSBwIXG) == 0 && Float.compare(-1.0f, -1.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.PxuCJdSBwIXG) * 31);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.PxuCJdSBwIXG + ", verticalBias=-1.0)";
    }
}
