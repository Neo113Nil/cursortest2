package x2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final long f10329a;

    public static final boolean a(long j, long j3) {
        return j == j3;
    }

    public static String b(long j) {
        return ((int) (j >> 32)) + " x " + ((int) (j & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f10329a == ((k) obj).f10329a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f10329a);
    }

    public final String toString() {
        return b(this.f10329a);
    }
}
