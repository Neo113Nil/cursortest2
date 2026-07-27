package H1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* loaded from: classes.dex */
public final class q extends P1.a {

    /* renamed from: b, reason: collision with root package name */
    public com.google.android.gms.common.internal.a f3288b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3289c;

    public q(com.google.android.gms.common.internal.a aVar, int i2) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.f3288b = aVar;
        this.f3289c = i2;
    }

    @Override // P1.a
    public final boolean d(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) Q1.a.a(parcel, Bundle.CREATOR);
            Q1.a.b(parcel);
            o.e(this.f3288b, "onPostInitComplete can be called only once per call to getRemoteService");
            com.google.android.gms.common.internal.a aVar = this.f3288b;
            aVar.getClass();
            s sVar = new s(aVar, readInt, readStrongBinder, bundle);
            p pVar = aVar.f6038e;
            pVar.sendMessage(pVar.obtainMessage(1, this.f3289c, -1, sVar));
            this.f3288b = null;
        } else if (i2 == 2) {
            parcel.readInt();
            Q1.a.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i2 != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            u uVar = (u) Q1.a.a(parcel, u.CREATOR);
            Q1.a.b(parcel);
            com.google.android.gms.common.internal.a aVar2 = this.f3288b;
            o.e(aVar2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            o.d(uVar);
            aVar2.f6054u = uVar;
            Bundle bundle2 = uVar.f3295d;
            o.e(this.f3288b, "onPostInitComplete can be called only once per call to getRemoteService");
            com.google.android.gms.common.internal.a aVar3 = this.f3288b;
            aVar3.getClass();
            s sVar2 = new s(aVar3, readInt2, readStrongBinder2, bundle2);
            p pVar2 = aVar3.f6038e;
            pVar2.sendMessage(pVar2.obtainMessage(1, this.f3289c, -1, sVar2));
            this.f3288b = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
