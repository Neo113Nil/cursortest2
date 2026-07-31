package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import x3.a;

/* loaded from: classes.dex */
public abstract class mg0 extends ae implements ng0 {
    public mg0() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static ng0 s6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return queryLocalInterface instanceof ng0 ? (ng0) queryLocalInterface : new lg0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            R0((Intent) be.a(parcel, Intent.CREATOR));
        } else if (i7 == 2) {
            t5(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
        } else {
            if (i7 != 3) {
                return false;
            }
            d();
        }
        parcel2.writeNoException();
        return true;
    }
}
