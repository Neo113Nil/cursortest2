package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzbac extends zzaxz implements zzbae {
    zzbac(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final void zzb(zzbab zzbabVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, zzbabVar);
        zzdf(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final void zzc(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzdf(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final void zzd(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zzc(zza, zzeVar);
        zzdf(3, zza);
    }
}
