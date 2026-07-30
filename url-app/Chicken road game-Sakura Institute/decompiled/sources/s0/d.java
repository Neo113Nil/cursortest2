package s0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f8093a;

    public d(float f9) {
        this.f8093a = f9;
    }

    @Override // s0.c
    public final long a(long j8, long j9, m2.k kVar) {
        long G = j1.c.G(((int) (j9 >> 32)) - ((int) (j8 >> 32)), ((int) (j9 & 4294967295L)) - ((int) (j8 & 4294967295L)));
        float f9 = 1;
        return a8.m.c(Math.round((this.f8093a + f9) * (((int) (G >> 32)) / 2.0f)), Math.round((f9 - 1.0f) * (((int) (G & 4294967295L)) / 2.0f)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Float.compare(this.f8093a, ((d) obj).f8093a) == 0 && Float.compare(-1.0f, -1.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.f8093a) * 31);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.f8093a + ", verticalBias=-1.0)";
    }
}
