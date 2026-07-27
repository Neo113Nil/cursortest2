package H1;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class r implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final int f3290a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f3291b;

    public r(com.google.android.gms.common.internal.a aVar, int i2) {
        this.f3291b = aVar;
        this.f3290a = i2;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i2;
        int i4;
        com.google.android.gms.common.internal.a aVar = this.f3291b;
        if (iBinder == null) {
            synchronized (aVar.f6039f) {
                i2 = aVar.f6046m;
            }
            if (i2 == 3) {
                aVar.f6053t = true;
                i4 = 5;
            } else {
                i4 = 4;
            }
            p pVar = aVar.f6038e;
            pVar.sendMessage(pVar.obtainMessage(i4, aVar.f6055v.get(), 16));
            return;
        }
        synchronized (aVar.f6040g) {
            try {
                com.google.android.gms.common.internal.a aVar2 = this.f3291b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                aVar2.f6041h = (queryLocalInterface == null || !(queryLocalInterface instanceof n)) ? new n(iBinder) : (n) queryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.common.internal.a aVar3 = this.f3291b;
        int i5 = this.f3290a;
        aVar3.getClass();
        t tVar = new t(aVar3, 0);
        p pVar2 = aVar3.f6038e;
        pVar2.sendMessage(pVar2.obtainMessage(7, i5, -1, tVar));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.common.internal.a aVar;
        synchronized (this.f3291b.f6040g) {
            aVar = this.f3291b;
            aVar.f6041h = null;
        }
        int i2 = this.f3290a;
        p pVar = aVar.f6038e;
        pVar.sendMessage(pVar.obtainMessage(6, i2, 1));
    }
}
