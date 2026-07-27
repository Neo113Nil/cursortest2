package M0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final long f3554a;

    public static final boolean a(long j4, long j5) {
        return j4 == j5;
    }

    public static final int b(long j4) {
        return (int) (j4 & 4294967295L);
    }

    public static final int c(long j4) {
        return (int) (j4 >> 32);
    }

    public static String d(long j4) {
        return ((int) (j4 >> 32)) + " x " + ((int) (j4 & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f3554a == ((j) obj).f3554a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3554a);
    }

    public final String toString() {
        return d(this.f3554a);
    }
}
