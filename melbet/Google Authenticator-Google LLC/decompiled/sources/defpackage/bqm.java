package defpackage;

import com.google.android.apps.authenticator2.editotp.AccountView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bqm extends bqb {
    private final AccountView a;

    public bqm(AccountView accountView) {
        this.a = accountView;
    }

    @Override // defpackage.bqb
    public final AccountView a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bqb) {
            return this.a.equals(((bqb) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "LocalAccountClickedEvent{accountView=" + this.a.toString() + "}";
    }
}
