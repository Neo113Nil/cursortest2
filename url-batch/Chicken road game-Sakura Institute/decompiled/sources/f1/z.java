package f1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class z extends c0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f3265c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3266d;

    public z(float f9, float f10) {
        super(1);
        this.f3265c = f9;
        this.f3266d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Float.compare(this.f3265c, zVar.f3265c) == 0 && Float.compare(this.f3266d, zVar.f3266d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3266d) + (Float.hashCode(this.f3265c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb.append(this.f3265c);
        sb.append(", dy=");
        return a0.m.k(sb, this.f3266d, ')');
    }
}
