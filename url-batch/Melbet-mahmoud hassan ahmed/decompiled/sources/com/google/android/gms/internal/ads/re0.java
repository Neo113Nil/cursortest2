package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class re0 extends zd implements te0 {
    re0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    @Override // com.google.android.gms.internal.ads.te0
    public final void w(cv cvVar) {
        Parcel E = E();
        be.d(E, cvVar);
        O0(4, E);
    }
}
