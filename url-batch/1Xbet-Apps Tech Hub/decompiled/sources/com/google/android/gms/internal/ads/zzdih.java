package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.ArrayMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdih implements zzczv, com.google.android.gms.ads.internal.overlay.zzo, zzczb {
    zzflf zza;
    private final Context zzb;
    private final zzcgv zzc;
    private final zzfdu zzd;
    private final zzcbt zze;
    private final zzayz zzf;

    public zzdih(Context context, zzcgv zzcgvVar, zzfdu zzfduVar, zzcbt zzcbtVar, zzayz zzayzVar) {
        this.zzb = context;
        this.zzc = zzcgvVar;
        this.zzd = zzfduVar;
        this.zze = zzcbtVar;
        this.zzf = zzayzVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbM() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbv() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbw() {
        if (this.zza == null || this.zzc == null) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzeY)).booleanValue()) {
            return;
        }
        this.zzc.zzd("onSdkImpression", new ArrayMap());
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbz(int i) {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzczb
    public final void zzq() {
        if (this.zza == null || this.zzc == null) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzeY)).booleanValue()) {
            this.zzc.zzd("onSdkImpression", new ArrayMap());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczv
    public final void zzr() {
        zzefq zzefqVar;
        zzefp zzefpVar;
        zzayz zzayzVar = this.zzf;
        if ((zzayzVar == zzayz.REWARD_BASED_VIDEO_AD || zzayzVar == zzayz.INTERSTITIAL || zzayzVar == zzayz.APP_OPEN) && this.zzd.zzU && this.zzc != null) {
            if (com.google.android.gms.ads.internal.zzt.zzA().zzj(this.zzb)) {
                zzcbt zzcbtVar = this.zze;
                String str = zzcbtVar.zzb + "." + zzcbtVar.zzc;
                zzfet zzfetVar = this.zzd.zzW;
                String zza = zzfetVar.zza();
                if (zzfetVar.zzb() == 1) {
                    zzefpVar = zzefp.VIDEO;
                    zzefqVar = zzefq.DEFINED_BY_JAVASCRIPT;
                } else {
                    zzefqVar = this.zzd.zzZ == 2 ? zzefq.UNSPECIFIED : zzefq.BEGIN_TO_RENDER;
                    zzefpVar = zzefp.HTML_DISPLAY;
                }
                zzflf zza2 = com.google.android.gms.ads.internal.zzt.zzA().zza(str, this.zzc.zzG(), "", "javascript", zza, zzefqVar, zzefpVar, this.zzd.zzam);
                this.zza = zza2;
                if (zza2 != null) {
                    com.google.android.gms.ads.internal.zzt.zzA().zzh(this.zza, (View) this.zzc);
                    this.zzc.zzap(this.zza);
                    com.google.android.gms.ads.internal.zzt.zzA().zzi(this.zza);
                    this.zzc.zzd("onSdkLoaded", new ArrayMap());
                }
            }
        }
    }
}
