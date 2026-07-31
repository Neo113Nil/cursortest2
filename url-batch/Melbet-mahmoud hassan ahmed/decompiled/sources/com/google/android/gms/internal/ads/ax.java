package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class ax extends zd implements dx {
    ax(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.dx
    public final void c() {
        O0(1, E());
    }

    @Override // com.google.android.gms.internal.ads.dx
    public final void o0(cv cvVar) {
        Parcel E = E();
        be.d(E, cvVar);
        O0(2, E);
    }
}
