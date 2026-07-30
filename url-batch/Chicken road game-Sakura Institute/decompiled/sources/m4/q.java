package m4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class q extends u4.a {

    /* renamed from: d, reason: collision with root package name */
    public com.google.android.gms.common.internal.a f6390d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6391e;

    public q(com.google.android.gms.common.internal.a aVar, int i7) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.f6390d = aVar;
        this.f6391e = i7;
    }

    @Override // u4.a
    public final boolean e(int i7, Parcel parcel, Parcel parcel2) {
        if (i7 == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) v4.a.a(parcel, Bundle.CREATOR);
            v4.a.b(parcel);
            o.e(this.f6390d, "onPostInitComplete can be called only once per call to getRemoteService");
            com.google.android.gms.common.internal.a aVar = this.f6390d;
            int i8 = this.f6391e;
            aVar.getClass();
            s sVar = new s(aVar, readInt, readStrongBinder, bundle);
            p pVar = aVar.f1783e;
            pVar.sendMessage(pVar.obtainMessage(1, i8, -1, sVar));
            this.f6390d = null;
        } else if (i7 == 2) {
            parcel.readInt();
            v4.a.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i7 != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            u uVar = (u) v4.a.a(parcel, u.CREATOR);
            v4.a.b(parcel);
            com.google.android.gms.common.internal.a aVar2 = this.f6390d;
            o.e(aVar2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            o.d(uVar);
            aVar2.f1799u = uVar;
            Bundle bundle2 = uVar.f6397f;
            o.e(this.f6390d, "onPostInitComplete can be called only once per call to getRemoteService");
            com.google.android.gms.common.internal.a aVar3 = this.f6390d;
            int i9 = this.f6391e;
            aVar3.getClass();
            s sVar2 = new s(aVar3, readInt2, readStrongBinder2, bundle2);
            p pVar2 = aVar3.f1783e;
            pVar2.sendMessage(pVar2.obtainMessage(1, i9, -1, sVar2));
            this.f6390d = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
