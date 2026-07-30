package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class rb extends wi0 {
    public final long a;
    public final long b;
    public final gb c;
    public final Integer d;
    public final String e;
    public final ArrayList f;

    public rb(long j, long j2, gb gbVar, Integer num, String str, ArrayList arrayList) {
        t01 t01Var = t01.d;
        this.a = j;
        this.b = j2;
        this.c = gbVar;
        this.d = num;
        this.e = str;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wi0)) {
            return false;
        }
        rb rbVar = (rb) ((wi0) obj);
        if (this.a != rbVar.a || this.b != rbVar.b || !this.c.equals(rbVar.c)) {
            return false;
        }
        Integer num = rbVar.d;
        Integer num2 = this.d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str = rbVar.e;
        String str2 = this.e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!this.f.equals(rbVar.f)) {
            return false;
        }
        Object obj2 = t01.d;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode()) * 1000003;
        Integer num = this.d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        return ((this.f.hashCode() ^ ((hashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003)) * 1000003) ^ t01.d.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + t01.d + "}";
    }
}
