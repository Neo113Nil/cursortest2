package defpackage;

import android.accounts.AccountManager;
import android.accounts.OnAccountsUpdateListener;
import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Log;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bkp {
    private static volatile bkp d;
    public boolean a;
    public final Object b;
    public final Object c;

    public bkp(Context context, efx efxVar, OnAccountsUpdateListener onAccountsUpdateListener) {
        this.a = false;
        this.b = onAccountsUpdateListener;
        this.c = AccountManager.get(context.getApplicationContext());
        if (aat.c(context, "android.permission.GET_ACCOUNTS") != 0) {
            hoq.av(efxVar.c(), new dkp(2), huf.a);
        }
    }

    static bkp a(Context context) {
        if (d == null) {
            synchronized (bkp.class) {
                if (d == null) {
                    d = new bkp(context.getApplicationContext());
                }
            }
        }
        return d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v3, types: [bmc, java.lang.Object] */
    final synchronized void b(bjv bjvVar) {
        ?? r0 = this.b;
        r0.add(bjvVar);
        if (!this.a && !r0.isEmpty()) {
            Object obj = this.c;
            ?? r02 = ((giq) obj).c;
            boolean z = true;
            ((giq) obj).a = ((ConnectivityManager) r02.a()).getActiveNetwork() != null;
            try {
                ((ConnectivityManager) r02.a()).registerDefaultNetworkCallback((ConnectivityManager.NetworkCallback) ((giq) obj).d);
            } catch (RuntimeException e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e);
                }
                z = false;
            }
            this.a = z;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v3, types: [bmc, java.lang.Object] */
    final synchronized void c(bjv bjvVar) {
        ?? r0 = this.b;
        r0.remove(bjvVar);
        if (this.a && r0.isEmpty()) {
            Object obj = this.c;
            ((ConnectivityManager) ((giq) obj).c.a()).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) ((giq) obj).d);
            this.a = false;
        }
    }

    private bkp(Context context) {
        this.b = new HashSet();
        this.c = new giq(new bmb(new bkm(context)), new bkn(this));
    }
}
