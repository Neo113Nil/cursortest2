package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzbev extends zzbcs implements zzbex {
    zzbev(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final com.google.android.gms.ads.internal.client.zzbx zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final void zzf(IObjectWrapper iObjectWrapper, zzbfe zzbfeVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, iObjectWrapper);
        zzbcu.zze(zza, zzbfeVar);
        zzda(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final com.google.android.gms.ads.internal.client.zzea zzg() throws RemoteException {
        Parcel zzcZ = zzcZ(5, zza());
        com.google.android.gms.ads.internal.client.zzea zzb = com.google.android.gms.ads.internal.client.zzdz.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final void zzh(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzbcu.zza;
        zza.writeInt(z ? 1 : 0);
        zzda(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final void zzi(com.google.android.gms.ads.internal.client.zzdt zzdtVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, zzdtVar);
        zzda(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final String zzj() throws RemoteException {
        Parcel zzcZ = zzcZ(8, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final long zzk() throws RemoteException {
        Parcel zzcZ = zzcZ(9, zza());
        long readLong = zzcZ.readLong();
        zzcZ.recycle();
        return readLong;
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final void zzl(long j) throws RemoteException {
        Parcel zza = zza();
        zza.writeLong(j);
        zzda(10, zza);
    }
}
