package M0;

import java.util.Objects;

/* loaded from: classes.dex */
public final class k extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f1723b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1724c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1725d;

    public k(String str, String str2, String str3) {
        super("----");
        this.f1723b = str;
        this.f1724c = str2;
        this.f1725d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (Objects.equals(this.f1724c, kVar.f1724c) && Objects.equals(this.f1723b, kVar.f1723b) && Objects.equals(this.f1725d, kVar.f1725d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f1723b;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f1724c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f1725d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // M0.i
    public final String toString() {
        return this.f1721a + ": domain=" + this.f1723b + ", description=" + this.f1724c;
    }
}
