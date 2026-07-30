package l2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f5860a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Float.compare(this.f5860a, ((a) obj).f5860a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5860a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f5860a + ')';
    }
}
