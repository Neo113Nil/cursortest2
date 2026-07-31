package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
public final class pi0 extends zd implements ri0 {
    pi0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.ri0
    public final void U0(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel E = E();
        be.d(E, parcelFileDescriptor);
        O0(1, E);
    }

    @Override // com.google.android.gms.internal.ads.ri0
    public final void z1(a3.f0 f0Var) {
        Parcel E = E();
        be.d(E, f0Var);
        O0(2, E);
    }
}
