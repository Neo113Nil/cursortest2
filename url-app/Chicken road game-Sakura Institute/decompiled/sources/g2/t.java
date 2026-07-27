package g2;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final long f6759a;

    public t(long j4) {
        this.f6759a = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && t.class == obj.getClass() && this.f6759a == ((t) obj).f6759a;
    }

    public final int hashCode() {
        long j4 = this.f6759a;
        return (int) (j4 ^ (j4 >>> 32));
    }

    public final String toString() {
        return "Tag{tagNumber=" + this.f6759a + '}';
    }
}
