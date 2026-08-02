package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dre {
    public final dpd a;
    public final dov b;
    public final dqy c;
    public final efc d;
    public final gzp e;
    private final gzp f;

    public dre(dpd dpdVar, dov dovVar, dqy dqyVar, efc efcVar, gzp gzpVar, gzp gzpVar2) {
        this.a = dpdVar;
        this.b = dovVar;
        this.c = dqyVar;
        this.d = efcVar;
        this.e = gzpVar;
        this.f = gzpVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dre) {
            dre dreVar = (dre) obj;
            if (this.a.equals(dreVar.a) && this.b.equals(dreVar.b) && this.c.equals(dreVar.c) && this.d.equals(dreVar.d) && this.e.equals(dreVar.e) && this.f.equals(dreVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        return ((((this.d.hashCode() ^ (hashCode * (-721379959))) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        gzp gzpVar = this.f;
        gzp gzpVar2 = this.e;
        efc efcVar = this.d;
        dqy dqyVar = this.c;
        dov dovVar = this.b;
        return "AccountManagementSpec{avatarImageLoader=" + String.valueOf(this.a) + ", accountConverter=" + String.valueOf(dovVar) + ", accountsModel=" + String.valueOf(dqyVar) + ", accountClass=null, oneGoogleEventLogger=" + String.valueOf(efcVar) + ", deactivatedAccountsFeature=" + String.valueOf(gzpVar2) + ", launcherAppDialogTracker=" + String.valueOf(gzpVar) + "}";
    }

    public dre() {
        throw null;
    }
}
