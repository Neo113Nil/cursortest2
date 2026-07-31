package L1;

/* loaded from: classes.dex */
public final class p implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final byte f2717d;

    public /* synthetic */ p(byte b2) {
        this.f2717d = b2;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return Z1.i.g(this.f2717d & 255, ((p) obj).f2717d & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f2717d == ((p) obj).f2717d;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f2717d);
    }

    public final String toString() {
        return String.valueOf(this.f2717d & 255);
    }
}
