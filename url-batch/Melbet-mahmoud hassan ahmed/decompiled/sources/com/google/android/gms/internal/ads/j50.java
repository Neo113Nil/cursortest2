package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class j50 extends zd implements l50 {
    j50(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.l50
    public final void d5(a50 a50Var) {
        Parcel E = E();
        be.f(E, a50Var);
        O0(1, E);
    }
}
