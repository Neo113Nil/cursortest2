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
public final class zzfdl extends zzbxi {
    private final zzfdh zza;
    private final zzfcx zzb;
    private final String zzc;
    private final zzfei zzd;
    private final Context zze;
    private final zzcbt zzf;
    private final zzasi zzg;
    private final zzdtp zzh;
    private zzdpy zzi;
    private boolean zzj = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzaC)).booleanValue();

    public zzfdl(String str, zzfdh zzfdhVar, Context context, zzfcx zzfcxVar, zzfei zzfeiVar, zzcbt zzcbtVar, zzasi zzasiVar, zzdtp zzdtpVar) {
        this.zzc = str;
        this.zza = zzfdhVar;
        this.zzb = zzfcxVar;
        this.zzd = zzfeiVar;
        this.zze = context;
        this.zzf = zzcbtVar;
        this.zzg = zzasiVar;
        this.zzh = zzdtpVar;
    }

    private final synchronized void zzu(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbxq zzbxqVar, int i) throws RemoteException {
        boolean z = false;
        if (((Boolean) zzbet.zzl.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzkt)).booleanValue()) {
                z = true;
            }
        }
        if (this.zzf.zzc < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzku)).intValue() || !z) {
            Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        }
        this.zzb.zzk(zzbxqVar);
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzG(this.zze) && zzlVar.zzs == null) {
            zzcbn.zzg("Failed to load the ad because app ID is missing.");
            this.zzb.zzbG(zzffr.zzd(4, null, null));
            return;
        }
        if (this.zzi != null) {
            return;
        }
        zzfcz zzfczVar = new zzfcz(null);
        this.zza.zzj(i);
        this.zza.zzb(zzlVar, this.zzc, zzfczVar, new zzfdk(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final Bundle zzb() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdpy zzdpyVar = this.zzi;
        return zzdpyVar != null ? zzdpyVar.zza() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final com.google.android.gms.ads.internal.client.zzdn zzc() {
        zzdpy zzdpyVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgM)).booleanValue() && (zzdpyVar = this.zzi) != null) {
            return zzdpyVar.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final zzbxg zzd() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdpy zzdpyVar = this.zzi;
        if (zzdpyVar != null) {
            return zzdpyVar.zzc();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final synchronized String zze() throws RemoteException {
        zzdpy zzdpyVar = this.zzi;
        if (zzdpyVar == null || zzdpyVar.zzl() == null) {
            return null;
        }
        return zzdpyVar.zzl().zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final synchronized void zzf(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbxq zzbxqVar) throws RemoteException {
        zzu(zzlVar, zzbxqVar, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final synchronized void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbxq zzbxqVar) throws RemoteException {
        zzu(zzlVar, zzbxqVar, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final synchronized void zzh(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzj = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final void zzi(com.google.android.gms.ads.internal.client.zzdd zzddVar) {
        if (zzddVar == null) {
            this.zzb.zzg(null);
        } else {
            this.zzb.zzg(new zzfdj(this, zzddVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final void zzj(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdgVar.zzf()) {
                this.zzh.zze();
            }
        } catch (RemoteException e) {
            zzcbn.zzf("Error in making CSI ping for reporting paid event callback", e);
        }
        this.zzb.zzi(zzdgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final void zzk(zzbxm zzbxmVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzj(zzbxmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final synchronized void zzl(zzbxx zzbxxVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzfei zzfeiVar = this.zzd;
        zzfeiVar.zza = zzbxxVar.zza;
        zzfeiVar.zzb = zzbxxVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final synchronized void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzn(iObjectWrapper, this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final synchronized void zzn(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzi == null) {
            zzcbn.zzj("Rewarded can not be shown before loaded");
            this.zzb.zzp(zzffr.zzd(9, null, null));
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzcx)).booleanValue()) {
            this.zzg.zzc().zzn(new Throwable().getStackTrace());
        }
        this.zzi.zzh(z, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final boolean zzo() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdpy zzdpyVar = this.zzi;
        return (zzdpyVar == null || zzdpyVar.zzf()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final void zzp(zzbxr zzbxrVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzo(zzbxrVar);
    }
}
