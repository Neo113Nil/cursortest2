package S;

import A.AbstractC0017m;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final float f3969a;

    public f(float f4) {
        this.f3969a = f4;
    }

    public final int a(int i2, int i4) {
        return Math.round((1 + this.f3969a) * ((i4 - i2) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Float.compare(this.f3969a, ((f) obj).f3969a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3969a);
    }

    public final String toString() {
        return AbstractC0017m.k(new StringBuilder("Vertical(bias="), this.f3969a, ')');
    }
}
