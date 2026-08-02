package defpackage;

import android.accounts.Account;
import android.accounts.OnAccountsUpdateListener;
import j$.util.Collection;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class idn implements OnAccountsUpdateListener {
    public static final /* synthetic */ int b = 0;
    final /* synthetic */ Object a;
    private final /* synthetic */ int c;

    public /* synthetic */ idn(egh eghVar, int i) {
        this.c = i;
        this.a = eghVar;
    }

    @Override // android.accounts.OnAccountsUpdateListener
    public final void onAccountsUpdated(Account[] accountArr) {
        int i = this.c;
        Object obj = this.a;
        if (i == 0) {
            Map map = ((idp) obj).a;
            synchronized (map) {
                Collection.EL.removeIf(map.entrySet(), new gqj(hfm.o(accountArr), 2));
            }
            return;
        }
        egh eghVar = (egh) obj;
        eghVar.i();
        for (Account account : accountArr) {
            eghVar.h(account);
        }
    }

    public idn(idp idpVar, int i) {
        this.c = i;
        this.a = idpVar;
    }
}
