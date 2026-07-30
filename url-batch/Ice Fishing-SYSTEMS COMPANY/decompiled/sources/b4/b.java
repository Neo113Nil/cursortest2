package b4;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f5543a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5544b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5545c;

    public b(int i, long j9, String str) {
        this.f5543a = str;
        this.f5544b = j9;
        this.f5545c = i;
    }

    public static F.d a() {
        F.d dVar = new F.d((byte) 0, 3);
        dVar.f910d = 0L;
        return dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        String str = this.f5543a;
        if (str == null) {
            if (bVar.f5543a != null) {
                return false;
            }
        } else if (!str.equals(bVar.f5543a)) {
            return false;
        }
        if (this.f5544b != bVar.f5544b) {
            return false;
        }
        int i = bVar.f5545c;
        int i4 = this.f5545c;
        return i4 == 0 ? i == 0 : AbstractC5088e.a(i4, i);
    }

    public final int hashCode() {
        String str = this.f5543a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j9 = this.f5544b;
        int i = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        int i4 = this.f5545c;
        return (i4 != 0 ? AbstractC5088e.d(i4) : 0) ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.f5543a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f5544b);
        sb.append(", responseCode=");
        int i = this.f5545c;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "AUTH_ERROR" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
