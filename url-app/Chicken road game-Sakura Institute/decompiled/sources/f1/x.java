package f1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class x extends c0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f3257c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3258d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3259e;

    /* renamed from: f, reason: collision with root package name */
    public final float f3260f;

    public x(float f9, float f10, float f11, float f12) {
        super(1);
        this.f3257c = f9;
        this.f3258d = f10;
        this.f3259e = f11;
        this.f3260f = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Float.compare(this.f3257c, xVar.f3257c) == 0 && Float.compare(this.f3258d, xVar.f3258d) == 0 && Float.compare(this.f3259e, xVar.f3259e) == 0 && Float.compare(this.f3260f, xVar.f3260f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3260f) + a0.m.a(this.f3259e, a0.m.a(this.f3258d, Float.hashCode(this.f3257c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeQuadTo(dx1=");
        sb.append(this.f3257c);
        sb.append(", dy1=");
        sb.append(this.f3258d);
        sb.append(", dx2=");
        sb.append(this.f3259e);
        sb.append(", dy2=");
        return a0.m.k(sb, this.f3260f, ')');
    }
}
