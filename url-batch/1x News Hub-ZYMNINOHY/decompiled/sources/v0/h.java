package v0;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f10549a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f10550b;

    /* renamed from: c, reason: collision with root package name */
    public final k f10551c;

    /* renamed from: d, reason: collision with root package name */
    public final long f10552d;

    /* renamed from: e, reason: collision with root package name */
    public final long f10553e;
    public final HashMap f;

    public h(String str, Integer num, k kVar, long j3, long j4, HashMap hashMap) {
        this.f10549a = str;
        this.f10550b = num;
        this.f10551c = kVar;
        this.f10552d = j3;
        this.f10553e = j4;
        this.f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final F1.c c() {
        F1.c cVar = new F1.c();
        String str = this.f10549a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        cVar.f486a = str;
        cVar.f487b = this.f10550b;
        k kVar = this.f10551c;
        if (kVar == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        cVar.f488c = kVar;
        cVar.f489d = Long.valueOf(this.f10552d);
        cVar.f490e = Long.valueOf(this.f10553e);
        cVar.f = new HashMap(this.f);
        return cVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!this.f10549a.equals(hVar.f10549a)) {
            return false;
        }
        Integer num = hVar.f10550b;
        Integer num2 = this.f10550b;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        return this.f10551c.equals(hVar.f10551c) && this.f10552d == hVar.f10552d && this.f10553e == hVar.f10553e && this.f.equals(hVar.f);
    }

    public final int hashCode() {
        int hashCode = (this.f10549a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f10550b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f10551c.hashCode()) * 1000003;
        long j3 = this.f10552d;
        int i3 = (hashCode2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        long j4 = this.f10553e;
        return ((i3 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f10549a + ", code=" + this.f10550b + ", encodedPayload=" + this.f10551c + ", eventMillis=" + this.f10552d + ", uptimeMillis=" + this.f10553e + ", autoMetadata=" + this.f + "}";
    }
}
