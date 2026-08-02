package K1;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l extends s {

    /* renamed from: a, reason: collision with root package name */
    public final long f1510a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1511b;

    /* renamed from: c, reason: collision with root package name */
    public final j f1512c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f1513d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1514e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f1515f;

    public l(long j4, long j5, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f1525a;
        this.f1510a = j4;
        this.f1511b = j5;
        this.f1512c = jVar;
        this.f1513d = num;
        this.f1514e = str;
        this.f1515f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        l lVar = (l) ((s) obj);
        if (this.f1510a != lVar.f1510a) {
            return false;
        }
        lVar.getClass();
        Object obj2 = w.f1525a;
        ArrayList arrayList = lVar.f1515f;
        String str = lVar.f1514e;
        Integer num = lVar.f1513d;
        j jVar = lVar.f1512c;
        if (this.f1511b != lVar.f1511b || !this.f1512c.equals(jVar)) {
            return false;
        }
        Integer num2 = this.f1513d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str2 = this.f1514e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return this.f1515f.equals(arrayList) && obj2.equals(obj2);
    }

    public final int hashCode() {
        long j4 = this.f1510a;
        long j5 = this.f1511b;
        int hashCode = (((((((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j5 >>> 32) ^ j5))) * 1000003) ^ this.f1512c.hashCode()) * 1000003;
        Integer num = this.f1513d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f1514e;
        return ((((hashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f1515f.hashCode()) * 1000003) ^ w.f1525a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f1510a + ", requestUptimeMs=" + this.f1511b + ", clientInfo=" + this.f1512c + ", logSource=" + this.f1513d + ", logSourceName=" + this.f1514e + ", logEvents=" + this.f1515f + ", qosTier=" + w.f1525a + "}";
    }
}
