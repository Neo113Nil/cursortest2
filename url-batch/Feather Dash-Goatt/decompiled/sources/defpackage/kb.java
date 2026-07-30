package defpackage;

import com.appsflyer.internal.l;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class kb {
    public final String a;
    public final Integer b;
    public final sv c;
    public final long d;
    public final long e;
    public final Map f;

    public kb(String str, Integer num, sv svVar, long j, long j2, HashMap hashMap) {
        this.a = str;
        this.b = num;
        this.c = svVar;
        this.d = j;
        this.e = j2;
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

    public final jb c() {
        jb jbVar = new jb();
        String str = this.a;
        if (str == null) {
            l.b("Null transportName");
            return null;
        }
        jbVar.a = str;
        jbVar.b = this.b;
        sv svVar = this.c;
        if (svVar == null) {
            l.b("Null encodedPayload");
            return null;
        }
        jbVar.c = svVar;
        jbVar.d = Long.valueOf(this.d);
        jbVar.e = Long.valueOf(this.e);
        jbVar.f = new HashMap(this.f);
        return jbVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kb) {
            kb kbVar = (kb) obj;
            if (this.a.equals(kbVar.a)) {
                Integer num = kbVar.b;
                Integer num2 = this.b;
                if (num2 != null ? num2.equals(num) : num == null) {
                    if (this.c.equals(kbVar.c) && this.d == kbVar.d && this.e == kbVar.e && this.f.equals(kbVar.f)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        int i = (hashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        return this.f.hashCode() ^ ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + "}";
    }
}
