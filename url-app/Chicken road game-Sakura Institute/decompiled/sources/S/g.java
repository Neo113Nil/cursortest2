package S;

import A.AbstractC0017m;

/* loaded from: classes.dex */
public final class g implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f3970a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3971b;

    public g(float f4, float f5) {
        this.f3970a = f4;
        this.f3971b = f5;
    }

    @Override // S.c
    public final long a(long j4, long j5, M0.k kVar) {
        float f4 = (((int) (j5 >> 32)) - ((int) (j4 >> 32))) / 2.0f;
        float f5 = (((int) (j5 & 4294967295L)) - ((int) (j4 & 4294967295L))) / 2.0f;
        M0.k kVar2 = M0.k.f3555d;
        float f6 = this.f3970a;
        if (kVar != kVar2) {
            f6 *= -1;
        }
        float f7 = 1;
        return j0.c.g(Math.round((f6 + f7) * f4), Math.round((f7 + this.f3971b) * f5));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Float.compare(this.f3970a, gVar.f3970a) == 0 && Float.compare(this.f3971b, gVar.f3971b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3971b) + (Float.hashCode(this.f3970a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.f3970a);
        sb.append(", verticalBias=");
        return AbstractC0017m.k(sb, this.f3971b, ')');
    }
}
