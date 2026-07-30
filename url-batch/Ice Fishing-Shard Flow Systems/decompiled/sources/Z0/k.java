package Z0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class k extends r {

    /* renamed from: a, reason: collision with root package name */
    public final long f2985a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f2986b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2987c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f2988d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2989e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2990f;

    /* renamed from: g, reason: collision with root package name */
    public final v f2991g;

    public k(long j, Integer num, long j7, byte[] bArr, String str, long j8, v vVar) {
        this.f2985a = j;
        this.f2986b = num;
        this.f2987c = j7;
        this.f2988d = bArr;
        this.f2989e = str;
        this.f2990f = j8;
        this.f2991g = vVar;
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
            if (this.f2985a == ((k) rVar).f2985a && ((num = this.f2986b) != null ? num.equals(((k) rVar).f2986b) : ((k) rVar).f2986b == null)) {
                k kVar = (k) rVar;
                v vVar2 = kVar.f2991g;
                String str2 = kVar.f2989e;
                if (this.f2987c == kVar.f2987c) {
                    if (Arrays.equals(this.f2988d, rVar instanceof k ? ((k) rVar).f2988d : kVar.f2988d) && ((str = this.f2989e) != null ? str.equals(str2) : str2 == null) && this.f2990f == kVar.f2990f && ((vVar = this.f2991g) != null ? vVar.equals(vVar2) : vVar2 == null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f2985a;
        int i2 = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f2986b;
        int hashCode = (i2 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j7 = this.f2987c;
        int hashCode2 = (((hashCode ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f2988d)) * 1000003;
        String str = this.f2989e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j8 = this.f2990f;
        int i5 = (hashCode3 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        v vVar = this.f2991g;
        return i5 ^ (vVar != null ? vVar.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f2985a + ", eventCode=" + this.f2986b + ", eventUptimeMs=" + this.f2987c + ", sourceExtension=" + Arrays.toString(this.f2988d) + ", sourceExtensionJsonProto3=" + this.f2989e + ", timezoneOffsetSeconds=" + this.f2990f + ", networkConnectionInfo=" + this.f2991g + "}";
    }
}
