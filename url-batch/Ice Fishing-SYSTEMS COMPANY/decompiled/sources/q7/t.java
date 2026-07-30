package q7;

/* loaded from: classes2.dex */
public final class t implements Comparable {

    /* renamed from: n, reason: collision with root package name */
    public final short f40181n;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return kotlin.jvm.internal.h.f(this.f40181n & 65535, ((t) obj).f40181n & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return this.f40181n == ((t) obj).f40181n;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f40181n);
    }

    public final String toString() {
        return String.valueOf(65535 & this.f40181n);
    }
}
