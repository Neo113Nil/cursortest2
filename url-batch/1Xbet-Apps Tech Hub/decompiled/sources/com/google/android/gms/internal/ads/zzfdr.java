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
public final class zzfdr extends zzbws {
    private final zzfdh zza;
    private final zzfcx zzb;
    private final zzfei zzc;
    private zzdpy zzd;
    private boolean zze = false;

    public zzfdr(zzfdh zzfdhVar, zzfcx zzfcxVar, zzfei zzfeiVar) {
        this.zza = zzfdhVar;
        this.zzb = zzfcxVar;
        this.zzc = zzfeiVar;
    }

    private final synchronized boolean zzy() {
        zzdpy zzdpyVar = this.zzd;
        if (zzdpyVar != null) {
            if (!zzdpyVar.zze()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final Bundle zzb() {
        Preconditions.checkMainThread("getAdMetadata can only be called from the UI thread.");
        zzdpy zzdpyVar = this.zzd;
        return zzdpyVar != null ? zzdpyVar.zza() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final synchronized com.google.android.gms.ads.internal.client.zzdn zzc() throws RemoteException {
        zzdpy zzdpyVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgM)).booleanValue() && (zzdpyVar = this.zzd) != null) {
            return zzdpyVar.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final synchronized String zzd() throws RemoteException {
        zzdpy zzdpyVar = this.zzd;
        if (zzdpyVar == null || zzdpyVar.zzl() == null) {
            return null;
        }
        return zzdpyVar.zzl().zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zze() throws RemoteException {
        zzf(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final synchronized void zzf(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        Context context = null;
        this.zzb.zzg(null);
        if (this.zzd != null) {
            if (iObjectWrapper != null) {
                context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            }
            this.zzd.zzm().zza(context);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbdc.zzfq)).booleanValue() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (java.util.regex.Pattern.matches(r1, r0) != false) goto L16;
     */
    @Override // com.google.android.gms.internal.ads.zzbwt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzg(zzbwx zzbwxVar) throws RemoteException {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        String str = zzbwxVar.zzb;
        String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzfo);
        if (str2 != null && str != null) {
            try {
            } catch (RuntimeException e) {
                com.google.android.gms.ads.internal.zzt.zzo().zzw(e, "NonagonUtil.isPatternMatched");
            }
        }
        if (zzy()) {
        }
        zzfcz zzfczVar = new zzfcz(null);
        this.zzd = null;
        this.zza.zzj(1);
        this.zza.zzb(zzbwxVar.zza, zzbwxVar.zzb, zzfczVar, new zzfdp(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzh() {
        zzi(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzm().zzb(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzj() {
        zzk(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final synchronized void zzk(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzm().zzc(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzl(com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        Preconditions.checkMainThread("setAdMetadataListener can only be called from the UI thread.");
        if (zzbyVar == null) {
            this.zzb.zzg(null);
        } else {
            this.zzb.zzg(new zzfdq(this, zzbyVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final synchronized void zzm(String str) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setCustomData");
        this.zzc.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final synchronized void zzn(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zze = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzo(zzbww zzbwwVar) throws RemoteException {
        Preconditions.checkMainThread("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzb.zzm(zzbwwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final synchronized void zzp(String str) throws RemoteException {
        Preconditions.checkMainThread("setUserId must be called on the main UI thread.");
        this.zzc.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final synchronized void zzq() throws RemoteException {
        zzr(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final synchronized void zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Preconditions.checkMainThread("showAd must be called on the main UI thread.");
        if (this.zzd != null) {
            Activity activity = null;
            if (iObjectWrapper != null) {
                Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
                if (unwrap instanceof Activity) {
                    activity = (Activity) unwrap;
                }
            }
            this.zzd.zzh(this.zze, activity);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final boolean zzs() throws RemoteException {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final boolean zzt() {
        zzdpy zzdpyVar = this.zzd;
        return zzdpyVar != null && zzdpyVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzu(zzbwr zzbwrVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzb.zzn(zzbwrVar);
    }
}
