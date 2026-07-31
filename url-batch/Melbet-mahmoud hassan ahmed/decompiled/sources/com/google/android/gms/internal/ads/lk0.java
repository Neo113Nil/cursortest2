package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class lk0 extends zd implements nk0 {
    lk0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void D(int i7) {
        Parcel E = E();
        E.writeInt(i7);
        O0(2, E);
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void e() {
        O0(1, E());
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void w(cv cvVar) {
        Parcel E = E();
        be.d(E, cvVar);
        O0(3, E);
    }
}
