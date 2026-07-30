package m2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: f, reason: collision with root package name */
    public final float f6307f;

    /* renamed from: g, reason: collision with root package name */
    public final float f6308g;

    public c(float f9, float f10) {
        this.f6307f = f9;
        this.f6308g = f10;
    }

    @Override // m2.b
    public final float a() {
        return this.f6307f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f6307f, cVar.f6307f) == 0 && Float.compare(this.f6308g, cVar.f6308g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6308g) + (Float.hashCode(this.f6307f) * 31);
    }

    @Override // m2.b
    public final float m() {
        return this.f6308g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.f6307f);
        sb.append(", fontScale=");
        return a0.m.k(sb, this.f6308g, ')');
    }
}
