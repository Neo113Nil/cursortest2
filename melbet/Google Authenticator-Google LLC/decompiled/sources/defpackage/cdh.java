package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cdh extends cds {
    private final cdv a;
    private final cdr b;

    public cdh(cdv cdvVar, cdr cdrVar) {
        this.a = cdvVar;
        this.b = cdrVar;
    }

    @Override // defpackage.cds
    public final cdr a() {
        return this.b;
    }

    @Override // defpackage.cds
    public final cdv b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        cdr cdrVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cds) {
            cds cdsVar = (cds) obj;
            if (this.a.equals(cdsVar.b()) && ((cdrVar = this.b) != null ? cdrVar.equals(cdsVar.a()) : cdsVar.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        cdr cdrVar = this.b;
        return (cdrVar == null ? 0 : cdrVar.hashCode()) ^ (hashCode * 1000003);
    }

    public final String toString() {
        cdr cdrVar = this.b;
        return "ComplianceData{privacyContext=" + this.a.toString() + ", productIdOrigin=" + String.valueOf(cdrVar) + "}";
    }
}
