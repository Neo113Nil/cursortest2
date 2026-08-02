package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.auth.UserRecoverableAuthException;
import j$.time.Instant;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class idm implements idk {
    private final AccountManager a;
    private final iel b;

    public idm(Context context, iel ielVar) {
        gty aC = hoq.aC(278, "AccountManagerTokenProvider#<init>");
        try {
            this.a = AccountManager.get(context);
            this.b = ielVar;
            aC.close();
        } catch (Throwable th) {
            try {
                aC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.idk
    public final void a(String str) {
        gty aC = hoq.aC(279, "AccountManagerTokenProvider#clearToken");
        try {
            this.a.invalidateAuthToken("com.google", str);
            aC.close();
        } catch (Throwable th) {
            try {
                aC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.idk
    public final iyi b(Account account, String str) {
        try {
            gty aC = hoq.aC(280, "AccountManagerTokenProvider#getTokenWithDetails");
            try {
                Bundle result = this.a.getAuthToken(account, str, (Bundle) null, false, (AccountManagerCallback<Bundle>) null, (Handler) null).getResult(this.b.b(), TimeUnit.MILLISECONDS);
                String string = result.getString("authtoken");
                if (string != null) {
                    long j = result.getLong("android.accounts.expiry");
                    iyi iyiVar = new iyi(string, Instant.now(), j == 0 ? null : Instant.ofEpochMilli(j));
                    aC.close();
                    return iyiVar;
                }
                String string2 = result.getString("errorMessage");
                Intent intent = (Intent) result.getParcelable("intent");
                if (intent != null) {
                    throw new idi(new UserRecoverableAuthException(string2, intent));
                }
                int i = result.getInt("errorCode");
                if (i == 1 || i == 3 || i == 4) {
                    throw new IOException(string2);
                }
                throw new idi(new chh(string2));
            } catch (Throwable th) {
                try {
                    aC.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (AuthenticatorException e) {
            throw new idi(new chh(e));
        } catch (OperationCanceledException e2) {
            throw new IOException(e2);
        }
    }
}
