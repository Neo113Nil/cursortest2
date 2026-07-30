package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class hi3 extends BroadcastReceiver {
    public final oq3 a;
    public boolean b;
    public boolean c;

    public hi3(oq3 oq3Var) {
        ll3.v(oq3Var);
        this.a = oq3Var;
    }

    public final void a() {
        oq3 oq3Var = this.a;
        oq3Var.l0();
        oq3Var.c().v();
        oq3Var.c().v();
        if (this.b) {
            oq3Var.a().z.b("Unregistering connectivity change receiver");
            this.b = false;
            this.c = false;
            try {
                oq3Var.x.m.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                oq3Var.a().r.c(e, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        oq3 oq3Var = this.a;
        oq3Var.l0();
        String action = intent.getAction();
        oq3Var.a().z.c(action, "NetworkBroadcastReceiver received action");
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            oq3Var.a().u.c(action, "NetworkBroadcastReceiver received unknown action");
            return;
        }
        bi3 bi3Var = oq3Var.n;
        oq3.U(bi3Var);
        boolean Q = bi3Var.Q();
        if (this.c != Q) {
            this.c = Q;
            oq3Var.c().F(new r7(this, Q));
        }
    }
}
