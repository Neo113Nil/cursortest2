package h0;

/* loaded from: classes.dex */
public final class z extends AbstractC0449B {

    /* renamed from: c, reason: collision with root package name */
    public final float f6040c;

    public z(float f3) {
        super(3, false, false);
        this.f6040c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Float.compare(this.f6040c, ((z) obj).f6040c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6040c);
    }

    public final String toString() {
        return A.k.i(new StringBuilder("RelativeVerticalTo(dy="), this.f6040c, ')');
    }
}
