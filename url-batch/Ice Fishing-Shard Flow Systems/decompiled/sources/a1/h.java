package a1;

import D6.z;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f3061a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f3062b;

    /* renamed from: c, reason: collision with root package name */
    public final l f3063c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3064d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3065e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f3066f;

    public h(String str, Integer num, l lVar, long j, long j7, HashMap hashMap) {
        this.f3061a = str;
        this.f3062b = num;
        this.f3063c = lVar;
        this.f3064d = j;
        this.f3065e = j7;
        this.f3066f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f3066f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f3066f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final z c() {
        z zVar = new z(3);
        String str = this.f3061a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        zVar.f639b = str;
        zVar.f640c = this.f3062b;
        l lVar = this.f3063c;
        if (lVar == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        zVar.f641d = lVar;
        zVar.f642e = Long.valueOf(this.f3064d);
        zVar.f643f = Long.valueOf(this.f3065e);
        zVar.f644g = new HashMap(this.f3066f);
        return zVar;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            String str = hVar.f3061a;
            Integer num2 = hVar.f3062b;
            if (this.f3061a.equals(str) && ((num = this.f3062b) != null ? num.equals(num2) : num2 == null) && this.f3063c.equals(hVar.f3063c) && this.f3064d == hVar.f3064d && this.f3065e == hVar.f3065e && this.f3066f.equals(hVar.f3066f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f3061a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f3062b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f3063c.hashCode()) * 1000003;
        long j = this.f3064d;
        int i2 = (hashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j7 = this.f3065e;
        return ((i2 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003) ^ this.f3066f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f3061a + ", code=" + this.f3062b + ", encodedPayload=" + this.f3063c + ", eventMillis=" + this.f3064d + ", uptimeMillis=" + this.f3065e + ", autoMetadata=" + this.f3066f + "}";
    }
}
