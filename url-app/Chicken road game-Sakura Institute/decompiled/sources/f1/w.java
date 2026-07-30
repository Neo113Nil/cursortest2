package f1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class w extends c0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f3255c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3256d;

    public w(float f9, float f10) {
        super(3);
        this.f3255c = f9;
        this.f3256d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Float.compare(this.f3255c, wVar.f3255c) == 0 && Float.compare(this.f3256d, wVar.f3256d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3256d) + (Float.hashCode(this.f3255c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeMoveTo(dx=");
        sb.append(this.f3255c);
        sb.append(", dy=");
        return a0.m.k(sb, this.f3256d, ')');
    }
}
