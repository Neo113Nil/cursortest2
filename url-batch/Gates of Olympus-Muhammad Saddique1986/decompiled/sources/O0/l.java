package O0;

/* loaded from: classes.dex */
public final class l implements P0.a {

    /* renamed from: a, reason: collision with root package name */
    public final float f3744a;

    public l(float f3) {
        this.f3744a = f3;
    }

    @Override // P0.a
    public final float a(float f3) {
        return f3 / this.f3744a;
    }

    @Override // P0.a
    public final float b(float f3) {
        return f3 * this.f3744a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Float.compare(this.f3744a, ((l) obj).f3744a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3744a);
    }

    public final String toString() {
        return A.k.i(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f3744a, ')');
    }
}
