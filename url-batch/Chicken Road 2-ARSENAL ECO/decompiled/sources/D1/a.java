package D1;

import N.p;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f362a;

    /* renamed from: b, reason: collision with root package name */
    public final String f363b;

    /* renamed from: c, reason: collision with root package name */
    public final String f364c;

    /* renamed from: d, reason: collision with root package name */
    public final c f365d;

    /* renamed from: e, reason: collision with root package name */
    public final int f366e;

    public a(String str, String str2, String str3, c cVar, int i7) {
        this.f362a = str;
        this.f363b = str2;
        this.f364c = str3;
        this.f365d = cVar;
        this.f366e = i7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.f362a;
        if (str == null) {
            if (aVar.f362a != null) {
                return false;
            }
        } else if (!str.equals(aVar.f362a)) {
            return false;
        }
        String str2 = this.f363b;
        if (str2 == null) {
            if (aVar.f363b != null) {
                return false;
            }
        } else if (!str2.equals(aVar.f363b)) {
            return false;
        }
        String str3 = this.f364c;
        if (str3 == null) {
            if (aVar.f364c != null) {
                return false;
            }
        } else if (!str3.equals(aVar.f364c)) {
            return false;
        }
        c cVar = this.f365d;
        if (cVar == null) {
            if (aVar.f365d != null) {
                return false;
            }
        } else if (!cVar.equals(aVar.f365d)) {
            return false;
        }
        int i7 = this.f366e;
        return i7 == 0 ? aVar.f366e == 0 : p.a(i7, aVar.f366e);
    }

    public final int hashCode() {
        String str = this.f362a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f363b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f364c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        c cVar = this.f365d;
        int hashCode4 = (hashCode3 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        int i7 = this.f366e;
        return (i7 != 0 ? p.c(i7) : 0) ^ hashCode4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.f362a);
        sb.append(", fid=");
        sb.append(this.f363b);
        sb.append(", refreshToken=");
        sb.append(this.f364c);
        sb.append(", authToken=");
        sb.append(this.f365d);
        sb.append(", responseCode=");
        int i7 = this.f366e;
        sb.append(i7 != 1 ? i7 != 2 ? "null" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
