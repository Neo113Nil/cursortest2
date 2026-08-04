package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzbqo extends zzaxz implements zzbqq {
    zzbqo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbqq
    public final void zze(zzbpm zzbpmVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, zzbpmVar);
        zzdf(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqq
    public final void zzf(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString("Adapter returned null.");
        zzdf(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqq
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zzc(zza, zzeVar);
        zzdf(3, zza);
    }
}
