package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cjp {
    public final int a;
    public final jom b;

    public cjp(int i, jom jomVar) {
        this.a = i;
        this.b = jomVar;
    }

    @Deprecated
    public static cjp a(int i, jom jomVar) {
        oy.al(i > 0);
        oy.at(jomVar);
        return new cjp(i, jomVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cjp) {
            cjp cjpVar = (cjp) obj;
            if (this.a == cjpVar.a && this.b.equals(cjpVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        return this.b.hashCode() ^ ((i ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ComplianceProductData{productId=" + this.a + ", productIdOrigin=" + this.b.toString() + "}";
    }

    public cjp() {
        throw null;
    }
}
