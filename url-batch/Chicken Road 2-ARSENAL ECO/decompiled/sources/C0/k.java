package C0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class k extends r {

    /* renamed from: a, reason: collision with root package name */
    public final long f165a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f166b;

    /* renamed from: c, reason: collision with root package name */
    public final long f167c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f168d;

    /* renamed from: e, reason: collision with root package name */
    public final String f169e;

    /* renamed from: f, reason: collision with root package name */
    public final long f170f;

    /* renamed from: g, reason: collision with root package name */
    public final v f171g;

    public k(long j4, Integer num, long j7, byte[] bArr, String str, long j8, v vVar) {
        this.f165a = j4;
        this.f166b = num;
        this.f167c = j7;
        this.f168d = bArr;
        this.f169e = str;
        this.f170f = j8;
        this.f171g = vVar;
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
            if (this.f165a == ((k) rVar).f165a && ((num = this.f166b) != null ? num.equals(((k) rVar).f166b) : ((k) rVar).f166b == null)) {
                k kVar = (k) rVar;
                v vVar2 = kVar.f171g;
                String str2 = kVar.f169e;
                if (this.f167c == kVar.f167c) {
                    if (Arrays.equals(this.f168d, rVar instanceof k ? ((k) rVar).f168d : kVar.f168d) && ((str = this.f169e) != null ? str.equals(str2) : str2 == null) && this.f170f == kVar.f170f && ((vVar = this.f171g) != null ? vVar.equals(vVar2) : vVar2 == null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f165a;
        int i7 = (((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f166b;
        int hashCode = (i7 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j7 = this.f167c;
        int hashCode2 = (((hashCode ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f168d)) * 1000003;
        String str = this.f169e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j8 = this.f170f;
        int i8 = (hashCode3 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        v vVar = this.f171g;
        return i8 ^ (vVar != null ? vVar.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f165a + ", eventCode=" + this.f166b + ", eventUptimeMs=" + this.f167c + ", sourceExtension=" + Arrays.toString(this.f168d) + ", sourceExtensionJsonProto3=" + this.f169e + ", timezoneOffsetSeconds=" + this.f170f + ", networkConnectionInfo=" + this.f171g + "}";
    }
}
