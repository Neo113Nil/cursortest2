package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ccf {
    public final bpc a;
    public final int b;
    public final int c;

    public ccf(int i, int i2, bpc bpcVar) {
        this.b = i;
        this.c = i2;
        this.a = bpcVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ccf) {
            ccf ccfVar = (ccf) obj;
            if (this.b == ccfVar.b && this.c == ccfVar.c && this.a.equals(ccfVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        bpc bpcVar = this.a;
        return ((this.c ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ bpcVar.hashCode();
    }

    public final String toString() {
        int i = this.b;
        return "SyncAction{type=" + (i != 1 ? i != 2 ? "CREATE" : "UPDATE" : "DELETE") + ", destination=" + (this.c != 1 ? "PASSBOX" : "LOCAL") + ", otp=" + this.a.toString() + "}";
    }

    public ccf() {
        throw null;
    }
}
