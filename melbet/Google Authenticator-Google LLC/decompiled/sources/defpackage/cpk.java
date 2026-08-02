package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cpk implements ServiceConnection {
    final /* synthetic */ cpo a;
    private final int b;

    public cpk(cpo cpoVar, int i) {
        this.a = cpoVar;
        this.b = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i2;
        cpo cpoVar = this.a;
        if (iBinder != null) {
            synchronized (cpoVar.e) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                cpoVar.q = (queryLocalInterface == null || !(queryLocalInterface instanceof cqu)) ? new cqu(iBinder) : (cqu) queryLocalInterface;
            }
            this.a.A(0, null, this.b);
            return;
        }
        synchronized (cpoVar.d) {
            i = cpoVar.h;
        }
        if (i == 3) {
            cpoVar.m = true;
            i2 = 5;
        } else {
            i2 = 4;
        }
        Handler handler = cpoVar.c;
        handler.sendMessage(handler.obtainMessage(i2, cpoVar.o.get(), 16));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        cpo cpoVar = this.a;
        synchronized (cpoVar.e) {
            cpoVar.q = null;
        }
        cpo cpoVar2 = this.a;
        int i = this.b;
        Handler handler = cpoVar2.c;
        handler.sendMessage(handler.obtainMessage(6, i, 1));
    }
}
