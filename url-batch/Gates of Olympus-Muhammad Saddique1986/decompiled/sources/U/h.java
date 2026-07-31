package U;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final float f4480a;

    public h(float f3) {
        this.f4480a = f3;
    }

    public final int a(int i3, int i4) {
        return Math.round((1 + this.f4480a) * ((i4 - i3) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Float.compare(this.f4480a, ((h) obj).f4480a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4480a);
    }

    public final String toString() {
        return A.k.i(new StringBuilder("Vertical(bias="), this.f4480a, ')');
    }
}
