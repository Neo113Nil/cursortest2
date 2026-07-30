package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzbjz extends zzbcs implements IInterface {
    zzbjz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    public final void zze(zzbyv zzbyvVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, zzbyvVar);
        zzda(1, zza);
    }
}
