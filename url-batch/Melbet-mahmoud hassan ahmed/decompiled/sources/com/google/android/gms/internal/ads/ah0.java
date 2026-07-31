package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class ah0 extends zd implements ch0 {
    ah0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
    }

    @Override // com.google.android.gms.internal.ads.ch0
    public final IBinder zze(x3.a aVar) {
        Parcel E = E();
        be.f(E, aVar);
        Parcel q02 = q0(1, E);
        IBinder readStrongBinder = q02.readStrongBinder();
        q02.recycle();
        return readStrongBinder;
    }
}
