package f1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class u extends c0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f3252c;

    public u(float f9) {
        super(3);
        this.f3252c = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Float.compare(this.f3252c, ((u) obj).f3252c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3252c);
    }

    public final String toString() {
        return a0.m.k(new StringBuilder("RelativeHorizontalTo(dx="), this.f3252c, ')');
    }
}
