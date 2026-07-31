package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class mi0 extends ae implements ni0 {
    public mi0() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        ri0 ri0Var = null;
        if (i7 != 1) {
            if (i7 == 2) {
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    if (queryLocalInterface instanceof oi0) {
                    }
                }
            } else if (i7 == 4) {
                vi0 vi0Var = (vi0) be.a(parcel, vi0.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    ri0Var = queryLocalInterface2 instanceof ri0 ? (ri0) queryLocalInterface2 : new pi0(readStrongBinder2);
                }
                m5(vi0Var, ri0Var);
            } else if (i7 == 5) {
                vi0 vi0Var2 = (vi0) be.a(parcel, vi0.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    ri0Var = queryLocalInterface3 instanceof ri0 ? (ri0) queryLocalInterface3 : new pi0(readStrongBinder3);
                }
                Q0(vi0Var2, ri0Var);
            } else if (i7 == 6) {
                vi0 vi0Var3 = (vi0) be.a(parcel, vi0.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    ri0Var = queryLocalInterface4 instanceof ri0 ? (ri0) queryLocalInterface4 : new pi0(readStrongBinder4);
                }
                h2(vi0Var3, ri0Var);
            } else {
                if (i7 != 7) {
                    return false;
                }
                String readString = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    ri0Var = queryLocalInterface5 instanceof ri0 ? (ri0) queryLocalInterface5 : new pi0(readStrongBinder5);
                }
                Z0(readString, ri0Var);
            }
            parcel2.writeNoException();
        } else {
            parcel2.writeNoException();
            be.e(parcel2, null);
        }
        return true;
    }
}
