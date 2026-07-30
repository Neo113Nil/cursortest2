package s0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final float f8095a;

    public f(float f9) {
        this.f8095a = f9;
    }

    public final int a(int i7, int i8) {
        return Math.round((1 + this.f8095a) * ((i8 - i7) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Float.compare(this.f8095a, ((f) obj).f8095a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8095a);
    }

    public final String toString() {
        return a0.m.k(new StringBuilder("Vertical(bias="), this.f8095a, ')');
    }
}
