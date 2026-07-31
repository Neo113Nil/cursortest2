package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class lj0 extends ae implements mj0 {
    public lj0() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            String c7 = c();
            parcel2.writeNoException();
            parcel2.writeString(c7);
        } else {
            if (i7 != 2) {
                return false;
            }
            int a7 = a();
            parcel2.writeNoException();
            parcel2.writeInt(a7);
        }
        return true;
    }
}
