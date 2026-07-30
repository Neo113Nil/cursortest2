package f1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class s extends c0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f3239c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3240d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3241e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3242f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3243g;

    /* renamed from: h, reason: collision with root package name */
    public final float f3244h;

    /* renamed from: i, reason: collision with root package name */
    public final float f3245i;

    public s(float f9, float f10, float f11, boolean z8, boolean z9, float f12, float f13) {
        super(3);
        this.f3239c = f9;
        this.f3240d = f10;
        this.f3241e = f11;
        this.f3242f = z8;
        this.f3243g = z9;
        this.f3244h = f12;
        this.f3245i = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Float.compare(this.f3239c, sVar.f3239c) == 0 && Float.compare(this.f3240d, sVar.f3240d) == 0 && Float.compare(this.f3241e, sVar.f3241e) == 0 && this.f3242f == sVar.f3242f && this.f3243g == sVar.f3243g && Float.compare(this.f3244h, sVar.f3244h) == 0 && Float.compare(this.f3245i, sVar.f3245i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3245i) + a0.m.a(this.f3244h, a0.m.e(a0.m.e(a0.m.a(this.f3241e, a0.m.a(this.f3240d, Float.hashCode(this.f3239c) * 31, 31), 31), 31, this.f3242f), 31, this.f3243g), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb.append(this.f3239c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.f3240d);
        sb.append(", theta=");
        sb.append(this.f3241e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f3242f);
        sb.append(", isPositiveArc=");
        sb.append(this.f3243g);
        sb.append(", arcStartDx=");
        sb.append(this.f3244h);
        sb.append(", arcStartDy=");
        return a0.m.k(sb, this.f3245i, ')');
    }
}
