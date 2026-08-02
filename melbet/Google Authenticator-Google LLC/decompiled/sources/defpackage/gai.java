package defpackage;

import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gai implements hut {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public gai(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.hut
    public final void a(Throwable th) {
        int i = this.b;
        if (i == 0) {
            if (th instanceof TimeoutException) {
                ((hkf) ((hkf) ((hkf) gaj.a.g()).h(th)).i("com/google/apps/tiktok/concurrent/AndroidFutures$1", "onFailure", 213, "AndroidFutures.java")).u("exceeded timeout: %s", this.a);
            }
        } else if (i != 1) {
            th.getClass();
            Log.e("MendelPackageState", (String) this.a, th);
        }
    }

    @Override // defpackage.hut
    public final void b(Object obj) {
        if (this.b != 1) {
            return;
        }
        Iterator it = ((jsd) ((fuy) this.a).b).b().iterator();
        while (it.hasNext()) {
            Object obj2 = ((kee) it.next()).a;
            hvi aJ = hnu.aJ(null);
            ((iwq) obj2).k(aJ, "com.google.apps.tiktok.account.data.AllAccounts");
            gaj.d(93, aJ, "AvailableAccountsInvalidatedObserver failed", new Object[0]);
        }
    }
}
