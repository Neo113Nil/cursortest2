package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jfg {
    public int a = 3;
    public int b;

    public jfg(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jfg)) {
            return false;
        }
        jfg jfgVar = (jfg) obj;
        return this.a == jfgVar.a && this.b == jfgVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "RemainingAccountsNumberContent(headerMaxAvatars=" + this.a + ", numberOfAvailableAccounts=" + this.b + ")";
    }
}
