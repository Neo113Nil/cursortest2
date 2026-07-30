package f1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class v extends c0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f3253c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3254d;

    public v(float f9, float f10) {
        super(3);
        this.f3253c = f9;
        this.f3254d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Float.compare(this.f3253c, vVar.f3253c) == 0 && Float.compare(this.f3254d, vVar.f3254d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3254d) + (Float.hashCode(this.f3253c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeLineTo(dx=");
        sb.append(this.f3253c);
        sb.append(", dy=");
        return a0.m.k(sb, this.f3254d, ')');
    }
}
