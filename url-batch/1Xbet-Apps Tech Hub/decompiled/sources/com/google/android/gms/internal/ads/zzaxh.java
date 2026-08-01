package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzaxh extends zzavg implements zzaxj {
    zzaxh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzaxj
    public final com.google.android.gms.ads.internal.client.zzbu zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzaxj
    public final com.google.android.gms.ads.internal.client.zzdn zzf() throws RemoteException {
        Parcel zzbh = zzbh(5, zza());
        com.google.android.gms.ads.internal.client.zzdn zzb = com.google.android.gms.ads.internal.client.zzdm.zzb(zzbh.readStrongBinder());
        zzbh.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaxj
    public final void zzg(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzavi.zza;
        zza.writeInt(z ? 1 : 0);
        zzbi(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzaxj
    public final void zzh(com.google.android.gms.ads.internal.client.zzdg zzdgVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, zzdgVar);
        zzbi(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzaxj
    public final void zzi(IObjectWrapper iObjectWrapper, zzaxq zzaxqVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, iObjectWrapper);
        zzavi.zzf(zza, zzaxqVar);
        zzbi(4, zza);
    }
}
