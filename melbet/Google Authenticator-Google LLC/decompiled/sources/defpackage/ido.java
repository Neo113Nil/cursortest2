package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ido {
    public final Account a;
    public final String b;

    public ido(Account account, String str) {
        this.a = account;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ido) {
            ido idoVar = (ido) obj;
            if (this.a.equals(idoVar.a) && this.b.equals(idoVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        return this.b.hashCode() ^ (hashCode * 1000003);
    }

    public final String toString() {
        return "AccountAndScope{account=" + this.a.toString() + ", scope=" + this.b + "}";
    }

    public ido() {
        throw null;
    }
}
