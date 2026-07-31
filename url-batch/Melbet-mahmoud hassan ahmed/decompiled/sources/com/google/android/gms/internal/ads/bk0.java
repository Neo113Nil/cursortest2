package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class bk0 extends ae implements ck0 {
    public bk0() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    public static ck0 s6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
        return queryLocalInterface instanceof ck0 ? (ck0) queryLocalInterface : new ak0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            String d7 = d();
            parcel2.writeNoException();
            parcel2.writeString(d7);
        } else {
            if (i7 != 2) {
                return false;
            }
            int b7 = b();
            parcel2.writeNoException();
            parcel2.writeInt(b7);
        }
        return true;
    }
}
