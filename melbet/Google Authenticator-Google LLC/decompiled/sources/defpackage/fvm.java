package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fvm {
    private static final hkh b = hkh.l("com/google/apps/tiktok/account/data/device/DeviceAccountsChangedMonitor");
    public final Set a;
    private final Context c;
    private final hvl d;
    private final gaj e;
    private boolean f = false;

    public fvm(Context context, Set set, hvl hvlVar, gaj gajVar) {
        this.c = context;
        this.a = set;
        this.d = hvlVar;
        this.e = gajVar;
    }

    final hvi a() {
        ((hkf) ((hkf) b.d()).i("com/google/apps/tiktok/account/data/device/DeviceAccountsChangedMonitor", "notifyAccountsChanged", 55, "DeviceAccountsChangedMonitor.java")).s("Device Accounts Changed");
        hvi aN = hnu.aN(gvx.b(new cbc(this, 17)), this.d);
        this.e.e(aN);
        return aN;
    }

    public final synchronized void b() {
        if (this.f) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.accounts.LOGIN_ACCOUNTS_CHANGED");
        this.c.registerReceiver(new fvl(), intentFilter);
        this.f = true;
    }

    final synchronized boolean c() {
        return this.f;
    }
}
