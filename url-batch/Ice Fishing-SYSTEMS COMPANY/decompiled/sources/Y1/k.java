package Y1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class k extends r {

    /* renamed from: a, reason: collision with root package name */
    public final long f3934a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f3935b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3936c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f3937d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3938e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3939f;

    /* renamed from: g, reason: collision with root package name */
    public final n f3940g;

    public k(long j9, Integer num, long j10, byte[] bArr, String str, long j11, n nVar) {
        this.f3934a = j9;
        this.f3935b = num;
        this.f3936c = j10;
        this.f3937d = bArr;
        this.f3938e = str;
        this.f3939f = j11;
        this.f3940g = nVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        k kVar = (k) rVar;
        if (this.f3934a != kVar.f3934a) {
            return false;
        }
        Integer num = this.f3935b;
        if (num == null) {
            if (kVar.f3935b != null) {
                return false;
            }
        } else if (!num.equals(kVar.f3935b)) {
            return false;
        }
        if (this.f3936c != kVar.f3936c) {
            return false;
        }
        if (!Arrays.equals(this.f3937d, rVar instanceof k ? ((k) rVar).f3937d : kVar.f3937d)) {
            return false;
        }
        String str = kVar.f3938e;
        String str2 = this.f3938e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.f3939f != kVar.f3939f) {
            return false;
        }
        n nVar = kVar.f3940g;
        n nVar2 = this.f3940g;
        return nVar2 == null ? nVar == null : nVar2.equals(nVar);
    }

    public final int hashCode() {
        long j9 = this.f3934a;
        int i = (((int) (j9 ^ (j9 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f3935b;
        int hashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j10 = this.f3936c;
        int hashCode2 = (((hashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f3937d)) * 1000003;
        String str = this.f3938e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j11 = this.f3939f;
        int i4 = (hashCode3 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        n nVar = this.f3940g;
        return i4 ^ (nVar != null ? nVar.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f3934a + ", eventCode=" + this.f3935b + ", eventUptimeMs=" + this.f3936c + ", sourceExtension=" + Arrays.toString(this.f3937d) + ", sourceExtensionJsonProto3=" + this.f3938e + ", timezoneOffsetSeconds=" + this.f3939f + ", networkConnectionInfo=" + this.f3940g + "}";
    }
}
