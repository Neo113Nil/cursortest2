package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class oy extends zd implements qy {
    oy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // com.google.android.gms.internal.ads.qy
    public final void V2(cv cvVar) {
        Parcel E = E();
        be.d(E, cvVar);
        O0(1, E);
    }
}
