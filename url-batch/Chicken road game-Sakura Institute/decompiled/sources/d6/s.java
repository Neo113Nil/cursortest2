package d6;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class s implements Comparable {

    /* renamed from: f, reason: collision with root package name */
    public final int f2632f;

    public /* synthetic */ s(int i7) {
        this.f2632f = i7;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return r6.k.g(this.f2632f ^ Integer.MIN_VALUE, ((s) obj).f2632f ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.f2632f == ((s) obj).f2632f;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2632f);
    }

    public final String toString() {
        return String.valueOf(this.f2632f & 4294967295L);
    }
}
