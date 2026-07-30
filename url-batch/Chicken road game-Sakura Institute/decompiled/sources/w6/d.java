package w6;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: i, reason: collision with root package name */
    public static final d f9528i = new d(1, 0, 1);

    @Override // w6.b
    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        if (isEmpty() && ((d) obj).isEmpty()) {
            return true;
        }
        d dVar = (d) obj;
        return this.f9521f == dVar.f9521f && this.f9522g == dVar.f9522g;
    }

    @Override // w6.b
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f9521f * 31) + this.f9522g;
    }

    @Override // w6.b
    public final boolean isEmpty() {
        return this.f9521f > this.f9522g;
    }

    @Override // w6.b
    public final String toString() {
        return this.f9521f + ".." + this.f9522g;
    }
}
