package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cdn extends cec {
    private final ceb a;
    private final cea b;

    public cdn(ceb cebVar, cea ceaVar) {
        this.a = cebVar;
        this.b = ceaVar;
    }

    @Override // defpackage.cec
    public final cea a() {
        return this.b;
    }

    @Override // defpackage.cec
    public final ceb b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cec) {
            cec cecVar = (cec) obj;
            ceb cebVar = this.a;
            if (cebVar != null ? cebVar.equals(cecVar.b()) : cecVar.b() == null) {
                cea ceaVar = this.b;
                if (ceaVar != null ? ceaVar.equals(cecVar.a()) : cecVar.a() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        ceb cebVar = this.a;
        int hashCode = cebVar == null ? 0 : cebVar.hashCode();
        cea ceaVar = this.b;
        return ((hashCode ^ 1000003) * 1000003) ^ (ceaVar != null ? ceaVar.hashCode() : 0);
    }

    public final String toString() {
        cea ceaVar = this.b;
        return "NetworkConnectionInfo{networkType=" + String.valueOf(this.a) + ", mobileSubtype=" + String.valueOf(ceaVar) + "}";
    }
}
