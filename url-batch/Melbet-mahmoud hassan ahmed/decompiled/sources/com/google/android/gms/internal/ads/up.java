package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class up extends zd implements wp {
    up(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final void F(int i7) {
        Parcel E = E();
        E.writeInt(i7);
        O0(2, E);
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final void Q1(tp tpVar) {
        Parcel E = E();
        be.f(E, tpVar);
        O0(1, E);
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final void q6(cv cvVar) {
        Parcel E = E();
        be.d(E, cvVar);
        O0(3, E);
    }
}
