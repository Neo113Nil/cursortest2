package M0;

import H2.AbstractC0080b;

/* loaded from: classes.dex */
public final class k implements N0.a {

    /* renamed from: a, reason: collision with root package name */
    public final float f2778a;

    public k(float f3) {
        this.f2778a = f3;
    }

    @Override // N0.a
    public final float a(float f3) {
        return f3 / this.f2778a;
    }

    @Override // N0.a
    public final float b(float f3) {
        return f3 * this.f2778a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Float.compare(this.f2778a, ((k) obj).f2778a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f2778a);
    }

    public final String toString() {
        return AbstractC0080b.j(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f2778a, ')');
    }
}
