package S;

import A.AbstractC0017m;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final float f3968a;

    public e(float f4) {
        this.f3968a = f4;
    }

    public final int a(int i2, int i4, M0.k kVar) {
        float f4 = (i4 - i2) / 2.0f;
        M0.k kVar2 = M0.k.f3555d;
        float f5 = this.f3968a;
        if (kVar != kVar2) {
            f5 *= -1;
        }
        return Math.round((1 + f5) * f4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Float.compare(this.f3968a, ((e) obj).f3968a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3968a);
    }

    public final String toString() {
        return AbstractC0017m.k(new StringBuilder("Horizontal(bias="), this.f3968a, ')');
    }
}
