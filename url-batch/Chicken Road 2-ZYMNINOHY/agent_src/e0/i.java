package e0;

import java.util.Objects;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f8382a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8383b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8384c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8385d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8386e;

    public i(String str, String str2, String str3, String str4, String str5) {
        this.f8382a = str;
        this.f8383b = str2;
        this.f8384c = str3;
        this.f8385d = str4;
        this.f8386e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Objects.equals(this.f8382a, iVar.f8382a) && Objects.equals(this.f8383b, iVar.f8383b) && Objects.equals(this.f8384c, iVar.f8384c) && Objects.equals(this.f8385d, iVar.f8385d) && Objects.equals(this.f8386e, iVar.f8386e);
    }

    public final int hashCode() {
        String str = this.f8382a;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f8383b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f8384c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f8385d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f8386e;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
