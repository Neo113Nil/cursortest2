package f1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class t extends c0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f3246c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3247d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3248e;

    /* renamed from: f, reason: collision with root package name */
    public final float f3249f;

    /* renamed from: g, reason: collision with root package name */
    public final float f3250g;

    /* renamed from: h, reason: collision with root package name */
    public final float f3251h;

    public t(float f9, float f10, float f11, float f12, float f13, float f14) {
        super(2);
        this.f3246c = f9;
        this.f3247d = f10;
        this.f3248e = f11;
        this.f3249f = f12;
        this.f3250g = f13;
        this.f3251h = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Float.compare(this.f3246c, tVar.f3246c) == 0 && Float.compare(this.f3247d, tVar.f3247d) == 0 && Float.compare(this.f3248e, tVar.f3248e) == 0 && Float.compare(this.f3249f, tVar.f3249f) == 0 && Float.compare(this.f3250g, tVar.f3250g) == 0 && Float.compare(this.f3251h, tVar.f3251h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3251h) + a0.m.a(this.f3250g, a0.m.a(this.f3249f, a0.m.a(this.f3248e, a0.m.a(this.f3247d, Float.hashCode(this.f3246c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
        sb.append(this.f3246c);
        sb.append(", dy1=");
        sb.append(this.f3247d);
        sb.append(", dx2=");
        sb.append(this.f3248e);
        sb.append(", dy2=");
        sb.append(this.f3249f);
        sb.append(", dx3=");
        sb.append(this.f3250g);
        sb.append(", dy3=");
        return a0.m.k(sb, this.f3251h, ')');
    }
}
