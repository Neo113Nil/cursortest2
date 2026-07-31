package k5;

/* loaded from: classes.dex */
public final class t implements Comparable {

    /* renamed from: f, reason: collision with root package name */
    public final short f5217f;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return kotlin.jvm.internal.i.g(this.f5217f & 65535, ((t) obj).f5217f & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return this.f5217f == ((t) obj).f5217f;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f5217f);
    }

    public final String toString() {
        return String.valueOf(this.f5217f & 65535);
    }
}
