package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class oe0 extends zd implements qe0 {
    oe0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.qe0
    public final void w(cv cvVar) {
        Parcel E = E();
        be.d(E, cvVar);
        O0(3, E);
    }
}
