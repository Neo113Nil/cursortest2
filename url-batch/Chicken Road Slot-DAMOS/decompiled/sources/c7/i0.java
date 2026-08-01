package c7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i0 extends x {
    public final IBinder g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f f1925h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(f fVar, int i3, IBinder iBinder, Bundle bundle) {
        super(fVar, i3, bundle);
        this.f1925h = fVar;
        this.g = iBinder;
    }

    @Override // c7.x
    public final boolean a() {
        IBinder iBinder = this.g;
        try {
            c0.g(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            f fVar = this.f1925h;
            if (!fVar.n().equals(interfaceDescriptor)) {
                String n10 = fVar.n();
                StringBuilder sb2 = new StringBuilder(n10.length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb2.append("service descriptor mismatch: ");
                sb2.append(n10);
                sb2.append(" vs. ");
                sb2.append(interfaceDescriptor);
                Log.w("GmsClient", sb2.toString());
                return false;
            }
            IInterface c10 = fVar.c(iBinder);
            if (c10 == null || !(fVar.t(2, 4, c10) || fVar.t(3, 4, c10))) {
                return false;
            }
            fVar.f1901z = null;
            b bVar = fVar.f1895t;
            if (bVar == null) {
                return true;
            }
            bVar.a();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // c7.x
    public final void b(z6.b bVar) {
        f fVar = this.f1925h;
        c cVar = fVar.f1896u;
        if (cVar != null) {
            cVar.onConnectionFailed(bVar);
        }
        fVar.f1881d = bVar.f10867e;
        fVar.f1882e = System.currentTimeMillis();
    }
}
