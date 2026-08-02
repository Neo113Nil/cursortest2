package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dsh {
    public final dqy a;
    public final dov b;
    public final fwm c;

    public dsh(dqy dqyVar, dov dovVar, fwm fwmVar) {
        dqyVar.getClass();
        dovVar.getClass();
        this.a = dqyVar;
        this.b = dovVar;
        this.c = fwmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsh)) {
            return false;
        }
        dsh dshVar = (dsh) obj;
        return ksp.b(this.a, dshVar.a) && ksp.b(this.b, dshVar.b) && ksp.b(this.c, dshVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        fwm fwmVar = this.c;
        return (hashCode * 31) + (fwmVar == null ? 0 : fwmVar.hashCode());
    }

    public final String toString() {
        return "AddAccountContext(accountsModel=" + this.a + ", accountConverter=" + this.b + ", oneGoogleStreamz=" + this.c + ")";
    }
}
