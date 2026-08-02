package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ccm {
    public final Object a;
    public final ccn b;

    public ccm(Object obj, ccn ccnVar) {
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.a = obj;
        if (ccnVar == null) {
            throw new NullPointerException("Null priority");
        }
        this.b = ccnVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ccm) {
            ccm ccmVar = (ccm) obj;
            if (this.a.equals(ccmVar.a) && this.b.equals(ccmVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ (-721379959);
        return (this.b.hashCode() ^ (hashCode * 1000003)) * (-721379959);
    }

    public final String toString() {
        ccn ccnVar = this.b;
        return "Event{code=null, payload=" + this.a.toString() + ", priority=" + ccnVar.toString() + ", productData=null, eventContext=null}";
    }

    public ccm() {
        throw null;
    }
}
