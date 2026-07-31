package l1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class r extends s {

    /* renamed from: b, reason: collision with root package name */
    public final float f4807b;

    public r(float f6) {
        super(3);
        this.f4807b = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && Float.compare(this.f4807b, ((r) obj).f4807b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4807b);
    }

    public final String toString() {
        return a0.q.j(new StringBuilder("RelativeVerticalTo(dy="), this.f4807b, ')');
    }
}
