package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public class zzelj extends zzbpw {
    private final zzcyf zza;
    private final zzdgc zzb;
    private final zzcyz zzc;
    private final zzczo zzd;
    private final zzczt zze;
    private final zzddb zzf;
    private final zzdan zzg;
    private final zzdgu zzh;
    private final zzdcx zzi;
    private final zzcyu zzj;

    public zzelj(zzcyf zzcyfVar, zzdgc zzdgcVar, zzcyz zzcyzVar, zzczo zzczoVar, zzczt zzcztVar, zzddb zzddbVar, zzdan zzdanVar, zzdgu zzdguVar, zzdcx zzdcxVar, zzcyu zzcyuVar) {
        this.zza = zzcyfVar;
        this.zzb = zzdgcVar;
        this.zzc = zzcyzVar;
        this.zzd = zzczoVar;
        this.zze = zzcztVar;
        this.zzf = zzddbVar;
        this.zzg = zzdanVar;
        this.zzh = zzdguVar;
        this.zzi = zzdcxVar;
        this.zzj = zzcyuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zze() {
        this.zza.onAdClicked();
        this.zzb.zzbL();
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzf() {
        this.zzg.zzbz(4);
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzg(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzi(int i, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    @Deprecated
    public final void zzj(int i) throws RemoteException {
        zzk(new com.google.android.gms.ads.internal.client.zze(i, "", AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzj.zza(zzffr.zzc(8, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzl(String str) {
        zzk(new com.google.android.gms.ads.internal.client.zze(0, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    public void zzm() {
        this.zzc.zza();
        this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzn() {
        this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzo() {
        this.zze.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzp() {
        this.zzg.zzbw();
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzq(String str, String str2) {
        this.zzf.zzb(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzr(zzbhc zzbhcVar, String str) {
    }

    public void zzs(zzbxc zzbxcVar) {
    }

    public void zzt(zzbxg zzbxgVar) throws RemoteException {
    }

    public void zzu() throws RemoteException {
    }

    public void zzv() {
        this.zzh.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzw() {
        this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zzx() throws RemoteException {
        this.zzh.zzc();
    }

    public void zzy() {
        this.zzh.zzd();
    }
}
