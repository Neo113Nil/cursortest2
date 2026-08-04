package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaxz;
import com.google.android.gms.internal.ads.zzayb;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzbi extends zzaxz implements zzbk {
    zzbi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzb() throws RemoteException {
        zzdf(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzc(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzdf(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzd(zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zzc(zza, zzeVar);
        zzdf(8, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zze() throws RemoteException {
        zzdf(3, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzf() throws RemoteException {
        zzdf(4, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzg() throws RemoteException {
        zzdf(5, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzh() throws RemoteException {
        zzdf(6, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzi() throws RemoteException {
        zzdf(9, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzj() throws RemoteException {
        zzdf(7, zza());
    }
}
