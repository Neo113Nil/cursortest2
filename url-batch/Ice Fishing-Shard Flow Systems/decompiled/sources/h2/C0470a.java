package h2;

import S.i;

/* renamed from: h2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0470a {

    /* renamed from: a, reason: collision with root package name */
    public final String f5147a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5148b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5149c;

    /* renamed from: d, reason: collision with root package name */
    public final C0471b f5150d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5151e;

    public C0470a(String str, String str2, String str3, C0471b c0471b, int i2) {
        this.f5147a = str;
        this.f5148b = str2;
        this.f5149c = str3;
        this.f5150d = c0471b;
        this.f5151e = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0470a)) {
            return false;
        }
        C0470a c0470a = (C0470a) obj;
        String str = this.f5147a;
        if (str == null) {
            if (c0470a.f5147a != null) {
                return false;
            }
        } else if (!str.equals(c0470a.f5147a)) {
            return false;
        }
        String str2 = this.f5148b;
        if (str2 == null) {
            if (c0470a.f5148b != null) {
                return false;
            }
        } else if (!str2.equals(c0470a.f5148b)) {
            return false;
        }
        String str3 = this.f5149c;
        if (str3 == null) {
            if (c0470a.f5149c != null) {
                return false;
            }
        } else if (!str3.equals(c0470a.f5149c)) {
            return false;
        }
        C0471b c0471b = this.f5150d;
        if (c0471b == null) {
            if (c0470a.f5150d != null) {
                return false;
            }
        } else if (!c0471b.equals(c0470a.f5150d)) {
            return false;
        }
        int i2 = this.f5151e;
        return i2 == 0 ? c0470a.f5151e == 0 : i.a(i2, c0470a.f5151e);
    }

    public final int hashCode() {
        String str = this.f5147a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f5148b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f5149c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        C0471b c0471b = this.f5150d;
        int hashCode4 = (hashCode3 ^ (c0471b == null ? 0 : c0471b.hashCode())) * 1000003;
        int i2 = this.f5151e;
        return (i2 != 0 ? i.b(i2) : 0) ^ hashCode4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.f5147a);
        sb.append(", fid=");
        sb.append(this.f5148b);
        sb.append(", refreshToken=");
        sb.append(this.f5149c);
        sb.append(", authToken=");
        sb.append(this.f5150d);
        sb.append(", responseCode=");
        int i2 = this.f5151e;
        sb.append(i2 != 1 ? i2 != 2 ? "null" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
