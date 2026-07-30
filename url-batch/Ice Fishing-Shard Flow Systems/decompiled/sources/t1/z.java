package t1;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class z implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final int f8009a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f8010b;

    public z(com.google.android.gms.common.internal.a aVar, int i2) {
        this.f8010b = aVar;
        this.f8009a = i2;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i2;
        int i5;
        com.google.android.gms.common.internal.a aVar = this.f8010b;
        if (iBinder == null) {
            synchronized (aVar.f4386k) {
                i2 = aVar.f4393r;
            }
            if (i2 == 3) {
                aVar.f4401z = true;
                i5 = 5;
            } else {
                i5 = 4;
            }
            x xVar = aVar.j;
            xVar.sendMessage(xVar.obtainMessage(i5, aVar.f4375B.get(), 16));
            return;
        }
        synchronized (aVar.f4387l) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                aVar.f4388m = (queryLocalInterface == null || !(queryLocalInterface instanceof t)) ? new t(iBinder) : (t) queryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.common.internal.a aVar2 = this.f8010b;
        int i7 = this.f8009a;
        aVar2.getClass();
        C0905B c0905b = new C0905B(aVar2, 0, null);
        x xVar2 = aVar2.j;
        xVar2.sendMessage(xVar2.obtainMessage(7, i7, -1, c0905b));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.common.internal.a aVar = this.f8010b;
        synchronized (aVar.f4387l) {
            aVar.f4388m = null;
        }
        com.google.android.gms.common.internal.a aVar2 = this.f8010b;
        int i2 = this.f8009a;
        x xVar = aVar2.j;
        xVar.sendMessage(xVar.obtainMessage(6, i2, 1));
    }
}
