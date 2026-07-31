package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class q50 extends ae implements r50 {
    public q50() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    public static r50 s6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
        return queryLocalInterface instanceof r50 ? (r50) queryLocalInterface : new p50(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        e50 c50Var;
        if (i7 != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            c50Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            c50Var = queryLocalInterface instanceof e50 ? (e50) queryLocalInterface : new c50(readStrongBinder);
        }
        G1(c50Var);
        parcel2.writeNoException();
        return true;
    }
}
