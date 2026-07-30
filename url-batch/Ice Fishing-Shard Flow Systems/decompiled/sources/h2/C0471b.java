package h2;

import S.i;

/* renamed from: h2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0471b {

    /* renamed from: a, reason: collision with root package name */
    public final String f5152a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5153b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5154c;

    public C0471b(long j, String str, int i2) {
        this.f5152a = str;
        this.f5153b = j;
        this.f5154c = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0471b)) {
            return false;
        }
        C0471b c0471b = (C0471b) obj;
        String str = this.f5152a;
        if (str == null) {
            if (c0471b.f5152a != null) {
                return false;
            }
        } else if (!str.equals(c0471b.f5152a)) {
            return false;
        }
        long j = c0471b.f5153b;
        int i2 = c0471b.f5154c;
        if (this.f5153b != j) {
            return false;
        }
        int i5 = this.f5154c;
        return i5 == 0 ? i2 == 0 : i.a(i5, i2);
    }

    public final int hashCode() {
        String str = this.f5152a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f5153b;
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        int i5 = this.f5154c;
        return (i5 != 0 ? i.b(i5) : 0) ^ i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.f5152a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f5153b);
        sb.append(", responseCode=");
        int i2 = this.f5154c;
        sb.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? "null" : "AUTH_ERROR" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
