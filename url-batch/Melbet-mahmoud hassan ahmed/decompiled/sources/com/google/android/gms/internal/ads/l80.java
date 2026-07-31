package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class l80 extends zd implements n80 {
    l80(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    @Override // com.google.android.gms.internal.ads.n80
    public final void s(String str) {
        Parcel E = E();
        E.writeString(str);
        O0(1, E);
    }
}
