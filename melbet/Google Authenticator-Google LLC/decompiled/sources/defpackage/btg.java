package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class btg {
    public final boolean a;
    public final hel b;

    public btg(boolean z, hel helVar) {
        this.a = z;
        if (helVar == null) {
            throw new NullPointerException("Null accounts");
        }
        this.b = helVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof btg) {
            btg btgVar = (btg) obj;
            if (this.a == btgVar.a && hnu.H(this.b, btgVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "FirstTimeConsentAndAccount{firstTime=" + this.a + ", accounts=" + this.b.toString() + "}";
    }

    public btg() {
        throw null;
    }
}
