package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cxh implements cmk {
    public final Account b;
    public final hsl c;

    public cxh(Account account, hsl hslVar) {
        if (account == null) {
            throw new NullPointerException("Null account");
        }
        this.b = account;
        if (hslVar == null) {
            throw new NullPointerException("Null timeSource");
        }
        this.c = hslVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cxh) {
            cxh cxhVar = (cxh) obj;
            if (this.b.equals(cxhVar.b) && this.c.equals(cxhVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() ^ 1000003;
        return this.c.hashCode() ^ (hashCode * 1000003);
    }

    public final String toString() {
        return "MdiSyncClientOptions{account=" + this.b.toString() + ", timeSource=TimeSource.system()}";
    }

    public cxh() {
        throw null;
    }
}
