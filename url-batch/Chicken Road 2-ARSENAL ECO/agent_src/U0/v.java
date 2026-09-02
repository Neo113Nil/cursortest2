package U0;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* loaded from: classes.dex */
public final class v extends e1.a {

    /* renamed from: d, reason: collision with root package name */
    public com.google.android.gms.common.internal.a f2584d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2585e;

    public v(com.google.android.gms.common.internal.a aVar, int i7) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.f2584d = aVar;
        this.f2585e = i7;
    }

    @Override // e1.a
    public final boolean b(int i7, Parcel parcel, Parcel parcel2) {
        if (i7 == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) e1.b.a(parcel, Bundle.CREATOR);
            e1.b.b(parcel);
            t.g(this.f2584d, "onPostInitComplete can be called only once per call to getRemoteService");
            com.google.android.gms.common.internal.a aVar = this.f2584d;
            int i8 = this.f2585e;
            aVar.getClass();
            x xVar = new x(aVar, readInt, readStrongBinder, bundle);
            u uVar = aVar.f3875j;
            uVar.sendMessage(uVar.obtainMessage(1, i8, -1, xVar));
            this.f2584d = null;
        } else if (i7 == 2) {
            parcel.readInt();
            e1.b.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i7 != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            z zVar = (z) e1.b.a(parcel, z.CREATOR);
            e1.b.b(parcel);
            com.google.android.gms.common.internal.a aVar2 = this.f2584d;
            t.g(aVar2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            t.f(zVar);
            aVar2.f3890z = zVar;
            Bundle bundle2 = zVar.f2591f;
            t.g(this.f2584d, "onPostInitComplete can be called only once per call to getRemoteService");
            com.google.android.gms.common.internal.a aVar3 = this.f2584d;
            int i9 = this.f2585e;
            aVar3.getClass();
            x xVar2 = new x(aVar3, readInt2, readStrongBinder2, bundle2);
            u uVar2 = aVar3.f3875j;
            uVar2.sendMessage(uVar2.obtainMessage(1, i9, -1, xVar2));
            this.f2584d = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
