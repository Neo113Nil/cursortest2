package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import x3.a;

/* loaded from: classes.dex */
public final class kd0 extends zd implements md0 {
    kd0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // com.google.android.gms.internal.ads.md0
    public final x3.a b() {
        Parcel q02 = q0(1, E());
        x3.a q03 = a.AbstractBinderC0153a.q0(q02.readStrongBinder());
        q02.recycle();
        return q03;
    }

    @Override // com.google.android.gms.internal.ads.md0
    public final boolean d() {
        Parcel q02 = q0(2, E());
        boolean g7 = be.g(q02);
        q02.recycle();
        return g7;
    }
}
