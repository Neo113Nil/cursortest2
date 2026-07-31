package N0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f3531a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Float.compare(this.f3531a, ((a) obj).f3531a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3531a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f3531a + ')';
    }
}
