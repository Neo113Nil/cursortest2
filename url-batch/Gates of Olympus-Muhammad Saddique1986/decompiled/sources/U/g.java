package U;

/* loaded from: classes.dex */
public final class g implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f4479a;

    public g(float f3) {
        this.f4479a = f3;
    }

    @Override // U.c
    public final int a(int i3, int i4, O0.k kVar) {
        float f3 = (i4 - i3) / 2.0f;
        O0.k kVar2 = O0.k.f3741d;
        float f4 = this.f4479a;
        if (kVar != kVar2) {
            f4 *= -1;
        }
        return Math.round((1 + f4) * f3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Float.compare(this.f4479a, ((g) obj).f4479a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4479a);
    }

    public final String toString() {
        return A.k.i(new StringBuilder("Horizontal(bias="), this.f4479a, ')');
    }
}
