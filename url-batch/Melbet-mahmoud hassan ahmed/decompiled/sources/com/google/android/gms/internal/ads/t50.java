package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class t50 extends zd implements v50 {
    t50(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.v50
    public final void h4(nx nxVar, x3.a aVar) {
        Parcel E = E();
        be.f(E, nxVar);
        be.f(E, aVar);
        O0(1, E);
    }
}
