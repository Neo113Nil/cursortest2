package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfpf extends zzavg implements IInterface {
    zzfpf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfpd zze(zzfpb zzfpbVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzd(zza, zzfpbVar);
        Parcel zzbh = zzbh(1, zza);
        zzfpd zzfpdVar = (zzfpd) zzavi.zza(zzbh, zzfpd.CREATOR);
        zzbh.recycle();
        return zzfpdVar;
    }

    public final zzfpm zzf(zzfpk zzfpkVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzd(zza, zzfpkVar);
        Parcel zzbh = zzbh(3, zza);
        zzfpm zzfpmVar = (zzfpm) zzavi.zza(zzbh, zzfpm.CREATOR);
        zzbh.recycle();
        return zzfpmVar;
    }

    public final void zzg(zzfoy zzfoyVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzd(zza, zzfoyVar);
        zzbi(2, zza);
    }
}
