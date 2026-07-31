package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class vj0 extends zd implements xj0 {
    vj0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.xj0
    public final void G0(x3.a aVar, int i7) {
        Parcel E = E();
        be.f(E, aVar);
        E.writeInt(i7);
        O0(9, E);
    }

    @Override // com.google.android.gms.internal.ads.xj0
    public final void U(x3.a aVar) {
        Parcel E = E();
        be.f(E, aVar);
        O0(1, E);
    }

    @Override // com.google.android.gms.internal.ads.xj0
    public final void Y(x3.a aVar) {
        Parcel E = E();
        be.f(E, aVar);
        O0(3, E);
    }

    @Override // com.google.android.gms.internal.ads.xj0
    public final void d0(x3.a aVar) {
        Parcel E = E();
        be.f(E, aVar);
        O0(4, E);
    }

    @Override // com.google.android.gms.internal.ads.xj0
    public final void f6(x3.a aVar, yj0 yj0Var) {
        Parcel E = E();
        be.f(E, aVar);
        be.d(E, yj0Var);
        O0(7, E);
    }

    @Override // com.google.android.gms.internal.ads.xj0
    public final void n4(x3.a aVar) {
        Parcel E = E();
        be.f(E, aVar);
        O0(11, E);
    }

    @Override // com.google.android.gms.internal.ads.xj0
    public final void p0(x3.a aVar) {
        Parcel E = E();
        be.f(E, aVar);
        O0(6, E);
    }

    @Override // com.google.android.gms.internal.ads.xj0
    public final void u0(x3.a aVar) {
        Parcel E = E();
        be.f(E, aVar);
        O0(5, E);
    }

    @Override // com.google.android.gms.internal.ads.xj0
    public final void zze(x3.a aVar) {
        Parcel E = E();
        be.f(E, aVar);
        O0(8, E);
    }
}
