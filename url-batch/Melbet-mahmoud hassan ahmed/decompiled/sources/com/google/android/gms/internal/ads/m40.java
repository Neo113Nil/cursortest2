package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class m40 extends ae implements n40 {
    public m40() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static n40 s6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return queryLocalInterface instanceof n40 ? (n40) queryLocalInterface : new l40(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        int g7;
        if (i7 == 1) {
            x3.a d7 = d();
            parcel2.writeNoException();
            be.f(parcel2, d7);
        } else if (i7 == 2) {
            Uri b7 = b();
            parcel2.writeNoException();
            be.e(parcel2, b7);
        } else if (i7 != 3) {
            if (i7 == 4) {
                g7 = g();
            } else {
                if (i7 != 5) {
                    return false;
                }
                g7 = c();
            }
            parcel2.writeNoException();
            parcel2.writeInt(g7);
        } else {
            double a7 = a();
            parcel2.writeNoException();
            parcel2.writeDouble(a7);
        }
        return true;
    }
}
