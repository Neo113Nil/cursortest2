package B1;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f84a;

    /* renamed from: b, reason: collision with root package name */
    public final long f85b;

    /* renamed from: c, reason: collision with root package name */
    public final long f86c;

    public a(String str, long j4, long j7) {
        this.f84a = str;
        this.f85b = j4;
        this.f86c = j7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f84a.equals(aVar.f84a) && this.f85b == aVar.f85b && this.f86c == aVar.f86c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f84a.hashCode() ^ 1000003) * 1000003;
        long j4 = this.f85b;
        long j7 = this.f86c;
        return ((hashCode ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ ((int) (j7 ^ (j7 >>> 32)));
    }

    public final String toString() {
        return "InstallationTokenResult{token=" + this.f84a + ", tokenExpirationTimestamp=" + this.f85b + ", tokenCreationTimestamp=" + this.f86c + "}";
    }
}
