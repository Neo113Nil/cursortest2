package H1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import w2.C1294c;

/* loaded from: classes.dex */
public final class s extends l {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f3292g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f3293h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.google.android.gms.common.internal.a aVar, int i2, IBinder iBinder, Bundle bundle) {
        super(aVar, i2, bundle);
        this.f3293h = aVar;
        this.f3292g = iBinder;
    }

    @Override // H1.l
    public final void a(E1.b bVar) {
        C1294c c1294c = this.f3293h.f6048o;
        if (c1294c != null) {
            ((F1.d) c1294c.f11388d).c(bVar);
        }
        System.currentTimeMillis();
    }

    @Override // H1.l
    public final boolean b() {
        IBinder iBinder = this.f3292g;
        try {
            o.d(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            com.google.android.gms.common.internal.a aVar = this.f3293h;
            if (!aVar.r().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + aVar.r() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface o4 = aVar.o(iBinder);
            if (o4 == null || !(com.google.android.gms.common.internal.a.u(aVar, 2, 4, o4) || com.google.android.gms.common.internal.a.u(aVar, 3, 4, o4))) {
                return false;
            }
            aVar.f6052s = null;
            C1294c c1294c = aVar.f6047n;
            if (c1294c == null) {
                return true;
            }
            ((F1.c) c1294c.f11388d).b();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
