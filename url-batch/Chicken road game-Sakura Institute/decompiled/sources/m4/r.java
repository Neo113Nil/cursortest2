package m4;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class r implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final int f6392a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f6393b;

    public r(com.google.android.gms.common.internal.a aVar, int i7) {
        this.f6393b = aVar;
        this.f6392a = i7;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i7;
        int i8;
        com.google.android.gms.common.internal.a aVar = this.f6393b;
        if (iBinder == null) {
            synchronized (aVar.f1784f) {
                i7 = aVar.f1791m;
            }
            if (i7 == 3) {
                aVar.f1798t = true;
                i8 = 5;
            } else {
                i8 = 4;
            }
            p pVar = aVar.f1783e;
            pVar.sendMessage(pVar.obtainMessage(i8, aVar.f1800v.get(), 16));
            return;
        }
        synchronized (aVar.f1785g) {
            try {
                com.google.android.gms.common.internal.a aVar2 = this.f6393b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                aVar2.f1786h = (queryLocalInterface == null || !(queryLocalInterface instanceof n)) ? new n(iBinder) : (n) queryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.common.internal.a aVar3 = this.f6393b;
        int i9 = this.f6392a;
        t tVar = new t(aVar3, 0);
        p pVar2 = aVar3.f1783e;
        pVar2.sendMessage(pVar2.obtainMessage(7, i9, -1, tVar));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.common.internal.a aVar;
        synchronized (this.f6393b.f1785g) {
            aVar = this.f6393b;
            aVar.f1786h = null;
        }
        int i7 = this.f6392a;
        p pVar = aVar.f1783e;
        pVar.sendMessage(pVar.obtainMessage(6, i7, 1));
    }
}
