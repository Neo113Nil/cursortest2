package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class dk0 extends zd implements fk0 {
    dk0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.fk0
    public final void G4(kv kvVar, nk0 nk0Var) {
        Parcel E = E();
        be.d(E, kvVar);
        be.f(E, nk0Var);
        O0(14, E);
    }

    @Override // com.google.android.gms.internal.ads.fk0
    public final void O5(wy wyVar) {
        Parcel E = E();
        be.f(E, wyVar);
        O0(13, E);
    }

    @Override // com.google.android.gms.internal.ads.fk0
    public final void X1(uk0 uk0Var) {
        Parcel E = E();
        be.d(E, uk0Var);
        O0(7, E);
    }

    @Override // com.google.android.gms.internal.ads.fk0
    public final void X3(ty tyVar) {
        Parcel E = E();
        be.f(E, tyVar);
        O0(8, E);
    }

    @Override // com.google.android.gms.internal.ads.fk0
    public final void a3(kv kvVar, nk0 nk0Var) {
        Parcel E = E();
        be.d(E, kvVar);
        be.f(E, nk0Var);
        O0(1, E);
    }

    @Override // com.google.android.gms.internal.ads.fk0
    public final zy c() {
        Parcel q02 = q0(12, E());
        zy s62 = yy.s6(q02.readStrongBinder());
        q02.recycle();
        return s62;
    }

    @Override // com.google.android.gms.internal.ads.fk0
    public final void k0(boolean z6) {
        Parcel E = E();
        be.c(E, z6);
        O0(15, E);
    }

    @Override // com.google.android.gms.internal.ads.fk0
    public final void m6(x3.a aVar) {
        Parcel E = E();
        be.f(E, aVar);
        O0(5, E);
    }

    @Override // com.google.android.gms.internal.ads.fk0
    public final void n5(jk0 jk0Var) {
        Parcel E = E();
        be.f(E, jk0Var);
        O0(2, E);
    }
}
