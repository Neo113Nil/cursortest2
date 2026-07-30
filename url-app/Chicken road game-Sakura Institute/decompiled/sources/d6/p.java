package d6;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class p implements Comparable {

    /* renamed from: f, reason: collision with root package name */
    public final byte f2627f;

    public /* synthetic */ p(byte b9) {
        this.f2627f = b9;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return r6.k.g(this.f2627f & 255, ((p) obj).f2627f & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f2627f == ((p) obj).f2627f;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f2627f);
    }

    public final String toString() {
        return String.valueOf(this.f2627f & 255);
    }
}
