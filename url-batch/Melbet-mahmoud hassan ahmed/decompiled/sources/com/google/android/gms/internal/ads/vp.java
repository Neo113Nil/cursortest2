package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class vp extends ae implements wp {
    public vp() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public static wp s6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        return queryLocalInterface instanceof wp ? (wp) queryLocalInterface : new up(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        tp rpVar;
        if (i7 == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                rpVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                rpVar = queryLocalInterface instanceof tp ? (tp) queryLocalInterface : new rp(readStrongBinder);
            }
            Q1(rpVar);
        } else if (i7 == 2) {
            parcel.readInt();
        } else {
            if (i7 != 3) {
                return false;
            }
            q6((cv) be.a(parcel, cv.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
