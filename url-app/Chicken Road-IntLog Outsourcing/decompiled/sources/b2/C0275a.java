package b2;

import O.j;

/* renamed from: b2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0275a {

    /* renamed from: a, reason: collision with root package name */
    public final String f4800a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4801b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4802c;

    /* renamed from: d, reason: collision with root package name */
    public final C0276b f4803d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4804e;

    public C0275a(String str, String str2, String str3, C0276b c0276b, int i2) {
        this.f4800a = str;
        this.f4801b = str2;
        this.f4802c = str3;
        this.f4803d = c0276b;
        this.f4804e = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0275a)) {
            return false;
        }
        C0275a c0275a = (C0275a) obj;
        String str = this.f4800a;
        if (str != null ? str.equals(c0275a.f4800a) : c0275a.f4800a == null) {
            String str2 = this.f4801b;
            if (str2 != null ? str2.equals(c0275a.f4801b) : c0275a.f4801b == null) {
                String str3 = this.f4802c;
                if (str3 != null ? str3.equals(c0275a.f4802c) : c0275a.f4802c == null) {
                    C0276b c0276b = this.f4803d;
                    if (c0276b != null ? c0276b.equals(c0275a.f4803d) : c0275a.f4803d == null) {
                        int i2 = this.f4804e;
                        if (i2 == 0) {
                            if (c0275a.f4804e == 0) {
                                return true;
                            }
                        } else if (j.a(i2, c0275a.f4804e)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f4800a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f4801b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f4802c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        C0276b c0276b = this.f4803d;
        int hashCode4 = (hashCode3 ^ (c0276b == null ? 0 : c0276b.hashCode())) * 1000003;
        int i2 = this.f4804e;
        return (i2 != 0 ? j.b(i2) : 0) ^ hashCode4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.f4800a);
        sb.append(", fid=");
        sb.append(this.f4801b);
        sb.append(", refreshToken=");
        sb.append(this.f4802c);
        sb.append(", authToken=");
        sb.append(this.f4803d);
        sb.append(", responseCode=");
        int i2 = this.f4804e;
        sb.append(i2 != 1 ? i2 != 2 ? "null" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
