package m2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l implements n2.a {

    /* renamed from: a, reason: collision with root package name */
    public final float f6325a;

    public l(float f9) {
        this.f6325a = f9;
    }

    @Override // n2.a
    public final float a(float f9) {
        return f9 / this.f6325a;
    }

    @Override // n2.a
    public final float b(float f9) {
        return f9 * this.f6325a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Float.compare(this.f6325a, ((l) obj).f6325a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6325a);
    }

    public final String toString() {
        return a0.m.k(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f6325a, ')');
    }
}
