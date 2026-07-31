package U;

/* loaded from: classes.dex */
public final class f implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f4478a;

    public f(float f3) {
        this.f4478a = f3;
    }

    @Override // U.d
    public final long a(long j3, long j4, O0.k kVar) {
        long d3 = O2.d.d(((int) (j4 >> 32)) - ((int) (j3 >> 32)), ((int) (j4 & 4294967295L)) - ((int) (j3 & 4294967295L)));
        float f3 = 1;
        return l0.c.c(Math.round((this.f4478a + f3) * (((int) (d3 >> 32)) / 2.0f)), Math.round((f3 - 1.0f) * (((int) (d3 & 4294967295L)) / 2.0f)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            return Float.compare(this.f4478a, ((f) obj).f4478a) == 0 && Float.compare(-1.0f, -1.0f) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.f4478a) * 31);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.f4478a + ", verticalBias=-1.0)";
    }
}
