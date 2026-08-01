package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzavg;
import com.google.android.gms.internal.ads.zzavi;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbf extends zzavg implements zzbh {
    zzbf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzc() throws RemoteException {
        zzbi(6, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzd() throws RemoteException {
        zzbi(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zze(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzbi(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzf(zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzd(zza, zzeVar);
        zzbi(8, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzg() throws RemoteException {
        zzbi(7, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzh() throws RemoteException {
        zzbi(3, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzi() throws RemoteException {
        zzbi(4, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzj() throws RemoteException {
        zzbi(5, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzk() throws RemoteException {
        zzbi(9, zza());
    }
}
