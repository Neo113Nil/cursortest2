package U;

import H2.AbstractC0080b;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final float f3295a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3296b;

    public d(float f3, float f4) {
        this.f3295a = f3;
        this.f3296b = f4;
    }

    public final long a(long j3, long j4, M0.j jVar) {
        float f3 = (((int) (j4 >> 32)) - ((int) (j3 >> 32))) / 2.0f;
        float f4 = (((int) (j4 & 4294967295L)) - ((int) (j3 & 4294967295L))) / 2.0f;
        M0.j jVar2 = M0.j.f2775d;
        float f5 = this.f3295a;
        if (jVar != jVar2) {
            f5 *= -1;
        }
        float f6 = 1;
        return I2.d.c(Math.round((f5 + f6) * f3), Math.round((f6 + this.f3296b) * f4));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f3295a, dVar.f3295a) == 0 && Float.compare(this.f3296b, dVar.f3296b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3296b) + (Float.hashCode(this.f3295a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.f3295a);
        sb.append(", verticalBias=");
        return AbstractC0080b.j(sb, this.f3296b, ')');
    }
}
