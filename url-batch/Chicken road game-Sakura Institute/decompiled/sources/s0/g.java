package s0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f8096a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8097b;

    public g(float f9, float f10) {
        this.f8096a = f9;
        this.f8097b = f10;
    }

    @Override // s0.c
    public final long a(long j8, long j9, m2.k kVar) {
        float f9 = (((int) (j9 >> 32)) - ((int) (j8 >> 32))) / 2.0f;
        float f10 = (((int) (j9 & 4294967295L)) - ((int) (j8 & 4294967295L))) / 2.0f;
        m2.k kVar2 = m2.k.f6322f;
        float f11 = this.f8096a;
        if (kVar != kVar2) {
            f11 *= -1;
        }
        float f12 = 1;
        return a8.m.c(Math.round((f11 + f12) * f9), Math.round((f12 + this.f8097b) * f10));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Float.compare(this.f8096a, gVar.f8096a) == 0 && Float.compare(this.f8097b, gVar.f8097b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8097b) + (Float.hashCode(this.f8096a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.f8096a);
        sb.append(", verticalBias=");
        return a0.m.k(sb, this.f8097b, ')');
    }
}
