package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbwu extends zzavg implements zzbww {
    zzbwu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zze(zzbwq zzbwqVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, zzbwqVar);
        zzbi(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzf() throws RemoteException {
        zzbi(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzg(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzbi(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzh() throws RemoteException {
        zzbi(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzi() throws RemoteException {
        zzbi(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzj() throws RemoteException {
        zzbi(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzk() throws RemoteException {
        zzbi(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzl() throws RemoteException {
        zzbi(3, zza());
    }
}
