package defpackage;

import com.google.firebase.encoders.json.BuildConfig;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class wl {
    public final String a;
    public final Integer b;
    public final hh0 c;
    public final long d;
    public final long e;
    public final Map f;

    public wl(String str, Integer num, hh0 hh0Var, long j, long j2, HashMap hashMap) {
        this.a = str;
        this.b = num;
        this.c = hh0Var;
        this.d = j;
        this.e = j2;
        this.f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f.get(str);
        return str2 == null ? BuildConfig.FLAVOR : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final sf c() {
        sf sfVar = new sf();
        String str = this.a;
        if (str == null) {
            ch2.l("Null transportName");
            return null;
        }
        sfVar.a = str;
        sfVar.b = this.b;
        hh0 hh0Var = this.c;
        if (hh0Var == null) {
            ch2.l("Null encodedPayload");
            return null;
        }
        sfVar.c = hh0Var;
        sfVar.d = Long.valueOf(this.d);
        sfVar.e = Long.valueOf(this.e);
        sfVar.f = new HashMap(this.f);
        return sfVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wl) {
            wl wlVar = (wl) obj;
            if (this.a.equals(wlVar.a)) {
                Integer num = wlVar.b;
                Integer num2 = this.b;
                if (num2 != null ? num2.equals(num) : num == null) {
                    if (this.c.equals(wlVar.c) && this.d == wlVar.d && this.e == wlVar.e && this.f.equals(wlVar.f)) {
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
