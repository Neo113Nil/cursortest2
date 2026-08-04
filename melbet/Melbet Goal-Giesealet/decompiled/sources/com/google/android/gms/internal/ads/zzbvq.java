package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzbvq extends zzaxz implements zzbvs {
    zzbvq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzdf(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzf(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzdf(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzdf(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzdf(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzdf(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzk(IObjectWrapper iObjectWrapper, zzbvt zzbvtVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzayb.zzc(zza, zzbvtVar);
        zzdf(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzdf(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzm(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zza.writeInt(i);
        zzdf(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzdf(11, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzp(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzdf(13, zza);
    }
}
