package U0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l extends s {

    /* renamed from: a, reason: collision with root package name */
    public final long f3135a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3136b;

    /* renamed from: c, reason: collision with root package name */
    public final j f3137c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f3138d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3139e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3140f;

    public l(long j2, long j6, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f3150a;
        this.f3135a = j2;
        this.f3136b = j6;
        this.f3137c = jVar;
        this.f3138d = num;
        this.f3139e = str;
        this.f3140f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        l lVar = (l) ((s) obj);
        if (this.f3135a == lVar.f3135a) {
            if (this.f3136b == lVar.f3136b) {
                if (this.f3137c.equals(lVar.f3137c)) {
                    Integer num = lVar.f3138d;
                    Integer num2 = this.f3138d;
                    if (num2 != null ? num2.equals(num) : num == null) {
                        String str = lVar.f3139e;
                        String str2 = this.f3139e;
                        if (str2 != null ? str2.equals(str) : str == null) {
                            if (this.f3140f.equals(lVar.f3140f)) {
                                Object obj2 = w.f3150a;
                                if (obj2.equals(obj2)) {
                                    return true;
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
        long j2 = this.f3135a;
        long j6 = this.f3136b;
        int hashCode = (((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j6 >>> 32) ^ j6))) * 1000003) ^ this.f3137c.hashCode()) * 1000003;
        Integer num = this.f3138d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f3139e;
        return ((((hashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f3140f.hashCode()) * 1000003) ^ w.f3150a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f3135a + ", requestUptimeMs=" + this.f3136b + ", clientInfo=" + this.f3137c + ", logSource=" + this.f3138d + ", logSourceName=" + this.f3139e + ", logEvents=" + this.f3140f + ", qosTier=" + w.f3150a + "}";
    }
}
