package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class ly extends ae implements my {
    public ly() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    public static my s6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return queryLocalInterface instanceof my ? (my) queryLocalInterface : new ky(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        String b7;
        if (i7 == 1) {
            b7 = b();
        } else {
            if (i7 != 2) {
                return false;
            }
            b7 = d();
        }
        parcel2.writeNoException();
        parcel2.writeString(b7);
        return true;
    }
}
