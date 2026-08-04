package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzbav extends zzaxz implements IInterface {
    zzbav(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final zzbaq zze(zzbat zzbatVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zzc(zza, zzbatVar);
        Parcel zzde = zzde(1, zza);
        zzbaq zzbaqVar = (zzbaq) zzayb.zzb(zzde, zzbaq.CREATOR);
        zzde.recycle();
        return zzbaqVar;
    }

    public final zzbaq zzf(zzbat zzbatVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zzc(zza, zzbatVar);
        Parcel zzde = zzde(2, zza);
        zzbaq zzbaqVar = (zzbaq) zzayb.zzb(zzde, zzbaq.CREATOR);
        zzde.recycle();
        return zzbaqVar;
    }

    public final long zzg(zzbat zzbatVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zzc(zza, zzbatVar);
        Parcel zzde = zzde(3, zza);
        long readLong = zzde.readLong();
        zzde.recycle();
        return readLong;
    }
}
