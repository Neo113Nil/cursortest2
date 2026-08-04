package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzbvy extends zzaxz implements zzbwa {
    zzbvy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzb(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzdf(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzc(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbwh zzbwhVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zzc(zza, zzmVar);
        zzayb.zze(zza, zzbwhVar);
        zzdf(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzd(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbwh zzbwhVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zzc(zza, zzmVar);
        zzayb.zze(zza, zzbwhVar);
        zzdf(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zze(zzbwd zzbwdVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, zzbwdVar);
        zzdf(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzf(com.google.android.gms.ads.internal.client.zzdq zzdqVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, zzdqVar);
        zzdf(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final Bundle zzg() throws RemoteException {
        Parcel zzde = zzde(9, zza());
        Bundle bundle = (Bundle) zzayb.zzb(zzde, Bundle.CREATOR);
        zzde.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzh(zzbwo zzbwoVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zzc(zza, zzbwoVar);
        zzdf(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final boolean zzi() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final String zzj() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzk(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final zzbvx zzl() throws RemoteException {
        zzbvx zzbvvVar;
        Parcel zzde = zzde(11, zza());
        IBinder readStrongBinder = zzde.readStrongBinder();
        if (readStrongBinder == null) {
            zzbvvVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            zzbvvVar = queryLocalInterface instanceof zzbvx ? (zzbvx) queryLocalInterface : new zzbvv(readStrongBinder);
        }
        zzde.recycle();
        return zzbvvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final com.google.android.gms.ads.internal.client.zzea zzm() throws RemoteException {
        Parcel zzde = zzde(12, zza());
        com.google.android.gms.ads.internal.client.zzea zzb = com.google.android.gms.ads.internal.client.zzdz.zzb(zzde.readStrongBinder());
        zzde.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final String zzn() throws RemoteException {
        Parcel zzde = zzde(16, zza());
        String readString = zzde.readString();
        zzde.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzo(com.google.android.gms.ads.internal.client.zzdt zzdtVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, zzdtVar);
        zzdf(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzp(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzayb.zza;
        zza.writeInt(z ? 1 : 0);
        zzdf(15, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final long zzq() throws RemoteException {
        Parcel zzde = zzde(17, zza());
        long readLong = zzde.readLong();
        zzde.recycle();
        return readLong;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzr(long j) throws RemoteException {
        Parcel zza = zza();
        zza.writeLong(j);
        zzdf(18, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzs(zzbwi zzbwiVar) throws RemoteException {
        throw null;
    }
}
