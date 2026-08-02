package g0;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final int f8979a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8980b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8981c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8982d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8983e;

    /* renamed from: f, reason: collision with root package name */
    public final String f8984f;

    public t(int i4, int i5, String str, String str2, String str3, String str4) {
        this.f8979a = i4;
        this.f8980b = i5;
        this.f8981c = str;
        this.f8982d = str2;
        this.f8983e = str3;
        this.f8984f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t.class == obj.getClass()) {
            t tVar = (t) obj;
            if (this.f8979a == tVar.f8979a && this.f8980b == tVar.f8980b && TextUtils.equals(this.f8981c, tVar.f8981c) && TextUtils.equals(this.f8982d, tVar.f8982d) && TextUtils.equals(this.f8983e, tVar.f8983e) && TextUtils.equals(this.f8984f, tVar.f8984f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4 = ((this.f8979a * 31) + this.f8980b) * 31;
        String str = this.f8981c;
        int hashCode = (i4 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f8982d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f8983e;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f8984f;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
