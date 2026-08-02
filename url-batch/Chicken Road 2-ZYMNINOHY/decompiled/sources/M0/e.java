package M0;

import java.util.Objects;

/* loaded from: classes.dex */
public final class e extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f1709b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1710c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1711d;

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f1709b = str;
        this.f1710c = str2;
        this.f1711d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (Objects.equals(this.f1710c, eVar.f1710c) && Objects.equals(this.f1709b, eVar.f1709b) && Objects.equals(this.f1711d, eVar.f1711d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f1709b;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f1710c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f1711d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // M0.i
    public final String toString() {
        return this.f1721a + ": language=" + this.f1709b + ", description=" + this.f1710c + ", text=" + this.f1711d;
    }
}
