package q1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class r extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f7931c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7932d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7933e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f7934f;
    public final boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final float f7935h;

    /* renamed from: i, reason: collision with root package name */
    public final float f7936i;

    public r(float f3, float f10, float f11, boolean z10, boolean z11, float f12, float f13) {
        super(3);
        this.f7931c = f3;
        this.f7932d = f10;
        this.f7933e = f11;
        this.f7934f = z10;
        this.g = z11;
        this.f7935h = f12;
        this.f7936i = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Float.compare(this.f7931c, rVar.f7931c) == 0 && Float.compare(this.f7932d, rVar.f7932d) == 0 && Float.compare(this.f7933e, rVar.f7933e) == 0 && this.f7934f == rVar.f7934f && this.g == rVar.g && Float.compare(this.f7935h, rVar.f7935h) == 0 && Float.compare(this.f7936i, rVar.f7936i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7936i) + n0.l.b(this.f7935h, n0.l.d(n0.l.d(n0.l.b(this.f7933e, n0.l.b(this.f7932d, Float.hashCode(this.f7931c) * 31, 31), 31), 31, this.f7934f), 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb2.append(this.f7931c);
        sb2.append(", verticalEllipseRadius=");
        sb2.append(this.f7932d);
        sb2.append(", theta=");
        sb2.append(this.f7933e);
        sb2.append(", isMoreThanHalf=");
        sb2.append(this.f7934f);
        sb2.append(", isPositiveArc=");
        sb2.append(this.g);
        sb2.append(", arcStartDx=");
        sb2.append(this.f7935h);
        sb2.append(", arcStartDy=");
        return v4.a.l(sb2, this.f7936i, ')');
    }
}
