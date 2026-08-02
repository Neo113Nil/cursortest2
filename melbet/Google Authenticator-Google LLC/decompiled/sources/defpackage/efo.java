package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class efo {
    public final String a;
    public final int b;

    public efo(int i, String str) {
        this.b = i;
        this.a = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof efo) {
            efo efoVar = (efo) obj;
            if (this.b == efoVar.b && ((str = this.a) != null ? str.equals(efoVar.a) : efoVar.a == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return ((this.b ^ 1000003) * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        int i = this.b;
        return "AuthChannel{type=" + (i != 1 ? i != 2 ? "PSEUDONYMOUS" : "ANONYMOUS" : "GAIA") + ", account=" + this.a + "}";
    }

    public efo() {
        throw null;
    }
}
