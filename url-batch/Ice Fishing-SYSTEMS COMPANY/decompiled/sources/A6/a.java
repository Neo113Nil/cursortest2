package A6;

import com.anythink.basead.exoplayer.h.o;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f37a;

    /* renamed from: b, reason: collision with root package name */
    public final long f38b;

    /* renamed from: c, reason: collision with root package name */
    public final long f39c;

    public a(long j9, long j10, long j11) {
        this.f37a = j9;
        this.f38b = j10;
        this.f39c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f37a == aVar.f37a && this.f38b == aVar.f38b && this.f39c == aVar.f39c;
    }

    public final int hashCode() {
        long j9 = this.f37a;
        long j10 = this.f38b;
        int i = (((((int) (j9 ^ (j9 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f39c;
        return ((((i ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ o.f7899d) * 1000003) ^ 10485760;
    }

    public final String toString() {
        return "FileStorageConfiguration{maxFileAgeForWriteMillis=" + this.f37a + ", minFileAgeForReadMillis=" + this.f38b + ", maxFileAgeForReadMillis=" + this.f39c + ", maxFileSize=1048576, maxFolderSize=10485760}";
    }
}
