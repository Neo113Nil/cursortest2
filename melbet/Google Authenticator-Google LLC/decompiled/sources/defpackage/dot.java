package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dot extends BroadcastReceiver {
    final /* synthetic */ hac a;
    final /* synthetic */ Account b;

    public dot(hac hacVar, Account account) {
        this.a = hacVar;
        this.b = account;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [doq, java.lang.Object] */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ?? bB = this.a.bB();
        if (bB != 0) {
            Account[] accounts = AccountManager.get(context).getAccounts();
            int intExtra = intent.getIntExtra("account_index", -1);
            if (intExtra < 0 || intExtra >= accounts.length || !accounts[intExtra].equals(this.b)) {
                return;
            }
            bB.e();
        }
    }
}
