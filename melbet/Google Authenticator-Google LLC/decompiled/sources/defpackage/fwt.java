package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fwt {
    public final Object a;
    public final fxd b;

    public fwt(Object obj, fxd fxdVar) {
        this.a = obj;
        if (fxdVar == null) {
            throw new NullPointerException("Null accountData");
        }
        this.b = fxdVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fwt) {
            fwt fwtVar = (fwt) obj;
            if (hnu.B(this.a, fwtVar.a) && this.b.equals(fwtVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        return this.b.hashCode() ^ (hashCode * 1000003);
    }

    public final String toString() {
        fxd fxdVar = this.b;
        return "ResultAndAccountData{result=" + String.valueOf(this.a) + ", accountData=" + fxdVar.toString() + "}";
    }

    public fwt() {
        throw null;
    }
}
