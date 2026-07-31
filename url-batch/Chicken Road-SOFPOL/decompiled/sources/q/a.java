package q;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f5795a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5796b;

    public a(float f6, float f8) {
        this.f5795a = f6;
        this.f5796b = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f5795a, aVar.f5795a) == 0 && Float.compare(this.f5796b, aVar.f5796b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5796b) + (Float.hashCode(this.f5795a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlingResult(distanceCoefficient=");
        sb.append(this.f5795a);
        sb.append(", velocityCoefficient=");
        return a0.q.j(sb, this.f5796b, ')');
    }
}
