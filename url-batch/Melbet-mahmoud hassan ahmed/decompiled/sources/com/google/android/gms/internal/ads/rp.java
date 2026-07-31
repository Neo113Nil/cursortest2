package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class rp extends zd implements tp {
    rp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.tp
    public final void G5(boolean z6) {
        Parcel E = E();
        be.c(E, z6);
        O0(6, E);
    }

    @Override // com.google.android.gms.internal.ads.tp
    public final void Z1(x3.a aVar, cq cqVar) {
        Parcel E = E();
        be.f(E, aVar);
        be.f(E, cqVar);
        O0(4, E);
    }

    @Override // com.google.android.gms.internal.ads.tp
    public final zy d() {
        Parcel q02 = q0(5, E());
        zy s62 = yy.s6(q02.readStrongBinder());
        q02.recycle();
        return s62;
    }

    @Override // com.google.android.gms.internal.ads.tp
    public final void h3(wy wyVar) {
        Parcel E = E();
        be.f(E, wyVar);
        O0(7, E);
    }
}
