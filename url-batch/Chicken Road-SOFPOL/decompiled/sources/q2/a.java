package q2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f6037a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Float.compare(this.f6037a, ((a) obj).f6037a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6037a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f6037a + ')';
    }
}
