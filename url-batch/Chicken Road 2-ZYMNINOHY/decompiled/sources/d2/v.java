package d2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class v implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final int f8304a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f8305b;

    public v(com.google.android.gms.common.internal.a aVar, int i4) {
        this.f8305b = aVar;
        this.f8304a = i4;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i4;
        int i5;
        com.google.android.gms.common.internal.a aVar = this.f8305b;
        if (iBinder == null) {
            synchronized (aVar.f5783f) {
                i4 = aVar.f5790m;
            }
            if (i4 == 3) {
                aVar.f5795t = true;
                i5 = 5;
            } else {
                i5 = 4;
            }
            t tVar = aVar.f5782e;
            tVar.sendMessage(tVar.obtainMessage(i5, aVar.v.get(), 16));
            return;
        }
        synchronized (aVar.f5784g) {
            try {
                com.google.android.gms.common.internal.a aVar2 = this.f8305b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                aVar2.f5785h = (queryLocalInterface == null || !(queryLocalInterface instanceof r)) ? new r(iBinder) : (r) queryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.common.internal.a aVar3 = this.f8305b;
        int i6 = this.f8304a;
        x xVar = new x(aVar3, 0);
        t tVar2 = aVar3.f5782e;
        tVar2.sendMessage(tVar2.obtainMessage(7, i6, -1, xVar));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.common.internal.a aVar;
        synchronized (this.f8305b.f5784g) {
            aVar = this.f8305b;
            aVar.f5785h = null;
        }
        int i4 = this.f8304a;
        t tVar = aVar.f5782e;
        tVar.sendMessage(tVar.obtainMessage(6, i4, 1));
    }
}
