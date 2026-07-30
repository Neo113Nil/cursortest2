package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ao implements f6 {
    public final float a;
    public final float b;

    public ao(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.f6
    public final long a(long j, long j2, u81 u81Var) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        u81 u81Var2 = u81.m;
        float f3 = this.a;
        if (u81Var != u81Var2) {
            f3 *= -1.0f;
        }
        float f4 = (1.0f + this.b) * f2;
        int round = Math.round((f3 + 1.0f) * f);
        return (Math.round(f4) & 4294967295L) | (round << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ao)) {
            return false;
        }
        ao aoVar = (ao) obj;
        return Float.compare(this.a, aoVar.a) == 0 && Float.compare(this.b, aoVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.a);
        sb.append(", verticalBias=");
        return q40.n(sb, this.b, ')');
    }
}
