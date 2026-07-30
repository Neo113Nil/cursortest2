package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class zl extends eg1 {
    public final long a;
    public final long b;
    public final tl c;
    public final Integer d;
    public final String e;
    public final ArrayList f;

    public zl(long j, long j2, tl tlVar, Integer num, String str, ArrayList arrayList) {
        x52 x52Var = x52.m;
        this.a = j;
        this.b = j2;
        this.c = tlVar;
        this.d = num;
        this.e = str;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eg1)) {
            return false;
        }
        zl zlVar = (zl) ((eg1) obj);
        if (this.a != zlVar.a || this.b != zlVar.b || !this.c.equals(zlVar.c)) {
            return false;
        }
        Integer num = zlVar.d;
        Integer num2 = this.d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str = zlVar.e;
        String str2 = this.e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!this.f.equals(zlVar.f)) {
            return false;
        }
        Object obj2 = x52.m;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode()) * 1000003;
        Integer num = this.d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        return ((this.f.hashCode() ^ ((hashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003)) * 1000003) ^ x52.m.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + x52.m + "}";
    }
}
