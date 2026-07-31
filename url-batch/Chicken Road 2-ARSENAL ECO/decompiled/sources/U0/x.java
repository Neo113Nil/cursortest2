package U0;

import D3.M;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes.dex */
public final class x extends q {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f2588g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f2589h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.google.android.gms.common.internal.a aVar, int i7, IBinder iBinder, Bundle bundle) {
        super(aVar, i7, bundle);
        this.f2589h = aVar;
        this.f2588g = iBinder;
    }

    @Override // U0.q
    public final void a(R0.a aVar) {
        com.google.android.gms.common.internal.a aVar2 = this.f2589h;
        M m4 = aVar2.f3885t;
        if (m4 != null) {
            ((S0.f) m4.f401g).onConnectionFailed(aVar);
        }
        aVar2.f3869d = aVar.f2053g;
        aVar2.f3870e = System.currentTimeMillis();
    }

    @Override // U0.q
    public final boolean b() {
        IBinder iBinder = this.f2588g;
        try {
            t.f(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            com.google.android.gms.common.internal.a aVar = this.f2589h;
            if (!aVar.s().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + aVar.s() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface o7 = aVar.o(iBinder);
            if (o7 == null || !(com.google.android.gms.common.internal.a.v(aVar, 2, 4, o7) || com.google.android.gms.common.internal.a.v(aVar, 3, 4, o7))) {
                return false;
            }
            aVar.f3889x = null;
            J1.c cVar = aVar.f3884s;
            if (cVar == null) {
                return true;
            }
            ((S0.e) cVar.f1289g).onConnected(null);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
