package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class g50 extends zd implements i50 {
    g50(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.i50
    public final void z2(y40 y40Var) {
        Parcel E = E();
        be.f(E, y40Var);
        O0(1, E);
    }
}
