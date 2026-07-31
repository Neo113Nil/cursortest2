package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class w50 extends zd implements y50 {
    w50(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.y50
    public final void y1(h60 h60Var) {
        Parcel E = E();
        be.f(E, h60Var);
        O0(1, E);
    }
}
