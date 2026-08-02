package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cgb {
    public static final cgb a = new cgb(null);
    public final long b;
    public final int c;
    public final int d;
    public final long e;
    public final int f;

    public cgb(byte[] bArr) {
        this.b = 10485760L;
        this.c = 200;
        this.d = 10000;
        this.e = 604800000L;
        this.f = 81920;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cgb) {
            cgb cgbVar = (cgb) obj;
            if (this.b == cgbVar.b && this.c == cgbVar.c && this.d == cgbVar.d && this.e == cgbVar.e && this.f == cgbVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f ^ ((((((((((int) this.b) ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ ((int) this.e)) * 1000003);
    }

    public final String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.b + ", loadBatchSize=" + this.c + ", criticalSectionEnterTimeoutMs=" + this.d + ", eventCleanUpAge=" + this.e + ", maxBlobByteSizePerRow=" + this.f + "}";
    }

    public cgb() {
        throw null;
    }
}
