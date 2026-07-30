package f1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class p extends c0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f3229c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3230d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3231e;

    /* renamed from: f, reason: collision with root package name */
    public final float f3232f;

    public p(float f9, float f10, float f11, float f12) {
        super(1);
        this.f3229c = f9;
        this.f3230d = f10;
        this.f3231e = f11;
        this.f3232f = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Float.compare(this.f3229c, pVar.f3229c) == 0 && Float.compare(this.f3230d, pVar.f3230d) == 0 && Float.compare(this.f3231e, pVar.f3231e) == 0 && Float.compare(this.f3232f, pVar.f3232f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3232f) + a0.m.a(this.f3231e, a0.m.a(this.f3230d, Float.hashCode(this.f3229c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuadTo(x1=");
        sb.append(this.f3229c);
        sb.append(", y1=");
        sb.append(this.f3230d);
        sb.append(", x2=");
        sb.append(this.f3231e);
        sb.append(", y2=");
        return a0.m.k(sb, this.f3232f, ')');
    }
}
