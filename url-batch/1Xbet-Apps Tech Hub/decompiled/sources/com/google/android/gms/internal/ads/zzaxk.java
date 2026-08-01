package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzaxk extends zzavg implements zzaxm {
    zzaxk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaxm
    public final void zzb(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzbi(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzaxm
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzd(zza, zzeVar);
        zzbi(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzaxm
    public final void zzd(zzaxj zzaxjVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, zzaxjVar);
        zzbi(1, zza);
    }
}
