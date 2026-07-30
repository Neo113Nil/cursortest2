package f1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j extends c0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f3189c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3190d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3191e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3192f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3193g;

    /* renamed from: h, reason: collision with root package name */
    public final float f3194h;

    /* renamed from: i, reason: collision with root package name */
    public final float f3195i;

    public j(float f9, float f10, float f11, boolean z8, boolean z9, float f12, float f13) {
        super(3);
        this.f3189c = f9;
        this.f3190d = f10;
        this.f3191e = f11;
        this.f3192f = z8;
        this.f3193g = z9;
        this.f3194h = f12;
        this.f3195i = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Float.compare(this.f3189c, jVar.f3189c) == 0 && Float.compare(this.f3190d, jVar.f3190d) == 0 && Float.compare(this.f3191e, jVar.f3191e) == 0 && this.f3192f == jVar.f3192f && this.f3193g == jVar.f3193g && Float.compare(this.f3194h, jVar.f3194h) == 0 && Float.compare(this.f3195i, jVar.f3195i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3195i) + a0.m.a(this.f3194h, a0.m.e(a0.m.e(a0.m.a(this.f3191e, a0.m.a(this.f3190d, Float.hashCode(this.f3189c) * 31, 31), 31), 31, this.f3192f), 31, this.f3193g), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb.append(this.f3189c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.f3190d);
        sb.append(", theta=");
        sb.append(this.f3191e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f3192f);
        sb.append(", isPositiveArc=");
        sb.append(this.f3193g);
        sb.append(", arcStartX=");
        sb.append(this.f3194h);
        sb.append(", arcStartY=");
        return a0.m.k(sb, this.f3195i, ')');
    }
}
