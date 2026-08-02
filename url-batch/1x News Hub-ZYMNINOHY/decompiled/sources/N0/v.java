package N0;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes.dex */
public final class v extends o {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f1063g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f1064h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.google.android.gms.common.internal.a aVar, int i3, IBinder iBinder, Bundle bundle) {
        super(aVar, i3, bundle);
        this.f1064h = aVar;
        this.f1063g = iBinder;
    }

    @Override // N0.o
    public final void a(K0.b bVar) {
        g gVar = this.f1064h.o;
        if (gVar != null) {
            ((L0.h) gVar.f1026a).c(bVar);
        }
        System.currentTimeMillis();
    }

    @Override // N0.o
    public final boolean b() {
        IBinder iBinder = this.f1063g;
        try {
            r.c(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            com.google.android.gms.common.internal.a aVar = this.f1064h;
            if (!aVar.r().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + aVar.r() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface n3 = aVar.n(iBinder);
            if (n3 == null || !(com.google.android.gms.common.internal.a.v(aVar, 2, 4, n3) || com.google.android.gms.common.internal.a.v(aVar, 3, 4, n3))) {
                return false;
            }
            aVar.f2698s = null;
            g gVar = aVar.f2694n;
            if (gVar == null) {
                return true;
            }
            ((L0.g) gVar.f1026a).b();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
