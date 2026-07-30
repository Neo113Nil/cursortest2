package k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f5171a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5172b;

    public a(float f9, float f10) {
        this.f5171a = f9;
        this.f5172b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f5171a, aVar.f5171a) == 0 && Float.compare(this.f5172b, aVar.f5172b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5172b) + (Float.hashCode(this.f5171a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlingResult(distanceCoefficient=");
        sb.append(this.f5171a);
        sb.append(", velocityCoefficient=");
        return a0.m.k(sb, this.f5172b, ')');
    }
}
