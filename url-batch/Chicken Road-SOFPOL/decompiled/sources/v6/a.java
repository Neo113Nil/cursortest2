package v6;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f7491a;

    public a(float f6) {
        this.f7491a = f6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        float f6 = this.f7491a;
        return (0.0f > f6 && 0.0f > ((a) obj).f7491a) || f6 == ((a) obj).f7491a;
    }

    public final int hashCode() {
        float f6 = this.f7491a;
        if (0.0f > f6) {
            return -1;
        }
        return Float.hashCode(f6) + (Float.hashCode(0.0f) * 31);
    }

    public final String toString() {
        return "0.0.." + this.f7491a;
    }
}
