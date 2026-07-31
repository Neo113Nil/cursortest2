package U0;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class w implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final int f2586a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f2587b;

    public w(com.google.android.gms.common.internal.a aVar, int i7) {
        this.f2587b = aVar;
        this.f2586a = i7;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i7;
        int i8;
        com.google.android.gms.common.internal.a aVar = this.f2587b;
        if (iBinder == null) {
            synchronized (aVar.f3876k) {
                i7 = aVar.f3883r;
            }
            if (i7 == 3) {
                aVar.y = true;
                i8 = 5;
            } else {
                i8 = 4;
            }
            u uVar = aVar.f3875j;
            uVar.sendMessage(uVar.obtainMessage(i8, aVar.f3864A.get(), 16));
            return;
        }
        synchronized (aVar.f3877l) {
            try {
                com.google.android.gms.common.internal.a aVar2 = this.f2587b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                aVar2.f3878m = (queryLocalInterface == null || !(queryLocalInterface instanceof s)) ? new s(iBinder) : (s) queryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.common.internal.a aVar3 = this.f2587b;
        int i9 = this.f2586a;
        y yVar = new y(aVar3, 0);
        u uVar2 = aVar3.f3875j;
        uVar2.sendMessage(uVar2.obtainMessage(7, i9, -1, yVar));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.common.internal.a aVar;
        synchronized (this.f2587b.f3877l) {
            aVar = this.f2587b;
            aVar.f3878m = null;
        }
        int i7 = this.f2586a;
        u uVar = aVar.f3875j;
        uVar.sendMessage(uVar.obtainMessage(6, i7, 1));
    }
}
