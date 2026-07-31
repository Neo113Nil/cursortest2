package U;

import H2.AbstractC0080b;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f3293a;

    public b(float f3) {
        this.f3293a = f3;
    }

    public final int a(int i3, int i4, M0.j jVar) {
        float f3 = (i4 - i3) / 2.0f;
        M0.j jVar2 = M0.j.f2775d;
        float f4 = this.f3293a;
        if (jVar != jVar2) {
            f4 *= -1;
        }
        return Math.round((1 + f4) * f3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Float.compare(this.f3293a, ((b) obj).f3293a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3293a);
    }

    public final String toString() {
        return AbstractC0080b.j(new StringBuilder("Horizontal(bias="), this.f3293a, ')');
    }
}
