package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import x3.a;

/* loaded from: classes.dex */
public abstract class u90 extends ae implements v90 {
    public u90() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        IInterface a7;
        y90 w90Var;
        if (i7 != 3) {
            if (i7 == 4) {
                g();
            } else if (i7 == 5) {
                x3.a q02 = a.AbstractBinderC0153a.q0(parcel.readStrongBinder());
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    w90Var = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                    w90Var = queryLocalInterface instanceof y90 ? (y90) queryLocalInterface : new w90(readStrongBinder);
                }
                d1(q02, w90Var);
            } else if (i7 == 6) {
                zze(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()));
            } else {
                if (i7 != 7) {
                    return false;
                }
                a7 = c();
            }
            parcel2.writeNoException();
            return true;
        }
        a7 = a();
        parcel2.writeNoException();
        be.f(parcel2, a7);
        return true;
    }
}
