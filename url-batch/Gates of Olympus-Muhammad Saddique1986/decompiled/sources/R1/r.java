package R1;

/* loaded from: classes.dex */
public final class r implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final int f4164d;

    public /* synthetic */ r(int i3) {
        this.f4164d = i3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return f2.j.g(this.f4164d ^ Integer.MIN_VALUE, ((r) obj).f4164d ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f4164d == ((r) obj).f4164d;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4164d);
    }

    public final String toString() {
        return String.valueOf(this.f4164d & 4294967295L);
    }
}
