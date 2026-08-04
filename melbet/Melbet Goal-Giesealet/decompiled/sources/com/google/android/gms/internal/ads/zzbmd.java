package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzbmd extends zzaxz implements zzbmf {
    zzbmd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbmf
    public final void zze(zzblz zzblzVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, zzblzVar);
        zzdf(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmf
    public final void zzf(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzdf(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmf
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zzc(zza, zzeVar);
        zzdf(3, zza);
    }
}
