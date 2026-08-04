package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzazz extends zzaxz implements zzbab {
    zzazz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final com.google.android.gms.ads.internal.client.zzbx zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final void zzf(IObjectWrapper iObjectWrapper, zzbai zzbaiVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzayb.zze(zza, zzbaiVar);
        zzdf(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final com.google.android.gms.ads.internal.client.zzea zzg() throws RemoteException {
        Parcel zzde = zzde(5, zza());
        com.google.android.gms.ads.internal.client.zzea zzb = com.google.android.gms.ads.internal.client.zzdz.zzb(zzde.readStrongBinder());
        zzde.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final void zzh(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzayb.zza;
        zza.writeInt(z ? 1 : 0);
        zzdf(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final void zzi(com.google.android.gms.ads.internal.client.zzdt zzdtVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, zzdtVar);
        zzdf(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final String zzj() throws RemoteException {
        Parcel zzde = zzde(8, zza());
        String readString = zzde.readString();
        zzde.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final long zzk() throws RemoteException {
        Parcel zzde = zzde(9, zza());
        long readLong = zzde.readLong();
        zzde.recycle();
        return readLong;
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final void zzl(long j) throws RemoteException {
        Parcel zza = zza();
        zza.writeLong(j);
        zzdf(10, zza);
    }
}
