package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class og0 extends zd implements qg0 {
    og0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // com.google.android.gms.internal.ads.qg0
    public final ng0 A0(x3.a aVar, dd0 dd0Var, int i7) {
        ng0 lg0Var;
        Parcel E = E();
        be.f(E, aVar);
        be.f(E, dd0Var);
        E.writeInt(214106000);
        Parcel q02 = q0(1, E);
        IBinder readStrongBinder = q02.readStrongBinder();
        if (readStrongBinder == null) {
            lg0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            lg0Var = queryLocalInterface instanceof ng0 ? (ng0) queryLocalInterface : new lg0(readStrongBinder);
        }
        q02.recycle();
        return lg0Var;
    }
}
