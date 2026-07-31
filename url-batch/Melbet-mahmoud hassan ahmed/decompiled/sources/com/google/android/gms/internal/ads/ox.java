package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class ox extends zd {
    ox(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder C3(x3.a aVar, pv pvVar, String str, dd0 dd0Var, int i7, int i8) {
        Parcel E = E();
        be.f(E, aVar);
        be.d(E, pvVar);
        E.writeString(str);
        be.f(E, dd0Var);
        E.writeInt(214106000);
        E.writeInt(i8);
        Parcel q02 = q0(2, E);
        IBinder readStrongBinder = q02.readStrongBinder();
        q02.recycle();
        return readStrongBinder;
    }
}
