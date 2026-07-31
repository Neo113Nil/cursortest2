package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class y80 extends zd {
    y80(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void C3(s80 s80Var, x80 x80Var) {
        Parcel E = E();
        be.d(E, s80Var);
        be.f(E, x80Var);
        B3(2, E);
    }
}
