package b5;

/* renamed from: b5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0278a {

    /* renamed from: a, reason: collision with root package name */
    public final long f4157a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4158b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4159c;

    public C0278a(long j, long j7, long j8) {
        this.f4157a = j;
        this.f4158b = j7;
        this.f4159c = j8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0278a)) {
            return false;
        }
        C0278a c0278a = (C0278a) obj;
        return this.f4157a == c0278a.f4157a && this.f4158b == c0278a.f4158b && this.f4159c == c0278a.f4159c;
    }

    public final int hashCode() {
        long j = this.f4157a;
        long j7 = this.f4158b;
        int i2 = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        long j8 = this.f4159c;
        return ((((i2 ^ ((int) ((j8 >>> 32) ^ j8))) * 1000003) ^ 1048576) * 1000003) ^ 10485760;
    }

    public final String toString() {
        return "FileStorageConfiguration{maxFileAgeForWriteMillis=" + this.f4157a + ", minFileAgeForReadMillis=" + this.f4158b + ", maxFileAgeForReadMillis=" + this.f4159c + ", maxFileSize=1048576, maxFolderSize=10485760}";
    }
}
