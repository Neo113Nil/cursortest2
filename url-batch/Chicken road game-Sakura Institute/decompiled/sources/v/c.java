package v;

import y0.f;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final float f9092a;

    public c(float f9) {
        this.f9092a = f9;
        if (f9 < 0.0f || f9 > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    @Override // v.a
    public final float a(long j8, m2.b bVar) {
        return (this.f9092a / 100.0f) * f.c(j8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Float.compare(this.f9092a, ((c) obj).f9092a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9092a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f9092a + "%)";
    }
}
