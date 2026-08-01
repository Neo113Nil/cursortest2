package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzayd extends zzavg implements IInterface {
    zzayd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final long zze(zzayb zzaybVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzd(zza, zzaybVar);
        Parcel zzbh = zzbh(3, zza);
        long readLong = zzbh.readLong();
        zzbh.recycle();
        return readLong;
    }

    public final zzaxy zzf(zzayb zzaybVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzd(zza, zzaybVar);
        Parcel zzbh = zzbh(1, zza);
        zzaxy zzaxyVar = (zzaxy) zzavi.zza(zzbh, zzaxy.CREATOR);
        zzbh.recycle();
        return zzaxyVar;
    }

    public final zzaxy zzg(zzayb zzaybVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzd(zza, zzaybVar);
        Parcel zzbh = zzbh(2, zza);
        zzaxy zzaxyVar = (zzaxy) zzavi.zza(zzbh, zzaxy.CREATOR);
        zzbh.recycle();
        return zzaxyVar;
    }
}
