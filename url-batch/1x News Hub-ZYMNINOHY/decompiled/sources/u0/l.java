package u0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l extends s {

    /* renamed from: a, reason: collision with root package name */
    public final long f10510a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10511b;

    /* renamed from: c, reason: collision with root package name */
    public final j f10512c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f10513d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10514e;
    public final ArrayList f;

    public l(long j3, long j4, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f10524a;
        this.f10510a = j3;
        this.f10511b = j4;
        this.f10512c = jVar;
        this.f10513d = num;
        this.f10514e = str;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        l lVar = (l) ((s) obj);
        if (this.f10510a != lVar.f10510a) {
            return false;
        }
        if (this.f10511b != lVar.f10511b) {
            return false;
        }
        if (!this.f10512c.equals(lVar.f10512c)) {
            return false;
        }
        Integer num = lVar.f10513d;
        Integer num2 = this.f10513d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str = lVar.f10514e;
        String str2 = this.f10514e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!this.f.equals(lVar.f)) {
            return false;
        }
        Object obj2 = w.f10524a;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        long j3 = this.f10510a;
        long j4 = this.f10511b;
        int hashCode = (((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003) ^ this.f10512c.hashCode()) * 1000003;
        Integer num = this.f10513d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f10514e;
        return ((((hashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f.hashCode()) * 1000003) ^ w.f10524a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f10510a + ", requestUptimeMs=" + this.f10511b + ", clientInfo=" + this.f10512c + ", logSource=" + this.f10513d + ", logSourceName=" + this.f10514e + ", logEvents=" + this.f + ", qosTier=" + w.f10524a + "}";
    }
}
