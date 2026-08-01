package d1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final float f3296a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3297b;

    public d(float f3, float f10) {
        this.f3296a = f3;
        this.f3297b = f10;
    }

    public final long a(long j, long j3, x2.l lVar) {
        float f3 = (((int) (j3 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f10 = (((int) (j3 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        x2.l lVar2 = x2.l.f10330d;
        float f11 = this.f3296a;
        if (lVar != lVar2) {
            f11 *= -1;
        }
        float f12 = 1;
        float f13 = (f11 + f12) * f3;
        float f14 = (f12 + this.f3297b) * f10;
        return (Math.round(f14) & 4294967295L) | (Math.round(f13) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f3296a, dVar.f3296a) == 0 && Float.compare(this.f3297b, dVar.f3297b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3297b) + (Float.hashCode(this.f3296a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BiasAlignment(horizontalBias=");
        sb2.append(this.f3296a);
        sb2.append(", verticalBias=");
        return v4.a.l(sb2, this.f3297b, ')');
    }
}
