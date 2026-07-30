package f1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b0 extends c0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f3084c;

    public b0(float f9) {
        super(3);
        this.f3084c = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && Float.compare(this.f3084c, ((b0) obj).f3084c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3084c);
    }

    public final String toString() {
        return a0.m.k(new StringBuilder("VerticalTo(y="), this.f3084c, ')');
    }
}
