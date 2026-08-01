package s7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b1 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final j4 f8513a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8514b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8515c;

    public b1(j4 j4Var) {
        c7.c0.g(j4Var);
        this.f8513a = j4Var;
    }

    public final void a() {
        j4 j4Var = this.f8513a;
        j4Var.l0();
        j4Var.d().s();
        j4Var.d().s();
        if (this.f8514b) {
            j4Var.b().B.a("Unregistering connectivity change receiver");
            this.f8514b = false;
            this.f8515c = false;
            try {
                j4Var.f8771z.f8932d.unregisterReceiver(this);
            } catch (IllegalArgumentException e2) {
                j4Var.b().f9050t.b(e2, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        j4 j4Var = this.f8513a;
        j4Var.l0();
        String action = intent.getAction();
        j4Var.b().B.b(action, "NetworkBroadcastReceiver received action");
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            j4Var.b().f9053w.b(action, "NetworkBroadcastReceiver received unknown action");
            return;
        }
        z0 z0Var = j4Var.f8761e;
        j4.T(z0Var);
        boolean w6 = z0Var.w();
        if (this.f8515c != w6) {
            this.f8515c = w6;
            j4Var.d().B(new b7.k(this, w6));
        }
    }
}
