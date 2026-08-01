package j6;

import java.util.ArrayList;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l extends s {

    /* renamed from: a, reason: collision with root package name */
    public final long f5087a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5088b;

    /* renamed from: c, reason: collision with root package name */
    public final j f5089c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f5090d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5091e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f5092f;

    public l(long j, long j3, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f5102d;
        this.f5087a = j;
        this.f5088b = j3;
        this.f5089c = jVar;
        this.f5090d = num;
        this.f5091e = str;
        this.f5092f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        l lVar = (l) ((s) obj);
        if (this.f5087a != lVar.f5087a || this.f5088b != lVar.f5088b || !this.f5089c.equals(lVar.f5089c)) {
            return false;
        }
        Integer num = lVar.f5090d;
        Integer num2 = this.f5090d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str = lVar.f5091e;
        String str2 = this.f5091e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!this.f5092f.equals(lVar.f5092f)) {
            return false;
        }
        Object obj2 = w.f5102d;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        long j = this.f5087a;
        long j3 = this.f5088b;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f5089c.hashCode()) * 1000003;
        Integer num = this.f5090d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f5091e;
        return ((((hashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f5092f.hashCode()) * 1000003) ^ w.f5102d.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f5087a + ", requestUptimeMs=" + this.f5088b + ", clientInfo=" + this.f5089c + ", logSource=" + this.f5090d + ", logSourceName=" + this.f5091e + ", logEvents=" + this.f5092f + ", qosTier=" + w.f5102d + "}";
    }
}
