package U;

/* loaded from: classes.dex */
public final class e implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f4477a;

    public e(float f3) {
        this.f4477a = f3;
    }

    @Override // U.c
    public final int a(int i3, int i4, O0.k kVar) {
        return Math.round((1 + this.f4477a) * ((i4 - i3) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Float.compare(this.f4477a, ((e) obj).f4477a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4477a);
    }

    public final String toString() {
        return A.k.i(new StringBuilder("Horizontal(bias="), this.f4477a, ')');
    }
}
