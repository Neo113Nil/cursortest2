package m4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class s extends l {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f6394g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f6395h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.google.android.gms.common.internal.a aVar, int i7, IBinder iBinder, Bundle bundle) {
        super(aVar, i7, bundle);
        this.f6395h = aVar;
        this.f6394g = iBinder;
    }

    @Override // m4.l
    public final void a(j4.b bVar) {
        l1.x xVar = this.f6395h.f1793o;
        if (xVar != null) {
            ((k4.d) xVar.f5847g).b(bVar);
        }
        System.currentTimeMillis();
    }

    @Override // m4.l
    public final boolean b() {
        IBinder iBinder = this.f6394g;
        try {
            o.d(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            com.google.android.gms.common.internal.a aVar = this.f6395h;
            if (!aVar.r().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + aVar.r() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface o2 = aVar.o(iBinder);
            if (o2 == null || !(com.google.android.gms.common.internal.a.u(aVar, 2, 4, o2) || com.google.android.gms.common.internal.a.u(aVar, 3, 4, o2))) {
                return false;
            }
            aVar.f1797s = null;
            l1.x xVar = aVar.f1792n;
            if (xVar == null) {
                return true;
            }
            ((k4.c) xVar.f5847g).d();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
