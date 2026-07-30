package f1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l extends c0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f3204c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3205d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3206e;

    /* renamed from: f, reason: collision with root package name */
    public final float f3207f;

    /* renamed from: g, reason: collision with root package name */
    public final float f3208g;

    /* renamed from: h, reason: collision with root package name */
    public final float f3209h;

    public l(float f9, float f10, float f11, float f12, float f13, float f14) {
        super(2);
        this.f3204c = f9;
        this.f3205d = f10;
        this.f3206e = f11;
        this.f3207f = f12;
        this.f3208g = f13;
        this.f3209h = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Float.compare(this.f3204c, lVar.f3204c) == 0 && Float.compare(this.f3205d, lVar.f3205d) == 0 && Float.compare(this.f3206e, lVar.f3206e) == 0 && Float.compare(this.f3207f, lVar.f3207f) == 0 && Float.compare(this.f3208g, lVar.f3208g) == 0 && Float.compare(this.f3209h, lVar.f3209h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3209h) + a0.m.a(this.f3208g, a0.m.a(this.f3207f, a0.m.a(this.f3206e, a0.m.a(this.f3205d, Float.hashCode(this.f3204c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CurveTo(x1=");
        sb.append(this.f3204c);
        sb.append(", y1=");
        sb.append(this.f3205d);
        sb.append(", x2=");
        sb.append(this.f3206e);
        sb.append(", y2=");
        sb.append(this.f3207f);
        sb.append(", x3=");
        sb.append(this.f3208g);
        sb.append(", y3=");
        return a0.m.k(sb, this.f3209h, ')');
    }
}
