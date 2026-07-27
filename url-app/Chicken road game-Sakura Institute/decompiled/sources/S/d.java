package S;

/* loaded from: classes.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f3967a;

    public d(float f4) {
        this.f3967a = f4;
    }

    @Override // S.c
    public final long a(long j4, long j5, M0.k kVar) {
        long c4 = u3.d.c(((int) (j5 >> 32)) - ((int) (j4 >> 32)), ((int) (j5 & 4294967295L)) - ((int) (j4 & 4294967295L)));
        float f4 = 1;
        return j0.c.g(Math.round((this.f3967a + f4) * (((int) (c4 >> 32)) / 2.0f)), Math.round((f4 - 1.0f) * (((int) (c4 & 4294967295L)) / 2.0f)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return Float.compare(this.f3967a, ((d) obj).f3967a) == 0 && Float.compare(-1.0f, -1.0f) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.f3967a) * 31);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.f3967a + ", verticalBias=-1.0)";
    }
}
