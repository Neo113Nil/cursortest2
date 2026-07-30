package Z3;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f4250a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4251b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4252c;

    public a(String str, long j9, long j10) {
        this.f4250a = str;
        this.f4251b = j9;
        this.f4252c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f4250a.equals(aVar.f4250a) && this.f4251b == aVar.f4251b && this.f4252c == aVar.f4252c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f4250a.hashCode() ^ 1000003) * 1000003;
        long j9 = this.f4251b;
        long j10 = this.f4252c;
        return ((hashCode ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "InstallationTokenResult{token=" + this.f4250a + ", tokenExpirationTimestamp=" + this.f4251b + ", tokenCreationTimestamp=" + this.f4252c + "}";
    }
}
