package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class nf extends BroadcastReceiver {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public nf(pj3 pj3Var) {
        this.b = pj3Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((b90) obj).l();
                break;
            default:
                pj3 pj3Var = (pj3) obj;
                if (intent != null) {
                    String action = intent.getAction();
                    if (action != null) {
                        int hashCode = action.hashCode();
                        if (hashCode == -1928239649) {
                            if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
                                vr3.a();
                                if (pj3Var.p.G(null, ug3.Q0)) {
                                    vh3 vh3Var = pj3Var.r;
                                    pj3.m(vh3Var);
                                    vh3Var.z.b("App receiver notified triggers are available");
                                    lj3 lj3Var = pj3Var.s;
                                    pj3.m(lj3Var);
                                    lj3Var.F(new r7(24, pj3Var));
                                    break;
                                }
                            }
                        } else if (hashCode == 1279883384 && action.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                            vh3 vh3Var2 = pj3Var.r;
                            pj3.m(vh3Var2);
                            vh3Var2.z.b("[sgtm] App Receiver notified batches are available");
                            lj3 lj3Var2 = pj3Var.s;
                            pj3.m(lj3Var2);
                            lj3Var2.F(new r7(23, this));
                            break;
                        }
                        vh3 vh3Var3 = pj3Var.r;
                        pj3.m(vh3Var3);
                        vh3Var3.u.b("App receiver called with unknown action");
                        break;
                    } else {
                        vh3 vh3Var4 = pj3Var.r;
                        pj3.m(vh3Var4);
                        vh3Var4.u.b("App receiver called with null action");
                        break;
                    }
                } else {
                    vh3 vh3Var5 = pj3Var.r;
                    pj3.m(vh3Var5);
                    vh3Var5.u.b("App receiver called with null intent");
                    break;
                }
                break;
        }
    }

    public nf(b90 b90Var) {
        this.b = b90Var;
    }
}
