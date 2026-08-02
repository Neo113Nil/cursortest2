package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ehq {
    public final dqy a;
    public final dov b;
    public final dsi c = null;

    public ehq(dqy dqyVar, dov dovVar) {
        this.a = dqyVar;
        this.b = dovVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ehq)) {
            return false;
        }
        ehq ehqVar = (ehq) obj;
        if (!ksp.b(this.a, ehqVar.a) || !ksp.b(this.b, ehqVar.b)) {
            return false;
        }
        dsi dsiVar = ehqVar.c;
        return ksp.b(null, null);
    }

    public final int hashCode() {
        return ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
    }

    public final String toString() {
        return "AccountsModelContainer(accountsModel=" + this.a + ", accountConverter=" + this.b + ", incognitoModel=null)";
    }
}
