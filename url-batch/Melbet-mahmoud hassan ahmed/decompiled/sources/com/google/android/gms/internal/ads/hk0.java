package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class hk0 extends zd implements jk0 {
    hk0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.jk0
    public final void G2(cv cvVar) {
        Parcel E = E();
        be.d(E, cvVar);
        O0(5, E);
    }

    @Override // com.google.android.gms.internal.ads.jk0
    public final void I2(ck0 ck0Var) {
        Parcel E = E();
        be.f(E, ck0Var);
        O0(3, E);
    }

    @Override // com.google.android.gms.internal.ads.jk0
    public final void O(int i7) {
        Parcel E = E();
        E.writeInt(i7);
        O0(4, E);
    }

    @Override // com.google.android.gms.internal.ads.jk0
    public final void b() {
        O0(7, E());
    }

    @Override // com.google.android.gms.internal.ads.jk0
    public final void d() {
        O0(6, E());
    }

    @Override // com.google.android.gms.internal.ads.jk0
    public final void e() {
        O0(2, E());
    }

    @Override // com.google.android.gms.internal.ads.jk0
    public final void i() {
        O0(1, E());
    }
}
