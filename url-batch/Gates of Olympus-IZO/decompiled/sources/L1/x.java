package L1;

/* loaded from: classes.dex */
public final class x implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final short f2727d;

    public /* synthetic */ x(short s3) {
        this.f2727d = s3;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return Z1.i.g(this.f2727d & 65535, ((x) obj).f2727d & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x) {
            return this.f2727d == ((x) obj).f2727d;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f2727d);
    }

    public final String toString() {
        return String.valueOf(65535 & this.f2727d);
    }
}
