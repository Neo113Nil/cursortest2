package d6;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class x implements Comparable {

    /* renamed from: f, reason: collision with root package name */
    public final short f2637f;

    public /* synthetic */ x(short s5) {
        this.f2637f = s5;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return r6.k.g(this.f2637f & 65535, ((x) obj).f2637f & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x) {
            return this.f2637f == ((x) obj).f2637f;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f2637f);
    }

    public final String toString() {
        return String.valueOf(this.f2637f & 65535);
    }
}
