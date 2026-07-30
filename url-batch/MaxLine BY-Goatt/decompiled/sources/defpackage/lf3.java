package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class lf3 implements ServiceConnection {
    public final int m;
    public final /* synthetic */ ln n;

    public lf3(ln lnVar, int i) {
        this.n = lnVar;
        this.m = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i2;
        ln lnVar = this.n;
        if (iBinder == null) {
            synchronized (lnVar.s) {
                i = lnVar.z;
            }
            if (i == 3) {
                lnVar.G = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            yc3 yc3Var = lnVar.r;
            yc3Var.sendMessage(yc3Var.obtainMessage(i2, lnVar.I.get(), 16));
            return;
        }
        synchronized (lnVar.t) {
            try {
                ln lnVar2 = this.n;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                lnVar2.u = (queryLocalInterface == null || !(queryLocalInterface instanceof mb3)) ? new mb3(iBinder) : (mb3) queryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        ln lnVar3 = this.n;
        int i3 = this.m;
        wg3 wg3Var = new wg3(lnVar3, 0, null);
        yc3 yc3Var2 = lnVar3.r;
        yc3Var2.sendMessage(yc3Var2.obtainMessage(7, i3, -1, wg3Var));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ln lnVar;
        synchronized (this.n.t) {
            lnVar = this.n;
            lnVar.u = null;
        }
        int i = this.m;
        yc3 yc3Var = lnVar.r;
        yc3Var.sendMessage(yc3Var.obtainMessage(6, i, 1));
    }
}
