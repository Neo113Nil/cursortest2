package L1;

/* loaded from: classes.dex */
public final class s implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final int f2722d;

    public /* synthetic */ s(int i3) {
        this.f2722d = i3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Z1.i.g(this.f2722d ^ Integer.MIN_VALUE, ((s) obj).f2722d ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.f2722d == ((s) obj).f2722d;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2722d);
    }

    public final String toString() {
        return String.valueOf(this.f2722d & 4294967295L);
    }
}
