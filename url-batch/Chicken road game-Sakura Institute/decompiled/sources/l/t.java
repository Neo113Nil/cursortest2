package l;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public double f5657a;

    /* renamed from: b, reason: collision with root package name */
    public double f5658b;

    public t(double d8, double d9) {
        this.f5657a = d8;
        this.f5658b = d9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Double.compare(this.f5657a, tVar.f5657a) == 0 && Double.compare(this.f5658b, tVar.f5658b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f5658b) + (Double.hashCode(this.f5657a) * 31);
    }

    public final String toString() {
        return "ComplexDouble(_real=" + this.f5657a + ", _imaginary=" + this.f5658b + ')';
    }
}
