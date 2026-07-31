package R1;

/* loaded from: classes.dex */
public final class w implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final short f4169d;

    public /* synthetic */ w(short s3) {
        this.f4169d = s3;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return f2.j.g(this.f4169d & 65535, ((w) obj).f4169d & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            return this.f4169d == ((w) obj).f4169d;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f4169d);
    }

    public final String toString() {
        return String.valueOf(65535 & this.f4169d);
    }
}
