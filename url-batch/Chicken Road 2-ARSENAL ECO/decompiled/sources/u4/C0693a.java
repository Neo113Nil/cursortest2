package u4;

/* renamed from: u4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0693a {

    /* renamed from: a, reason: collision with root package name */
    public final long f6036a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6037b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6038c;

    public C0693a(long j4, long j7, long j8) {
        this.f6036a = j4;
        this.f6037b = j7;
        this.f6038c = j8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0693a)) {
            return false;
        }
        C0693a c0693a = (C0693a) obj;
        return this.f6036a == c0693a.f6036a && this.f6037b == c0693a.f6037b && this.f6038c == c0693a.f6038c;
    }

    public final int hashCode() {
        long j4 = this.f6036a;
        long j7 = this.f6037b;
        int i7 = (((((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        long j8 = this.f6038c;
        return ((((i7 ^ ((int) ((j8 >>> 32) ^ j8))) * 1000003) ^ 1048576) * 1000003) ^ 10485760;
    }

    public final String toString() {
        return "FileStorageConfiguration{maxFileAgeForWriteMillis=" + this.f6036a + ", minFileAgeForReadMillis=" + this.f6037b + ", maxFileAgeForReadMillis=" + this.f6038c + ", maxFileSize=1048576, maxFolderSize=10485760}";
    }
}
