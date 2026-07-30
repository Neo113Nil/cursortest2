package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class tb extends dp0 {
    public final cp0 a;
    public final bp0 b;

    public tb(cp0 cp0Var, bp0 bp0Var) {
        this.a = cp0Var;
        this.b = bp0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dp0) {
            dp0 dp0Var = (dp0) obj;
            cp0 cp0Var = this.a;
            if (cp0Var != null ? cp0Var.equals(((tb) dp0Var).a) : ((tb) dp0Var).a == null) {
                bp0 bp0Var = this.b;
                if (bp0Var != null ? bp0Var.equals(((tb) dp0Var).b) : ((tb) dp0Var).b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        cp0 cp0Var = this.a;
        int hashCode = ((cp0Var == null ? 0 : cp0Var.hashCode()) ^ 1000003) * 1000003;
        bp0 bp0Var = this.b;
        return hashCode ^ (bp0Var != null ? bp0Var.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}
