package f2;

/* renamed from: f2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0394a {

    /* renamed from: a, reason: collision with root package name */
    public final String f4773a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4774b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4775c;

    public C0394a(String str, long j, long j7) {
        this.f4773a = str;
        this.f4774b = j;
        this.f4775c = j7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0394a) {
            C0394a c0394a = (C0394a) obj;
            if (this.f4773a.equals(c0394a.f4773a) && this.f4774b == c0394a.f4774b && this.f4775c == c0394a.f4775c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f4773a.hashCode() ^ 1000003) * 1000003;
        long j = this.f4774b;
        long j7 = this.f4775c;
        return ((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j7 ^ (j7 >>> 32)));
    }

    public final String toString() {
        return "InstallationTokenResult{token=" + this.f4773a + ", tokenExpirationTimestamp=" + this.f4774b + ", tokenCreationTimestamp=" + this.f4775c + "}";
    }
}
