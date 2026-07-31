package v6;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: g, reason: collision with root package name */
    public static final d f7499g = new d(1, 0, 1);

    @Override // v6.b
    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        if (isEmpty() && ((d) obj).isEmpty()) {
            return true;
        }
        d dVar = (d) obj;
        return this.f7492d == dVar.f7492d && this.f7493e == dVar.f7493e;
    }

    @Override // v6.b
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f7492d * 31) + this.f7493e;
    }

    @Override // v6.b
    public final boolean isEmpty() {
        return this.f7492d > this.f7493e;
    }

    @Override // v6.b
    public final String toString() {
        return this.f7492d + ".." + this.f7493e;
    }
}
