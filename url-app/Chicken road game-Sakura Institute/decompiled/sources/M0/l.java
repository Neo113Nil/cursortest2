package M0;

import A.AbstractC0017m;

/* loaded from: classes.dex */
public final class l implements N0.a {

    /* renamed from: a, reason: collision with root package name */
    public final float f3558a;

    public l(float f4) {
        this.f3558a = f4;
    }

    @Override // N0.a
    public final float a(float f4) {
        return f4 / this.f3558a;
    }

    @Override // N0.a
    public final float b(float f4) {
        return f4 * this.f3558a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Float.compare(this.f3558a, ((l) obj).f3558a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3558a);
    }

    public final String toString() {
        return AbstractC0017m.k(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f3558a, ')');
    }
}
