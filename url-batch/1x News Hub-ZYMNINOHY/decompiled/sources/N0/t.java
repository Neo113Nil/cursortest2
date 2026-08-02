package N0;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* loaded from: classes.dex */
public final class t extends X0.a {

    /* renamed from: c, reason: collision with root package name */
    public com.google.android.gms.common.internal.a f1059c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1060d;

    public t(com.google.android.gms.common.internal.a aVar, int i3) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 0);
        this.f1059c = aVar;
        this.f1060d = i3;
    }

    @Override // X0.a
    public final boolean d(int i3, Parcel parcel, Parcel parcel2) {
        if (i3 == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) X0.b.a(parcel, Bundle.CREATOR);
            X0.b.b(parcel);
            r.d(this.f1059c, "onPostInitComplete can be called only once per call to getRemoteService");
            com.google.android.gms.common.internal.a aVar = this.f1059c;
            aVar.getClass();
            v vVar = new v(aVar, readInt, readStrongBinder, bundle);
            s sVar = aVar.f2686e;
            sVar.sendMessage(sVar.obtainMessage(1, this.f1060d, -1, vVar));
            this.f1059c = null;
        } else if (i3 == 2) {
            parcel.readInt();
            X0.b.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i3 != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            x xVar = (x) X0.b.a(parcel, x.CREATOR);
            X0.b.b(parcel);
            com.google.android.gms.common.internal.a aVar2 = this.f1059c;
            r.d(aVar2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            r.c(xVar);
            aVar2.f2700u = xVar;
            if (aVar2.u()) {
                C0064c c0064c = xVar.f1069d;
                g b3 = g.b();
                h hVar = c0064c == null ? null : c0064c.f997a;
                synchronized (b3) {
                    if (hVar == null) {
                        hVar = g.f1025c;
                    } else {
                        h hVar2 = (h) b3.f1026a;
                        if (hVar2 != null) {
                            if (hVar2.f1027a < hVar.f1027a) {
                            }
                        }
                    }
                    b3.f1026a = hVar;
                }
            }
            Bundle bundle2 = xVar.f1066a;
            r.d(this.f1059c, "onPostInitComplete can be called only once per call to getRemoteService");
            com.google.android.gms.common.internal.a aVar3 = this.f1059c;
            aVar3.getClass();
            v vVar2 = new v(aVar3, readInt2, readStrongBinder2, bundle2);
            s sVar2 = aVar3.f2686e;
            sVar2.sendMessage(sVar2.obtainMessage(1, this.f1060d, -1, vVar2));
            this.f1059c = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
