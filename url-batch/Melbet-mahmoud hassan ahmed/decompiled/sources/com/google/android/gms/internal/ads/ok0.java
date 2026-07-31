package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class ok0 extends zd {
    ok0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    public final void C3(ck0 ck0Var, String str, String str2) {
        Parcel E = E();
        be.f(E, ck0Var);
        E.writeString(str);
        E.writeString(str2);
        O0(2, E);
    }
}
