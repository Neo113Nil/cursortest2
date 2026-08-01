package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbxh extends zzavg implements zzbxj {
    zzbxh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final Bundle zzb() throws RemoteException {
        Parcel zzbh = zzbh(9, zza());
        Bundle bundle = (Bundle) zzavi.zza(zzbh, Bundle.CREATOR);
        zzbh.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final com.google.android.gms.ads.internal.client.zzdn zzc() throws RemoteException {
        Parcel zzbh = zzbh(12, zza());
        com.google.android.gms.ads.internal.client.zzdn zzb = com.google.android.gms.ads.internal.client.zzdm.zzb(zzbh.readStrongBinder());
        zzbh.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final zzbxg zzd() throws RemoteException {
        zzbxg zzbxeVar;
        Parcel zzbh = zzbh(11, zza());
        IBinder readStrongBinder = zzbh.readStrongBinder();
        if (readStrongBinder == null) {
            zzbxeVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            zzbxeVar = queryLocalInterface instanceof zzbxg ? (zzbxg) queryLocalInterface : new zzbxe(readStrongBinder);
        }
        zzbh.recycle();
        return zzbxeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final String zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final void zzf(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbxq zzbxqVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzd(zza, zzlVar);
        zzavi.zzf(zza, zzbxqVar);
        zzbi(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbxq zzbxqVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzd(zza, zzlVar);
        zzavi.zzf(zza, zzbxqVar);
        zzbi(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final void zzh(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzavi.zza;
        zza.writeInt(z ? 1 : 0);
        zzbi(15, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final void zzi(com.google.android.gms.ads.internal.client.zzdd zzddVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, zzddVar);
        zzbi(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final void zzj(com.google.android.gms.ads.internal.client.zzdg zzdgVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, zzdgVar);
        zzbi(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final void zzk(zzbxm zzbxmVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, zzbxmVar);
        zzbi(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final void zzl(zzbxx zzbxxVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzd(zza, zzbxxVar);
        zzbi(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzbi(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final void zzn(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final boolean zzo() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final void zzp(zzbxr zzbxrVar) throws RemoteException {
        throw null;
    }
}
