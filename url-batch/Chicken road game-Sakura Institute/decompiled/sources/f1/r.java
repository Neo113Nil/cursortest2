package f1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class r extends c0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f3237c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3238d;

    public r(float f9, float f10) {
        super(1);
        this.f3237c = f9;
        this.f3238d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Float.compare(this.f3237c, rVar.f3237c) == 0 && Float.compare(this.f3238d, rVar.f3238d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3238d) + (Float.hashCode(this.f3237c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveQuadTo(x=");
        sb.append(this.f3237c);
        sb.append(", y=");
        return a0.m.k(sb, this.f3238d, ')');
    }
}
