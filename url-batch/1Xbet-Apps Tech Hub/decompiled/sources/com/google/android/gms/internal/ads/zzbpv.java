package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbpv extends zzavg implements zzbpx {
    zzbpv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zze() throws RemoteException {
        zzbi(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzf() throws RemoteException {
        zzbi(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzg(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzbi(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzd(zza, zzeVar);
        zzbi(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzi(int i, String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeString(str);
        zzbi(22, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzj(int i) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzd(zza, zzeVar);
        zzbi(24, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzl(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbi(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzm() throws RemoteException {
        zzbi(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzn() throws RemoteException {
        zzbi(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzo() throws RemoteException {
        zzbi(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzp() throws RemoteException {
        zzbi(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzq(String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbi(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzr(zzbhc zzbhcVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, zzbhcVar);
        zza.writeString(str);
        zzbi(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzs(zzbxc zzbxcVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzt(zzbxg zzbxgVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, zzbxgVar);
        zzbi(16, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzu() throws RemoteException {
        zzbi(18, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzv() throws RemoteException {
        zzbi(11, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzw() throws RemoteException {
        zzbi(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzx() throws RemoteException {
        zzbi(20, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzy() throws RemoteException {
        zzbi(13, zza());
    }
}
