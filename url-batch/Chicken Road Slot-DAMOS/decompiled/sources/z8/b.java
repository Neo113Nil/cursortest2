package z8;

import a4.i;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f10955a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10956b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10957c;

    public b(int i3, long j, String str) {
        this.f10955a = str;
        this.f10956b = j;
        this.f10957c = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        String str = bVar.f10955a;
        String str2 = this.f10955a;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.f10956b != bVar.f10956b) {
            return false;
        }
        int i3 = bVar.f10957c;
        int i10 = this.f10957c;
        return i10 == 0 ? i3 == 0 : i.a(i10, i3);
    }

    public final int hashCode() {
        String str = this.f10955a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f10956b;
        int i3 = (((hashCode ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        int i10 = this.f10957c;
        return (i10 != 0 ? i.b(i10) : 0) ^ i3;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TokenResult{token=");
        sb2.append(this.f10955a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f10956b);
        sb2.append(", responseCode=");
        int i3 = this.f10957c;
        sb2.append(i3 != 1 ? i3 != 2 ? i3 != 3 ? "null" : "AUTH_ERROR" : "BAD_CONFIG" : "OK");
        sb2.append("}");
        return sb2.toString();
    }
}
