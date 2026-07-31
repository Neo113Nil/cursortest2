package C0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l extends s {

    /* renamed from: a, reason: collision with root package name */
    public final long f172a;

    /* renamed from: b, reason: collision with root package name */
    public final long f173b;

    /* renamed from: c, reason: collision with root package name */
    public final j f174c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f175d;

    /* renamed from: e, reason: collision with root package name */
    public final String f176e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f177f;

    public l(long j4, long j7, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f187f;
        this.f172a = j4;
        this.f173b = j7;
        this.f174c = jVar;
        this.f175d = num;
        this.f176e = str;
        this.f177f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        l lVar = (l) ((s) obj);
        if (this.f172a != lVar.f172a) {
            return false;
        }
        lVar.getClass();
        Object obj2 = w.f187f;
        ArrayList arrayList = lVar.f177f;
        String str = lVar.f176e;
        Integer num = lVar.f175d;
        j jVar = lVar.f174c;
        if (this.f173b != lVar.f173b || !this.f174c.equals(jVar)) {
            return false;
        }
        Integer num2 = this.f175d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str2 = this.f176e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return this.f177f.equals(arrayList) && obj2.equals(obj2);
    }

    public final int hashCode() {
        long j4 = this.f172a;
        long j7 = this.f173b;
        int hashCode = (((((((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j7 >>> 32) ^ j7))) * 1000003) ^ this.f174c.hashCode()) * 1000003;
        Integer num = this.f175d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f176e;
        return ((((hashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f177f.hashCode()) * 1000003) ^ w.f187f.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f172a + ", requestUptimeMs=" + this.f173b + ", clientInfo=" + this.f174c + ", logSource=" + this.f175d + ", logSourceName=" + this.f176e + ", logEvents=" + this.f177f + ", qosTier=" + w.f187f + "}";
    }
}
