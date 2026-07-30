package s0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final float f8094a;

    public e(float f9) {
        this.f8094a = f9;
    }

    public final int a(int i7, int i8, m2.k kVar) {
        float f9 = (i8 - i7) / 2.0f;
        m2.k kVar2 = m2.k.f6322f;
        float f10 = this.f8094a;
        if (kVar != kVar2) {
            f10 *= -1;
        }
        return Math.round((1 + f10) * f9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Float.compare(this.f8094a, ((e) obj).f8094a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8094a);
    }

    public final String toString() {
        return a0.m.k(new StringBuilder("Horizontal(bias="), this.f8094a, ')');
    }
}
