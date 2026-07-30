package Z0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l extends s {

    /* renamed from: a, reason: collision with root package name */
    public final long f2992a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2993b;

    /* renamed from: c, reason: collision with root package name */
    public final j f2994c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f2995d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2996e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2997f;

    public l(long j, long j7, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f3007d;
        this.f2992a = j;
        this.f2993b = j7;
        this.f2994c = jVar;
        this.f2995d = num;
        this.f2996e = str;
        this.f2997f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        l lVar = (l) ((s) obj);
        if (this.f2992a != lVar.f2992a) {
            return false;
        }
        lVar.getClass();
        Object obj2 = w.f3007d;
        ArrayList arrayList = lVar.f2997f;
        String str = lVar.f2996e;
        Integer num = lVar.f2995d;
        j jVar = lVar.f2994c;
        if (this.f2993b != lVar.f2993b || !this.f2994c.equals(jVar)) {
            return false;
        }
        Integer num2 = this.f2995d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str2 = this.f2996e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return this.f2997f.equals(arrayList) && obj2.equals(obj2);
    }

    public final int hashCode() {
        long j = this.f2992a;
        long j7 = this.f2993b;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j7 >>> 32) ^ j7))) * 1000003) ^ this.f2994c.hashCode()) * 1000003;
        Integer num = this.f2995d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f2996e;
        return ((((hashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f2997f.hashCode()) * 1000003) ^ w.f3007d.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f2992a + ", requestUptimeMs=" + this.f2993b + ", clientInfo=" + this.f2994c + ", logSource=" + this.f2995d + ", logSourceName=" + this.f2996e + ", logEvents=" + this.f2997f + ", qosTier=" + w.f3007d + "}";
    }
}
