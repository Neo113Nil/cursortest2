package f1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class o extends c0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f3227c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3228d;

    public o(float f9, float f10) {
        super(3);
        this.f3227c = f9;
        this.f3228d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Float.compare(this.f3227c, oVar.f3227c) == 0 && Float.compare(this.f3228d, oVar.f3228d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3228d) + (Float.hashCode(this.f3227c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoveTo(x=");
        sb.append(this.f3227c);
        sb.append(", y=");
        return a0.m.k(sb, this.f3228d, ')');
    }
}
