package o1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* loaded from: classes.dex */
public final class w extends A1.a {

    /* renamed from: e, reason: collision with root package name */
    public com.google.android.gms.common.internal.a f11605e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11606f;

    public w(com.google.android.gms.common.internal.a aVar, int i2) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 0);
        this.f11605e = aVar;
        this.f11606f = i2;
    }

    @Override // A1.a
    public final boolean b(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) A1.b.a(parcel, Bundle.CREATOR);
            A1.b.b(parcel);
            u.h(this.f11605e, "onPostInitComplete can be called only once per call to getRemoteService");
            com.google.android.gms.common.internal.a aVar = this.f11605e;
            aVar.getClass();
            y yVar = new y(aVar, readInt, readStrongBinder, bundle);
            v vVar = aVar.f5002j;
            vVar.sendMessage(vVar.obtainMessage(1, this.f11606f, -1, yVar));
            this.f11605e = null;
        } else if (i2 == 2) {
            parcel.readInt();
            A1.b.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i2 != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            C1356A c1356a = (C1356A) A1.b.a(parcel, C1356A.CREATOR);
            A1.b.b(parcel);
            com.google.android.gms.common.internal.a aVar2 = this.f11605e;
            u.h(aVar2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            u.g(c1356a);
            aVar2.z = c1356a;
            if (aVar2.x()) {
                C1367e c1367e = c1356a.f11501d;
                C1371i a6 = C1371i.a();
                C1372j c1372j = c1367e == null ? null : c1367e.f11529a;
                synchronized (a6) {
                    if (c1372j == null) {
                        c1372j = C1371i.f11561c;
                    } else {
                        C1372j c1372j2 = (C1372j) a6.f11562a;
                        if (c1372j2 != null) {
                            if (c1372j2.f11563a < c1372j.f11563a) {
                            }
                        }
                    }
                    a6.f11562a = c1372j;
                }
            }
            Bundle bundle2 = c1356a.f11498a;
            u.h(this.f11605e, "onPostInitComplete can be called only once per call to getRemoteService");
            com.google.android.gms.common.internal.a aVar3 = this.f11605e;
            aVar3.getClass();
            y yVar2 = new y(aVar3, readInt2, readStrongBinder2, bundle2);
            v vVar2 = aVar3.f5002j;
            vVar2.sendMessage(vVar2.obtainMessage(1, this.f11606f, -1, yVar2));
            this.f11605e = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
