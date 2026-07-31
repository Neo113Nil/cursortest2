package l1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j extends s {

    /* renamed from: b, reason: collision with root package name */
    public final float f4785b;

    public j(float f6) {
        super(3);
        this.f4785b = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Float.compare(this.f4785b, ((j) obj).f4785b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4785b);
    }

    public final String toString() {
        return a0.q.j(new StringBuilder("HorizontalTo(x="), this.f4785b, ')');
    }
}
