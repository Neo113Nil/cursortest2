package k6;

import a2.r;
import com.google.android.gms.internal.measurement.ra;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f5458a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f5459b;

    /* renamed from: c, reason: collision with root package name */
    public final k f5460c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5461d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5462e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f5463f;

    public h(String str, Integer num, k kVar, long j, long j3, HashMap hashMap) {
        this.f5458a = str;
        this.f5459b = num;
        this.f5460c = kVar;
        this.f5461d = j;
        this.f5462e = j3;
        this.f5463f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f5463f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f5463f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final ra c() {
        ra raVar = new ra();
        String str = this.f5458a;
        if (str == null) {
            r.j("Null transportName");
            return null;
        }
        raVar.f2737a = str;
        raVar.f2738b = this.f5459b;
        k kVar = this.f5460c;
        if (kVar == null) {
            r.j("Null encodedPayload");
            return null;
        }
        raVar.f2739c = kVar;
        raVar.f2740d = Long.valueOf(this.f5461d);
        raVar.f2741e = Long.valueOf(this.f5462e);
        raVar.f2742f = new HashMap(this.f5463f);
        return raVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f5458a.equals(hVar.f5458a)) {
                Integer num = hVar.f5459b;
                Integer num2 = this.f5459b;
                if (num2 != null ? num2.equals(num) : num == null) {
                    if (this.f5460c.equals(hVar.f5460c) && this.f5461d == hVar.f5461d && this.f5462e == hVar.f5462e && this.f5463f.equals(hVar.f5463f)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f5458a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f5459b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f5460c.hashCode()) * 1000003;
        long j = this.f5461d;
        int i3 = (hashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j3 = this.f5462e;
        return ((i3 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ this.f5463f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f5458a + ", code=" + this.f5459b + ", encodedPayload=" + this.f5460c + ", eventMillis=" + this.f5461d + ", uptimeMillis=" + this.f5462e + ", autoMetadata=" + this.f5463f + "}";
    }
}
