package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class lu1 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ tu1 e;

    public /* synthetic */ lu1(tu1 tu1Var, int i) {
        this.d = i;
        this.e = tu1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
            case 1:
                tu1 tu1Var = this.e;
                synchronized (tu1Var) {
                    if (tu1Var.a == 1) {
                        tu1Var.a("Timed out while binding");
                    }
                }
                return;
            default:
                this.e.a("Service disconnected");
                return;
        }
        while (true) {
            tu1 tu1Var2 = this.e;
            synchronized (tu1Var2) {
                try {
                    if (tu1Var2.a != 2) {
                        return;
                    }
                    if (tu1Var2.d.isEmpty()) {
                        tu1Var2.c();
                        return;
                    }
                    vu1 vu1Var = (vu1) tu1Var2.d.poll();
                    tu1Var2.e.put(vu1Var.a, vu1Var);
                    ((ScheduledExecutorService) tu1Var2.f.c).schedule(new lf(tu1Var2, 14, vu1Var), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(vu1Var)));
                    }
                    xu1 xu1Var = tu1Var2.f;
                    Messenger messenger = tu1Var2.b;
                    int i = vu1Var.c;
                    Context context = (Context) xu1Var.b;
                    Message obtain = Message.obtain();
                    obtain.what = i;
                    obtain.arg1 = vu1Var.a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", vu1Var.a());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", vu1Var.d);
                    obtain.setData(bundle);
                    try {
                        c51 c51Var = tu1Var2.c;
                        Messenger messenger2 = (Messenger) c51Var.e;
                        if (messenger2 != null) {
                            messenger2.send(obtain);
                        } else {
                            wt1 wt1Var = (wt1) c51Var.g;
                            if (wt1Var == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = wt1Var.d;
                            messenger3.getClass();
                            messenger3.send(obtain);
                        }
                    } catch (RemoteException e) {
                        tu1Var2.a(e.getMessage());
                    }
                } finally {
                }
            }
        }
    }
}
