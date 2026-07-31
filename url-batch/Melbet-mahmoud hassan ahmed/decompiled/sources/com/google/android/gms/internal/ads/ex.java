package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class ex extends zd implements gx {
    ex(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.gx
    public final void Y1(kv kvVar) {
        Parcel E = E();
        be.d(E, kvVar);
        O0(1, E);
    }
}
