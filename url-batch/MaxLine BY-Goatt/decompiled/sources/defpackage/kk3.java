package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class kk3 implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ gq3 n;

    public /* synthetic */ kk3(gq3 gq3Var, int i) {
        this.m = i;
        this.n = gq3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.m) {
            case 0:
                break;
            case 1:
                gq3 gq3Var = this.n;
                synchronized (gq3Var) {
                    if (gq3Var.m == 1) {
                        gq3Var.a("Timed out while binding");
                    }
                }
                return;
            default:
                this.n.a("Service disconnected");
                return;
        }
        while (true) {
            gq3 gq3Var2 = this.n;
            synchronized (gq3Var2) {
                try {
                    if (gq3Var2.m != 2) {
                        return;
                    }
                    if (gq3Var2.p.isEmpty()) {
                        gq3Var2.c();
                        return;
                    }
                    ds3 ds3Var = (ds3) gq3Var2.p.poll();
                    gq3Var2.q.put(ds3Var.a, ds3Var);
                    ((ScheduledExecutorService) gq3Var2.r.c).schedule(new pn3(2, gq3Var2, ds3Var, false), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(ds3Var)));
                    }
                    vs3 vs3Var = gq3Var2.r;
                    Messenger messenger = gq3Var2.n;
                    int i = ds3Var.c;
                    Context context = (Context) vs3Var.b;
                    Message obtain = Message.obtain();
                    obtain.what = i;
                    obtain.arg1 = ds3Var.a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", ds3Var.a());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", ds3Var.d);
                    obtain.setData(bundle);
                    try {
                        tt1 tt1Var = gq3Var2.o;
                        Messenger messenger2 = (Messenger) tt1Var.n;
                        if (messenger2 != null) {
                            messenger2.send(obtain);
                        } else {
                            ue3 ue3Var = (ue3) tt1Var.o;
                            if (ue3Var == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = ue3Var.m;
                            messenger3.getClass();
                            messenger3.send(obtain);
                        }
                    } catch (RemoteException e) {
                        gq3Var2.a(e.getMessage());
                    }
                } finally {
                }
            }
        }
    }
}
