package f1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class y extends c0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f3261c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3262d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3263e;

    /* renamed from: f, reason: collision with root package name */
    public final float f3264f;

    public y(float f9, float f10, float f11, float f12) {
        super(2);
        this.f3261c = f9;
        this.f3262d = f10;
        this.f3263e = f11;
        this.f3264f = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Float.compare(this.f3261c, yVar.f3261c) == 0 && Float.compare(this.f3262d, yVar.f3262d) == 0 && Float.compare(this.f3263e, yVar.f3263e) == 0 && Float.compare(this.f3264f, yVar.f3264f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3264f) + a0.m.a(this.f3263e, a0.m.a(this.f3262d, Float.hashCode(this.f3261c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb.append(this.f3261c);
        sb.append(", dy1=");
        sb.append(this.f3262d);
        sb.append(", dx2=");
        sb.append(this.f3263e);
        sb.append(", dy2=");
        return a0.m.k(sb, this.f3264f, ')');
    }
}
