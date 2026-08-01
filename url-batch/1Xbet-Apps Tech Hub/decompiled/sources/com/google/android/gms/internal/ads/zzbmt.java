package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbmt extends zzavg implements zzbmv {
    zzbmt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final void zze(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzbi(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzd(zza, zzeVar);
        zzbi(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final void zzg(zzbmp zzbmpVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, zzbmpVar);
        zzbi(1, zza);
    }
}
