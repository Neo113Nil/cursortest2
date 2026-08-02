package defpackage;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class dt {
    private BroadcastReceiver a;
    final /* synthetic */ dy c;

    public dt(dy dyVar) {
        this.c = dyVar;
    }

    public abstract IntentFilter a();

    public abstract void b();

    final void c() {
        BroadcastReceiver broadcastReceiver = this.a;
        if (broadcastReceiver != null) {
            try {
                this.c.k.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    final void d() {
        c();
        IntentFilter a = a();
        if (a.countActions() == 0) {
            return;
        }
        if (this.a == null) {
            this.a = new ds(this);
        }
        dy dyVar = this.c;
        dyVar.k.registerReceiver(this.a, a);
    }
}
