package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class g20 extends zd implements i20 {
    g20(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.i20
    public final void W1(f20 f20Var) {
        Parcel E = E();
        be.f(E, f20Var);
        O0(1, E);
    }
}
