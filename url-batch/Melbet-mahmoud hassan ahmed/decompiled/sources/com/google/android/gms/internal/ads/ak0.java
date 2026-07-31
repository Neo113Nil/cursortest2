package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class ak0 extends zd implements ck0 {
    ak0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.ck0
    public final int b() {
        Parcel q02 = q0(2, E());
        int readInt = q02.readInt();
        q02.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.ck0
    public final String d() {
        Parcel q02 = q0(1, E());
        String readString = q02.readString();
        q02.recycle();
        return readString;
    }
}
