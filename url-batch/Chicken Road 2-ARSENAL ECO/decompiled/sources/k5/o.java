package k5;

/* loaded from: classes.dex */
public final class o implements Comparable {

    /* renamed from: f, reason: collision with root package name */
    public final int f5212f;

    public /* synthetic */ o(int i7) {
        this.f5212f = i7;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return kotlin.jvm.internal.i.g(this.f5212f ^ Integer.MIN_VALUE, ((o) obj).f5212f ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f5212f == ((o) obj).f5212f;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5212f);
    }

    public final String toString() {
        return String.valueOf(this.f5212f & 4294967295L);
    }
}
