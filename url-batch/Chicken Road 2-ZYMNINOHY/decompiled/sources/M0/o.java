package M0;

import E.AbstractC0005f;
import java.util.Objects;

/* loaded from: classes.dex */
public final class o extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f1735b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1736c;

    public o(String str, String str2, String str3) {
        super(str);
        this.f1735b = str2;
        this.f1736c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f1721a.equals(oVar.f1721a) && Objects.equals(this.f1735b, oVar.f1735b) && Objects.equals(this.f1736c, oVar.f1736c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int f4 = AbstractC0005f.f(527, 31, this.f1721a);
        String str = this.f1735b;
        int hashCode = (f4 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f1736c;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // M0.i
    public final String toString() {
        return this.f1721a + ": url=" + this.f1736c;
    }
}
