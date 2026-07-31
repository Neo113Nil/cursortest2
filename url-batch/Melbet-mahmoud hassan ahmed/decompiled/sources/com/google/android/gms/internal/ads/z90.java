package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class z90 extends zd implements ba0 {
    z90(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.ba0
    public final void D(int i7) {
        Parcel E = E();
        E.writeInt(i7);
        O0(2, E);
    }

    @Override // com.google.android.gms.internal.ads.ba0
    public final void v1(v90 v90Var) {
        Parcel E = E();
        be.f(E, v90Var);
        O0(1, E);
    }

    @Override // com.google.android.gms.internal.ads.ba0
    public final void w(cv cvVar) {
        Parcel E = E();
        be.d(E, cvVar);
        O0(3, E);
    }
}
