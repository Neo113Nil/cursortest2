package M0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final long f2774a;

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
        if (obj instanceof i) {
            return this.f2774a == ((i) obj).f2774a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2774a);
    }

    public final String toString() {
        return d(this.f2774a);
    }
}
