package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class qj0 extends zd implements sj0 {
    qj0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.sj0
    public final void A(int i7) {
        Parcel E = E();
        E.writeInt(i7);
        O0(7, E);
    }

    @Override // com.google.android.gms.internal.ads.sj0
    public final void Q3(mj0 mj0Var) {
        Parcel E = E();
        be.f(E, mj0Var);
        O0(5, E);
    }

    @Override // com.google.android.gms.internal.ads.sj0
    public final void d() {
        O0(4, E());
    }

    @Override // com.google.android.gms.internal.ads.sj0
    public final void f() {
        O0(6, E());
    }

    @Override // com.google.android.gms.internal.ads.sj0
    public final void h() {
        O0(1, E());
    }

    @Override // com.google.android.gms.internal.ads.sj0
    public final void i() {
        O0(2, E());
    }

    @Override // com.google.android.gms.internal.ads.sj0
    public final void j() {
        O0(8, E());
    }

    @Override // com.google.android.gms.internal.ads.sj0
    public final void k() {
        O0(3, E());
    }
}
