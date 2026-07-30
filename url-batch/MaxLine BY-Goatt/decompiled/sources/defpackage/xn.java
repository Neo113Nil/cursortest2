package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xn implements f6 {
    public final float a;

    public xn(float f) {
        this.a = f;
    }

    @Override // defpackage.f6
    public final long a(long j, long j2, u81 u81Var) {
        long j3 = ((((int) (j2 >> 32)) - ((int) (j >> 32))) << 32) | ((((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) & 4294967295L);
        return (Math.round((((int) (j3 & 4294967295L)) / 2.0f) * 0.0f) & 4294967295L) | (Math.round((1.0f + this.a) * (((int) (j3 >> 32)) / 2.0f)) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xn) && Float.compare(this.a, ((xn) obj).a) == 0 && Float.compare(-1.0f, -1.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.a + ", verticalBias=-1.0)";
    }
}
