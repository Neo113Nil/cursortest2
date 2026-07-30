package l5;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final long f6080a;

    public t(long j8) {
        this.f6080a = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && t.class == obj.getClass() && this.f6080a == ((t) obj).f6080a;
    }

    public final int hashCode() {
        long j8 = this.f6080a;
        return (int) (j8 ^ (j8 >>> 32));
    }

    public final String toString() {
        return "Tag{tagNumber=" + this.f6080a + '}';
    }
}
