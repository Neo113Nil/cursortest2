package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fzu {
    public final String a;
    public final String b;
    public final String c;

    public fzu(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fzu)) {
            return false;
        }
        fzu fzuVar = (fzu) obj;
        return ksp.b(this.a, fzuVar.a) && ksp.b(this.b, fzuVar.b) && ksp.b(this.c, fzuVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "SelectedAccount(userId=" + this.a + ", displayId=" + this.b + ", type=" + this.c + ")";
    }
}
