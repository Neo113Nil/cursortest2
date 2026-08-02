package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dtp {
    public final duh a;
    public final gjl b;
    private final gzp c;

    public dtp(gzp gzpVar, duh duhVar, gjl gjlVar) {
        this.c = gzpVar;
        this.a = duhVar;
        this.b = gjlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtp)) {
            return false;
        }
        dtp dtpVar = (dtp) obj;
        return ksp.b(this.c, dtpVar.c) && ksp.b(this.a, dtpVar.a) && ksp.b(this.b, dtpVar.b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() - 1161807148) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "BentoData(bentoController=" + this.c + ", fragmentInjectables=" + this.a + ", appStateData=" + this.b + ")";
    }
}
