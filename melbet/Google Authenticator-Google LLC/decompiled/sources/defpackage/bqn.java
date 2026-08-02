package defpackage;

import com.google.android.apps.authenticator2.editotp.AccountView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bqn extends bqc {
    private final AccountView a;

    public bqn(AccountView accountView) {
        this.a = accountView;
    }

    @Override // defpackage.bqc
    public final AccountView a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bqc) {
            return this.a.equals(((bqc) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RadioButtonClickedEvent{accountView=" + this.a.toString() + "}";
    }
}
