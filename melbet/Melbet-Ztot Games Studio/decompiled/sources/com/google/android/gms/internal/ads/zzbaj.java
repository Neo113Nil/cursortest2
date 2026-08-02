package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzbaj extends zzaxm implements IInterface {
    zzbaj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final long zze(zzbah zzbahVar) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzd(zza, zzbahVar);
        Parcel zzdb = zzdb(3, zza);
        long readLong = zzdb.readLong();
        zzdb.recycle();
        return readLong;
    }

    public final zzbae zzf(zzbah zzbahVar) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzd(zza, zzbahVar);
        Parcel zzdb = zzdb(1, zza);
        zzbae zzbaeVar = (zzbae) zzaxo.zza(zzdb, zzbae.CREATOR);
        zzdb.recycle();
        return zzbaeVar;
    }

    public final zzbae zzg(zzbah zzbahVar) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzd(zza, zzbahVar);
        Parcel zzdb = zzdb(2, zza);
        zzbae zzbaeVar = (zzbae) zzaxo.zza(zzdb, zzbae.CREATOR);
        zzdb.recycle();
        return zzbaeVar;
    }
}
