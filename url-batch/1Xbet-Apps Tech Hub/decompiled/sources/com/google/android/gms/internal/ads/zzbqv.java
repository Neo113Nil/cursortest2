package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbqv extends zzbpw {
    private final Adapter zza;
    private final zzbxb zzb;

    zzbqv(Adapter adapter, zzbxb zzbxbVar) {
        this.zza = adapter;
        this.zzb = zzbxbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zze() throws RemoteException {
        zzbxb zzbxbVar = this.zzb;
        if (zzbxbVar != null) {
            zzbxbVar.zze(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzf() throws RemoteException {
        zzbxb zzbxbVar = this.zzb;
        if (zzbxbVar != null) {
            zzbxbVar.zzf(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzg(int i) throws RemoteException {
        zzbxb zzbxbVar = this.zzb;
        if (zzbxbVar != null) {
            zzbxbVar.zzg(ObjectWrapper.wrap(this.zza), i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzi(int i, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzj(int i) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzl(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzm() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzn() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzo() throws RemoteException {
        zzbxb zzbxbVar = this.zzb;
        if (zzbxbVar != null) {
            zzbxbVar.zzi(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzp() throws RemoteException {
        zzbxb zzbxbVar = this.zzb;
        if (zzbxbVar != null) {
            zzbxbVar.zzj(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzq(String str, String str2) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzr(zzbhc zzbhcVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzs(zzbxc zzbxcVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzt(zzbxg zzbxgVar) throws RemoteException {
        zzbxb zzbxbVar = this.zzb;
        if (zzbxbVar != null) {
            zzbxbVar.zzm(ObjectWrapper.wrap(this.zza), new zzbxc(zzbxgVar.zzf(), zzbxgVar.zze()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzu() throws RemoteException {
        zzbxb zzbxbVar = this.zzb;
        if (zzbxbVar != null) {
            zzbxbVar.zzn(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzv() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzw() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzx() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzy() throws RemoteException {
        zzbxb zzbxbVar = this.zzb;
        if (zzbxbVar != null) {
            zzbxbVar.zzo(ObjectWrapper.wrap(this.zza));
        }
    }
}
