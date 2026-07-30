package t1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: t1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0904A extends s {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f7894g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f7895h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0904A(com.google.android.gms.common.internal.a aVar, int i2, IBinder iBinder, Bundle bundle) {
        super(aVar, i2, bundle);
        this.f7895h = aVar;
        this.f7894g = iBinder;
    }

    @Override // t1.s
    public final boolean a() {
        IBinder iBinder = this.f7894g;
        try {
            u.f(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            com.google.android.gms.common.internal.a aVar = this.f7895h;
            if (!aVar.j().equals(interfaceDescriptor)) {
                String j = aVar.j();
                StringBuilder sb = new StringBuilder(j.length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb.append("service descriptor mismatch: ");
                sb.append(j);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                Log.w("GmsClient", sb.toString());
                return false;
            }
            IInterface c7 = aVar.c(iBinder);
            if (c7 == null || !(aVar.o(2, 4, c7) || aVar.o(3, 4, c7))) {
                return false;
            }
            aVar.f4400y = null;
            C0921h c0921h = aVar.f4394s;
            if (c0921h == null) {
                return true;
            }
            ((r1.k) c0921h.f7958a).onConnected(null);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // t1.s
    public final void b(q1.b bVar) {
        com.google.android.gms.common.internal.a aVar = this.f7895h;
        C0921h c0921h = aVar.f4395t;
        if (c0921h != null) {
            ((r1.l) c0921h.f7958a).onConnectionFailed(bVar);
        }
        aVar.f4380d = bVar.f7311e;
        aVar.f4381e = System.currentTimeMillis();
    }
}
