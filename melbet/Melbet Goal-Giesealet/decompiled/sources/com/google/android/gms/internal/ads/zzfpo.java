package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzfpo extends zzaxz implements IInterface {
    zzfpo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfpm zze(zzfpk zzfpkVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zzc(zza, zzfpkVar);
        Parcel zzde = zzde(1, zza);
        zzfpm zzfpmVar = (zzfpm) zzayb.zzb(zzde, zzfpm.CREATOR);
        zzde.recycle();
        return zzfpmVar;
    }

    public final void zzf(zzfph zzfphVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zzc(zza, zzfphVar);
        zzdf(2, zza);
    }

    public final zzfpv zzg(zzfpt zzfptVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zzc(zza, zzfptVar);
        Parcel zzde = zzde(3, zza);
        zzfpv zzfpvVar = (zzfpv) zzayb.zzb(zzde, zzfpv.CREATOR);
        zzde.recycle();
        return zzfpvVar;
    }
}
