package q;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f7285a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7286b;

    /* renamed from: c, reason: collision with root package name */
    public final float f7287c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7288d;

    public h0(float f9, float f10, float f11, float f12) {
        this.f7285a = f9;
        this.f7286b = f10;
        this.f7287c = f11;
        this.f7288d = f12;
        if (f9 < 0.0f) {
            throw new IllegalArgumentException("Start padding must be non-negative");
        }
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Top padding must be non-negative");
        }
        if (f11 < 0.0f) {
            throw new IllegalArgumentException("End padding must be non-negative");
        }
        if (f12 < 0.0f) {
            throw new IllegalArgumentException("Bottom padding must be non-negative");
        }
    }

    public final float a() {
        return this.f7288d;
    }

    public final float b(m2.k kVar) {
        return kVar == m2.k.f6322f ? this.f7285a : this.f7287c;
    }

    public final float c(m2.k kVar) {
        return kVar == m2.k.f6322f ? this.f7287c : this.f7285a;
    }

    public final float d() {
        return this.f7286b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return m2.e.a(this.f7285a, h0Var.f7285a) && m2.e.a(this.f7286b, h0Var.f7286b) && m2.e.a(this.f7287c, h0Var.f7287c) && m2.e.a(this.f7288d, h0Var.f7288d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f7288d) + a0.m.a(this.f7287c, a0.m.a(this.f7286b, Float.hashCode(this.f7285a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) m2.e.e(this.f7285a)) + ", top=" + ((Object) m2.e.e(this.f7286b)) + ", end=" + ((Object) m2.e.e(this.f7287c)) + ", bottom=" + ((Object) m2.e.e(this.f7288d)) + ')';
    }
}
