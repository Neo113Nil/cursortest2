package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class euw {
    public final dbl a;
    public final String b;

    public euw(dbl dblVar, String str) {
        str.getClass();
        this.a = dblVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof euw)) {
            return false;
        }
        euw euwVar = (euw) obj;
        return ksp.b(this.a, euwVar.a) && ksp.b(this.b, euwVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ExperimentTokenData(experimentToken=" + this.a + ", configPackageName=" + this.b + ")";
    }
}
