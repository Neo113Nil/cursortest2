package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class kk0 extends zd {
    kk0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
    }

    public final IBinder C3(x3.a aVar, String str, dd0 dd0Var, int i7) {
        Parcel E = E();
        be.f(E, aVar);
        E.writeString(str);
        be.f(E, dd0Var);
        E.writeInt(214106000);
        Parcel q02 = q0(1, E);
        IBinder readStrongBinder = q02.readStrongBinder();
        q02.recycle();
        return readStrongBinder;
    }
}
