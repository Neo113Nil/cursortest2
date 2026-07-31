package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class gy extends zd {
    gy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
    }

    public final IBinder C3(x3.a aVar, int i7) {
        Parcel E = E();
        be.f(E, aVar);
        E.writeInt(214106000);
        Parcel q02 = q0(1, E);
        IBinder readStrongBinder = q02.readStrongBinder();
        q02.recycle();
        return readStrongBinder;
    }
}
