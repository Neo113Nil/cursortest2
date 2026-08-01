package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzenu extends com.google.android.gms.ads.internal.client.zzbt {
    private final com.google.android.gms.ads.internal.client.zzq zza;
    private final Context zzb;
    private final zzfbx zzc;
    private final String zzd;
    private final zzcbt zze;
    private final zzenm zzf;
    private final zzfcx zzg;
    private final zzasi zzh;
    private final zzdtp zzi;
    private zzdgx zzj;
    private boolean zzk = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzaC)).booleanValue();

    public zzenu(Context context, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzfbx zzfbxVar, zzenm zzenmVar, zzfcx zzfcxVar, zzcbt zzcbtVar, zzasi zzasiVar, zzdtp zzdtpVar) {
        this.zza = zzqVar;
        this.zzd = str;
        this.zzb = context;
        this.zzc = zzfbxVar;
        this.zzf = zzenmVar;
        this.zzg = zzfcxVar;
        this.zze = zzcbtVar;
        this.zzh = zzasiVar;
        this.zzi = zzdtpVar;
    }

    private final synchronized boolean zze() {
        zzdgx zzdgxVar = this.zzj;
        if (zzdgxVar != null) {
            if (!zzdgxVar.zza()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzA() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzB() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        zzdgx zzdgxVar = this.zzj;
        if (zzdgxVar != null) {
            zzdgxVar.zzm().zzc(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(com.google.android.gms.ads.internal.client.zzbe zzbeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        this.zzf.zzj(zzbhVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzF(com.google.android.gms.ads.internal.client.zzq zzqVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
        Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        this.zzf.zzm(zzcbVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(zzaxm zzaxmVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(com.google.android.gms.ads.internal.client.zzw zzwVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(com.google.android.gms.ads.internal.client.zzci zzciVar) {
        this.zzf.zzn(zzciVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzK(com.google.android.gms.ads.internal.client.zzdu zzduVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzL(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzk = z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzM(zzbty zzbtyVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzN(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzO(zzbea zzbeaVar) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzc.zzi(zzbeaVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdgVar.zzf()) {
                this.zzi.zze();
            }
        } catch (RemoteException e) {
            zzcbn.zzf("Error in making CSI ping for reporting paid event callback", e);
        }
        this.zzf.zzl(zzdgVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(zzbub zzbubVar, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(zzbww zzbwwVar) {
        this.zzg.zzm(zzbwwVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzT(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzU(com.google.android.gms.ads.internal.client.zzfl zzflVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzW(IObjectWrapper iObjectWrapper) {
        if (this.zzj == null) {
            zzcbn.zzj("Interstitial can not be shown before loaded.");
            this.zzf.zzp(zzffr.zzd(9, null, null));
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzcx)).booleanValue()) {
            this.zzh.zzc().zzn(new Throwable().getStackTrace());
        }
        this.zzj.zzc(this.zzk, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzX() {
        Preconditions.checkMainThread("showInterstitial must be called on the main UI thread.");
        if (this.zzj == null) {
            zzcbn.zzj("Interstitial can not be shown before loaded.");
            this.zzf.zzp(zzffr.zzd(9, null, null));
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzcx)).booleanValue()) {
                this.zzh.zzc().zzn(new Throwable().getStackTrace());
            }
            this.zzj.zzc(this.zzk, null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzY() {
        return this.zzc.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzZ() {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zze();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[Catch: all -> 0x008b, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0010, B:8:0x0025, B:11:0x0042, B:13:0x004e, B:15:0x0052, B:17:0x005b, B:21:0x0064, B:23:0x006a, B:26:0x003d), top: B:2:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean zzaa(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        boolean z;
        if (((Boolean) zzbet.zzi.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzkt)).booleanValue()) {
                z = true;
                if (this.zze.zzc >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzku)).intValue() || !z) {
                    Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
                }
                com.google.android.gms.ads.internal.zzt.zzp();
                if (!com.google.android.gms.ads.internal.util.zzt.zzG(this.zzb) && zzlVar.zzs == null) {
                    zzcbn.zzg("Failed to load the ad because app ID is missing.");
                    zzenm zzenmVar = this.zzf;
                    if (zzenmVar != null) {
                        zzenmVar.zzbG(zzffr.zzd(4, null, null));
                    }
                } else if (!zze()) {
                    zzffl.zza(this.zzb, zzlVar.zzf);
                    this.zzj = null;
                    return this.zzc.zzb(zzlVar, this.zzd, new zzfbq(this.zza), new zzent(this));
                }
                return false;
            }
        }
        z = false;
        if (this.zze.zzc >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzku)).intValue()) {
        }
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        com.google.android.gms.ads.internal.zzt.zzp();
        if (!com.google.android.gms.ads.internal.util.zzt.zzG(this.zzb)) {
        }
        if (!zze()) {
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzab(com.google.android.gms.ads.internal.client.zzcf zzcfVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzd() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzq zzg() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzbh zzi() {
        return this.zzf.zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzcb zzj() {
        return this.zzf.zzi();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzdn zzk() {
        zzdgx zzdgxVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgM)).booleanValue() && (zzdgxVar = this.zzj) != null) {
            return zzdgxVar.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzdq zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final IObjectWrapper zzn() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzr() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzs() {
        zzdgx zzdgxVar = this.zzj;
        if (zzdgxVar == null || zzdgxVar.zzl() == null) {
            return null;
        }
        return zzdgxVar.zzl().zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzt() {
        zzdgx zzdgxVar = this.zzj;
        if (zzdgxVar == null || zzdgxVar.zzl() == null) {
            return null;
        }
        return zzdgxVar.zzl().zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzx() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        zzdgx zzdgxVar = this.zzj;
        if (zzdgxVar != null) {
            zzdgxVar.zzm().zza(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(com.google.android.gms.ads.internal.client.zzl zzlVar, com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        this.zzf.zzk(zzbkVar);
        zzaa(zzlVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzz() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        zzdgx zzdgxVar = this.zzj;
        if (zzdgxVar != null) {
            zzdgxVar.zzm().zzb(null);
        }
    }
}
