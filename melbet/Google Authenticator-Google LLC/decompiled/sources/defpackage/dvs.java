package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dvs {
    public final cvg a;
    public final jiu b;

    public dvs(cvg cvgVar, jiu jiuVar) {
        this.a = cvgVar;
        this.b = jiuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvs)) {
            return false;
        }
        dvs dvsVar = (dvs) obj;
        return ksp.b(this.a, dvsVar.a) && ksp.b(this.b, dvsVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "HealthAlertWithTap(accountHealthAlerts=" + this.a + ", tap=" + this.b + ")";
    }
}
