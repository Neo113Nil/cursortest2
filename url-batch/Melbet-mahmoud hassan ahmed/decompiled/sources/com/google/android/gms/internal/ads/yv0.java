package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class yv0 extends zd implements aw0 {
    yv0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.measurement.IMeasurementManager");
    }

    @Override // com.google.android.gms.internal.ads.aw0
    public final void X2(x3.a aVar, xv0 xv0Var) {
        Parcel E = E();
        be.f(E, aVar);
        be.f(E, xv0Var);
        O0(2, E);
    }
}
