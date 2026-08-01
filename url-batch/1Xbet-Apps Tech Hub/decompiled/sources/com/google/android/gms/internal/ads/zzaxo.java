package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzaxo extends zzavg implements zzaxq {
    zzaxo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaxq
    public final void zzb() throws RemoteException {
        zzbi(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzaxq
    public final void zzc() throws RemoteException {
        zzbi(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzaxq
    public final void zzd(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzd(zza, zzeVar);
        zzbi(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzaxq
    public final void zze() throws RemoteException {
        zzbi(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzaxq
    public final void zzf() throws RemoteException {
        zzbi(1, zza());
    }
}
