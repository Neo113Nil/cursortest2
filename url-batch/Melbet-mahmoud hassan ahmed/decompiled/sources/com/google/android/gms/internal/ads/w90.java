package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class w90 extends zd implements y90 {
    w90(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.y90
    public final void D(int i7) {
        Parcel E = E();
        E.writeInt(i7);
        O0(2, E);
    }

    @Override // com.google.android.gms.internal.ads.y90
    public final void d() {
        O0(1, E());
    }
}
