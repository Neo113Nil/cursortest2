package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzbag extends zzaxz implements zzbai {
    zzbag(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbai
    public final void zzc() throws RemoteException {
        zzdf(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbai
    public final void zzd() throws RemoteException {
        zzdf(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbai
    public final void zze(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zzc(zza, zzeVar);
        zzdf(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbai
    public final void zzf() throws RemoteException {
        zzdf(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbai
    public final void zzg() throws RemoteException {
        zzdf(5, zza());
    }
}
