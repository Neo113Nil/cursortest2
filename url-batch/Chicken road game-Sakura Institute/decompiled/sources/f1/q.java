package f1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class q extends c0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f3233c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3234d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3235e;

    /* renamed from: f, reason: collision with root package name */
    public final float f3236f;

    public q(float f9, float f10, float f11, float f12) {
        super(2);
        this.f3233c = f9;
        this.f3234d = f10;
        this.f3235e = f11;
        this.f3236f = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Float.compare(this.f3233c, qVar.f3233c) == 0 && Float.compare(this.f3234d, qVar.f3234d) == 0 && Float.compare(this.f3235e, qVar.f3235e) == 0 && Float.compare(this.f3236f, qVar.f3236f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3236f) + a0.m.a(this.f3235e, a0.m.a(this.f3234d, Float.hashCode(this.f3233c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveCurveTo(x1=");
        sb.append(this.f3233c);
        sb.append(", y1=");
        sb.append(this.f3234d);
        sb.append(", x2=");
        sb.append(this.f3235e);
        sb.append(", y2=");
        return a0.m.k(sb, this.f3236f, ')');
    }
}
