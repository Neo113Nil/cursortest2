package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class ik0 extends ae implements jk0 {
    public ik0() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        ck0 ak0Var;
        switch (i7) {
            case 1:
                i();
                break;
            case 2:
                e();
                break;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    ak0Var = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    ak0Var = queryLocalInterface instanceof ck0 ? (ck0) queryLocalInterface : new ak0(readStrongBinder);
                }
                I2(ak0Var);
                break;
            case 4:
                O(parcel.readInt());
                break;
            case 5:
                G2((cv) be.a(parcel, cv.CREATOR));
                break;
            case 6:
                d();
                break;
            case c4.w0.f2149o /* 7 */:
                b();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
