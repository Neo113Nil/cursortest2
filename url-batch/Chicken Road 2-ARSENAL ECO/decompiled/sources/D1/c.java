package D1;

import N.p;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f371a;

    /* renamed from: b, reason: collision with root package name */
    public final long f372b;

    /* renamed from: c, reason: collision with root package name */
    public final int f373c;

    public c(long j4, String str, int i7) {
        this.f371a = str;
        this.f372b = j4;
        this.f373c = i7;
    }

    public static b a() {
        b bVar = new b(0, (byte) 0);
        bVar.f370d = 0L;
        return bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        String str = this.f371a;
        if (str == null) {
            if (cVar.f371a != null) {
                return false;
            }
        } else if (!str.equals(cVar.f371a)) {
            return false;
        }
        long j4 = cVar.f372b;
        int i7 = cVar.f373c;
        if (this.f372b != j4) {
            return false;
        }
        int i8 = this.f373c;
        return i8 == 0 ? i7 == 0 : p.a(i8, i7);
    }

    public final int hashCode() {
        String str = this.f371a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j4 = this.f372b;
        int i7 = (((hashCode ^ 1000003) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003;
        int i8 = this.f373c;
        return (i8 != 0 ? p.c(i8) : 0) ^ i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.f371a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f372b);
        sb.append(", responseCode=");
        int i7 = this.f373c;
        sb.append(i7 != 1 ? i7 != 2 ? i7 != 3 ? "null" : "AUTH_ERROR" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
