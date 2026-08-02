package L1;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f1639a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f1640b;

    /* renamed from: c, reason: collision with root package name */
    public final n f1641c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1642d;

    /* renamed from: e, reason: collision with root package name */
    public final long f1643e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f1644f;

    public i(String str, Integer num, n nVar, long j4, long j5, HashMap hashMap) {
        this.f1639a = str;
        this.f1640b = num;
        this.f1641c = nVar;
        this.f1642d = j4;
        this.f1643e = j5;
        this.f1644f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f1644f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f1644f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final h c() {
        h hVar = new h();
        String str = this.f1639a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        hVar.f1633a = str;
        hVar.f1634b = this.f1640b;
        n nVar = this.f1641c;
        if (nVar == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        hVar.f1635c = nVar;
        hVar.f1636d = Long.valueOf(this.f1642d);
        hVar.f1637e = Long.valueOf(this.f1643e);
        hVar.f1638f = new HashMap(this.f1644f);
        return hVar;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            String str = iVar.f1639a;
            Integer num2 = iVar.f1640b;
            if (this.f1639a.equals(str) && ((num = this.f1640b) != null ? num.equals(num2) : num2 == null) && this.f1641c.equals(iVar.f1641c) && this.f1642d == iVar.f1642d && this.f1643e == iVar.f1643e && this.f1644f.equals(iVar.f1644f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f1639a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f1640b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f1641c.hashCode()) * 1000003;
        long j4 = this.f1642d;
        int i4 = (hashCode2 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        long j5 = this.f1643e;
        return ((i4 ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003) ^ this.f1644f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f1639a + ", code=" + this.f1640b + ", encodedPayload=" + this.f1641c + ", eventMillis=" + this.f1642d + ", uptimeMillis=" + this.f1643e + ", autoMetadata=" + this.f1644f + "}";
    }
}
