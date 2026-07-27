package L0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f3493a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Float.compare(this.f3493a, ((a) obj).f3493a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3493a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f3493a + ')';
    }
}
