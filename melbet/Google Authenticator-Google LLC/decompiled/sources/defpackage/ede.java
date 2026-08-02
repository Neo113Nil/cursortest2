package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ede {
    public final dov a;
    public final dpd b;
    public final gzf c;

    public ede(dov dovVar, dpd dpdVar, gzf gzfVar) {
        this.a = dovVar;
        this.b = dpdVar;
        this.c = gzfVar;
    }

    public final boolean equals(Object obj) {
        dpd dpdVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ede) {
            ede edeVar = (ede) obj;
            if (this.a.equals(edeVar.a) && ((dpdVar = this.b) != null ? dpdVar.equals(edeVar.b) : edeVar.b == null) && this.c.equals(edeVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        dpd dpdVar = this.b;
        return this.c.hashCode() ^ (((hashCode * (-721379959)) ^ (dpdVar == null ? 0 : dpdVar.hashCode())) * 1000003);
    }

    public final String toString() {
        gzf gzfVar = this.c;
        dpd dpdVar = this.b;
        return "AccountLayer{accountConverter=" + String.valueOf(this.a) + ", avatarRetriever=null, avatarImageLoader=" + String.valueOf(dpdVar) + ", onAddAccount=" + String.valueOf(gzfVar) + "}";
    }

    public ede() {
        throw null;
    }
}
