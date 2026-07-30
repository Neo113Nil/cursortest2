package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class bm extends ur1 {
    public final tr1 a;
    public final sr1 b;

    public bm(tr1 tr1Var, sr1 sr1Var) {
        this.a = tr1Var;
        this.b = sr1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ur1) {
            ur1 ur1Var = (ur1) obj;
            tr1 tr1Var = this.a;
            if (tr1Var != null ? tr1Var.equals(((bm) ur1Var).a) : ((bm) ur1Var).a == null) {
                sr1 sr1Var = this.b;
                if (sr1Var != null ? sr1Var.equals(((bm) ur1Var).b) : ((bm) ur1Var).b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        tr1 tr1Var = this.a;
        int hashCode = ((tr1Var == null ? 0 : tr1Var.hashCode()) ^ 1000003) * 1000003;
        sr1 sr1Var = this.b;
        return hashCode ^ (sr1Var != null ? sr1Var.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}
