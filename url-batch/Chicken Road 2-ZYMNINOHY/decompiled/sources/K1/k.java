package K1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class k extends r {

    /* renamed from: a, reason: collision with root package name */
    public final long f1503a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f1504b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1505c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f1506d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1507e;

    /* renamed from: f, reason: collision with root package name */
    public final long f1508f;

    /* renamed from: g, reason: collision with root package name */
    public final v f1509g;

    public k(long j4, Integer num, long j5, byte[] bArr, String str, long j6, v vVar) {
        this.f1503a = j4;
        this.f1504b = num;
        this.f1505c = j5;
        this.f1506d = bArr;
        this.f1507e = str;
        this.f1508f = j6;
        this.f1509g = vVar;
    }

    public final boolean equals(Object obj) {
        Integer num;
        String str;
        v vVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.f1503a == ((k) rVar).f1503a && ((num = this.f1504b) != null ? num.equals(((k) rVar).f1504b) : ((k) rVar).f1504b == null)) {
                k kVar = (k) rVar;
                v vVar2 = kVar.f1509g;
                String str2 = kVar.f1507e;
                if (this.f1505c == kVar.f1505c) {
                    if (Arrays.equals(this.f1506d, rVar instanceof k ? ((k) rVar).f1506d : kVar.f1506d) && ((str = this.f1507e) != null ? str.equals(str2) : str2 == null) && this.f1508f == kVar.f1508f && ((vVar = this.f1509g) != null ? vVar.equals(vVar2) : vVar2 == null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f1503a;
        int i4 = (((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f1504b;
        int hashCode = (i4 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j5 = this.f1505c;
        int hashCode2 = (((hashCode ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f1506d)) * 1000003;
        String str = this.f1507e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j6 = this.f1508f;
        int i5 = (hashCode3 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        v vVar = this.f1509g;
        return i5 ^ (vVar != null ? vVar.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f1503a + ", eventCode=" + this.f1504b + ", eventUptimeMs=" + this.f1505c + ", sourceExtension=" + Arrays.toString(this.f1506d) + ", sourceExtensionJsonProto3=" + this.f1507e + ", timezoneOffsetSeconds=" + this.f1508f + ", networkConnectionInfo=" + this.f1509g + "}";
    }
}
