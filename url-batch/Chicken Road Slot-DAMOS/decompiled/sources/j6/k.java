package j6;

import java.util.Arrays;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k extends r {

    /* renamed from: a, reason: collision with root package name */
    public final long f5081a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f5082b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5083c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f5084d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5085e;

    /* renamed from: f, reason: collision with root package name */
    public final long f5086f;
    public final v g;

    public k(long j, Integer num, long j3, byte[] bArr, String str, long j10, v vVar) {
        this.f5081a = j;
        this.f5082b = num;
        this.f5083c = j3;
        this.f5084d = bArr;
        this.f5085e = str;
        this.f5086f = j10;
        this.g = vVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            k kVar = (k) rVar;
            if (this.f5081a == kVar.f5081a) {
                Integer num = kVar.f5082b;
                Integer num2 = this.f5082b;
                if (num2 != null ? num2.equals(num) : num == null) {
                    if (this.f5083c == kVar.f5083c) {
                        if (Arrays.equals(this.f5084d, rVar instanceof k ? ((k) rVar).f5084d : kVar.f5084d)) {
                            String str = kVar.f5085e;
                            String str2 = this.f5085e;
                            if (str2 != null ? str2.equals(str) : str == null) {
                                if (this.f5086f == kVar.f5086f) {
                                    v vVar = kVar.g;
                                    v vVar2 = this.g;
                                    if (vVar2 != null ? vVar2.equals(vVar) : vVar == null) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f5081a;
        int i3 = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f5082b;
        int hashCode = (i3 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j3 = this.f5083c;
        int hashCode2 = (((hashCode ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f5084d)) * 1000003;
        String str = this.f5085e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j10 = this.f5086f;
        int i10 = (hashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        v vVar = this.g;
        return i10 ^ (vVar != null ? vVar.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f5081a + ", eventCode=" + this.f5082b + ", eventUptimeMs=" + this.f5083c + ", sourceExtension=" + Arrays.toString(this.f5084d) + ", sourceExtensionJsonProto3=" + this.f5085e + ", timezoneOffsetSeconds=" + this.f5086f + ", networkConnectionInfo=" + this.g + "}";
    }
}
