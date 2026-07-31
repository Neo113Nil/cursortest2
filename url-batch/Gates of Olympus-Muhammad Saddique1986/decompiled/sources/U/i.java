package U;

/* loaded from: classes.dex */
public final class i implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f4481a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4482b;

    public i(float f3, float f4) {
        this.f4481a = f3;
        this.f4482b = f4;
    }

    @Override // U.d
    public final long a(long j3, long j4, O0.k kVar) {
        float f3 = (((int) (j4 >> 32)) - ((int) (j3 >> 32))) / 2.0f;
        float f4 = (((int) (j4 & 4294967295L)) - ((int) (j3 & 4294967295L))) / 2.0f;
        O0.k kVar2 = O0.k.f3741d;
        float f5 = this.f4481a;
        if (kVar != kVar2) {
            f5 *= -1;
        }
        float f6 = 1;
        return l0.c.c(Math.round((f5 + f6) * f3), Math.round((f6 + this.f4482b) * f4));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Float.compare(this.f4481a, iVar.f4481a) == 0 && Float.compare(this.f4482b, iVar.f4482b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4482b) + (Float.hashCode(this.f4481a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.f4481a);
        sb.append(", verticalBias=");
        return A.k.i(sb, this.f4482b, ')');
    }
}
