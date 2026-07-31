package r3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import r3.c;

/* loaded from: classes.dex */
public final class t0 extends j0 {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f21328g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ c f21329h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(c cVar, int i7, IBinder iBinder, Bundle bundle) {
        super(cVar, i7, bundle);
        this.f21329h = cVar;
        this.f21328g = iBinder;
    }

    @Override // r3.j0
    protected final boolean f() {
        c.a aVar;
        c.a aVar2;
        try {
            IBinder iBinder = this.f21328g;
            o.i(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f21329h.D().equals(interfaceDescriptor)) {
                String D = this.f21329h.D();
                StringBuilder sb = new StringBuilder(String.valueOf(D).length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb.append("service descriptor mismatch: ");
                sb.append(D);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                Log.e("GmsClient", sb.toString());
                return false;
            }
            IInterface s7 = this.f21329h.s(this.f21328g);
            if (s7 == null || !(c.d0(this.f21329h, 2, 4, s7) || c.d0(this.f21329h, 3, 4, s7))) {
                return false;
            }
            this.f21329h.f21227z = null;
            Bundle w6 = this.f21329h.w();
            aVar = this.f21329h.f21222u;
            if (aVar == null) {
                return true;
            }
            aVar2 = this.f21329h.f21222u;
            aVar2.O0(w6);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // r3.j0
    protected final void g(o3.b bVar) {
        if (this.f21329h.f21223v != null) {
            this.f21329h.f21223v.E(bVar);
        }
        this.f21329h.K(bVar);
    }
}
