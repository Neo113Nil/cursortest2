package f1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a0 extends c0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f3081c;

    public a0(float f9) {
        super(3);
        this.f3081c = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && Float.compare(this.f3081c, ((a0) obj).f3081c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3081c);
    }

    public final String toString() {
        return a0.m.k(new StringBuilder("RelativeVerticalTo(dy="), this.f3081c, ')');
    }
}
