package w2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f10023a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Float.compare(this.f10023a, ((a) obj).f10023a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10023a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f10023a + ')';
    }
}
