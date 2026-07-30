package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.a;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class bu1 implements ServiceConnection {
    public final int a;
    public final /* synthetic */ a b;

    public bu1(a aVar, int i) {
        this.b = aVar;
        this.a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i2;
        a aVar = this.b;
        if (iBinder == null) {
            synchronized (aVar.f) {
                i = aVar.m;
            }
            if (i == 3) {
                aVar.t = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            pt1 pt1Var = aVar.e;
            pt1Var.sendMessage(pt1Var.obtainMessage(i2, aVar.v.get(), 16));
            return;
        }
        synchronized (aVar.g) {
            try {
                a aVar2 = this.b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                aVar2.h = (queryLocalInterface == null || !(queryLocalInterface instanceof lt1)) ? new lt1(iBinder) : (lt1) queryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        a aVar3 = this.b;
        int i3 = this.a;
        hu1 hu1Var = new hu1(aVar3, 0);
        pt1 pt1Var2 = aVar3.e;
        pt1Var2.sendMessage(pt1Var2.obtainMessage(7, i3, -1, hu1Var));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        a aVar;
        synchronized (this.b.g) {
            aVar = this.b;
            aVar.h = null;
        }
        int i = this.a;
        pt1 pt1Var = aVar.e;
        pt1Var.sendMessage(pt1Var.obtainMessage(6, i, 1));
    }
}
