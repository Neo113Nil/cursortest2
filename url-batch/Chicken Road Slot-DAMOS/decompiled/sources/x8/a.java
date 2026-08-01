package x8;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f10541a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10542b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10543c;

    public a(String str, long j, long j3) {
        this.f10541a = str;
        this.f10542b = j;
        this.f10543c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f10541a.equals(aVar.f10541a) && this.f10542b == aVar.f10542b && this.f10543c == aVar.f10543c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f10541a.hashCode() ^ 1000003) * 1000003;
        long j = this.f10542b;
        long j3 = this.f10543c;
        return ((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "InstallationTokenResult{token=" + this.f10541a + ", tokenExpirationTimestamp=" + this.f10542b + ", tokenCreationTimestamp=" + this.f10543c + "}";
    }
}
