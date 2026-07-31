package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class nj0 extends zd {
    nj0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void C3(mj0 mj0Var, String str, String str2) {
        Parcel E = E();
        be.f(E, mj0Var);
        E.writeString(str);
        E.writeString(str2);
        O0(2, E);
    }
}
