package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class xc1 {
    public final wc1 a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public xc1(wc1 wc1Var, String str, String str2, String str3, String str4, String str5, String str6) {
        wc1Var.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = wc1Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xc1)) {
            return false;
        }
        xc1 xc1Var = (xc1) obj;
        return Intrinsics.a(this.a, xc1Var.a) && Intrinsics.a(this.b, xc1Var.b) && Intrinsics.a(this.c, xc1Var.c) && Intrinsics.a(this.d, xc1Var.d) && this.e.equals(xc1Var.e) && Intrinsics.a(this.f, xc1Var.f) && Intrinsics.a(this.g, xc1Var.g);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + ((((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31) + 803262031) * 31)) * 31)) * 31;
        String str = this.f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "StartupConfigRequest(attributionData=" + this.a + ", appsFlyerId=" + this.b + ", bundleId=" + this.c + ", os=Android, storeId=" + this.d + ", locale=" + this.e + ", pushToken=" + this.f + ", firebaseProjectId=" + this.g + ")";
    }
}
