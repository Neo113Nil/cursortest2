package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes.dex */
public abstract class yy extends ae implements zy {
    public yy() {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    public static zy s6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        return queryLocalInterface instanceof zy ? (zy) queryLocalInterface : new xy(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        String b7;
        if (i7 == 1) {
            b7 = b();
        } else {
            if (i7 != 2) {
                if (i7 != 3) {
                    return false;
                }
                List<tv> e7 = e();
                parcel2.writeNoException();
                parcel2.writeTypedList(e7);
                return true;
            }
            b7 = d();
        }
        parcel2.writeNoException();
        parcel2.writeString(b7);
        return true;
    }
}
