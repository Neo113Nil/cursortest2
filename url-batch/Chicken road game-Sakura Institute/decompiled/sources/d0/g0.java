package d0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f1971a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1972b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1973c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1974d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1975e;

    public g0(float f9, float f10, float f11, float f12, float f13, float f14) {
        this.f1971a = f9;
        this.f1972b = f10;
        this.f1973c = f11;
        this.f1974d = f12;
        this.f1975e = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return m2.e.a(this.f1971a, g0Var.f1971a) && m2.e.a(this.f1972b, g0Var.f1972b) && m2.e.a(this.f1973c, g0Var.f1973c) && m2.e.a(this.f1974d, g0Var.f1974d) && m2.e.a(this.f1975e, g0Var.f1975e);
    }

    public final int hashCode() {
        return Float.hashCode(this.f1975e) + a0.m.a(this.f1974d, a0.m.a(this.f1973c, a0.m.a(this.f1972b, Float.hashCode(this.f1971a) * 31, 31), 31), 31);
    }
}
