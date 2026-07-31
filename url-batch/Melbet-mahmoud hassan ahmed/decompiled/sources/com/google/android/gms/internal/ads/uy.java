package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class uy extends zd implements wy {
    uy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // com.google.android.gms.internal.ads.wy
    public final void s5(rv rvVar) {
        Parcel E = E();
        be.d(E, rvVar);
        O0(1, E);
    }
}
