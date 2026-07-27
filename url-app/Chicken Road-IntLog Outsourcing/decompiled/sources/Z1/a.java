package Z1;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f3748a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3749b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3750c;

    public a(long j2, long j6, String str) {
        this.f3748a = str;
        this.f3749b = j2;
        this.f3750c = j6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f3748a.equals(aVar.f3748a) && this.f3749b == aVar.f3749b && this.f3750c == aVar.f3750c;
    }

    public final int hashCode() {
        int hashCode = (this.f3748a.hashCode() ^ 1000003) * 1000003;
        long j2 = this.f3749b;
        long j6 = this.f3750c;
        return ((hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)));
    }

    public final String toString() {
        return "InstallationTokenResult{token=" + this.f3748a + ", tokenExpirationTimestamp=" + this.f3749b + ", tokenCreationTimestamp=" + this.f3750c + "}";
    }
}
