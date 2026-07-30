package Y1;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l extends s {

    /* renamed from: a, reason: collision with root package name */
    public final long f3941a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3942b;

    /* renamed from: c, reason: collision with root package name */
    public final j f3943c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f3944d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3945e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3946f;

    public l(long j9, long j10, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f3956n;
        this.f3941a = j9;
        this.f3942b = j10;
        this.f3943c = jVar;
        this.f3944d = num;
        this.f3945e = str;
        this.f3946f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        l lVar = (l) ((s) obj);
        if (this.f3941a != lVar.f3941a) {
            return false;
        }
        if (this.f3942b != lVar.f3942b) {
            return false;
        }
        if (!this.f3943c.equals(lVar.f3943c)) {
            return false;
        }
        Integer num = lVar.f3944d;
        Integer num2 = this.f3944d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str = lVar.f3945e;
        String str2 = this.f3945e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!this.f3946f.equals(lVar.f3946f)) {
            return false;
        }
        Object obj2 = w.f3956n;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        long j9 = this.f3941a;
        long j10 = this.f3942b;
        int hashCode = (((((((int) (j9 ^ (j9 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f3943c.hashCode()) * 1000003;
        Integer num = this.f3944d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f3945e;
        return ((((hashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f3946f.hashCode()) * 1000003) ^ w.f3956n.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f3941a + ", requestUptimeMs=" + this.f3942b + ", clientInfo=" + this.f3943c + ", logSource=" + this.f3944d + ", logSourceName=" + this.f3945e + ", logEvents=" + this.f3946f + ", qosTier=" + w.f3956n + "}";
    }
}
