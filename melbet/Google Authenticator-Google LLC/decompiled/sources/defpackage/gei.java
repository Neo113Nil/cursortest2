package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gei {
    public final gdn a;
    public final Object b;
    public final gev c;
    public final long d;
    public final gej e;
    public final int f;

    public gei(gdn gdnVar, gev gevVar, long j, int i, gej gejVar) {
        this.a = gdnVar;
        this.b = "com.google.apps.tiktok.account.data.AllAccounts";
        this.c = gevVar;
        this.d = j;
        this.f = i;
        this.e = gejVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gei) {
            gei geiVar = (gei) obj;
            if (this.a.equals(geiVar.a) && this.b.equals(geiVar.b) && this.c.equals(geiVar.c) && this.d == geiVar.d && this.f == geiVar.f && this.e.equals(geiVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        long j = this.d;
        gej gejVar = this.e;
        return ((this.f ^ (((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003)) * 1000003) ^ gejVar.hashCode();
    }

    public final String toString() {
        int i = this.f;
        gev gevVar = this.c;
        String obj = this.a.toString();
        String obj2 = gevVar.toString();
        String str = i != 1 ? i != 2 ? "SUBSCRIBE" : "FORCE_REFRESH" : "UNDEFINED";
        long j = this.d;
        Object obj3 = this.b;
        return "SubscribeCallState{dataSource=" + obj + ", contentKey=" + ((String) obj3) + ", tolerance=" + obj2 + ", index=" + j + ", subscribeCallType=" + str + ", subscribeSequenceState=" + this.e.toString() + "}";
    }

    public gei() {
        throw null;
    }
}
