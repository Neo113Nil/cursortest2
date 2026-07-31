package D0;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f336a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f337b;

    /* renamed from: c, reason: collision with root package name */
    public final m f338c;

    /* renamed from: d, reason: collision with root package name */
    public final long f339d;

    /* renamed from: e, reason: collision with root package name */
    public final long f340e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f341f;

    public i(String str, Integer num, m mVar, long j4, long j7, HashMap hashMap) {
        this.f336a = str;
        this.f337b = num;
        this.f338c = mVar;
        this.f339d = j4;
        this.f340e = j7;
        this.f341f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f341f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f341f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final h c() {
        h hVar = new h(0);
        String str = this.f336a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        hVar.f330b = str;
        hVar.f331c = this.f337b;
        m mVar = this.f338c;
        if (mVar == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        hVar.f332d = mVar;
        hVar.f333e = Long.valueOf(this.f339d);
        hVar.f334f = Long.valueOf(this.f340e);
        hVar.f335g = new HashMap(this.f341f);
        return hVar;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            String str = iVar.f336a;
            Integer num2 = iVar.f337b;
            if (this.f336a.equals(str) && ((num = this.f337b) != null ? num.equals(num2) : num2 == null) && this.f338c.equals(iVar.f338c) && this.f339d == iVar.f339d && this.f340e == iVar.f340e && this.f341f.equals(iVar.f341f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f336a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f337b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f338c.hashCode()) * 1000003;
        long j4 = this.f339d;
        int i7 = (hashCode2 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        long j7 = this.f340e;
        return ((i7 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003) ^ this.f341f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f336a + ", code=" + this.f337b + ", encodedPayload=" + this.f338c + ", eventMillis=" + this.f339d + ", uptimeMillis=" + this.f340e + ", autoMetadata=" + this.f341f + "}";
    }
}
