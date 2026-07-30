package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzcax extends zzbcs implements zzcaz {
    zzcax(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzb(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, iObjectWrapper);
        zzda(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzc(com.google.android.gms.ads.internal.client.zzm zzmVar, zzcbg zzcbgVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zzc(zza, zzmVar);
        zzbcu.zze(zza, zzcbgVar);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzd(com.google.android.gms.ads.internal.client.zzm zzmVar, zzcbg zzcbgVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zzc(zza, zzmVar);
        zzbcu.zze(zza, zzcbgVar);
        zzda(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zze(zzcbc zzcbcVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, zzcbcVar);
        zzda(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzf(com.google.android.gms.ads.internal.client.zzdq zzdqVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, zzdqVar);
        zzda(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final Bundle zzg() throws RemoteException {
        Parcel zzcZ = zzcZ(9, zza());
        Bundle bundle = (Bundle) zzbcu.zzb(zzcZ, Bundle.CREATOR);
        zzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzh(zzcbn zzcbnVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zzc(zza, zzcbnVar);
        zzda(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final boolean zzi() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final String zzj() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzk(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final zzcaw zzl() throws RemoteException {
        zzcaw zzcauVar;
        Parcel zzcZ = zzcZ(11, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzcauVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            zzcauVar = queryLocalInterface instanceof zzcaw ? (zzcaw) queryLocalInterface : new zzcau(readStrongBinder);
        }
        zzcZ.recycle();
        return zzcauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final com.google.android.gms.ads.internal.client.zzea zzm() throws RemoteException {
        Parcel zzcZ = zzcZ(12, zza());
        com.google.android.gms.ads.internal.client.zzea zzb = com.google.android.gms.ads.internal.client.zzdz.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final String zzn() throws RemoteException {
        Parcel zzcZ = zzcZ(16, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzo(com.google.android.gms.ads.internal.client.zzdt zzdtVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, zzdtVar);
        zzda(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzp(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzbcu.zza;
        zza.writeInt(z ? 1 : 0);
        zzda(15, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final long zzq() throws RemoteException {
        Parcel zzcZ = zzcZ(17, zza());
        long readLong = zzcZ.readLong();
        zzcZ.recycle();
        return readLong;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzr(long j) throws RemoteException {
        Parcel zza = zza();
        zza.writeLong(j);
        zzda(18, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzs(zzcbh zzcbhVar) throws RemoteException {
        throw null;
    }
}
