package d0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public final float f1947a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1948b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1949c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1950d;

    public f1(float f9, float f10, float f11, float f12) {
        this.f1947a = f9;
        this.f1948b = f10;
        this.f1949c = f11;
        this.f1950d = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        if (m2.e.a(this.f1947a, f1Var.f1947a) && m2.e.a(this.f1948b, f1Var.f1948b) && m2.e.a(this.f1949c, f1Var.f1949c)) {
            return m2.e.a(this.f1950d, f1Var.f1950d);
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1950d) + a0.m.a(this.f1949c, a0.m.a(this.f1948b, Float.hashCode(this.f1947a) * 31, 31), 31);
    }
}
