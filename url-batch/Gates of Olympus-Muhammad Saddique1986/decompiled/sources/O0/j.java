package O0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final long f3740a;

    public static final boolean a(long j3, long j4) {
        return j3 == j4;
    }

    public static final int b(long j3) {
        return (int) (j3 & 4294967295L);
    }

    public static final int c(long j3) {
        return (int) (j3 >> 32);
    }

    public static String d(long j3) {
        return ((int) (j3 >> 32)) + " x " + ((int) (j3 & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f3740a == ((j) obj).f3740a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3740a);
    }

    public final String toString() {
        return d(this.f3740a);
    }
}
