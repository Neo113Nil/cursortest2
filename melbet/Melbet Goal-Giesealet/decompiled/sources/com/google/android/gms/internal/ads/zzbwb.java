package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzbwb extends zzaxz implements zzbwd {
    zzbwb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zze() throws RemoteException {
        zzdf(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zzf() throws RemoteException {
        zzdf(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zzg(zzbvx zzbvxVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, zzbvxVar);
        zzdf(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zzh(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzdf(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zzi(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zzc(zza, zzeVar);
        zzdf(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zzj() throws RemoteException {
        zzdf(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zzk() throws RemoteException {
        zzdf(7, zza());
    }
}
